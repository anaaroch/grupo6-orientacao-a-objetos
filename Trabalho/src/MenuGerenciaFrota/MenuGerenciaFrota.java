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
		System.out.println("|             Bem Vindo ao Menu Ger�ncia Frota              |");
		System.out.println("|                1 - Cadastrar Ve�culos                     |");
		System.out.println("|                2 - Pesquisar Ve�culos                     |");
		System.out.println("|                3 - Atualizar Dados de um Ve�culo          |");
		System.out.println("|                4 - Remover Ve�culo da Frota               |");
		System.out.println("+-----------------------------------------------------------+");
		System.out.println("                  Escolha uma dessas op��es:                 ");
	}
	
	public static void CadastroVeiculo() {
		
		// Guardando dados basicos do ve�culo.
		Veiculo dadosBasicos = CadastrarVe�culos.cadastro();
		
		if (dadosBasicos == null) {
			System.out.println("Ve�culo n�o cadastrado!");
			return;
		}
		else {
			// Menu de escolha do tipo de ve�culo.
			CadastrarVe�culos.CadastrarVeiculo();
			// Escolhendo o tipo de ve�culo.
			int escolha;
			escolha = leitor.nextInt();
			
			// Chamando o metodo de acordo com a escolha.
			switch(escolha) {
			case 1:
				VeiculoDePasseio veiculoP = CadastrarVe�culos.CadastrarPasseio(dadosBasicos);
				veiculos.add(veiculoP);
				break;
			case 2:	
				VeiculoUtilitario veiculoU = CadastrarVe�culos.CadastrarUtilitario(dadosBasicos);
				veiculos.add(veiculoU);
				break;
			case 3:
				Motocicleta veiculoM = CadastrarVe�culos.CadastrarMotocicleta(dadosBasicos);
				veiculos.add(veiculoM);
				break;
			default:
				System.out.println("Escolha inv�lida!");
			}
		}
		
	}
	
	public static void PesquisarVeiculos() {
		
		//Chamando o menu
		PesquisarVe�culos.PesquisaVeiculo();
		
		// Chamando o metodo do tipo de pesquisa.
		int escolhaPV;
		escolhaPV = leitor.nextInt();
		
		// Chamando o metodo de acordo com a escolha.
		switch(escolhaPV) {
		case 1:
			PesquisarVe�culos.PesquisaVeiculoRenavam(veiculos);
			break;
		case 2:	
			PesquisarVe�culos.PesquisaVeiculoMMC(veiculos);
			break;
		default:
			System.out.println("Escolha inv�lida!"); 
		}

	}
	
	public static void AtualizaDados() {
				
		System.out.println("Bem vindo ao Metodo Atualiza Dados");
		MetodoAtualizaDados.AtualizaBasico(veiculos);
		
		/*
		Verificar com o professor se precisa atualizar todos os dados.
		MetodoAtualizaDados.MenuAtualizaDadosFrota();
		
		int escolha;
		escolha = leitor.nextInt();
		switch(escolha) {
		case 1:
			MetodoAtualizaDados.AtualizaBasico(veiculos);
			break;
		case 2:	
			//MetodoAtualizaDados.AtualizaPasseio(veiculos);
			break;
		case 3:
			//MetodoAtualizaDados.AtualizaUtilitario(veiculos);
			break;
		case 4:
			//MetodoAtualizaDados.AtualizaMotocicleta(veiculos);
			break;
		default:
			System.out.println("Escolha inv�lida!");
		}*/
	}

	public static void RemoveVeiculo() {

		System.out.println("\n\nMetodo Remover veiculo");
		System.out.println("Digite o renavam do veiculo a ser removido: ");
		
		Veiculo veiculoAuxiliar = null;
		
		int renavamProcurado;
		renavamProcurado = leitor.nextInt();
		
		try {
			
			for (Veiculo v : veiculos) {
				if (v.getRenavam() == renavamProcurado) {
					veiculoAuxiliar = v;
				}
			}
				
			// Verificando se o objeto esta vazio e lan�ando a exception caso sim.
			if (veiculoAuxiliar == null) {
				throw new ObjetoNaoEncontradoException("Ve�culo n�o encontrado!");
			}
	
			else {
				veiculos.remove(veiculoAuxiliar);
				System.out.println("Ve�culo removido com sucesso.");
			}
		
		} catch (ObjetoNaoEncontradoException e) {
			System.out.println(e.getMessage());
		}
		
	}
}