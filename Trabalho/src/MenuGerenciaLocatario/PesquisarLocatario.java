package MenuGerenciaLocatario;

import java.util.ArrayList;
import java.util.Scanner;

import gerenciaFrota.Veiculo;
import gerenciaLocatarios.Locatario;
import gerenciaLocatarios.PessoaFisica;
import gerenciaLocatarios.PessoaJuridica;

public class PesquisarLocatario {
	
	public static Scanner leitor = new Scanner(System.in);
	
	public static void MenuPesquisa() {
		
		System.out.println("----------------- Pesquisa de Locatario -------------------\n");
		System.out.println("                 1 - Pessoa Fisica                           ");
		System.out.println("                 2 - Pessoa Juridica                         ");
		System.out.println("                                                             ");
		System.out.println("                 Escolha uma dessas opções:                  ");
			
		}
	
	public static void PesquisaFisicaPessoaNome(ArrayList<PessoaFisica> Pessoas) {
		
		
		System.out.println("Digite o nome:");
		String NomePesquisado = leitor.nextLine();
		System.out.println("Nome Pesquisa: " + NomePesquisado);

		// Procurando Locatario:
		try {
			for (PessoaFisica PessoaF : Pessoas) {
				if (PessoaF.getNome().contentEquals(NomePesquisado)) {
					System.out.println("Pessoa Encontrada!");
					System.out.println("Dados:");
					System.out.println("Nome: " + PessoaF.getNome());
					System.out.println("CPF: " + PessoaF.getCpf());
					System.out.println("Email: " + PessoaF.getEmail());
					System.out.println("Celular: " + PessoaF.getCelular());
					
				}
			}
		} catch (Exception ObjetoNaoEncontradoException) {
			System.out.println("Erro! Pessoa nao encontrado!");
		}
		
	} 
	public static void PesquisaPessoaJuridicaNome(ArrayList<PessoaJuridica> PessoasJ) {
		
		
		System.out.println("Digite o nome:");
		String NomePesquisadoJ = leitor.nextLine();
		System.out.println("Nome Pesquisa: " + NomePesquisadoJ);

		// Procurando Locatario:
		try {
			for (PessoaJuridica PessoaJ : PessoasJ) {
				if (PessoaJ.getNomeSocial().equalsIgnoreCase(NomePesquisadoJ)) {
					System.out.println("Pessoa Encontrada!");
					System.out.println("Dados:");
					System.out.println("Nome Social da Empresa: " + PessoaJ.getNomeSocial());
					System.out.println("Email: " + PessoaJ.getEmail());
					System.out.println("Celular: " + PessoaJ.getCelular());
				}
			}
		} catch (Exception ObjetoNaoEncontradoException) {
			System.out.println("Erro! Pessoa nao encontrado!");
		}
		
	} 
	


}
