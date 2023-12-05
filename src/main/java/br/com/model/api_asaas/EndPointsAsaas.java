package br.com.model.api_asaas;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.httpclient.Header;

import com.google.gson.Gson;

import br.com.model.api_asaas.estrutura.cliente.ClienteRequest;
import br.com.model.api_asaas.estrutura.cliente.ClienteResponse;
import br.com.model.api_asaas.estrutura.cliente.ListaClienteResponse;
import br.com.model.api_asaas.uteis.HTTPMetodos;
import br.com.model.api_asaas.uteis.HTTPMetodosException;

public class EndPointsAsaas {
	HTTPMetodos http = new HTTPMetodos();
	Gson gson = new Gson();
	/**
	 * <p>
	 * SandBox
	 * </p>
	 * $aact_YTU5YTE0M2M2N2I4MTliNzk0YTI5N2U5MzdjNWZmNDQ6OjAwMDAwMDAwMDAwMDAwNDAzNDI6OiRhYWNoXzVlMGQzMTRkLWU1MTQtNDBmYy1hY2FjLTJiZjA4NzI3OGM3Mg==
	 * <br>
	 * <p>
	 * Producao
	 * </p>
	 * {token_Producao} <br>
	 */
	static String token = "$aact_YTU5YTE0M2M2N2I4MTliNzk0YTI5N2U5MzdjNWZmNDQ6OjAwMDAwMDAwMDAwMDAwNDAzNDI6OiRhYWNoXzVlMGQzMTRkLWU1MTQtNDBmYy1hY2FjLTJiZjA4NzI3OGM3Mg==";
	/**
	 * <p>
	 * SandBox
	 * </p>
	 * https://sandbox.asaas.com/api/v3/<br>
	 * <p>
	 * Producao
	 * </p>
	 * https://www.asaas.com/api/v3/<br>
	 */
	static String endpoint = "https://sandbox.asaas.com/api/v3/";

	// INÍCIO - ENDPOINT CLIENTE
	
	/**
	 * Executa uma requisição post para criar um cliente no Asaas
	 * 
	 * @param clienteRequest
	 * @return txIdAsaas
	 * @throws HTTPMetodosException
	 */
	public String criarCliente(ClienteRequest clienteRequest) throws HTTPMetodosException {
		String url = endpoint + "customers";
		String json = gson.toJson(clienteRequest);

		String retorno = http.post(json, url, criarHeaderRequisicao());

		if (retorno.contains("\"id\":")) {
			ClienteResponse clienteResponse = gson.fromJson(retorno, ClienteResponse.class);
			return clienteResponse.getId();
		} else if (retorno.contains("error")) {
			throw new HTTPMetodosException(retorno);
		} else if (retorno.trim().isEmpty()) {
			throw new HTTPMetodosException("Ocorreu um erro na requisição.");
		}
		return null;
	}
	
	/**
	 * Executa uma requisição get para buscar todos os clientes do Asaas
	 * @return List<ClienteResponse> clientes
	 * @throws HTTPMetodosException
	 */
	public List<ClienteResponse> listarClientes() throws HTTPMetodosException {
		String url = endpoint + "customers";
		
		String retorno = http.get(url, criarHeaderRequisicao());
		
		if (!retorno.isBlank()) {
			ListaClienteResponse clientes = gson.fromJson(retorno, ListaClienteResponse.class);
			if (clientes.getTotalCount() > 0) {
				return clientes.getData();
			} else if (clientes.getTotalCount() <= 0) {
				throw new HTTPMetodosException("Não existem clientes.");
			}
		} else {
			throw new HTTPMetodosException("Ocorreu um erro na requisição.");
		}
		return null;
	}
	
	public ClienteResponse buscarClienteById(String txIdAsaas) throws HTTPMetodosException {
		String url = endpoint + "customers";
		String retorno = http.get(url, criarHeaderRequisicao());
		
		if(!retorno.isBlank()) {
			return gson.fromJson(retorno,ClienteResponse.class);
		}else {
			throw new HTTPMetodosException("Ocorreu um erro na requisição.");
		}
	}
	
	/**
	 * Executa o metodo post para atualizar as informações do cliente no Asaas
	 * 
	 * @param idCliente
	 * @param clienteRequest
	 * @return txIdAsaas
	 * @throws HTTPMetodosException
	 */
	public String atualizarCliente(String idCliente, ClienteRequest clienteRequest) throws HTTPMetodosException {
		String url = endpoint + "customers/" + idCliente;
		String json = gson.toJson(clienteRequest);

		String retorno = http.post(json, url, criarHeaderRequisicao());

		if (retorno.contains("\"id\":")) {
			ClienteResponse clienteResponse = gson.fromJson(retorno, ClienteResponse.class);
			return clienteResponse.getId();
		} else if (retorno.contains("error")) {
			throw new HTTPMetodosException(retorno);

		} else if (retorno.trim().isEmpty()) {
			throw new HTTPMetodosException("Ocorreu um erro na requisição");
		}
		return null;
	}
	// FIM - ENDPOINT CLIENTE

