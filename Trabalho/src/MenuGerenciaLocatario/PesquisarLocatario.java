package MenuGerenciaLocatario;

import java.util.ArrayList;
import java.util.Scanner;

import Excecoes.ObjetoNaoEncontradoException;
import gerenciaLocatarios.PessoaFisica;
import gerenciaLocatarios.PessoaJuridica;



public class PesquisarLocatario {
	
	private static void clearBuffer(Scanner scanner) {
        if (scanner.hasNextLine()) {
            scanner.nextLine();
        }
    }
	
	public static Scanner leitor = new Scanner(System.in);
	
	public static void MenuPesquisa() {
		
		System.out.println("----------------- Pesquisa de Locatario -------------------\n");
		System.out.println("                 1 - Pessoa Fisica                           ");
		System.out.println("                 2 - Pessoa Juridica                         ");
		System.out.println("                                                             ");
		System.out.println("                 Escolha uma dessas opções:                  ");
			
		}
	
	public static void MenuPesquisaF() {
		
		System.out.println("----------------- Pesquisa Pessoa Fisica -------------------\n");
		System.out.println("                 1 - Pesquisa pelo nome                      ");
		System.out.println("                 2 - Pessoa pelo CPF                         ");
		System.out.println("                 3 - Pessoa pelo Email                       ");
		System.out.println("                                                             ");
		System.out.println("                 Escolha uma dessas opções:                  ");
			
		}
	
	public static void MenuPesquisaJ() {
		
		System.out.println("---------------- Pesquisa Pessoa Juridica ------------------\n");
		System.out.println("                 1 - Pesquisa pelo nome da empresa           ");
		System.out.println("                 2 - Pessoa pelo CNPJ                        ");
		System.out.println("                                                             ");
		System.out.println("                 Escolha uma dessas opções:                  ");
			
		}
	
	public static void PesquisaFisicaPessoaNome(ArrayList<PessoaFisica> Pessoas) {
		
		
		System.out.println("Digite o nome:");
		String NomePesquisado = leitor.nextLine();
		System.out.println("Nome Pesquisado: " + NomePesquisado);
		int Auxiliar=0;
		
		// Procurando Locatario:
			for (PessoaFisica PessoaF : Pessoas) {
				if (PessoaF.getNome().contentEquals(NomePesquisado)) {
					System.out.println("Locatario Encontrado");
					System.out.println("Dados:");
					System.out.println("Nome: " + PessoaF.getNome());
					System.out.println("CPF: " + PessoaF.getCpf());
					System.out.println("Email: " + PessoaF.getEmail());
					System.out.println("Celular: " + PessoaF.getCelular());
					Auxiliar=1;
				}
			}
			try {
				for (PessoaFisica PessoaF : Pessoas) {
						if ((! PessoaF.getNome().equals(NomePesquisado) && Auxiliar==0)) {
								throw new ObjetoNaoEncontradoException(" ");
						}	
				} 
				}catch (ObjetoNaoEncontradoException e) {
				System.out.println(e.getMessage());
				System.out.println("Erro! Pessoa nao encontrado!");
				System.out.println("Deseja tentar novamente? Digite Sim/sim ou Não/não");
				String Tentar;
				Tentar=leitor.nextLine();
				if(Tentar.equals("Sim")||Tentar.equals("sim")){
					PesquisaFisicaPessoaNome(Pessoas);
				} else if(Tentar.equals("Não")||Tentar.equals("não")){
					System.out.println("Retornando ao programa...");
					return;
				}
			}
	}
			
	
	public static void PesquisaFisicaPessoaCPF(ArrayList<PessoaFisica> Pessoas) {
		
		
		System.out.println("Digite o CPF:");
		String CPFPesquisado = leitor.nextLine();
		int Auxiliar=0;

		// Procurando Locatario:
			for (PessoaFisica PessoaF : Pessoas) {
				if (PessoaF.getCpf().equals(CPFPesquisado)) {
					System.out.println("Locatario Encontrado!");
					System.out.println("Dados:");
					System.out.println("Nome: " + PessoaF.getNome());
					System.out.println("CPF: " + PessoaF.getCpf());
					System.out.println("Email: " + PessoaF.getEmail());
					System.out.println("Celular: " + PessoaF.getCelular());
					System.out.println("\n");
					Auxiliar=1;
			}
			}
			try {
				for (PessoaFisica PessoaF : Pessoas) {
					if (! PessoaF.getCpf().equals(CPFPesquisado) && Auxiliar==0) {
						throw new ObjetoNaoEncontradoException(" ");
					}
			
					} 
			}catch (ObjetoNaoEncontradoException e) {
			System.out.println(e.getMessage());
			System.out.println("Erro! Pessoa nao encontrado!");
			System.out.println("Deseja tentar novamente? Digite Sim/sim ou Não/não");
			String Tentar;
			Tentar=leitor.nextLine();
			if(Tentar.equals("Sim")||Tentar.equals("sim")){
				PesquisaFisicaPessoaCPF(Pessoas);
			} else if(Tentar.equals("Não")||Tentar.equals("não")){
				System.out.println("Retornando ao programa...");
				return;
		}
		}
		
	} 
	
