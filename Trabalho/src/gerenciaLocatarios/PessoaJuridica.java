package gerenciaLocatarios;


public class PessoaJuridica extends Locatario{
	
	private String nomeSocial;
	private String cnpj;
	private PessoaFisica funcionarios[];

	public PessoaJuridica(String nomeSocial, String email, String celular,  Endereco endereco) {
		super(email, celular, endereco);
		this.nomeSocial = nomeSocial;
	}
	
	public Boolean cadastraFuncionario(PessoaFisica pf) {
		return true;
	}
	
	public void setNomeSocial(String nomeSocial) {
		this.nomeSocial = nomeSocial;
	}
	
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	
	public void setFuncionarios(PessoaFisica funcionarios[]) {
		this.funcionarios = funcionarios;
	}
	
	public String getNomeSocial() {
		return nomeSocial;
	}

	public String getCnpj() {
		return cnpj;
	}

	public PessoaFisica[] getFuncionarios() {
		return funcionarios;
	}

}