package MenuGerenciaFrota;

import java.util.ArrayList;
import java.util.Scanner;

import Excecoes.ObjetoNaoEncontradoException;

import gerenciaFrota.Veiculo;
import gerenciaFrota.VeiculoDePasseio;

public class PesquisarVeículos {
	
	// Criando o leitor "global".
	public static Scanner leitor = new Scanner(System.in);
	
	public static void PesquisaVeiculo() {
		System.out.println("+------------------------------------------------------------------+");
		System.out.println("|             Bem Vindo ao Menu Pesquisa de Veículos               |");
		System.out.println("|               1 - Pesquisar Veículo pelo Renavam                 |");
		System.out.println("|          2 - Pesquisar Veículo por Marca, Modelo ou Categoria    |");
		System.out.println("+------------------------------------------------------------------+");
		System.out.println("                 Escolha uma dessas opções:                        ");
	}
	
	public static void MenuEscolhaMMC() {
		System.out.println("+------------------------------------------------------------------+");
		System.out.println("|  Bem Vindo ao Método de Pesquisa por Marca, Modelo ou Categoria  |");
		System.out.println("|                 1 - Pela Marca                	           |");
		System.out.println("|                 2 - Pelo Modelo 				   |");
		System.out.println("|                 3 - Pela Categoria (Veículo de Passeio)	   |");
		System.out.println("+------------------------------------------------------------------+");
		System.out.println("                 Escolha uma dessas opções:                     ");
	}
	
	public static Veiculo RetornaVeiculo(ArrayList<Veiculo> veiculos) {
		
		// O método retorna um veículo com um determinado Renavam.
		
		// Objeto auxiliar.
		Veiculo veiculoAuxiliar = null;
		
		System.out.println("Método Retorna Veículo");
	
		// Pegando o Renavam.
		System.out.println("Digite o Renavam do Veículo:");
		int RenavamPesquisado = leitor.nextInt();
		System.out.println("Renavam pesquisado: " + RenavamPesquisado + "\n");

		boolean veiculoEncontrado = false;
		
		// Procurando o Veiculo.
		try {
			for (Veiculo v : veiculos) {
				if (v.getRenavam()==RenavamPesquisado) {
					veiculoAuxiliar = v; // Guardando o veículo no objeto auxiliar.
					veiculoEncontrado = true;
					break;	
				}
			}
			
			if (veiculoEncontrado == false) {
				// Lançando a exceção.
				throw new ObjetoNaoEncontradoException("Erro! Veículo não encontrado!");
			}
	
		} catch (ObjetoNaoEncontradoException e) { // Capturando a exceção.
			System.out.println(e.getMessage());
			return null;
			//e.printStackTrace();
		}
		
		return veiculoAuxiliar;
		
	}
	
	public static void PesquisaVeiculoRenavam(ArrayList<Veiculo> veiculos) {
		
		System.out.println("Método de Pesquisa pelo Renavam");
		
		// Pegando o Renavam.
		System.out.println("Digite o Renavam do Veículo:");
		int RenavamPesquisado = leitor.nextInt();
		System.out.println("\nRenavam pesquisado: " + RenavamPesquisado);

		boolean veiculoEncontrado = false;
		
		// Procurando o Veiculo.
		try {
			for (Veiculo v : veiculos) {
				if (v.getRenavam()==RenavamPesquisado) {
					System.out.println("\nVeículo encontrado!");
					System.out.println("+-------------------------------------------+");
					System.out.println(" Dados:");
					System.out.println("+-------------------------------------------+");
					System.out.println("	Marca: " + v.getMarca());
					System.out.println("	Modelo: " + v.getModelo());
					System.out.println("	Ano de Fabicação: " + v.getAnoFabricacao());
					System.out.println("	Ano do Modelo: " + v.getAnoModelo());
					System.out.println("+-------------------------------------------+");
					System.out.println("\n");
					veiculoEncontrado = true;
				}
			}
			
			if (veiculoEncontrado == false) {
				// Lançando a exceção.
				throw new ObjetoNaoEncontradoException("Erro! Veículo não encontrado!");
			}
			
		} catch (ObjetoNaoEncontradoException e) { // Capturando a exceção.
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
		
		// Chamando o método de acordo com a escolha.
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
			System.out.println("Escolha inválida!"); 
		}
		
				
	}