	public static void PesquisaFisicaPessoaEmail(ArrayList<PessoaFisica> Pessoas) {
		
		
		System.out.println("Digite o Email:");
		String EmailPesquisado = leitor.nextLine();
		System.out.println("Email Pesquisado: " + EmailPesquisado);
		int Auxiliar=0;

		// Procurando Locatario:
			for (PessoaFisica PessoaF : Pessoas) {
				if (PessoaF.getEmail().contentEquals(EmailPesquisado)) {
					System.out.println("Locatario Encontrado!");
					System.out.println("Dados:");
					System.out.println("Nome: " + PessoaF.getNome());
					System.out.println("CPF: " + PessoaF.getCpf());
					System.out.println("Email: " + PessoaF.getEmail());
					System.out.println("Celular: " + PessoaF.getCelular());
					Auxiliar=1;
					
				}
			}
			try {
				for (PessoaFisica PessoaF : Pessoas) {
					if (! PessoaF.getCpf().equals(EmailPesquisado) && Auxiliar==0) {
						throw new ObjetoNaoEncontradoException(" ");
					}	
				} 
				}catch (ObjetoNaoEncontradoException e) {
				System.out.println(e.getMessage());
				System.out.println("Erro! Pessoa nao encontrado!");
				System.out.println("Deseja tentar novamente? Digite Sim/sim ou Não/não");
				String Tentar;
				Tentar=leitor.nextLine();
				if(Tentar.equals("Sim")||Tentar.equals("sim")){
					PesquisaFisicaPessoaCPF(Pessoas);
				} else if(Tentar.equals("Não")||Tentar.equals("não")){
					System.out.println("Retornando ao programa...");
					return;
				}
				}
	}
		
	
	public static void PesquisaPessoaJuridicaNome(ArrayList<PessoaJuridica> PessoasJ) {
		
		
		System.out.println("Digite o nome social da empresa:");
		String NomePesquisadoJ = leitor.nextLine();
		System.out.println("Nome Pesquisa: " + NomePesquisadoJ);
		int Auxiliar=1;

		// Procurando Locatario:
		for (PessoaJuridica PessoaJ : PessoasJ) {
			if (PessoaJ.getNomeSocial().equalsIgnoreCase(NomePesquisadoJ)) {
				System.out.println("Locatario Encontrada!");
				System.out.println("Dados:");
				System.out.println("Nome Social da Empresa: " + PessoaJ.getNomeSocial());
				System.out.println("Email: " + PessoaJ.getEmail());
				System.out.println("CNPJ: "+PessoaJ.getCnpj());
				System.out.println("Celular: " + PessoaJ.getCelular());
				System.out.println("\n");
				Auxiliar=1;
			}
		}
			try {
				for (PessoaJuridica PessoaJ : PessoasJ) {
					if (! PessoaJ.getNomeSocial().equals(NomePesquisadoJ) && Auxiliar==0) {
						throw new ObjetoNaoEncontradoException("Erro! Pessoa nao encontrado!");
					}	
				} 
				}catch (ObjetoNaoEncontradoException e) {
				System.out.println(e.getMessage());
				System.out.println("Erro! Pessoa nao encontrado!");
				System.out.println("Deseja tentar novamente? Digite Sim/sim ou Não/não");
				String Tentar;
				Tentar=leitor.nextLine();
				if(Tentar.equals("Sim")||Tentar.equals("sim")){
					PesquisaPessoaJuridicaNome(PessoasJ);
				} else if(Tentar.equals("Não")||Tentar.equals("não")){
					System.out.println("Retornando ao programa...");
					return;
				}
				}
	} 
	

	public static void PesquisaPessoaJuridicaCNPJ(ArrayList<PessoaJuridica> PessoasJ) {
	
	
		System.out.println("Digite o CNPJ da Empresa:");
		String CNPJPesquisado = leitor.nextLine();
		System.out.println("Nome Pesquisa: " + CNPJPesquisado);
		int Auxiliar=1;
	
		// Procurando Locatario
		for (PessoaJuridica PessoaJ : PessoasJ) {
			if (PessoaJ.getCnpj().contentEquals(CNPJPesquisado)) {
				System.out.println("Pessoa Encontrada!");
				System.out.println("Dados:");
				System.out.println("Nome Social da Empresa: " + PessoaJ.getNomeSocial());
				System.out.println("CNPJ: "+PessoaJ.getCnpj());
				System.out.println("Email: " + PessoaJ.getEmail());
				System.out.println("Celular: " + PessoaJ.getCelular());
				System.out.println("\n");
				Auxiliar=1;
			} 
			}
		try {
			for (PessoaJuridica PessoaJ : PessoasJ) {
				if (! PessoaJ.getNomeSocial().equals(CNPJPesquisado) && Auxiliar==0) {
					throw new ObjetoNaoEncontradoException(" ");
				}	
			} 
			}catch (ObjetoNaoEncontradoException e) {
			System.out.println(e.getMessage());
			System.out.println("Erro! Pessoa nao encontrado!");
			System.out.println("Deseja tentar novamente? Digite Sim/sim ou Não/não");
			String Tentar;
			Tentar=leitor.nextLine();
			if(Tentar.equals("Sim")||Tentar.equals("sim")){
				PesquisaPessoaJuridicaNome(PessoasJ);
			} else if(Tentar.equals("Não")||Tentar.equals("não")){
				System.out.println("Retornando ao programa...");
				return;
			}
			}
	}
}

