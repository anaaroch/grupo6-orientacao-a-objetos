package Menu;

import java.util.Scanner;

import javax.swing.JOptionPane;

import Excecoes.ObjetoNaoEncontradoException;
import MenuGerenciaFrota.MenuGerenciaFrota;
import MenuGerenciaLocatario.MenuGerenciaLocatari;
import MenuReserva.MenuGerenciaReserva;


public class Menu {
	
	// Criando o leitor que vai ser usado em toda a classe.
	public static Scanner scan = new Scanner(System.in);
	
	public static void GerenciaLoc() throws ObjetoNaoEncontradoException {
		MenuGerenciaLocatari GerenciaLocatario=new MenuGerenciaLocatari();
		GerenciaLocatario.MenuLocatario();
		
		int escolhaL;
		
		escolhaL = scan.nextInt();
		
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
	
	public static void GerenciaFrota() throws ObjetoNaoEncontradoException {
		
		MenuGerenciaFrota.MenuFrotaPrincipal();
		
		int escolhaF;
		escolhaF = scan.nextInt();
		
		switch(escolhaF) {
		case 1:
			MenuGerenciaFrota.CadastroVeiculo();
			break;
		case 2:	
			MenuGerenciaFrota.PesquisarVeiculos();
			break;
		case 3:
			MenuGerenciaFrota.AtualizaDados();
			break;
		case 4:
			MenuGerenciaFrota.RemoveVeiculo();	
			break;
			
		default:
			System.out.println("Escolha inválida. Tente novamente!!");
		}
		
	}
	
	public static void GerenciaReservas() {
		
		MenuGerenciaReserva GerenciarReserva=new MenuGerenciaReserva();
		MenuGerenciaReserva.MenuLocatario();
		
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
		Scanner sair =new Scanner(System.in);
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
	
	public static void main(String [] args) throws ObjetoNaoEncontradoException {
		
		Scanner leitor = new Scanner(System.in);
		
		boolean continuar = true;
		
		do {
			
			System.out.println("------------------- Menu Principal ------------------------\n"+
						   "                 1 - Gerenciar Locatários                    \n"+
						   "                 2 - Gerenciar Frota                         \n"+
						   "                 3 - Gerenciar Reservas	                  \n"+
						   "                 4 - Sair do Programa                        \n"+
						   "                                                             \n"+
						   "                 Escolha uma dessas opções:                  \n");
			int escolha = 0;
			escolha = scan.nextInt();
			
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
			
			System.out.println("Deseja continuar?");
			System.out.println("(Digite 0 para não ou 1 para sim)");
			escolha = scan.nextInt();
			if (escolha==0) {
				continuar = false;
			} else if (escolha==1) {
				continuar = true;
			}

		} while(continuar==true);
	}

}
