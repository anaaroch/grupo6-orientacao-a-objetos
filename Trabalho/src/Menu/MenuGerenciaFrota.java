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
		System.out.println("------------------- Menu [Ger�ncia Frota] -----------------\n");
		System.out.println("                 1 - Cadastrar Ve�culos                      ");
		System.out.println("                 2 - Pesquisar Ve�culos                      ");
		System.out.println("                 3 - Atualizar Dados de um Ve�culo           ");
		System.out.println("                 4 - Remover Ve�culo da Frota                ");
		System.out.println("                                                             ");
		System.out.println("                 Escolha uma dessas op��es:                  ");
	}
	
	public static void CadastroVeiculo() {

		// Guardando dados basicos do ve�culo.
		Veiculo dadosBasicos = CadastrarVe�culos.cadastro();
		
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
			System.out.println("Escolha inv�lida. Tente novamente!!");
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
			System.out.println("Escolha inv�lida. Tente novamente!!"); 
		}

	}
	
	public static void AtualizaDados() {
		System.out.println("M�todo - Atualizar dados de um ve�culo...");
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