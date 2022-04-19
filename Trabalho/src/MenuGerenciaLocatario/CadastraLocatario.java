package MenuGerenciaLocatario;

import java.util.ArrayList;
import java.util.Scanner;

import gerenciaLocatarios.Endereco;
import gerenciaLocatarios.PessoaFisica;
import gerenciaLocatarios.PessoaJuridica;

public class CadastraLocatario {
	
	private static final String String = null;
	private static final Endereco Endereco = null;

	
	public static void CadastrarPessoa() {
		
	System.out.println("------------------- Cadastro de Locatario  ----------------\n");
	System.out.println("                 1 - Cadastrar Pessoa Física                 ");
	System.out.println("                 2 - Cadastrar Pessoa Jurídica               ");
	System.out.println("                                                             ");
	System.out.println("                 Escolha uma dessas opções:                  ");
	}
	
	public static void cadastrarPessoaFisica() {
		Endereco endereco2=new Endereco(null, null, null, null, null, null, null);
		PessoaFisica PessoaF= new PessoaFisica(null, null, null, null, null, null);
		PessoaJuridica PessoaJ=new PessoaJuridica(null, null, null, null);
		Scanner cadastrar=new Scanner(System.in);
		System.out.println("Cadastrando Locatário...");
		System.out.println("Coloque o seu Nome Completo:");
		PessoaF.setNome(cadastrar.nextLine());
		System.out.println("Coloque o seu CPF:");
		PessoaF.setCpf(cadastrar.nextLine());
		System.out.println("Coloque o seu Estado Civil:");
		PessoaF.setEstadocivil(cadastrar.nextLine());
		System.out.println("Coloque o seu Email:");
		PessoaF.setEmail(cadastrar.nextLine());
		System.out.println("Coloque o seu Telefone:");
		PessoaF.setCelular(cadastrar.nextLine());
		System.out.println("Infome seu endereço: \n \n");
		System.out.println("Logadouro:");
		endereco2.setLogadouro(cadastrar.nextLine());
		System.out.println("Numero:");
		endereco2.setNumero(cadastrar.nextLine());
		System.out.println("Complemento:");
		endereco2.setComplemento(cadastrar.nextLine());
		System.out.println("Bairro:");
		endereco2.setBairro(cadastrar.nextLine());
		System.out.println("Cidade:");
		endereco2.setCidade(cadastrar.nextLine());
		System.out.println("Estado:");
		endereco2.setEstado(cadastrar.nextLine());
		System.out.println("Cep:");
		endereco2.setCep(cadastrar.nextLine());
		
		
		
		
		
		
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
		
		
	   
	}
	
	public static void cadastrarPessoaJuridica() {
		PessoaJuridica PessoaJ=new PessoaJuridica(null, null, null, null);
		Scanner cadastrar=new Scanner(System.in);
		System.out.println("Cadastrando Locatário...");
		
		System.out.println("Coloque o Nome Social da sua Empresa:");
		PessoaJ.setNomeSocial(cadastrar.nextLine());
		System.out.println("Coloque o Nome da Pessoa Autorizada a Realizar Locações:");
		String nome=cadastrar.nextLine();
		System.out.println("Coloque o seu Email:");
		PessoaJ.setEmail(cadastrar.nextLine());
		System.out.println("Coloque o seu Telefone:");
		PessoaJ.setCelular(cadastrar.nextLine());
		System.out.println("- - - - - - - - - - - - - - - ");	
		System.out.println("Dados cadastrados de Pessoa Jurídica: ");
		System.out.println("- - - - - - - - - - - - - - - ");	
		System.out.println("Nome da Empresa: "+PessoaJ.getNomeSocial());
		System.out.println("Nome da pessoa: "+nome);
		System.out.println("Email: "+PessoaJ.getEmail());
		System.out.println("Telefone: "+PessoaJ.getCelular());
		System.out.println("- - - - - - - - - - - - - - - ");
		
	}
}
