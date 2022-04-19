package gerenciaLocatarios;

public class Locatario {
	
	private String email,
				   celular;
	
	private Endereco endereco;

	public Locatario(String email, String celular, Endereco endereco) {
		this.email = email;
		this.celular = celular;
		this.setEndereco(endereco);
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	public void setCelular(String celular) {
		this.celular = celular;
	}
	
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	
	public String getEmail() {
		return email;
	}

	public String getCelular() {
		return celular;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	
}