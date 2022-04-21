package Menu;

import java.util.ArrayList;
import java.util.Scanner;

import gerenciaFrota.Veiculo;
import gerenciaFrota.VeiculoDePasseio;

public class PesquisarVe�culos {
	
	// Criando o leitor "global".
	public static Scanner leitor = new Scanner(System.in);
	
	public static void PesquisaVeiculo() {
		System.out.println("-------------------- Pesquisa de Ve�culos ---------------------\n  ");
		System.out.println("                 1 - Pesquisar Ve�culo pelo Renavam                ");
		System.out.println("                 2 - Pesquisar Ve�culo por Marca, Modelo e Renavam ");
		System.out.println("                                                                   ");
		System.out.println("                 Escolha uma dessas op��es:                        ");
	}
	
	public static void MenuEscolhaMMC() {
		System.out.println("-------------------- Pesquisa de Ve�culos ---------------------\n  ");
		System.out.println("                 1 - Pela Marca                					   ");
		System.out.println("                 2 - Pelo Modelo 								   ");
		System.out.println("                 3 - Pela Categoria (Veiculo de Passageiro)	       ");
		System.out.println("                                                                   ");
		System.out.println("              Escolha uma dessas op��es:                        ");
	}
	
	public static void PesquisaVeiculoRenavam(ArrayList<Veiculo> veiculos) {
		
		System.out.println("M�todo de Pesquisa pelo Renavam..");
		
		// Pegando o Renavam.
		System.out.println("Digite o Renavam do Ve�culo:");
		int RenavamPesquisado = leitor.nextInt();
		System.out.println("Renavam pesquisado: " + RenavamPesquisado);

		// Procurando o Veiculo.
		try {
			for (Veiculo v : veiculos) {
				if (v.getRenavam()==RenavamPesquisado) {
					System.out.println("Ve�culo encontrado!");
					System.out.println("Dados:");
					System.out.println("Marca: " + v.getMarca());
					System.out.println("Modelo: " + v.getModelo());
					System.out.println("Ano de Fabicacao: " + v.getAnoFabricacao());
					System.out.println("Ano do Modelo: " + v.getAnoModelo());
				}
			}
		} catch (Exception ObjetoNaoEncontradoException) {
			System.out.println("Erro! Ve�culo nao encontrado!");
		}
		
	}
	
	public static void PesquisaVeiculoMMC(ArrayList<Veiculo> veiculos) {
				
		System.out.println("Bem Vindo ao M�todo de Pesquisa por Marca, Modelo ou Categoria");
		
		// Menu de escolha
		MenuEscolhaMMC();
		
		// Lendo a escolha
		int escolha;
		escolha = leitor.nextInt();
		
		// Chamando o metodo de acordo com a escolha.
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
		
		System.out.println("Digite o Modelo do ve�culo:");
		String PesquisaCategoria = leitor.nextLine();
		
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
				}
			}
		} catch (Exception ObjetoNaoEncontradoException) {
			System.out.println("Erro! Ve�culo nao encontrado!");
		}

	}

	private static void PesquisaVeiculoModelo(ArrayList<Veiculo> veiculos) {

		System.out.println("Digite o Modelo do ve�culo:");
		String PesquisaModelo = leitor.nextLine();
		
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
				}
			}
		} catch (Exception ObjetoNaoEncontradoException) {
			System.out.println("Erro! Ve�culo nao encontrado!");
		}

	}

	private static void PesquisaVeiculoMarca(ArrayList<Veiculo> veiculos) {
				
		System.out.println("Digite a Marca do ve�culo:");
		String PesquisaMarca = leitor.nextLine();
		
		// Procurando o Veiculo.
		try {
			for (Veiculo v : veiculos) {
				if (v.getMarca() == PesquisaMarca) {
					System.out.println("Ve�culo encontrado!");
					System.out.println("Dados:");
					System.out.println("Modelo: " + v.getModelo());
					System.out.println("Ano de Fabicacao: " + v.getAnoFabricacao());
					System.out.println("Ano do Modelo: " + v.getAnoModelo());
					System.out.println("Renavam: " + v.getRenavam());
				}
			}
		} catch (Exception ObjetoNaoEncontradoException) {
			System.out.println("Erro! Ve�culo nao encontrado!");
		}
		
	}
}

