package br.com.model.api_asaas.uteis;

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.URL;
import java.net.URLConnection;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.List;

import org.apache.commons.httpclient.Header;
import org.apache.commons.httpclient.HttpClient;
import org.apache.commons.httpclient.HttpMethod;
import org.apache.commons.httpclient.MultiThreadedHttpConnectionManager;
import org.apache.commons.httpclient.methods.DeleteMethod;
import org.apache.commons.httpclient.methods.GetMethod;
import org.apache.commons.httpclient.methods.InputStreamRequestEntity;
import org.apache.commons.httpclient.methods.PostMethod;
import org.apache.commons.httpclient.methods.PutMethod;
import org.apache.commons.httpclient.methods.multipart.ByteArrayPartSource;
import org.apache.commons.httpclient.methods.multipart.FilePart;
import org.apache.commons.httpclient.methods.multipart.MultipartRequestEntity;
import org.apache.commons.httpclient.methods.multipart.Part;
import org.apache.commons.httpclient.methods.multipart.StringPart;
import org.apache.commons.httpclient.params.HttpConnectionManagerParams;
import org.apache.log4j.Logger;

public class HTTPMetodos {

	final static Logger logger = Logger.getLogger(HTTPMetodos.class);

	public byte[] getDownloadService(String body, String url, List<Header> headers) throws HTTPMetodosException {
		GetMethod getMethod = new GetMethod(url);
		if (headers != null && !headers.isEmpty()) {
			for (Header header : headers) {
				getMethod.setRequestHeader(header);
			}
		}

		return (byte[]) execute(getMethod, false);
	}

	public byte[] getAsArray(String url, List<Header> headers) throws HTTPMetodosException {
		GetMethod getMethod = new GetMethod(url);
		if (headers != null && !headers.isEmpty()) {
			for (Header header : headers) {
				getMethod.setRequestHeader(header);
			}
		}

		return (byte[]) execute(getMethod, false);
	}

	public String get(String url, List<Header> headers) throws HTTPMetodosException {
		GetMethod getMethod = new GetMethod(url);
		if (headers != null && !headers.isEmpty()) {
			for (Header header : headers) {
				getMethod.setRequestHeader(header);
			}
		}

		return (String) execute(getMethod, true);
	}
	
	/**
	 * Executa uma requisição do tipo POST, tipicamente utilizada para acesso a WS.
	 * Faz a chamada utilizando UTF-8 como Charset padrão.
	 * 
	 * @param body       conteudo do corpo da requisição post
	 * @param urlServico a URL a ser chamada
	 * @return uma String com o conteúdo retornoado pelo servidor remoto
	 * @throws HTTPMetodosException
	 */
	public String post(String body, String urlServico) throws HTTPMetodosException {
		return post(body, StandardCharsets.UTF_8, urlServico, null);
	}
	
	/**
	 * Executa uma requisição do tipo POST, tipicamente utilizada para acesso a WS.
	 * Faz a chamada utilizando UTF-8 como Charset padrão.
	 * 
	 * @param body       conteudo do corpo da requisição post
	 * @param urlServico a URL a ser chamada
	 * @param headers    Os headers a serem enviados na requisição
	 * @return uma String com o conteúdo retornoado pelo servidor remoto
	 * @throws HTTPMetodosException
	 */
	public String post(String body, String urlServico, List<Header> headers) throws HTTPMetodosException {
		return post(body, StandardCharsets.UTF_8, urlServico, headers);
	}

	public String post(String body, Charset bodyCharset, String urlServico, List<Header> headers)
			throws HTTPMetodosException {
		return post(body, bodyCharset, urlServico, headers, null);
	}
	
