package MenuGerenciaLocatario;

import java.util.Scanner;

import MenuGerenciaFrota.CadastrarVeículos;
import gerenciaLocatarios.Endereco;
import gerenciaLocatarios.PessoaFisica;
import gerenciaLocatarios.PessoaJuridica;

public class MenuGerenciaLocatari {
	
	private static final String String = null;
	private static final Endereco Endereco = null;

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
		CadastraLocatario CadastrarP=new CadastraLocatario();
		CadastrarP.CadastrarPessoa();
		
		int escolhaL;
		
		Scanner lerc=new Scanner(System.in);
		
		
		escolhaL=lerc.nextInt();
		
		switch(escolhaL) {
		case 1:
			CadastrarP.cadastrarPessoaFisica();
			break;
		case 2:	
			CadastrarP.cadastrarPessoaJuridica();
			break;
			
			default:
				System.out.println("Escolha inválida. Tente novamente!!");
		}
	}
	public static void buscarlocatario() {
		System.out.println("Método - Buscar Locátario...");
	}
	
	public static void pesquisarlocatario() {
		PesquisarLocatario Pesquisar=new PesquisarLocatario();
	}
	
	public static void excluirlocatario() {
		System.out.println("Método - Excluir Locátario...");
	}
}