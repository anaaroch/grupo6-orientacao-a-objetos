package MenuGerenciaLocatario;

import java.util.ArrayList;
import java.util.Scanner;

import Excecoes.ObjetoNaoEncontradoException;
import gerenciaLocatarios.PessoaFisica;
import gerenciaLocatarios.PessoaJuridica;

public class AlterarLocatario {
	public static Scanner leitor = new Scanner(System.in);
	
	public static void MenuAltera() {
		
		System.out.println("------------------- Alterar Locatario ---------------------\n");
		System.out.println("                 1 - Pessoa Fisica                           ");
		System.out.println("                 2 - Pessoa Juridica                         ");
		System.out.println("                                                             ");
		System.out.println("                 Escolha uma dessas opções:                  ");
			
		}
	
	public static void AlterarPessoaFisica(ArrayList<PessoaFisica> Pessoas) {
	
		System.out.println("Digite o nome do Locatario ao ser alterado:");
		String NomeAlterado = leitor.nextLine();
		System.out.println("Dados do ");
		try {
			for (PessoaFisica PessoaF : Pessoas) {
				if (PessoaF.getNome().contentEquals(NomeAlterado))
					System.out.println("Deseja realmente alterar os dados do Locatario "+PessoaF.getNome()+"? Digite Sim/sim ou Não/não");
					String Alterar;
					Alterar=leitor.nextLine();
					if(Alterar.equals("Sim")||Alterar.equals("sim")){
						System.out.println("Coloque o seu Nome Completo:");
						PessoaF.setNome(leitor.nextLine());
						System.out.println("Coloque o seu CPF:");
						PessoaF.setCpf(leitor.nextLine());
						System.out.println("Coloque o seu Estado Civil:");
						PessoaF.setEstadocivil(leitor.nextLine());
						System.out.println("Coloque o seu Email:");
						PessoaF.setEmail(leitor.nextLine());
						System.out.println("Coloque o seu Telefone:");
						PessoaF.setCelular(leitor.nextLine());
					} else if(Alterar.equals("Não")||Alterar.equals("não")){
				System.out.println("Retornando ao programa...");
				return;
					}else {
						throw new ObjetoNaoEncontradoException("Erro! Pessoa nao encontrado!");
					}
				}
		} catch (ObjetoNaoEncontradoException e) {
			System.out.println("Erro! Pessoa nao encontrado!");
			System.out.println("Deseja tentar novamente? Digite Sim/sim ou Não/não");
			String Tentar;
			Tentar=leitor.nextLine();
			if(Tentar.equals("Sim")||Tentar.equals("sim")){
				AlterarPessoaFisica(Pessoas);
			} else if(Tentar.equals("Não")||Tentar.equals("não")){
				System.out.println("Retornando ao programa...");
				return;
				}
			}
	}
	
	public static void AlterarPessoaJuridica(ArrayList<PessoaJuridica> PessoasJ) {
		
		System.out.println("Digite o nome do Locatario ao ser alterado:");
		String NomeAlterado = leitor.nextLine();
		System.out.println("Dados do ");
		try {
			for (PessoaJuridica PessoaJ : PessoasJ) {
				if (PessoaJ.getNomeSocial().contentEquals(NomeAlterado))
					System.out.println("Deseja realmente alterar os dados do Locatario "+PessoaJ.getNomeSocial()+"? Digite Sim/sim ou Não/não");
					String Alterar;
					Alterar=leitor.nextLine();
					if(Alterar.equals("Sim")||Alterar.equals("sim")){
						System.out.println("Coloque o Nome Social da sua Empresa:");
						PessoaJ.setNomeSocial(leitor.nextLine());
						System.out.println("Coloque o CNPJ:");
						PessoaJ.setCnpj(leitor.nextLine());
						System.out.println("Coloque o seu Email:");
						PessoaJ.setEmail(leitor.nextLine());
						System.out.println("Coloque o seu Telefone:");
						PessoaJ.setCelular(leitor.nextLine());
					} else if(Alterar.equals("Não")||Alterar.equals("não")){
				System.out.println("Retornando ao programa...");
				return;
					}else {
						throw new ObjetoNaoEncontradoException("Erro! Pessoa nao encontrado!");
					}
				}
		}catch (ObjetoNaoEncontradoException e) {
			System.out.println("Erro! Pessoa nao encontrado!");
			System.out.println("Deseja tentar novamente? Digite Sim/sim ou Não/não");
			String Tentar;
			Tentar=leitor.nextLine();
			if(Tentar.equals("Sim")||Tentar.equals("sim")){
				AlterarPessoaJuridica(PessoasJ);
			} else if(Tentar.equals("Não")||Tentar.equals("não")){
				System.out.println("Retornando ao programa...");
				return;
				}
			}
	}
}
	
