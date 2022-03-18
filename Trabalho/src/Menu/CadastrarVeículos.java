package Menu;

import java.util.Scanner;

public class CadastrarVeículos {
	
	public static void cadastro() {

		Scanner cadastrarV = new Scanner(System.in);

		// Obtendo os dados iniciais do veículo.
		System.out.println("Cadastrando...");
		System.out.println("Coloque a Marca do Veículo:");
		String Marca = cadastrarV.nextLine();

		System.out.println("Coloque o Modelo do Veículo:");
		String Modelo = cadastrarV.nextLine();

		System.out.println("Coloque o Ano de Fabricação:");
		String AnoFab = cadastrarV.nextLine();

		System.out.println("Coloque o Ano de Modelo:");
		String AnoMod = cadastrarV.nextLine();

		System.out.println("Coloque o Número do Renavam:");
		String Renavam = cadastrarV.nextLine();

		System.out.println("Coloque a Capacidade do Tanque:");
		String CapacidadeTanque = cadastrarV.nextLine();

		// Mostrando os dados digitados.
		System.out.println("\n\n\n");
		System.out.println("Dados cadastrados: ");
		System.out.println("Marca: " + Marca);
		System.out.println("Modelo: " + Modelo);
		System.out.println("Ano de Fabricação: " + AnoFab);
		System.out.println("Ano Modelo: " + AnoMod);
		System.out.println("Renavam: " + Renavam);
		System.out.println("Capacidade do Tanque: " + CapacidadeTanque);
	}

	public static void CadastrarVeiculo() {

	System.out.println("-------------------- Cadastro de Veículos -----------------\n");
	System.out.println("                 1 - Cadastrar Veículo de Passeio            ");
	System.out.println("                 2 - Cadastrar Veículo Utilitário            ");
	System.out.println("                 3 - Cadastrar Motocicleta                   ");
	System.out.println("                                                             ");
	System.out.println("                 Escolha uma dessas opções:                  ");

	}
	
	public static void CadastrarPasseio() {

		Scanner cadastrarP = new Scanner(System.in);

		// Obtendo os dados dos itens opcionais de veículos de passeio.
		System.out.println("Cadastrando Veículo de Passeio...");
		System.out.println("Coloque a Categoria do Veículo:");
		String CategoriaVeiculo = cadastrarP.nextLine();

		System.out.println("O veículo possui Ar-Condicionado? (Digite sim ou não)");
		String Ar = cadastrarP.nextLine();
		Boolean ArCondicionado = true; 
		// Usando o método “.equalsIgnoreCase()” para verificar o que foi digitado. Essa estrutura é repetida ao longo do código.
		if (Ar.equalsIgnoreCase("sim")) {
			System.out.print("Ar-Condicionado: Possui");
		} else if (Ar.equalsIgnoreCase("não")) {
			ArCondicionado = false;
			System.out.print("Ar-Condicionado: Não possui");
		}

		System.out.println("O veículo possui Direção Hidraulica? (Digite sim ou não)");
		String Direcao = cadastrarP.nextLine();
		Boolean DirecaoHidraulica = true;
		if (Direcao.equalsIgnoreCase("sim")) {
			System.out.print("Direcao Hidraulica: Possui");
		} else if (Direcao.equalsIgnoreCase("não")) {
			DirecaoHidraulica = false;
			System.out.print("Direcao Hidraulica: Não possui");
		}

		System.out.println("O veículo tem Câmbio Automático? (Digite sim ou não)");
		String Cambio = cadastrarP.nextLine();
		Boolean CambioAutomatico = true;
		if (Cambio.equalsIgnoreCase("sim")) {
			System.out.print("Câmbio Automático: Possui");
		} else if (Cambio.equalsIgnoreCase("não")) {
			CambioAutomatico = false;
			System.out.print("Câmbio Automático: Não possui");
		}

		System.out.println("\n\n\n");
		System.out.println("Dados cadastrados: ");
		System.out.println("Categoria do Veículo: "+ CategoriaVeiculo);
		System.out.println("Ar-Condicionado: " + Ar);
		System.out.println("Direção Hidráulica: " + Direcao);
		System.out.println("Câmbio Automático: " + Cambio);
	}
	
	public static void CadastrarUtilitario() {

		// Obtendo os dados dos itens opcionais de veículos utilitários.
	    System.out.println("Cadastrando Utilitario");
	    System.out.println("O veículo é do tipo Carga o Passageiro? (Digite carga ou passageiro)");		
		Scanner cadastrarU = new Scanner(System.in);
		String EscolhaU = cadastrarU.nextLine();
		if (EscolhaU.equalsIgnoreCase("carga")) {
			System.out.println("Veículo de Carga");
		}  
		else if (EscolhaU.equalsIgnoreCase("passageiro")) {
			System.out.println("Veículo de Passageiro");
		}
	}

	public static void CadastrarMotocicleta() {

		Scanner cadastrarM = new Scanner(System.in);
		System.out.println("Cadastrando Motocicleta...");

		System.out.println("O veículo tem Controle de Tração? (Digite sim ou não)");
		String Controle = cadastrarM.nextLine();;
		Boolean ControleTracao = true;
		if (Controle.equalsIgnoreCase("sim")) {
			System.out.print("Controle Tração: Possui");
		} else if (Controle.equalsIgnoreCase("não")) {
			ControleTracao = false;
			System.out.print("Controle Tração: Não possui");
		}

		System.out.println("O veículo tem Freio ABS? (Digite sim ou não)");
		String Freio = cadastrarM.nextLine();
		Boolean FreioAbs = true;
		if (Freio.equalsIgnoreCase("sim")) {
			System.out.print("Freio Abs: Possui");
		} else if (Freio.equalsIgnoreCase("não")) {
			FreioAbs = false;
			System.out.print("Freio Abs: Não possui");
		}

		System.out.println("O veículo tem Piloto Automatico? (Digite sim ou não)");
		String Piloto = cadastrarM.nextLine();
		Boolean PilotoAutomatico = true;
		if (Piloto.equalsIgnoreCase("sim")) {
			System.out.print("Piloto Automatico: Possui");
		} else if (Piloto.equalsIgnoreCase("não")) {
			PilotoAutomatico = false;
			System.out.print("Piloto Automatico: Não possui");
		}

		System.out.println("Digite o Modo de Pilotagem: (Digite Cidade, Estrada, Sport ou Off-Road)");
		String ModoPilotagem = cadastrarM.nextLine();
		if (ModoPilotagem.equalsIgnoreCase("cidade")) {
			System.out.print("Modo de Pilotagem: Cidade");

		} else if (ModoPilotagem.equalsIgnoreCase("estrada")) {
			System.out.print("Piloto Automatico: Estrada");

		} else if (ModoPilotagem.equalsIgnoreCase("sport")){
			System.out.print("Modo de Piltogem: Sport");

		} else if (ModoPilotagem.equalsIgnoreCase("off-road")) {
			System.out.print("Modo de Pilotagem: Off-Road");
		}

		System.out.println("\n\n\n");
		System.out.println("Dados cadastrados: ");
		System.out.println("Controle de Tração: " + Controle);
		System.out.println("Freio ABS: " + Freio);
		System.out.println("Piloto Automático: " + Piloto);
		System.out.println("Modo de Pilotagem: " + ModoPilotagem);
	}
}
