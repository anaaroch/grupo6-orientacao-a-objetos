package MenuGerenciaLocatario;

import java.util.ArrayList;
import java.util.Scanner;

import Excecoes.ObjetoNaoEncontradoException;
import MenuGerenciaFrota.CadastrarVe�culos;
import gerenciaFrota.Veiculo;
import gerenciaFrota.VeiculoDePasseio;
import gerenciaLocatarios.Endereco;
import gerenciaLocatarios.Locatario;
import gerenciaLocatarios.PessoaFisica;
import gerenciaLocatarios.PessoaJuridica;

public class MenuGerenciaLocatari {
	
	public static Scanner leitorP = new Scanner(System.in);
	
	static ArrayList<PessoaFisica> Pessoas = new ArrayList<PessoaFisica>();
	static ArrayList<PessoaJuridica> PessoasJ = new ArrayList<PessoaJuridica>();

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
		CadastraLocatario.CadastrarPessoa();
		
		int escolhaL;
		
		
		escolhaL=leitorP.nextInt();
		
		switch(escolhaL) {
		case 1:
			PessoaFisica PessoaF = CadastraLocatario.cadastrarPessoaFisica();
			Pessoas.add(PessoaF);
			break;
		case 2:	
			System.out.println("Teste");
			PessoaJuridica PessoaJ = CadastraLocatario.cadastrarPessoaJuridica();
			PessoasJ.add(PessoaJ);
			break;
			
			default:
				System.out.println("Escolha inv�lida. Tente novamente!!");
		}
	}
	public static void buscarlocatario() {
		System.out.println("M�todo - Buscar Loc�tario...");
	}
	
	public static void pesquisarlocatario() {
		PesquisarLocatario.MenuPesquisa();
		
		int escolhaL;
		
		escolhaL=leitorP.nextInt();
		
		switch(escolhaL) {
		case 1:
			PesquisarLocatario.PesquisaFisicaPessoaNome(Pessoas);
			break;
		case 2:	
			PesquisarLocatario.PesquisaPessoaJuridicaNome(PessoasJ);
			break;
			
			default:
				System.out.println("Escolha inv�lida. Tente novamente!!");
		}
		
	}
	
	public static void excluirlocatario() throws ObjetoNaoEncontradoException {
		ExcluirLocatario.MenuExcluir();

		int escolhaE;
		
		escolhaE=leitorP.nextInt();
		
		switch(escolhaE) {
		case 1:
			ExcluirLocatario.ExcluiPessoaFisicaNome(Pessoas);
			break;
		case 2:	
			ExcluirLocatario.ExcluiPessoaJuridicaNome(PessoasJ);
			break;
			
			default:
				System.out.println("Escolha inv�lida. Tente novamente!!");
		}
	}

}