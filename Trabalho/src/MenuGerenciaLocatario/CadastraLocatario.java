package MenuGerenciaLocatario;

import java.util.Scanner;

import gerenciaLocatarios.PessoaFisica;
import gerenciaLocatarios.PessoaJuridica;
import gerenciaLocatarios.Endereco;
import gerenciaLocatarios.Locatario;

public class CadastraLocatario {
	
	// Criando o leitor que vai ser usado em toda a classe.
	public static Scanner leitorP = new Scanner(System.in);
	
	public static void CadastrarPessoa() {
		
		
	System.out.println("------------------- Cadastro de Locatario  ----------------\n");
	System.out.println("                 1 - Cadastrar Pessoa Física                 ");
	System.out.println("                 2 - Cadastrar Pessoa Jurídica               ");
	System.out.println("                                                             ");
	System.out.println("                 Escolha uma dessas opções:                  ");
	}
	
	public static PessoaFisica cadastrarPessoaFisica() {
		Endereco endereco2=new Endereco(null, null, null, null, null, null, null);
		PessoaFisica PessoaF= new PessoaFisica(null, null, null, null, null, null);

		System.out.println("Cadastrando Locatário...");
		
		System.out.println("Coloque o seu Nome Completo:");
		PessoaF.setNome(leitorP.nextLine());
		
		System.out.println("Coloque o seu CPF:");
		PessoaF.setCpf(leitorP.nextLine());
		
		System.out.println("Coloque o seu Estado Civil:");
		PessoaF.setEstadocivil(leitorP.nextLine());
		
		System.out.println("Coloque o seu Email:");
		PessoaF.setEmail(leitorP.nextLine());
		
		System.out.println("Coloque o seu Telefone:");
		PessoaF.setCelular(leitorP.nextLine());
		
		System.out.println("Infome seu endereço: \n \n");
		System.out.println("Logadouro:");
		String Logadouro=leitorP.nextLine();
		
		System.out.println("Numero:");
		String Numero=leitorP.nextLine();
		
		System.out.println("Complemento:");
		String Complemento=leitorP.nextLine();
		
		System.out.println("Bairro:");
		String Bairro=leitorP.nextLine();
		
		System.out.println("Cidade:");
		String Cidade=leitorP.nextLine();
		
		System.out.println("Estado:");
		String Estado=leitorP.nextLine();
		
		System.out.println("Cep:");
		String Cep=leitorP.nextLine();
		
		
		
		System.out.println("- - - - - - - - - - - - - - - ");	
		System.out.println("Dados cadastrados de Pessoa Física: ");
		System.out.println("- - - - - - - - - - - - - - - ");	
		System.out.println("Nome Completo: "+PessoaF.getNome());
		System.out.println("CPF: "+PessoaF.getCpf());
		System.out.println("Estado Civil: "+PessoaF.getEstadocivil());
		System.out.println("Email: "+PessoaF.getEmail());
		System.out.println("Telefone: "+PessoaF.getCelular());
		System.out.println("Endereço: "+endereco2.getLogadouro()+" "+endereco2.getNumero()+" "+endereco2.getComplemento()+" "+endereco2.getBairro()
										+" "+endereco2.getCidade()+" "+endereco2.getEstado()+" "+endereco2.getCep());
		System.out.println("- - - - - - - - - - - - - - - ");
		return PessoaF;	
		
		
	   
	}
	
	public static PessoaJuridica cadastrarPessoaJuridica() {
		PessoaJuridica PessoaJ=new PessoaJuridica(null, null, null, null);
		Scanner cadastrar=new Scanner(System.in);
		System.out.println("Cadastrando Locatário...");
		
		System.out.println("Coloque o Nome Social da sua Empresa:");
		PessoaJ.setNomeSocial(leitorP.nextLine());
		System.out.println("Coloque o Nome da Pessoa Autorizada a Realizar Locações:");
		String nome=cadastrar.nextLine();
		System.out.println("Coloque o seu Email:");
		PessoaJ.setEmail(leitorP.nextLine());
		System.out.println("Coloque o seu Telefone:");
		PessoaJ.setCelular(leitorP.nextLine());
		System.out.println("- - - - - - - - - - - - - - - ");	
		System.out.println("Dados cadastrados de Pessoa Jurídica: ");
		System.out.println("- - - - - - - - - - - - - - - ");	
		System.out.println("Nome da Empresa: "+PessoaJ.getNomeSocial());
		System.out.println("Nome da pessoa: "+nome);
		System.out.println("Email: "+PessoaJ.getEmail());
		System.out.println("Telefone: "+PessoaJ.getCelular());
		System.out.println("- - - - - - - - - - - - - - - ");
		return PessoaJ;
		
	}
}
