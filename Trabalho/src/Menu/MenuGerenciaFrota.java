package Menu;

import java.util.Scanner;

public class MenuGerenciaFrota {
	public static void MenuGerenciaF() {
		System.out.println("------------------- Menu [Gerência Frota] -----------------\n");
		System.out.println("                 1 - Cadastrar Veículos                      ");
		System.out.println("                 2 - Pesquisar Veículos                      ");
		System.out.println("                 3 - Atualizar Dados de um Veículo           ");
		System.out.println("                 4 - Remover Veículo da Frota                ");
		System.out.println("                                                             ");
		System.out.println("                 Escolha uma dessas opções:                  ");
}
	public static void CadastroVeicul() {
		CadastrarVeículos CadastrarV=new CadastrarVeículos();
		CadastrarV.cadastro();
		CadastrarV.CadastrarVeiculo();
		
		int escolhac;
		
		Scanner lerc=new Scanner(System.in);
		
		
		escolhac=lerc.nextInt();
		
		switch(escolhac) {
		case 1:
			CadastrarV.CadastrarPasseio();
			break;
		case 2:	
			CadastrarV.CadastrarUtilitario();
			break;
		case 3:
			CadastrarV.CadastrarMotocicleta();
			break;
			
			default:
				System.out.println("Escolha inválida. Tente novamente!!");
		}
	}
	public static void PesquisarVeiculos() {
		PesquisarVeículos PesquisaV=new PesquisarVeículos();
		PesquisarVeículos.PesquisaVeiculo();
		
		int escolhaPV;
		
		Scanner lerPv=new Scanner(System.in);
		
		
		escolhaPV=lerPv.nextInt();
		
		switch(escolhaPV) {
		case 1:
			PesquisarVeículos.PesquisaVeiculoRenavam();
			break;
		case 2:	
			PesquisarVeículos.PesquisaVeiculoMMR();
			break;
			
			default:
				System.out.println("Escolha inválida. Tente novamente!!"); 
		}
	}
	
	public static void AtualizaDados() {
		System.out.println("Método - Atualizar dados de um veículo...");
	}
	
	public static void RemoveVeiculo() {
		System.out.println("Método - Remover veículo de frota...");
	}
}