	/**
	 * Solução encontrada neste link
	 * "https://developer.salesforce.com/forums/?id=906F00000009CYWIA2" , apenas
	 * adiciona um parâmetro no link da requisição.
	 * 
	 * @param body
	 * @param urlServico
	 * @param headers
	 * @return
	 */
	public String patch(String body, String urlServico, List<Header> headers) {
		String retorno = null;
		try {
			retorno = post(body, urlServico + "?_HttpMethod=PATCH", headers);
			return retorno;
		} catch (Exception e) {
			e.printStackTrace();
			return "Erro";
		}
	}

	/**
	 * Executa uma requisição do tipo POST, tipicamente utilizada para acesso a WS
	 * 
	 * @param body             conteudo do corpo da requisição post
	 * @param bodyCharset      o Charset a ser utilizado para a String que compões o
	 *                         corpo da requisição
	 * @param urlServico       a URL a ser chamada
	 * @param headers          Os headers a serem enviados na requisição
	 * @param multipartRequest Caso seja uma requisião multipart/form-data
	 * @return uma String com o conteúdo retornoado pelo servidor remoto
	 * @throws HTTPMetodosException
	 */
	public String post(String body, Charset bodyCharset, String urlServico, List<Header> headers,
			Part[] multipartRequest) throws HTTPMetodosException {
		logger.info("URL: " + urlServico);
		logger.info("Headers: " + headers);
		logger.info("Body Charset: " + bodyCharset);
		logger.info("Body: " + body);

		PostMethod postMethod = new PostMethod(urlServico);
		if (headers != null && !headers.isEmpty()) {
			for (Header header : headers) {
				postMethod.setRequestHeader(header);
			}
		}
		if (multipartRequest != null) {
			MultipartRequestEntity entity = new MultipartRequestEntity(multipartRequest, postMethod.getParams());
			postMethod.setRequestEntity(entity);
		} else {
			postMethod.setRequestEntity(
					new InputStreamRequestEntity(new ByteArrayInputStream(body.getBytes(bodyCharset))));
		}

		String retorno = (String) execute(postMethod, true);
		logger.info(retorno);
		return retorno;
	}

	/**
	 * Método usado para requisições comuns do tipo PUT.
	 * 
	 * @param body
	 * @param bodyCharset
	 * @param url
	 * @param headers
	 * @return
	 * @throws HTTPMetodosException
	 */
	public String put(String body, Charset bodyCharset, String url, List<Header> headers) throws HTTPMetodosException {
		return put(body, bodyCharset, url, headers, null);
	}
	
	/**
	 * Executa uma requisição do tipo PUT
	 * 
	 * @param body             - Conteudo do corpo da requisição post
	 * @param bodyCharset      - O Charset a ser utilizado para a String que compões
	 *                         o corpo da requisição
	 * @param url              - A URL a ser chamada
	 * @param headers          - Os headers a serem enviados na requisição
	 * @param multipartRequest - Caso seja uma requisição multipart/form-data
	 * @return Uma String com o conteúdo retornoado pelo servidor remoto
	 * @throws HTTPMetodosException
	 */
	public String put(String body, Charset bodyCharset, String url, List<Header> headers, Part[] multipartRequest)
			throws HTTPMetodosException {
		PutMethod putMethod = new PutMethod(url);
		if (headers != null && !headers.isEmpty()) {
			for (Header header : headers) {
				putMethod.setRequestHeader(header);
			}
		}
		if (multipartRequest != null) {
			MultipartRequestEntity entity = new MultipartRequestEntity(multipartRequest, putMethod.getParams());
			putMethod.setRequestEntity(entity);
		} else {
			putMethod.setRequestEntity(
					new InputStreamRequestEntity(new ByteArrayInputStream(body.getBytes(bodyCharset))));
		}

		return (String) execute(putMethod, true);
	}