	// INÍCIO - ASSINATURAS

//	public String criarCobrancaBoletoAssinatura(AssinaturaBoletoRequest assinaturaRq) {
//		String url = endpoint + "subscriptions";
//		String json = gson.toJson(assinaturaRq, AssinaturaBoletoRequest.class);
//
//		try {
//			String retorno = http.post(json, url, criarHeaderRequisicao());
//
//			if (!retorno.isEmpty()) {
//				return retorno;
//			} else if (retorno.trim().isEmpty()) {
//				throw new HttpException("Ocorreu um erro na requisição.");
//			}
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//		return null;
//	}

//	public String criarAssinaturaCartao(AssinaturaCartaoCreditoRequest assinRequest) {
//		String url = endpoint + "subscriptions";
//		String json = gson.toJson(assinRequest);
//		StringBuilder sb = new StringBuilder();
//		try {
//			sb.append(http.post(json, url, criarHeaderRequisicao()));
//		} catch (Exception e) {
//			e.printStackTrace();
//			return null;
//		}
//		return sb.toString();
//	}

//	public String alterarAssinatura(String idAssinatura, AlterarAssinaturaRequest rq) {
//		String url = endpoint + "subscriptions/" + idAssinatura;
//		String json = gson.toJson(rq);
//		try {
//			json = http.post(json, url, criarHeaderRequisicao());
//
//			return json;
//		} catch (Exception e) {
//			e.printStackTrace();
//			return null;
//		}
//	}

	public String cancelarAssinatura(String idAssinatura) {
		String url = endpoint + "subscriptions/" + idAssinatura;

		try {
			String json = http.delete(url, criarHeaderRequisicao());

			return json;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	/**
	 * Trás uma lista de cobrancas atreladas a uma assinatura.
	 * 
	 * @param idAssinatura - ID da assinatura.
	 * @return Lista de assinaturas em JSON.
	 */
//	public List<ConsultaCobranca> listarCobrancasAssinaturas(String idAssinatura) {
//		ConsultaCobrancasAssinatura cobrancas = new ConsultaCobrancasAssinatura();
//		String url = endpoint + "subscriptions/" + idAssinatura + "/payments";
//		String json;
//
//		try {
//			json = http.get(url, criarHeaderRequisicao());
//
//			cobrancas = gson.fromJson(json, ConsultaCobrancasAssinatura.class);
//
//			if (cobrancas.getTotalCobrancas() > 0) {
//				return cobrancas.getCobrancas();
//			} else {
//				return null;
//			}
//		} catch (Exception e) {
//			e.printStackTrace();
//			return null;
//		}
//	}

	/**
	 * Método que será usado para recuperar apenas um código de barras usando o id
	 * de uma cobranca específica.
	 * 
	 * @param idCobranca
	 * @return Código de Barras da Cobranca passada no parâmetro.
	 */
//	public String recuperarCodigoBarrasBoleto(String idCobranca) { // OK
//		String url = endpoint + "/payments/" + idCobranca + "/identificationField";
//		StringBuilder sb = new StringBuilder();
//		try {
//			sb.append(http.get(url, criarHeaderRequisicao()));
//
//			if (sb.toString().contains("\"identificationField\":")) {
//				BoletoResponse boletoResponse = gson.fromJson(sb.toString(), BoletoResponse.class);
//				sb.append(boletoResponse.getBarCode());
//			} else if (sb.toString().contains("error")) {
//				sb.append("Erro ao obter o código de barras do boleto.");
//			} else if (sb.toString().trim().isEmpty() || sb.toString() == null) {
//				return null;
//				// throw new HttpException("Ocorreu um erro na requisição
//				// \"recuperarCodigoBarrasBoleto\" com o ASAAS.");
//			}
//			return sb.toString();
//		} catch (HttpException e) {
//			e.printStackTrace();
//			return null;
//		}
//
//	}
	// FIM - ASSINATURAS

	public List<Header> criarHeaderRequisicao() {
		List<Header> headers = new ArrayList<Header>();
		headers.add(new Header("Content-Type", "application/json"));
		headers.add(new Header("access_token", token));
		return headers;
	}

	/*
	 * Comentado pois não usaremos cobrancas individuais no sistema mas caso um dia
	 * necessite, já exista. public String
	 * criarCobrancaCartaoCredito(PagamentoCartaoCreditoRequest cobrancaoCartaoRq) {
	 * String url = endpoint + "payments"; String json =
	 * gson.toJson(cobrancaoCartaoRq); try { String retorno = http.post(json, url,
	 * criarHeaderRequisicao()); if (retorno.contains("\"ccv\":")) {
	 * PagamentoCartaoCredito cobrancaCartaoRp = gson.fromJson(retorno,
	 * PagamentoCartaoCredito.class); } else if (retorno.contains("error")) { return
	 * retorno; } else if (retorno.trim().isEmpty()) { throw new
	 * HttpException("Ocorreu um erro na requisição."); } } catch
	 * (HttpException e) { e.printStackTrace(); } return
	 * "Erro ao requisitar criação de cobrança com cartão de crédito"; }
	 */

	/*
	 * Comentado pois não usaremos cobrancas individuais no sistema mas caso um dia
	 * necessite, já exista. public PagamentoResponse criarCobranca(PagamentoRequest
	 * cobrancaRq) { PagamentoResponse cobrancaRp = new PagamentoResponse(); String
	 * url = endpoint + "payments"; String json = gson.toJson(cobrancaRq); try {
	 * String retorno = http.post(json, url, criarHeaderRequisicao()); if
	 * (retorno.contains("\"billingType\":")) { cobrancaRp = gson.fromJson(retorno,
	 * PagamentoResponse.class); return cobrancaRp; } else if
	 * (retorno.contains("error")) { System.out.println("Erro_criarCobranca: " +
	 * retorno); return null; } else if (retorno.trim().isEmpty()) { throw new
	 * HttpException("Ocorreu um erro na requisição."); } } catch
	 * (HttpException e) { e.printStackTrace(); } return null; }
	 */

}
