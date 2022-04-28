package MenuGerenciaFrota;

import java.util.ArrayList;
import java.util.Scanner;

import Excecoes.ObjetoNaoEncontradoException;

import gerenciaFrota.Veiculo;
import gerenciaFrota.VeiculoDePasseio;

public class PesquisarVe�culos {
	
	// Criando o leitor "global".
	public static Scanner leitor = new Scanner(System.in);
	
	public static void PesquisaVeiculo() {
		System.out.println("+------------------------------------------------------------------+");
		System.out.println("|             Bem Vindo ao Menu Pesquisa de Ve�culos               |");
		System.out.println("|               1 - Pesquisar Ve�culo pelo Renavam                 |");
		System.out.println("|          2 - Pesquisar Ve�culo por Marca, Modelo ou Categoria    |");
		System.out.println("+------------------------------------------------------------------+");
		System.out.println("                 Escolha uma dessas op��es:                        ");
	}
	
	public static void MenuEscolhaMMC() {
		System.out.println("+------------------------------------------------------------------+");
		System.out.println("|  Bem Vindo ao M�todo de Pesquisa por Marca, Modelo ou Categoria  |");
		System.out.println("|                 1 - Pela Marca                	           |");
		System.out.println("|                 2 - Pelo Modelo 				   |");
		System.out.println("|                 3 - Pela Categoria (Ve�culo de Passeio)	   |");
		System.out.println("+------------------------------------------------------------------+");
		System.out.println("                 Escolha uma dessas op��es:                     ");
	}
	
	public static void PesquisaVeiculoRenavam(ArrayList<Veiculo> veiculos) {
		
		System.out.println("M�todo de Pesquisa pelo Renavam..");
		
		// Pegando o Renavam.
		System.out.println("Digite o Renavam do Ve�culo:");
		int RenavamPesquisado = leitor.nextInt();
		System.out.println("\nRenavam pesquisado: " + RenavamPesquisado);

		boolean veiculoEncontrado = false;
		
		// Procurando o Veiculo.
		try {
			for (Veiculo v : veiculos) {
				if (v.getRenavam()==RenavamPesquisado) {
					System.out.println("\n\nVe�culo encontrado!");
					System.out.println("+--------------Dados--------------+");
					System.out.println("  Marca: " + v.getMarca());
					System.out.println("  Modelo: " + v.getModelo());
					System.out.println("  Ano de Fabica��o: " + v.getAnoFabricacao());
					System.out.println("  Ano do Modelo: " + v.getAnoModelo());
					System.out.println("+---------------------------------+");
					veiculoEncontrado = true;
				}
			}
			
			if (veiculoEncontrado == false) {
				// Lan�ando a exce��o.
				throw new ObjetoNaoEncontradoException("Erro! Ve�culo n�o encontrado!");
			}
			
		} catch (ObjetoNaoEncontradoException e) { // Capturando a exce��o.
			System.out.println(e.getMessage());
			//e.printStackTrace();
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
		case 3:
			PesquisaVeiculoCategoria(veiculos);
			break;
		default:
			System.out.println("Escolha inv�lida. Tente novamente!!"); 
		}
		
				
	}

	private static void PesquisaVeiculoCategoria(ArrayList<Veiculo> veiculos) {
		
		System.out.println("Digite a Categoria do Ve�culo de Passeio:");
		System.out.println("(Compacto, Compacto de Luxo, Sedan ou SUVs)");
		String PesquisaCategoria = leitor.nextLine();
		
		// Criando a vari�vel �veiculoEncontrado�para controlar os lan�amentos das exce��es.
		boolean veiculoEncontrado = false;
		
		// Procurando o Veiculo.
		try {
			for (Veiculo v : veiculos) {
				if ( ((VeiculoDePasseio) v).getCategoriaPasseio() == PesquisaCategoria ) {
					System.out.println("Ve�culo encontrado!");
					System.out.println("Dados:");
					System.out.println("Marca: " + v.getMarca());
					System.out.println("Modelo: " + v.getModelo());
					System.out.println("Ano de Fabicacao: " + v.getAnoFabricacao());
					System.out.println("Ano do Modelo: " + v.getAnoModelo());
					System.out.println("Renavam: " + v.getRenavam());
					// Mudando a vari�vel �veiculoEncontrado� para true caso o ve�culo seja encontrado.
					veiculoEncontrado = true;
				}
			}
			
			if (veiculoEncontrado == false) {
				// Lan�ando a exce��o.
				throw new ObjetoNaoEncontradoException("Erro! Ve�culo n�o encontrado!");
			}
			
		} catch (ObjetoNaoEncontradoException e) {
			// Mostrando a mensagem de erro.
			System.out.println(e.getMessage());
		}

	}

	private static void PesquisaVeiculoModelo(ArrayList<Veiculo> veiculos) {

		System.out.println("Digite o Modelo do ve�culo:");
		String PesquisaModelo = leitor.nextLine();

		boolean veiculoEncontrado = false;
		
		// Procurando o Veiculo.
		try {
			for (Veiculo v : veiculos) {
				if (v.getModelo() == PesquisaModelo) {
					System.out.println("Ve�culo encontrado!");
					System.out.println("Dados:");
					System.out.println("Marca: " + v.getMarca());
					System.out.println("Ano de Fabicacao: " + v.getAnoFabricacao());
					System.out.println("Ano do Modelo: " + v.getAnoModelo());
					System.out.println("Renavam: " + v.getRenavam());
					veiculoEncontrado = true;
				}
			}
			
			if (veiculoEncontrado == false) {
				// Lan�ando a exce��o.
				throw new ObjetoNaoEncontradoException("Erro! Ve�culo n�o encontrado!");
			}
			
		} catch (ObjetoNaoEncontradoException e) {
			System.out.println(e.getMessage());
		}

	}

	private static void PesquisaVeiculoMarca(ArrayList<Veiculo> veiculos) {
		
		System.out.println("Digite a Marca do ve�culo:");
		String PesquisaMarca = leitor.nextLine();
		
		boolean veiculoEncontrado = false;
		
		// Procurando o Ve�culo.
		try {
			for (Veiculo v : veiculos) {
				if (v.getMarca() == PesquisaMarca) {
					System.out.println("Ve�culo encontrado!");
					System.out.println("Dados:");
					System.out.println("Modelo: " + v.getModelo());
					System.out.println("Ano de Fabicacao: " + v.getAnoFabricacao());
					System.out.println("Ano do Modelo: " + v.getAnoModelo());
					System.out.println("Renavam: " + v.getRenavam());
					veiculoEncontrado = true;
				}
			}
			
			if (veiculoEncontrado == false) {
				// Lan�ando a exce��o.
				throw new ObjetoNaoEncontradoException("Erro! Ve�culo n�o encontrado!");
			}
			
		} catch (ObjetoNaoEncontradoException e) {
			System.out.println(e.getMessage());
		}
		
	}
	
}