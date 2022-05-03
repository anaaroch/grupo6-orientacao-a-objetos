package MenuGerenciaFrota;

import java.util.ArrayList;
import java.util.Scanner;

import Excecoes.ObjetoNaoEncontradoException;

import gerenciaFrota.Veiculo;
import gerenciaFrota.VeiculoDePasseio;
import gerenciaLocatarios.PessoaFisica;

public class PesquisarVe�culos {
	
	// Criando o leitor "global".
	public static Scanner leitor = new Scanner(System.in);
	
	private static void clearBuffer(Scanner scanner) {
        if (scanner.hasNextLine()) {
            scanner.nextLine();
        }
    }
	
	public static void PesquisaVeiculo() {
		System.out.println("+------------------------------------------------------------------+");
		System.out.println("|             Bem Vindo ao Menu Pesquisa de Ve�culos               |");
		System.out.println("|               1 - Pesquisar Ve�culo pelo Renavam                 |");
		System.out.println("|          2 - Pesquisar Ve�culo por Marca ou Modelo               |");
		System.out.println("+------------------------------------------------------------------+");
		System.out.println("                 Escolha uma dessas op��es:                        ");
	}
	
	public static void MenuEscolhaMMC() {
		System.out.println("+------------------------------------------------------------------+");
		System.out.println("|  Bem Vindo ao M�todo de Pesquisa por Marca ou Modelo             |");
		System.out.println("|                 1 - Pela Marca                	           |");
		System.out.println("|                 2 - Pelo Modelo 				   |");
		System.out.println("+------------------------------------------------------------------+");
		System.out.println("                 Escolha uma dessas op��es:                     ");
	}
	
	public static Veiculo RetornaVeiculo(ArrayList<Veiculo> veiculos) {
		
		// O m�todo retorna um ve�culo com um determinado Renavam.
		
		// Objeto auxiliar.
		Veiculo veiculoAuxiliar = null;
		
		System.out.println("M�todo Retorna Ve�culo");
	
		// Pegando o Renavam.
		System.out.println("Digite o Renavam do Ve�culo:");
		int RenavamPesquisado = leitor.nextInt();
		System.out.println("Renavam pesquisado: " + RenavamPesquisado + "\n");

		boolean veiculoEncontrado = false;
		
		// Procurando o Veiculo.
		try {
			for (Veiculo v : veiculos) {
				if (v.getRenavam()==RenavamPesquisado) {
					veiculoAuxiliar = v; // Guardando o ve�culo no objeto auxiliar.
					veiculoEncontrado = true;
					break;	
				}
			}
			
			if (veiculoEncontrado == false) {
				// Lan�ando a exce��o.
				throw new ObjetoNaoEncontradoException("Erro! Ve�culo n�o encontrado!");
			}
	
		} catch (ObjetoNaoEncontradoException e) { // Capturando a exce��o.
			System.out.println(e.getMessage());
			return null;
			//e.printStackTrace();
		}
		
		return veiculoAuxiliar;
		
	}
	
	public static void PesquisaVeiculoRenavam(ArrayList<Veiculo> veiculos) {
		
		System.out.println("M�todo de Pesquisa pelo Renavam");
		
		// Pegando o Renavam.
		System.out.println("Digite o Renavam do Ve�culo:");
		int RenavamPesquisado = leitor.nextInt();
		System.out.println("\nRenavam pesquisado: " + RenavamPesquisado);

		boolean veiculoEncontrado = false;
		int Auxiliar = 0;
		
		// Procurando o Veiculo.
		for (Veiculo v : veiculos) {
			if (v.getRenavam()==RenavamPesquisado) {
				System.out.println("\nVe�culo encontrado!");
				System.out.println("+-------------------------------------------+");
				System.out.println(" Dados:");
				System.out.println("+-------------------------------------------+");
				System.out.println("	Marca: " + v.getMarca());
				System.out.println("	Modelo: " + v.getModelo());
				System.out.println("	Ano de Fabica��o: " + v.getAnoFabricacao());
				System.out.println("	Ano do Modelo: " + v.getAnoModelo());
				System.out.println("+-------------------------------------------+");
				System.out.println("\n");
				veiculoEncontrado = true;
				Auxiliar=1;
			}
			}
		try {
			for (Veiculo v: veiculos) {
					if (!(v.getRenavam()==RenavamPesquisado) && Auxiliar==0) {
							throw new ObjetoNaoEncontradoException(" ");
					}	
			} 
			}catch (ObjetoNaoEncontradoException e) {
			System.out.println(e.getMessage());
			System.out.println("Erro! Veiculo nao encontrado!");
			System.out.println("Deseja tentar novamente? Digite Sim/sim ou N�o/n�o");
			String Tentar;
			Tentar=leitor.nextLine();
			if(Tentar.equals("Sim")||Tentar.equals("sim")){
				PesquisaVeiculoRenavam(veiculos);
			} else if(Tentar.equals("N�o")||Tentar.equals("n�o")){
				System.out.println("Retornando ao programa...");
				return;
			}
		}
	}
	
