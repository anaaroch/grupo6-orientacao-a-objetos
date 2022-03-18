package Menu;

import java.util.Scanner;

public class MenuGerenciaLocatari {
	
	public static void MenuLocatario() {
		
		System.out.println("------------- Menu [Gerência de Locatários] ---------------\n");
		System.out.println("                 1 - Cadastrar Locatário                     ");
		System.out.println("                 2 - Buscar Locatário                        ");
		System.out.println("                 3 - Pesquisar Locatário                     ");
		System.out.println("                 4 - Excluir Locatário                       ");
		System.out.println("                                                             ");
		System.out.println("                 Escolha uma dessas opções:                  ");
			
		}
	
	public static void cadastrarlocatario() {
		Scanner cadastrar=new Scanner(System.in);
		System.out.println("Cadastrando Locatário...");
		System.out.println("Digite f se quer alugar como uma pessoa fisica, ou  j como  pessoa juridica...");
		String escolhaTipo;
		escolhaTipo = cadastrar.nextLine();
		char escolha = escolhaTipo.charAt(0);
		if((escolha == 'f')|| (escolha == 'F')) {
		System.out.println("Coloque o seu Nome Completo:");
		String nomeCompleto=cadastrar.nextLine();
		System.out.println("Coloque o seu CPF:");
		String cpf=cadastrar.nextLine();
		System.out.println("Coloque o seu Estado Civil:");
		String estadoCivil=cadastrar.nextLine();
		
		System.out.println("Dados cadastrados: ");
		System.out.println("Nome Completo: "+nomeCompleto);
		System.out.println("CPF: "+cpf);
		System.out.println("Estado Civil: "+estadoCivil);
		
			
		}else if((escolha == 'j')|| (escolha == 'J')) {
			
		System.out.println("Coloque o Nome Social da sua Empresa:");
		String nomeEmpresa=cadastrar.nextLine();
		System.out.println("Coloque o Nome da Pessoa Autorizada a Realizar Locações:");
		String nome=cadastrar.nextLine();
		System.out.println("Dados cadastrados: ");
		System.out.println("Nome da Empresa: "+nomeEmpresa);
		System.out.println("Nome da pessoa: "+nome);
		
			
		}
		System.out.println("Coloque o seu Endereço:");
		String Endereco=cadastrar.nextLine();
		System.out.println("Coloque o seu Email:");
		String Email=cadastrar.nextLine();
		System.out.println("Coloque o seu Telefone:");
		String Telefone=cadastrar.nextLine();
		System.out.println("Dados cadastrados: ");
		System.out.println("Endereço: "+Endereco);
		System.out.println("Email: "+Email);
		System.out.println("Telefone: "+Telefone);
	   
	}
	public static void buscarlocatario() {
		System.out.println("Método - Buscar Locátario...");
	}
	
	public static void pesquisarlocatario() {
		Scanner PesquisarL=new Scanner(System.in);	
		System.out.println("Método pesquisar locatario.;");
		System.out.println("Digite o nome do locatário:");
		String PesquisaLoc=PesquisarL.nextLine();
		System.out.println("- Locatário pesquisado -");
		System.out.println("Locatário: "+PesquisaLoc);
		System.out.println("- Locatários encontrados:");
		System.out.println("**********");
		System.out.println("...");
	}
	
	public static void excluirlocatario() {
		System.out.println("Método - Excluir Locátario...");
	}
}