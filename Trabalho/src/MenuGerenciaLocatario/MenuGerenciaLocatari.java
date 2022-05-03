package MenuGerenciaLocatario;

import java.util.ArrayList;
import java.util.Scanner;

import Excecoes.ObjetoNaoEncontradoException;
import gerenciaLocatarios.PessoaFisica;
import gerenciaLocatarios.PessoaJuridica;


public class MenuGerenciaLocatari {
	
	
	public static Scanner leitorP = new Scanner(System.in);
	
	static ArrayList<PessoaFisica> Pessoas = new ArrayList<PessoaFisica>();
	static ArrayList<PessoaJuridica> PessoasJ = new ArrayList<PessoaJuridica>();

	public static void MenuLocatario() {
		
		System.out.println("------------- Menu [Gerência de Locatários] ---------------\n");
		System.out.println("                 1 - Cadastrar Locatário                     ");
		System.out.println("                 2 - Alterar Locatário                       ");
		System.out.println("                 3 - Pesquisar Locatário                     ");
		System.out.println("                 4 - Excluir Locatário                       ");
		System.out.println("                                                             ");
		System.out.println("                 Escolha uma dessas opções:                  ");
			
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
			PessoaJuridica PessoaJ = CadastraLocatario.cadastrarPessoaJuridica();
			PessoasJ.add(PessoaJ);
			int Funcionarios = 0;
			System.out.println("Coloque a quantidade de funcionários:");
			Funcionarios=leitorP.nextInt();
			for (int i=0; i<Funcionarios; i++){
				PessoaFisica PessoaF2=CadastraLocatario.cadastrarPessoaFisica();
				Pessoas.add(PessoaF2);
			}
			break;
			
			default:
				System.out.println("Escolha inválida. Tente novamente!!");
		}
	}
	public static void AlterarLocatario() {
		AlterarLocatario.MenuAltera();
		int escolhaA;
		
		
		escolhaA=leitorP.nextInt();
		
		switch(escolhaA) {
		case 1:
			AlterarLocatario.AlterarPessoaFisica(Pessoas);
			break;
		case 2:	
			AlterarLocatario.AlterarPessoaJuridica(PessoasJ);
			break;
			
			default:
				System.out.println("Escolha inválida. Tente novamente!!");
		}
	}
	
	public static void pesquisarlocatario() {
		PesquisarLocatario.MenuPesquisa();
		
		int escolhaL;
		
		escolhaL=leitorP.nextInt();
		
		switch(escolhaL) {
		case 1:
			PesquisarLocatario.MenuPesquisaF();
			
			// Lendo a escolha
			int escolhaPF;
			escolhaPF = leitorP.nextInt();
			
			// Chamando o metodo de acordo com a escolha.
			switch(escolhaPF) {
			case 1:
				PesquisarLocatario.PesquisaFisicaPessoaNome(Pessoas);
				break;
			case 2:	
				PesquisarLocatario.PesquisaFisicaPessoaCPF(Pessoas);
				break;
			case 3:
				PesquisarLocatario.PesquisaFisicaPessoaEmail(Pessoas);
				break;
			default:
				System.out.println("Escolha inválida. Tente novamente!!"); 
			}
			break;
		case 2:	
			PesquisarLocatario.MenuPesquisaJ();
			
			// Lendo a escolha
			int escolhaPJ;
			escolhaPJ = leitorP.nextInt();
			
			// Chamando o metodo de acordo com a escolha.
			switch(escolhaPJ) {
			case 1:
				PesquisarLocatario.PesquisaPessoaJuridicaNome(PessoasJ);
				break;
			case 2:	
				PesquisarLocatario.PesquisaPessoaJuridicaCNPJ(PessoasJ);
				break;

			default:
				System.out.println("Escolha inválida. Tente novamente!!"); 
			}
			break;
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
				System.out.println("Escolha inválida. Tente novamente!!");
		}
	}

}