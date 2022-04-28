package MenuGerenciaLocatario;

import java.util.ArrayList;
import java.util.Scanner;

import Excecoes.ObjetoNaoEncontradoException;
import gerenciaLocatarios.PessoaFisica;
import gerenciaLocatarios.PessoaJuridica;

public class ExcluirLocatario  {

	public static Scanner leitorP = new Scanner(System.in);
	
	public static void MenuExcluir() {
		
		System.out.println("----------------- Excluir Locatario     -------------------\n");
		System.out.println("                 1 - Pessoa Fisica                           ");
		System.out.println("                 2 - Pessoa Juridica                         ");
		System.out.println("                                                             ");
		System.out.println("                 Escolha uma dessas op��es:                  ");
			
		}
	
	public static void ExcluiPessoaFisicaNome(ArrayList<PessoaFisica> Pessoas) {
		System.out.println("Digite o nome do locatario a ser removido: ");
		String locatarioProcurado;
		locatarioProcurado = leitorP.nextLine();
		
		try {
			for (PessoaFisica PessoaF : Pessoas) {
				if (PessoaF.getNome().equalsIgnoreCase(locatarioProcurado)) {
					System.out.println("Locatario Encontrado: " + locatarioProcurado);
					System.out.println("CPF:"+PessoaF.getCpf());
					System.out.println("Deseja realmente excluir esse locat�rio? Digite 'Sim' para exclui-lo ou 'N�o' para retornar ao programa ");
					String Excluir;
					Excluir=leitorP.nextLine();
					if(Excluir.equals("Sim")||Excluir.equals("sim")){
						Pessoas.remove(PessoaF);
						System.out.println("Locatario removido com sucesso.");
						return;
					}else if(Excluir.equals("N�o")||Excluir.equals("n�o")){
						System.out.println("Retornando ao programa...");
						return;
					}
					break;
				} else {
					throw new ObjetoNaoEncontradoException("Erro! Pessoa nao encontrado!");
				}
			}
		} catch (ObjetoNaoEncontradoException e) {
			System.out.println("Erro! Locatario n�o existe!");
			System.out.println("Deseja tentar novamente? Digite Sim/sim ou N�o/n�o");
			String Tentar;
			Tentar=leitorP.nextLine();
			if(Tentar.equals("Sim")||Tentar.equals("sim")){
				ExcluiPessoaFisicaNome(Pessoas);
			} else if(Tentar.equals("N�o")||Tentar.equals("n�o")){
				System.out.println("Retornando ao programa...");
				return;
			}
		}
	}
	public static void ExcluiPessoaJuridicaNome(ArrayList<PessoaJuridica> PessoasJ) {
		System.out.println("Digite o nome do locatario a ser removido: ");
		String locatarioJProcurado;
		locatarioJProcurado = leitorP.nextLine();
		
		try {
			for (PessoaJuridica PessoaJ : PessoasJ) {
				if (PessoaJ.getNomeSocial().equalsIgnoreCase(locatarioJProcurado)) {
					System.out.println("Locatario Encontrado: " + locatarioJProcurado);
					System.out.println("CNPJ:"+PessoaJ.getCnpj());
					System.out.println("Deseja realmente excluir esse locat�rio? Digite 'Sim' para exclui-lo ou 'N�o' para retornar ao programa ");
					String Excluir;
					Excluir=leitorP.nextLine();
					if(Excluir.equals("Sim")||Excluir.equals("sim")){
						PessoasJ.remove(PessoaJ);
						System.out.println("Locatario removido com sucesso.");
						return;
					}else if(Excluir.equals("N�o")||Excluir.equals("n�o")){
						System.out.println("Retornando ao programa...");
						return;
					}
					break;
				} else {
					throw new ObjetoNaoEncontradoException("Erro! Pessoa nao encontrado!");
				}
			}
		} catch (ObjetoNaoEncontradoException e) {
			System.out.println("Erro! Locatario n�o existe!");
			System.out.println("Deseja tentar novamente? Digite Sim/sim ou N�o/n�o");
			String Tentar;
			Tentar=leitorP.nextLine();
			if(Tentar.equals("Sim")||Tentar.equals("sim")){
				ExcluiPessoaJuridicaNome(PessoasJ);
			} else if(Tentar.equals("N�o")||Tentar.equals("n�o")){
				System.out.println("Retornando ao programa...");
				return;
			}
			}
	}
}
