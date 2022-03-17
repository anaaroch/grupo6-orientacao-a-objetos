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
		System.out.println("Coloque o seu endereço:");
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
		System.out.println("Metodo Buscar Locátario...");
	}
	
	public static void pesquisarlocatario() {
		System.out.println("Metodo Pesquisar Locátario...");
	}
	
	public static void excluirlocatario() {
		System.out.println("Metodo Excluir Locátario...");
	}
	
	public static void main(String [] args) {
		
		int escolha=0;
		
		Scanner ler=new Scanner(System.in);
		
		MenuLocatario();
		
		escolha=ler.nextInt();
		
		switch(escolha) {
		case 1:
			cadastrarlocatario();
			break;
		case 2:
			buscarlocatario();
			break;
		case 3:
			pesquisarlocatario();
			break;
		case 4:
			excluirlocatario();
			break;
			
			default:
				System.out.println("Escolha inválida, tente novamente!");
			
		}
	}
}