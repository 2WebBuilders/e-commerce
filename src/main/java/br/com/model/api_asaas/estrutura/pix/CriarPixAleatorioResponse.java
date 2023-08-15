package br.com.model.api_asaas.estrutura.pix;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Generated("jsonschema2pojo")
public class CriarPixAleatorioResponse {

	@SerializedName("id")
	@Expose
	public String id;
	@SerializedName("key")
	@Expose
	public String key;
	@SerializedName("type")
	@Expose
	public String type;
	@SerializedName("status")
	@Expose
	public String status;
	@SerializedName("dateCreated")
	@Expose
	public String dateCreated;
	@SerializedName("canBeDeleted")
	@Expose
	public Boolean canBeDeleted;
	@SerializedName("cannotBeDeletedReason")
	@Expose
	public Object cannotBeDeletedReason;
	@SerializedName("qrCode")
	@Expose
	@Valid
	public QrCodeResponse qrCode;

}