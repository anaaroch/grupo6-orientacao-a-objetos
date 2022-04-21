package Menu;

import java.util.ArrayList;
import java.util.Scanner;

import Excecoes.ObjetoNaoEncontradoException;
import gerenciaFrota.Motocicleta;
import gerenciaFrota.Veiculo;
import gerenciaFrota.VeiculoDePasseio;
import gerenciaFrota.VeiculoUtilitario;

public class MenuGerenciaFrota {
	
	// Criando o leitor que vai ser usado em toda a classe.
	public static Scanner leitor = new Scanner(System.in);
	
	static ArrayList<Veiculo> veiculos = new ArrayList<Veiculo>();
	
	public static void MenuFrotaPrincipal() {
		System.out.println("------------------- Menu [Gerência Frota] -----------------\n");
		System.out.println("                 1 - Cadastrar Veículos                      ");
		System.out.println("                 2 - Pesquisar Veículos                      ");
		System.out.println("                 3 - Atualizar Dados de um Veículo           ");
		System.out.println("                 4 - Remover Veículo da Frota                ");
		System.out.println("                                                             ");
		System.out.println("                 Escolha uma dessas opções:                  ");
	}
	
	public static void CadastroVeiculo() {

		// Guardando dados basicos do veículo.
		Veiculo dadosBasicos = CadastrarVeículos.cadastro();
		
		// Menu de escolha do tipo de veículo.
		CadastrarVeículos.CadastrarVeiculo();
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
			System.out.println("Escolha inválida. Tente novamente!!");
		}
		
	}
	public static void PesquisarVeiculos() {
				
		//Chamando o menu
		PesquisarVeículos.PesquisaVeiculo();
		
		// Chamando o metodo do tipo de pesquisa.
		int escolhaPV;
		escolhaPV = leitor.nextInt();
		
		// Chamando o metodo de acordo com a escolha.
		switch(escolhaPV) {
		case 1:
			PesquisarVeículos.PesquisaVeiculoRenavam(veiculos);
			break;
		case 2:	
			PesquisarVeículos.PesquisaVeiculoMMC(veiculos);
			break;
			
		default:
			System.out.println("Escolha inválida. Tente novamente!!"); 
		}

	}
	
	public static void AtualizaDados() {
		System.out.println("Método - Atualizar dados de um veículo...");
	}
	
	public static void RemoveVeiculo() throws ObjetoNaoEncontradoException {

		System.out.println("Metodo Remover veiculo");
		System.out.println("Digite o renavam do veiculo a ser removido: ");
		int renavamProcurado;
		renavamProcurado = leitor.nextInt();

		for (Veiculo v : veiculos) {
			if (v.getRenavam() == renavamProcurado) {
				veiculos.remove(v);
				System.out.println("Veiculo removido com sucesso.");
				break;
			}
		}


	}
}