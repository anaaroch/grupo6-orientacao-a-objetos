package Menu;

import java.util.Scanner;

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
			MenuGerenciaLocatari.cadastrarlocatario();;
			break;
		case 2:
			MenuGerenciaLocatari.AlterarLocatario();
			break;
		case 3:
			MenuGerenciaLocatari.pesquisarlocatario();
			break;
		case 4:
			MenuGerenciaLocatari.excluirlocatario();
			break;
		default:
			System.out.println("Escolha inválida. Tente novamente!!");

	}
	}
	
	public static void GerenciaFrota() {
		
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
		if(Saindo.equals("Sim")||Saindo.equals("sim")){
			System.out.println("Saindo do programa...");
			System.exit(0);
		} else if(Saindo.equals("Não")||Saindo.equals("não")){
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
			String escolhaE;
			System.out.println("");
			System.out.println("Deseja continuar?");
			System.out.println("(Digite 'Sim' parar continuar ou 'Não' para sair do programa)");
			escolhaE = leitor.nextLine();
			if (escolhaE.equals("Não")||escolhaE.equals("não")) {
				continuar = false;
			} else if (escolhaE.equals("Sim")||escolhaE.equals("sim")) {
				continuar = true;
			}

		} while(continuar==true);
	}

}