package Menu;

import java.util.Scanner;

public class PesquisarVeículos {
	public static void PesquisaVeiculo() {
		
	System.out.println("-------------------- Pesquisa de Veículos ---------------------\n  ");
	System.out.println("                 1 - Pesquisar Veículo pelo Renavam                ");
	System.out.println("                 2 - Pesquisar Veículo por Marca, Modelo e Renavam ");
	System.out.println("                                                                   ");
	System.out.println("                 Escolha uma dessas opções:                        ");
	}
	
	public static void PesquisaVeiculoRenavam() {
		Scanner PesquisarVP=new Scanner(System.in);	
		System.out.println("Método de Pesquisa pelo Renavam..");
		System.out.println("Digite o Renavam do Veículo:");
		String PesquisaRenavam=PesquisarVP.nextLine();
		System.out.println("- Renavam pesquisado -");
		System.out.println("Renavam: "+PesquisaRenavam);
		System.out.println("Veículos encontrados:");
		System.out.println("Veículo: ****** ***");
		System.out.println("...");
		
	}
	
	public static void PesquisaVeiculoMMR() {
		Scanner PesquisarP=new Scanner(System.in);	
		System.out.println("Método de Pesquisa por Marca, Modelo e Renavam..");
		System.out.println("Digite a Marca do veículo:");
		String PesquisaMarca=PesquisarP.nextLine();
		System.out.println("Digite o Modelo do veículo:");
		String PesquisaModelo=PesquisarP.nextLine();
		System.out.println("Digite o Renavam do veículo:");
		String PesquisaRenavamP=PesquisarP.nextLine();
		System.out.println(" - Dados pesquisados - ");
		System.out.println("Marca: "+PesquisaMarca);
		System.out.println("Modelo: "+PesquisaModelo);
		System.out.println("Renavam: "+PesquisaRenavamP);
		System.out.println("Veículos encontrados:");
		System.out.println("Veículo: ********");
		System.out.println("...");
		
	}
}

