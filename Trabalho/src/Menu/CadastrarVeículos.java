package Menu;

import java.util.Scanner;

public class CadastrarVeículos {
	
	public static void cadastro() {
		Scanner cadastrarV=new Scanner(System.in);		
		System.out.println("Cadastrando...");
		System.out.println("Coloque a Marca do Veículo:");
		String Marca=cadastrarV.nextLine();
		System.out.println("Coloque o Modelo do Veículo:");
		String Modelo=cadastrarV.nextLine();
		System.out.println("Coloque o Ano de Fabricação:");
		String AnoFab=cadastrarV.nextLine();
		System.out.println("Coloque o Ano de Modelo:");
		String AnoMod=cadastrarV.nextLine();
		System.out.println("Coloque o Número do Renavam:");
		String Renavam=cadastrarV.nextLine();
		System.out.println("Coloque a Capacidade do TANQUE:");
		String CapacidadedoTanque=cadastrarV.nextLine();
		System.out.println("Dados cadastrados: ");
		System.out.println("Marca: "+Marca);
		System.out.println("Modelo: "+Modelo);
		System.out.println("Ano de Fabricação: "+AnoFab);
		System.out.println("Ano Modelo: "+AnoMod);
		System.out.println("Renavam: "+Renavam);
		System.out.println("Capacidade do Tanque: "+CapacidadedoTanque);
	}
	public static void CadastrarVeiculo() {
		
	System.out.println("-------------------- Cadastro de Veículos -----------------\n");
	System.out.println("                 1 - Cadastrar Veículos de Passeio           ");
	System.out.println("                 2 - Cadastrar veículo utilitário            ");
	System.out.println("                 3 - Cadastrar Motocicleta                   ");
	System.out.println("                                                             ");
	System.out.println("                 Escolha uma dessas opções:                  ");
	}
	
	public static void CadastrarPasseio() {
		Scanner cadastrarP=new Scanner(System.in);
		System.out.println("Cadastrando Veículo de Passeio...");
		System.out.println("Coloque a Categoria do Veículo:");
		String CategoriaVeiculo=cadastrarP.nextLine();
		System.out.println("O veículo possui ar condicionado? Digite Sim/sim se possuir e Não/não se não possuir:");
		String Arcondicionado=cadastrarP.nextLine();
		String Ar;
		Ar=Arcondicionado;
		if(Ar=="Sim"||Ar=="sim") {
			System.out.print("Ar Condicionado: Possui");
		} else if(Ar=="Não"||Ar=="não") {
			System.out.print("Ar Condicionado: Não possui");
		}
		System.out.println("O veículo possui Direção Hidraulica? Digite Sim/sim se possuir e Não/não se não possuir:");
		String DirecaoHidraulica=cadastrarP.nextLine();;
		String Direcao;
		Direcao=DirecaoHidraulica;
		if(Direcao=="Sim"||Direcao=="s") {
			System.out.print("Direcao Hidraulica: Possui");
		} else if(Direcao=="Não"||Direcao=="não") {
			System.out.print("Direcao Hidraulica: Não possui");
		}
		System.out.println("O veículo tem câmbio automático? Digite Sim/sim se possuir e Não/não se não possuir:");
		String CambioAutomatico=cadastrarP.nextLine();;
		String Cambio;
		Cambio=CambioAutomatico;
		if((Cambio=="Sim")||(Cambio=="sim")) {
			System.out.print("Câmbio Automático: Possui");
		} else if(Cambio=="Não"||Cambio=="não") {
			System.out.print("Câmbio Automático: Não possui");
		}
		System.out.println("Dados cadastrados: ");
		System.out.println("Categoria do Veículo: "+CategoriaVeiculo);
		System.out.println("Arcondicionado: "+Ar);
		System.out.println("Ano de Fabricação: "+Direcao);
		System.out.println("Ano Modelo: "+Cambio);
	}
	
	public static void CadastrarUtilitario() {
		Scanner cadastrarU=new Scanner(System.in);	
	    System.out.println("Cadastrando Utilitario");
	    System.out.println("O veículo é do tipo carga ou passageiro? Digite carga ou passageiro");		
		String EscolhaU=cadastrarU.nextLine();
		String EscolhaUt;
	    EscolhaUt=EscolhaU;
		if((EscolhaU=="Carga")||(EscolhaU=="carga")) {
			System.out.print("Veículo de carga");
			
		}  
			else if((EscolhaU=="Passageiro")||(EscolhaU=="passageiro")) {
				System.out.print("Veículo de Passageiro");
			}
	}
	public static void CadastrarMotocicleta() {
		Scanner cadastrarM=new Scanner(System.in);	
		System.out.println("Cadastrando Motocicleta...");
		System.out.println("O veículo tem Controle de Tração? Digite Sim/sim se possuir e Não/não se não possuir:");
		String ControleTracao=cadastrarM.nextLine();;
		String Controle;
		Controle=ControleTracao;
		if((Controle=="Sim")||(Controle=="sim")) {
			System.out.print("Controle Tração: Possui");
		} else if(Controle=="Não"||Controle=="não") {
			System.out.print("Controle Tração: Não possui");
		}
		System.out.println("O veículo tem Freio ABS? Digite Sim/sim se possuir e Não/não se não possuir:");
		String FreioAbs=cadastrarM.nextLine();
		String Freio;
		Freio=FreioAbs;
		if((Freio=="Sim")||(Freio=="sim")) {
			System.out.print("Freio Abs: Possui");
		} else if((Freio=="Não")||(Freio=="não")) {
			System.out.print("Freio Abs: Não possui");
		}
		System.out.println("O veículo tem Piloto Automatico? Digite Sim/sim se possuir e Não/não se não possuir:");
		String PilotoAutomatico=cadastrarM.nextLine();
		String Piloto;
		Piloto=PilotoAutomatico;
		if((Piloto=="Sim")||(Piloto=="sim")) {
			System.out.print("Piloto Automatico: Possui");
		} else if((Piloto=="Não")||(Piloto=="não")) {
			System.out.print("Piloto Automatico: Não possui");
		}
		System.out.println("Digite o modo de pilotagem: Cidade/Estrada/Sport/Off-Road");
		String MododePilotagem=cadastrarM.nextLine();
		String Modo;
		Modo=MododePilotagem;
		if((Piloto=="Cidade")) {
			System.out.print("Modo de Pilotagem: Cidade");
		} else if ((Piloto=="Estrada")) {
			System.out.print("Piloto Automatico: Estrada");
		}     else if ((Piloto=="Sport")){
			   System.out.print("Modo de Piltogem: Sport");
		}       else if ((Piloto=="Off-Road")) {
			      System.out.print("Modo de Pilotagem: Off-Road");
		}
		System.out.println("Dados cadastrados: ");
		System.out.println("Controle de Tração: "+Controle);
		System.out.println("Freio ABS: "+Freio);
		System.out.println("Piloto Automático: "+Piloto);
		System.out.println("Modo de Pilotagem: "+Modo);
	}
}
