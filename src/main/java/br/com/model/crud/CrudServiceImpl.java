package br.com.model.crud;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Service;

import jakarta.persistence.EntityNotFoundException;
import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.Predicate;
import jakarta.persistence.criteria.Root;

@Service
public abstract class CrudServiceImpl<T, ID extends Serializable> implements CrudService<T, ID> {

	protected abstract JpaRepository<T, ID> getRepository();
	
	@Autowired
	private ModelMapper modelMapper;

	@Override
	public T save(T entity) {
		return getRepository().save(entity);
	}

	@Override
	public void delete(ID id) {
		if (getRepository().findById(id).isPresent()) {
			getRepository().deleteById(id);
			return;
		}
		throw new EntityNotFoundException("Entity not exist with ID: " + id + " Not found");
	}

	@Override
	public List<T> findAll() {
		return getRepository().findAll();
	}

	@Override
	public Page<T> findPaginateAll(Pageable page) {
		return getRepository().findAll(page);
	}

	@Override
	public T findById(ID id) {
		return getRepository().findById(id).orElseThrow(() -> new EntityNotFoundException("Entity not exist with ID: " + id + " Not found"));
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public Page<T> FindForFilterAndPaginateAll(List<Object> parameters, Pageable page) {
		Specification<T> specification = this.buildQuery(parameters);
		JpaSpecificationExecutor<T> repository = (JpaSpecificationExecutor<T>) this.getRepository();
		return repository.findAll(specification, page);
	}
	
	@Override
	public  T update(ID id, T entityUpdate) {
		T entity = getRepository().findById(id).orElseThrow(() -> new EntityNotFoundException("Entity not exist with ID: " + id + " Not found"));
		modelMapper.map(entityUpdate, entity);
		return getRepository().save(entity);
	}

	@Override
	public List<T> removeList(Long id, List<T> entityList) {
		// TODO Implementar metodo
		return null;
	}

	@Override
	public List<T> addList(Long id, List<T> entityList) {
		// TODO Implementar metodo
		return null;
	}
	
	/**
	 * Constroi a consulta utilizando a lista de parametros para incluir nas clausulas(like, equal, isNull..., etc)
	 * 
	 * @param lista de parametros
	 * @return Specification
	 */
	private Specification<T> buildQuery(List<Object> parameters) {
		return new Specification<T>() {
			@Override
			public Predicate toPredicate(Root<T> root, CriteriaQuery<?> query, CriteriaBuilder criteriaBuilder) {
				List<Predicate> predicates = new ArrayList<Predicate>();
				for (int i = 0; i < parameters.size(); i++) {
					Object atributo = parameters.get(i);
					if (atributo != null) {
						predicates.add(criteriaBuilder.equal(root.get(atributo.toString()), atributo));
					}
				}
				return criteriaBuilder.and(predicates.toArray(new Predicate[] {}));
			}
		};
	}

}
