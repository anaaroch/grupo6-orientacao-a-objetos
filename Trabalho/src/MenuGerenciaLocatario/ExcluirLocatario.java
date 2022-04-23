package MenuGerenciaLocatario;

import java.util.ArrayList;
import java.util.Scanner;

import gerenciaLocatarios.PessoaFisica;
import gerenciaLocatarios.PessoaJuridica;

public class ExcluirLocatario  {

	public static Scanner leitorP = new Scanner(System.in);
	
	public static void MenuExcluir() {
		
		System.out.println("----------------- Excluir Locatario     -------------------\n");
		System.out.println("                 1 - Pessoa Fisica                           ");
		System.out.println("                 2 - Pessoa Juridica                         ");
		System.out.println("                                                             ");
		System.out.println("                 Escolha uma dessas opções:                  ");
			
		}
	
	public static void ExcluiPessoaFisicaNome(ArrayList<PessoaFisica> Pessoas) {
		System.out.println("Metodo Remover locatario");
		System.out.println("Digite o nome do locatario a ser removido: ");
		String locatarioProcurado;
		locatarioProcurado = leitorP.nextLine();

		for (PessoaFisica PessoaF : Pessoas) {
			if (PessoaF.getNome().equalsIgnoreCase(locatarioProcurado)) {
				Pessoas.remove(PessoaF);
				System.out.println("Locatario removido com sucesso.");
				break;
			}
		}
	}
	public static void ExcluiPessoaJuridicaNome(ArrayList<PessoaJuridica> PessoasJ) {
		System.out.println("Metodo Remover locatario");
		System.out.println("Digite o nome do locatario a ser removido: ");
		String locatarioJProcurado;
		locatarioJProcurado = leitorP.nextLine();

		for (PessoaJuridica PessoaJ : PessoasJ) {
			if (PessoaJ.getNomeSocial().equalsIgnoreCase(locatarioJProcurado)) {
				PessoasJ.remove(PessoaJ);
				System.out.println("Locatario removido com sucesso.");
				break;
			}
		}
	}
}
