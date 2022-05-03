package MenuGerenciaFrota;

import java.util.ArrayList;
import java.util.Scanner;

import Excecoes.ObjetoNaoEncontradoException;
import gerenciaFrota.Motocicleta;
import gerenciaFrota.Veiculo;
import gerenciaFrota.VeiculoDePasseio;
import gerenciaFrota.VeiculoUtilitario;

public class MenuGerenciaFrota {
	
	public static Scanner leitor = new Scanner(System.in);
	
	static ArrayList<Veiculo> veiculos = new ArrayList<Veiculo>();
	
	public static void MenuFrotaPrincipal() {
		System.out.println("+-----------------------------------------------------------+");
		System.out.println("|             Bem Vindo ao Menu Gerência Frota              |");
		System.out.println("|                1 - Cadastrar Veículos                     |");
		System.out.println("|                2 - Pesquisar Veículos                     |");
		System.out.println("|                3 - Atualizar Dados de um Veículo          |");
		System.out.println("|                4 - Remover Veículo da Frota               |");
		System.out.println("+-----------------------------------------------------------+");
		System.out.println("                  Escolha uma dessas opções:                 ");
	}
	
	public static void CadastroVeiculo(ArrayList<Veiculo> veiculos) {
		
		// Guardando dados basicos do veículo.
		Veiculo dadosBasicos = CadastrarVeículos.cadastro();
		
		if (dadosBasicos == null) { // Terminado o método caso os dados voltem vazios.
			System.out.println("Veículo não cadastrado!");
			return;
		}
		else {
			// Menu de escolha do tipo de veículo.
			CadastrarVeículos.MenuCadastrarVeiculo();
			// Escolhendo o tipo de veículo.
			int escolha;
			escolha = leitor.nextInt();
			
			// Chamando o metodo de acordo com a escolha.
			switch(escolha) {
			case 1:
				VeiculoDePasseio veiculoP = CadastrarVeículos.CadastrarPasseio(dadosBasicos);
				veiculos.add(veiculoP);
				break;
			case 2:	
				VeiculoUtilitario veiculoU = CadastrarVeículos.CadastrarUtilitario(dadosBasicos);
				veiculos.add(veiculoU);
				break;
			case 3:
				Motocicleta veiculoM = CadastrarVeículos.CadastrarMotocicleta(dadosBasicos);
				veiculos.add(veiculoM);
				break;
			default:
				System.out.println("Escolha inválida!");
			}
		}
		
	}
	
	public static void PesquisarVeiculos(ArrayList<Veiculo> veiculos) {
		
		// Chamando o menu
		PesquisarVeículos.PesquisaVeiculo();
		
		// Chamando o método do tipo de pesquisa.
		int escolhaPV;
		escolhaPV = leitor.nextInt();
		
		// Chamando o método de acordo com a escolha.
		switch(escolhaPV) {
		case 1:
			PesquisarVeículos.PesquisaVeiculoRenavam(veiculos);
			break;
		case 2:	
			PesquisarVeículos.PesquisaVeiculoMMC(veiculos);
			break;
		default:
			System.out.println("Escolha inválida!"); 
		}

	}
	
	public static void AtualizaDados(ArrayList<Veiculo> veiculos) {
				
		System.out.println("Bem vindo ao Método Atualiza Dados.");
		MetodoAtualizaDados.AtualizaBasico(veiculos);

		/*
		Será implementado apenas o método para atualizar os dados básicos.
		
		MetodoAtualizaDados.MenuAtualizaDadosFrota();
		
		int escolha;
		escolha = leitor.nextInt();
		switch(escolha) {
		case 1:
			MetodoAtualizaDados.AtualizaBasico(veiculos);
			break;
		case 2:	
			MetodoAtualizaDados.AtualizaPasseio(veiculos);
			break;
		case 3:
			//MetodoAtualizaDados.AtualizaUtilitario(veiculos);
			break;
		case 4:
			//MetodoAtualizaDados.AtualizaMotocicleta(veiculos);
			break;
		default:
			System.out.println("Escolha inválida!");
		}*/
	}

	public static void RemoveVeiculo(ArrayList<Veiculo> veiculos) {

		System.out.println("\n\nMétodo Remove Veículo!");
		System.out.println("Digite o renavam do veículo a ser removido:");
		
		Veiculo veiculoAuxiliar = null;
		
		int renavamProcurado;
		renavamProcurado = leitor.nextInt();
		
		try {
			
			for (Veiculo v : veiculos) {
				if (v.getRenavam() == renavamProcurado) {
					veiculoAuxiliar = v;
				}
			}
				
			// Verificando se o objeto está vazio e lançando a exception caso sim.
			if (veiculoAuxiliar == null) {
				throw new ObjetoNaoEncontradoException("Veículo não encontrado!");
			}
	
			else {
				veiculos.remove(veiculoAuxiliar);
				System.out.println("Veículo removido com sucesso!");
			}
		
		} catch (ObjetoNaoEncontradoException e) {
			System.out.println(e.getMessage());
		}
		
	}
}