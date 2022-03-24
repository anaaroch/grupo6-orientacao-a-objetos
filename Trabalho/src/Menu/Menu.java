package Menu;

import java.util.Scanner;

public class Menu {
	
	public static void Menu() {
		System.out.println("------------------- Menu Principal ------------------------\n");
		System.out.println("                 1 - Gerenciar Locatários                    ");
		System.out.println("                 2 - Gerenciar Frota                         ");
		System.out.println("                 3 - Gerenciar Reservas	                     ");
		System.out.println("                 4 - Sair do Programa                        ");
		System.out.println("                                                             ");
		System.out.println("                 Escolha uma dessas opções:                  ");
	}		
			
	public static void GerenciaLoc() {
		MenuGerenciaLocatari GerenciaLocatario=new MenuGerenciaLocatari();
		GerenciaLocatario.MenuLocatario();
		
		int escolhaL;
		
		Scanner ler=new Scanner(System.in);
		
		escolhaL=ler.nextInt();
		
		switch(escolhaL) {
		case 1:
			GerenciaLocatario.cadastrarlocatario();;
			break;
		case 2:
			GerenciaLocatario.buscarlocatario();
			break;
		case 3:
			GerenciaLocatario.pesquisarlocatario();
			break;
		case 4:
			GerenciaLocatario.excluirlocatario();
			break;
			
			default:
				System.out.println("Escolha inválida. Tente novamente!!");

	}
	}
	
	public static void GerenciaFrota() {
		MenuGerenciaFrota GerenciarFrota=new MenuGerenciaFrota();
		GerenciarFrota.MenuGerenciaF();
		
		int escolhaF;
		
		Scanner ler=new Scanner(System.in);
		
		escolhaF=ler.nextInt();
		
		switch(escolhaF) {
		case 1:
			GerenciarFrota.CadastroVeicul();
			break;
		case 2:	
			GerenciarFrota.PesquisarVeiculos();
			break;
		case 3:
			GerenciarFrota.AtualizaDados();
			break;
		case 4:
			GerenciarFrota.RemoveVeiculo();	
			break;
			
			default:
				System.out.println("Escolha inválida. Tente novamente!!");
		}
	}
	
	public static void GerenciaReservas() {
		MenuGerenciaReserva GerenciarReserva=new MenuGerenciaReserva();
		GerenciarReserva.MenuLocatario();
		
		int escolhaR;
		
		Scanner ler=new Scanner(System.in);
		
		escolhaR=ler.nextInt();
		
		switch(escolhaR) {
		case 1:
			GerenciarReserva.CadastrarReserva();
			break;
		case 2:	
			GerenciarReserva.EmitirRelatorio();
			break;
		case 3:
			GerenciarReserva.EmitirRelatorioConsolidado();
			break;
			
			default:
				System.out.println("Escolha inválida. Tente novamente!!");
		}
	}
	
	public static void Sair() {
		System.out.println("Método - Sair...");
	}
	
	public static void main(String [] args) {
		Menu();
		
		int escolha;
		
		Scanner ler=new Scanner(System.in);
		
		escolha=ler.nextInt();
		
		switch(escolha) {
		case 1:
			GerenciaLoc();
			break;
		case 2:	
			GerenciaFrota();
			break;
		case 3:
			GerenciaReservas();
			break;
		case 4:
			Sair();	
			break;
			
			default:
				System.out.println("Escolha inválida. Tente novamente!!");
		}
	}

}
