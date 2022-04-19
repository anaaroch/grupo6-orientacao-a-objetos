package MenuGerenciaFrota;

import java.util.Scanner;

public class MenuGerenciaFrota {
	public static void MenuGerenciaF() {
		System.out.println("------------------- Menu [Ger�ncia Frota] -----------------\n");
		System.out.println("                 1 - Cadastrar Ve�culos                      ");
		System.out.println("                 2 - Pesquisar Ve�culos                      ");
		System.out.println("                 3 - Atualizar Dados de um Ve�culo           ");
		System.out.println("                 4 - Remover Ve�culo da Frota                ");
		System.out.println("                                                             ");
		System.out.println("                 Escolha uma dessas op��es:                  ");
}
	public static void CadastroVeicul() {
		CadastrarVe�culos CadastrarV=new CadastrarVe�culos();
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
				System.out.println("Escolha inv�lida. Tente novamente!!");
		}
	}
	public static void PesquisarVeiculos() {
		PesquisarVe�culos PesquisaV=new PesquisarVe�culos();
		PesquisarVe�culos.PesquisaVeiculo();
		
		int escolhaPV;
		
		Scanner lerPv=new Scanner(System.in);
		
		
		escolhaPV=lerPv.nextInt();
		
		switch(escolhaPV) {
		case 1:
			PesquisarVe�culos.PesquisaVeiculoRenavam();
			break;
		case 2:	
			PesquisarVe�culos.PesquisaVeiculoMMR();
			break;
			
			default:
				System.out.println("Escolha inv�lida. Tente novamente!!"); 
		}
	}
	
	public static void AtualizaDados() {
		System.out.println("M�todo - Atualizar dados de um ve�culo...");
	}
	
	public static void RemoveVeiculo() {
		System.out.println("M�todo - Remover ve�culo de frota...");
	}
}