	/**
	 * 
	 * @param url     enredeco do servidor remoto. URL do servico
	 * @param headers cabecalhos / headers da requisicao
	 * @return uma String com o conteúdo retornoado pelo servidor remoto
	 * @throws HTTPMetodosException
	 */
	public String delete(String url, List<Header> headers) throws HTTPMetodosException {
		DeleteMethod deleteMethod = new DeleteMethod(url);
		if (headers != null && !headers.isEmpty()) {
			for (Header header : headers) {
				deleteMethod.setRequestHeader(header);
			}
		}
		return (String) execute(deleteMethod, true);
	}
	
	/**
	 * Metodo usado para requisições multipart/form-data. Pode ser usado em
	 * requisições PUT ou POST, só é necessário indicar no parâmetro metodoPUT.
	 * 
	 * @param dados       bytes do arquivo a ser enviado
	 * @param bodyCharset o Charset a ser utilizado para a String que compões o
	 *                    corpo da requisição
	 * @param urlServico  a URL a ser chamada
	 * @param headers     Os headers a serem enviados na requisição
	 * @param metodoPUT   true: PUT , false: POST
	 * @return uma String com o conteúdo retornoado pelo servidor remoto
	 * @throws HTTPMetodosException
	 */
	public String MultipartFormData(byte[] dados, Charset bodyCharset, String urlServico, List<Header> headers,
			Boolean metodoPUT) throws HTTPMetodosException {
		return MultipartFormData(dados, null, null, bodyCharset, urlServico, headers, metodoPUT);
	}

