package MenuGerenciaLocatario;

import java.util.Scanner;

import MenuGerenciaFrota.CadastrarVe�culos;
import gerenciaLocatarios.Endereco;
import gerenciaLocatarios.PessoaFisica;
import gerenciaLocatarios.PessoaJuridica;

public class MenuGerenciaLocatari {
	
	private static final String String = null;
	private static final Endereco Endereco = null;

	public static void MenuLocatario() {
		
		System.out.println("------------- Menu [Ger�ncia de Locat�rios] ---------------\n");
		System.out.println("                 1 - Cadastrar Locat�rio                     ");
		System.out.println("                 2 - Buscar Locat�rio                        ");
		System.out.println("                 3 - Pesquisar Locat�rio                     ");
		System.out.println("                 4 - Excluir Locat�rio                       ");
		System.out.println("                                                             ");
		System.out.println("                 Escolha uma dessas op��es:                  ");
			
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
				System.out.println("Escolha inv�lida. Tente novamente!!");
		}
	}
	public static void buscarlocatario() {
		System.out.println("M�todo - Buscar Loc�tario...");
	}
	
	public static void pesquisarlocatario() {
		PesquisarLocatario Pesquisar=new PesquisarLocatario();
	}
	
	public static void excluirlocatario() {
		System.out.println("M�todo - Excluir Loc�tario...");
	}
}