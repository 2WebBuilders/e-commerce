package br.com.model.api_asaas.estrutura.auxiliar;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import jakarta.annotation.Generated;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Generated("jsonschema2pojo")
public class DadosBancoAsaas {

	@SerializedName("name")
	@Expose
	public String name;
	@SerializedName("cpfCnpj")
	@Expose
	public String cpfCnpj;
	@SerializedName("agency")
	@Expose
	public String agency;
	@SerializedName("account")
	@Expose
	public String account;
	@SerializedName("accountDigit")
	@Expose
	public String accountDigit;

}