	public String MultipartFormData(byte[] dados, String nomeDados, String[] stringParts, Charset bodyCharset,
			String urlServico, List<Header> headers, Boolean metodoPUT) throws HTTPMetodosException {
		logger.info("URL: " + urlServico);
		logger.info("Headers: " + headers);
		logger.info("Body Charset: " + bodyCharset);
		logger.info("Body: " + dados);
		String retorno = null;
		// É definido a quantidade de partes da requisição, sendo o arquivo obrigatório
		// e o String[] opcional.
		Part[] parts = new Part[((stringParts == null) ? 1 : stringParts.length + 1)];

		FilePart filePart = new FilePart("arquivo", new ByteArrayPartSource(nomeDados, dados));
		parts[0] = filePart;

		for (int i = 1; i < parts.length; i++) {
			for (String texto : stringParts) {
				if (texto.contains(",")) {
					String[] tituloEValor = texto.split(",");
					parts[i] = new StringPart(tituloEValor[0], tituloEValor[1]);
				} else {
					parts[i] = new StringPart("parametro", texto.trim());
				}

			}
		}
		try {
			if (metodoPUT) {
				retorno = put(null, bodyCharset, urlServico, headers, parts);
			} else {
				retorno = post(urlServico, bodyCharset, urlServico, headers, parts);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		logger.info(retorno);
		return retorno;
	}
	
	/**
	 * Método para consumir WebService via conexão simples, sem utilização das
	 * classes geradas na reversa do WSDL. Nesse sentido, é necessário setar
	 * manualmente o endereço a ser consumido e construir manualmente a String do
	 * Envelope SOAP.
	 *
	 * @param envelopeSoap
	 * @param urlDoWsdl       (Ex.:
	 *                        https://nfse.caxias.rs.gov.br/portal/Servicos?wsdl)
	 * @param metodoConsumido (Ex.: http://ws.pc.gif.com.br/enviarLoteNotas ou
	 *                        ServicosPortSoap11.enviarLoteNotas)
	 * @return Envelope SOAP com o retorno do WS da Prefeitura.
	 *
	 */
	public String criarEnvelopeSoapEEnviar(String envelopeSoap, String urlDoWsdl, String metodoConsumido) {
		
		String msgRetorno = null;
		
		try {
			
			// Definir a URL Do Serviço sem a ?WSDL no fim
			URL url;
			url = new URL(urlDoWsdl);
			URLConnection conn = url.openConnection();
			
			// Define que a Conexão terá uma saída/retorno
			conn.setDoOutput(true);
			
			// Método a ser Consumido pela requisição
			conn.setRequestProperty("SOAPAction", metodoConsumido);
			
			// Propriedades da Mensagem SOAP
			conn.setRequestProperty("Content-Type", "text/xml");
			conn.setRequestProperty("Encoding", "UTF-8");
			conn.setRequestProperty("Http-Method", "POST");
			
			// Canal de Saída da Requisição
			OutputStreamWriter wr = new OutputStreamWriter(conn.getOutputStream());
			
			// Mensagem no Formato SOAP
			wr.write(envelopeSoap);
			wr.flush();
			
			// Leitura da Resposta do Serviço
			BufferedReader rd = new BufferedReader(new InputStreamReader(conn.getInputStream()));
			
			// Leituras das Linhas da Resposta
			while (rd.ready()) {
				msgRetorno += rd.readLine();
			}
			
			wr.close();
			rd.close();
			conn.getInputStream().close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return msgRetorno;
	}

	/**
	 * Faz a abertura da conexão HTTP, envio dos dados e recebimento da resposta.
	 * 
	 * @param method
	 * @param returnAsString
	 * @return
	 * @throws HTTPMetodosException
	 */
	private Object execute(HttpMethod method, boolean returnAsString) throws HTTPMetodosException {
		MultiThreadedHttpConnectionManager cm = new MultiThreadedHttpConnectionManager();
		HttpConnectionManagerParams param = cm.getParams();
		param.setConnectionTimeout(60000);
		param.setSoTimeout(60000);

		HttpClient client = new HttpClient(cm);
		try {
			int httpStatus = client.executeMethod(method);
			if (method.getURI().getURI().contains("asaas")) {
				// if(new String(IOUtils.toByteArray(method.getResponseBodyAsStream())) !=null
				// && !new
				// String(IOUtils.toByteArray(method.getResponseBodyAsStream())).equals("")){
				return new String(leitorInpuStream(method.getResponseBodyAsStream()));
				// }
			}
			if (httpStatus != 200) {
				if (httpStatus == 429) {
					throw new HTTPMetodosException(
                            "Está havendo muitas requisições simultâneas, aguarde um minuto.;HTTP Status: %d.;".formatted(
                                    httpStatus) + method.getResponseBodyAsString());
				}
				if (httpStatus == 401) {
					throw new HTTPMetodosException(
                            "A requisição não foi autorizada. Verifique os paramêtros de autenticação e/ou seu certificado digital.;HTTP Status: %d.;".formatted(
                                    httpStatus) + method.getResponseBodyAsString());
				} else if (httpStatus > 220) {
					throw new HTTPMetodosException("A requisição falhou.;HTTP Status: %d.;".formatted(httpStatus)
							+ method.getResponseBodyAsString());
				}
			}
			if (returnAsString)
				return new String(leitorInpuStream(method.getResponseBodyAsStream()));
			else {
				byte[] targetArray = method.getResponseBody();
				return targetArray;
			}
		} catch (Exception e) {
			e.printStackTrace();
			logger.error(e, e.getCause());
			throw new HTTPMetodosException("A requisição falhou. Tente novamente.; Mensagem Erro:" + e.getMessage());
		} finally {
			method.releaseConnection();
		}
	}

	private String leitorInpuStream(InputStream inputStream) {
		try {
			// Crie um ByteArrayOutputStream para armazenar os bytes lidos
			ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();

			// Defina um tamanho de buffer para a leitura
			byte[] buffer = new byte[1024];
			int bytesRead;

			// Faça a leitura do InputStream e escreva os bytes no ByteArrayOutputStream
			while ((bytesRead = inputStream.read(buffer)) != -1) {
				byteArrayOutputStream.write(buffer, 0, bytesRead);
			}

			// Converta os bytes lidos em uma String
			String result = new String(byteArrayOutputStream.toByteArray(), "UTF-8");

			// Feche o InputStream e o ByteArrayOutputStream
			inputStream.close();
			byteArrayOutputStream.close();

			return result;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

}