	public static void PesquisaVeiculoMMC(ArrayList<Veiculo> veiculos) {
		
		// Menu de escolha.
		MenuEscolhaMMC();
		
		// Lendo a escolha.
		int escolha;
		escolha = leitor.nextInt();
		
		// Chamando o m�todo de acordo com a escolha.
		switch(escolha) {
		case 1:
			PesquisaVeiculoMarca(veiculos);
			break;
		case 2:	
			PesquisaVeiculoModelo(veiculos);
			break;
		default:
			System.out.println("Escolha inv�lida!"); 
		}
		
				
	}


	private static void PesquisaVeiculoModelo(ArrayList<Veiculo> veiculos) {

		System.out.println("Digite o Modelo do ve�culo:");
		String PesquisaModelo = leitor.nextLine();

		boolean veiculoEncontrado = false;
		
		// Procurando o Veiculo.
			for (Veiculo v : veiculos) {
				if (v.getModelo().equalsIgnoreCase(PesquisaModelo)) {
					System.out.println("Ve�culo encontrado!");
					System.out.println("Dados:");
					System.out.println("Marca: " + v.getMarca());
					System.out.println("Ano de Fabicacao: " + v.getAnoFabricacao());
					System.out.println("Ano do Modelo: " + v.getAnoModelo());
					System.out.println("Renavam: " + v.getRenavam());
					System.out.println("\n");
					veiculoEncontrado = true;
				}
			}
			try {
				for (Veiculo v: veiculos) {
						if (! v.getMarca().equalsIgnoreCase(PesquisaModelo) && veiculoEncontrado==false) {
								throw new ObjetoNaoEncontradoException(" ");
						}	
				} 
				}catch (ObjetoNaoEncontradoException e) {
				System.out.println(e.getMessage());
				System.out.println("Erro! Veiculo nao encontrado!");
				System.out.println("Deseja tentar novamente? Digite Sim/sim ou N�o/n�o");
				String Tentar;
				Tentar=leitor.nextLine();
				if(Tentar.equals("Sim")||Tentar.equals("sim")){
					PesquisaVeiculoModelo(veiculos);
				} else if(Tentar.equals("N�o")||Tentar.equals("n�o")){
					System.out.println("Retornando ao programa...");
					return;
				}
				}
		}

	private static void PesquisaVeiculoMarca(ArrayList<Veiculo> veiculos) {
		
		clearBuffer(leitor);
		System.out.println("Digite a Marca do ve�culo:");
		String PesquisaMarca = leitor.nextLine();
		
		boolean veiculoEncontrado = false;
		
		// Procurando o Ve�culo.
		for (Veiculo v : veiculos) {
			if (v.getMarca().equalsIgnoreCase(PesquisaMarca)){
				System.out.println("Ve�culo encontrado!");
				System.out.println("Dados:");
				System.out.println("Marca: " + v.getMarca());
				System.out.println("Modelo: " + v.getModelo());
				System.out.println("Ano de Fabicacao: " + v.getAnoFabricacao());
				System.out.println("Ano do Modelo: " + v.getAnoModelo());
				System.out.println("Renavam: " + v.getRenavam());
				System.out.println("\n");
				veiculoEncontrado = true;
			}
		}
		try {
			for (Veiculo v: veiculos) {
					if (! v.getMarca().equalsIgnoreCase(PesquisaMarca) && veiculoEncontrado==false) {
							throw new ObjetoNaoEncontradoException(" ");
					}	
			} 
			}catch (ObjetoNaoEncontradoException e) {
			System.out.println(e.getMessage());
			System.out.println("Erro! Veiculo nao encontrado!");
			System.out.println("Deseja tentar novamente? Digite Sim/sim ou N�o/n�o");
			String Tentar;
			Tentar=leitor.nextLine();
			if(Tentar.equals("Sim")||Tentar.equals("sim")){
				PesquisaVeiculoMarca(veiculos);
			} else if(Tentar.equals("N�o")||Tentar.equals("n�o")){
				System.out.println("Retornando ao programa...");
				return;
			}
		}
	}

}