	private static void PesquisaVeiculoCategoria(ArrayList<Veiculo> veiculos) {
		
		System.out.println("Digite a Categoria do Veículo de Passeio:");
		System.out.println("(Compacto, Compacto de Luxo, Sedan ou SUVs)");
		String PesquisaCategoria = leitor.nextLine();
		
		// Criando a variável “veiculoEncontrado”para controlar os lançamentos das exceções.
		boolean veiculoEncontrado = false;
		
		// Procurando o Veiculo.
		try {
			for (Veiculo v : veiculos) {
				if ( ((VeiculoDePasseio) v).getCategoriaPasseio() == PesquisaCategoria ) {
					System.out.println("Veículo encontrado!");
					System.out.println("Dados:");
					System.out.println("Marca: " + v.getMarca());
					System.out.println("Modelo: " + v.getModelo());
					System.out.println("Ano de Fabicacao: " + v.getAnoFabricacao());
					System.out.println("Ano do Modelo: " + v.getAnoModelo());
					System.out.println("Renavam: " + v.getRenavam());
					System.out.println("\n");
					// Mudando a variável “veiculoEncontrado” para true caso o veículo seja encontrado.
					veiculoEncontrado = true;
				}
			}
			
			if (veiculoEncontrado == false) {
				// Lançando a exceção.
				throw new ObjetoNaoEncontradoException("Erro! Veículo não encontrado!");
			}
			
		} catch (ObjetoNaoEncontradoException e) {
			// Mostrando a mensagem de erro.
			System.out.println(e.getMessage());
		}

	}

	private static void PesquisaVeiculoModelo(ArrayList<Veiculo> veiculos) {

		System.out.println("Digite o Modelo do veículo:");
		String PesquisaModelo = leitor.nextLine();

		boolean veiculoEncontrado = false;
		
		// Procurando o Veiculo.
		try {
			for (Veiculo v : veiculos) {
				if (v.getModelo() == PesquisaModelo) {
					System.out.println("Veículo encontrado!");
					System.out.println("Dados:");
					System.out.println("Marca: " + v.getMarca());
					System.out.println("Ano de Fabicacao: " + v.getAnoFabricacao());
					System.out.println("Ano do Modelo: " + v.getAnoModelo());
					System.out.println("Renavam: " + v.getRenavam());
					System.out.println("\n");
					veiculoEncontrado = true;
				}
			}
			
			if (veiculoEncontrado == false) {
				// Lançando a exceção.
				throw new ObjetoNaoEncontradoException("Erro! Veículo não encontrado!");
			}
			
		} catch (ObjetoNaoEncontradoException e) {
			System.out.println(e.getMessage());
		}

	}

	private static void PesquisaVeiculoMarca(ArrayList<Veiculo> veiculos) {
		
		System.out.println("Digite a Marca do veículo:");
		String PesquisaMarca = leitor.nextLine();
		
		boolean veiculoEncontrado = false;
		
		// Procurando o Veículo.
		try {
			for (Veiculo v : veiculos) {
				if (v.getMarca() == PesquisaMarca) {
					System.out.println("Veículo encontrado!");
					System.out.println("Dados:");
					System.out.println("Modelo: " + v.getModelo());
					System.out.println("Ano de Fabicacao: " + v.getAnoFabricacao());
					System.out.println("Ano do Modelo: " + v.getAnoModelo());
					System.out.println("Renavam: " + v.getRenavam());
					System.out.println("\n");
					veiculoEncontrado = true;
				}
			}
			
			if (veiculoEncontrado == false) {
				// Lançando a exceção.
				throw new ObjetoNaoEncontradoException("Erro! Veículo não encontrado!");
			}
			
		} catch (ObjetoNaoEncontradoException e) {
			System.out.println(e.getMessage());
		}
		
	}
	
}