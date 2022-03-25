package gerenciaLocatarios;

public class PessoaFisica extends Locatario{
	

	private String nome,
				   cpf,
				   estadocivil;
	
	public PessoaFisica(String nome, String cpf, String estadocivil, 
						String email, String celular, Endereco endereco) {
		super(email, celular, endereco);
		this.nome = nome;
		this.cpf = cpf;
		this.estadocivil = estadocivil;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	public void setEstadocivil(String estadocivil) {
		this.estadocivil = estadocivil;
	}
	
	public String getNome() {
		return nome;
	}

	public String getCpf() {
		return cpf;
	}

	public String getEstadocivil() {
		return estadocivil;
	}
	
}
