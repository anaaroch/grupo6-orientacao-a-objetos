package gerenciaLocatarios;

public class Endereco {
	
	private String logadouro,
		   numero,
		   complemento,
		   bairro,
		   cidade,
		   estado,
		   cep;

	public Endereco (String logadouro, String numero, String complemento, String bairro, String cidade, String estado,
			String cep) {
		this.logadouro = logadouro;
		this.numero = numero;
		this.complemento = complemento;
		this.bairro = bairro;
		this.cidade = cidade;
		this.estado = estado;
		this.cep = cep;
	}


	public void setLogadouro(String logadouro) {
		this.logadouro = logadouro;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}
	
	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}
	
	
	public String getLogadouro() {
		return logadouro;
	}
	
	public String getNumero() {
		return numero;
	}
	
	public String getComplemento() {
		return complemento;
	}
	
	public String getBairro() {
		return bairro;
	}
	
	public String getCidade() {
		return cidade;
	}
	
	public String getEstado() {
		return estado;
	}
	
	public String getCep() {
		return cep;
	}

}
