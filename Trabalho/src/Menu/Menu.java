package Menu;

import java.util.Scanner;

import javax.swing.JOptionPane;

import MenuGerenciaFrota.MenuGerenciaFrota;
import MenuGerenciaLocatario.MenuGerenciaLocatari;
import MenuReserva.MenuGerenciaReserva;

public class Menu {
	
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
		Scanner sair=new Scanner(System.in);
		String Saindo;
		
		System.out.println("Deseja realmente sair do programa? Digite Sim/sim ou Não/não");
		Saindo=sair.next();
		String Sair;
		Sair=Saindo;
		Saindo=sair.nextLine();
		if(Sair.equals("Sim")||Sair.equals("sim")){
			System.out.println("Saindo do programa...");
			System.exit(0);
		} else if(Sair.equals("Não")||Sair.equals("não")){
			System.out.println("Retornando ao programa...");
			return;
		}
	}
	
	public static void main(String [] args) {
		
		int escolha;
		
		while(true) {
		System.out.println("------------------- Menu Principal ------------------------\n"+
		"                 1 - Gerenciar Locatários                    \n"+
		"                 2 - Gerenciar Frota                         \n"+
		"                 3 - Gerenciar Reservas	                  \n"+
		"                 4 - Sair do Programa                        \n"+
		"                                                             \n"+
		"                 Escolha uma dessas opções:                  \n");
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

}
