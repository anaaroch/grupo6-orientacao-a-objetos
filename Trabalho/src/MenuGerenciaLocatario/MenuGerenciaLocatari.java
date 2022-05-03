package MenuGerenciaLocatario;

import java.util.ArrayList;
import java.util.Scanner;

import Excecoes.ObjetoNaoEncontradoException;
import gerenciaLocatarios.PessoaFisica;
import gerenciaLocatarios.PessoaJuridica;


public class MenuGerenciaLocatari {
	
	
	public static Scanner leitorP = new Scanner(System.in);
	
	

	public static void MenuLocatario() {
		
		System.out.println("------------- Menu [Gerência de Locatários] ---------------\n");
		System.out.println("                 1 - Cadastrar Locatário                     ");
		System.out.println("                 2 - Alterar Locatário                       ");
		System.out.println("                 3 - Pesquisar Locatário                     ");
		System.out.println("                 4 - Excluir Locatário                       ");
		System.out.println("                                                             ");
		System.out.println("                 Escolha uma dessas opções:                  ");
			
		}
	
	public static void cadastrarlocatario(ArrayList<PessoaFisica> pessoas, ArrayList<PessoaJuridica> pessoasJ) {
		CadastraLocatario.CadastrarPessoa();
		
		int escolhaL;
		
		
		escolhaL=leitorP.nextInt();
		
		switch(escolhaL) {
		case 1:
			PessoaFisica PessoaF = CadastraLocatario.cadastrarPessoaFisica();
			pessoas.add(PessoaF);
			break;
		case 2:	
			PessoaJuridica PessoaJ = CadastraLocatario.cadastrarPessoaJuridica();
			pessoasJ.add(PessoaJ);
			int Funcionarios = 0;
			System.out.println("Coloque a quantidade de funcionários:");
			Funcionarios=leitorP.nextInt();
			for (int i=0; i<Funcionarios; i++){
				PessoaFisica PessoaF2=CadastraLocatario.cadastrarPessoaFisica();
				pessoas.add(PessoaF2);
			}
			break;
			
			default:
				System.out.println("Escolha inválida. Tente novamente!!");
		}
	}
	public static void AlterarLocatario(ArrayList<PessoaFisica> pessoas, ArrayList<PessoaJuridica> pessoasJ) {
		AlterarLocatario.MenuAltera();
		int escolhaA;
		
		
		escolhaA=leitorP.nextInt();
		
		switch(escolhaA) {
		case 1:
			AlterarLocatario.AlterarPessoaFisica(pessoas);
			break;
		case 2:	
			AlterarLocatario.AlterarPessoaJuridica(pessoasJ);
			break;
			
			default:
				System.out.println("Escolha inválida. Tente novamente!!");
		}
	}
	
	public static void pesquisarlocatario(ArrayList<PessoaFisica> pessoas, ArrayList<PessoaJuridica> pessoasJ) {
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
				PesquisarLocatario.PesquisaFisicaPessoaNome(pessoas);
				break;
			case 2:	
				PesquisarLocatario.PesquisaFisicaPessoaCPF(pessoas);
				break;
			case 3:
				PesquisarLocatario.PesquisaFisicaPessoaEmail(pessoas);
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
				PesquisarLocatario.PesquisaPessoaJuridicaNome(pessoasJ);
				break;
			case 2:	
				PesquisarLocatario.PesquisaPessoaJuridicaCNPJ(pessoasJ);
				break;

			default:
				System.out.println("Escolha inválida. Tente novamente!!"); 
			}
			break;
		}
		
	}
	
	public static void excluirlocatario(ArrayList<PessoaFisica> pessoas, ArrayList<PessoaJuridica> pessoasJ) throws ObjetoNaoEncontradoException {
		ExcluirLocatario.MenuExcluir();

		int escolhaE;
		
		escolhaE=leitorP.nextInt();
		
		switch(escolhaE) {
		case 1:
			ExcluirLocatario.ExcluiPessoaFisicaNome(pessoas);
			break;
		case 2:	
			ExcluirLocatario.ExcluiPessoaJuridicaNome(pessoasJ);
			break;
			
			default:
				System.out.println("Escolha inválida. Tente novamente!!");
		}
	}

}