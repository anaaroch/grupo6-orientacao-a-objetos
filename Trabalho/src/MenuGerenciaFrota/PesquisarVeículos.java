package MenuGerenciaFrota;

import java.util.Scanner;

public class PesquisarVe�culos {
	public static void PesquisaVeiculo() {
		
	System.out.println("-------------------- Pesquisa de Ve�culos ---------------------\n  ");
	System.out.println("                 1 - Pesquisar Ve�culo pelo Renavam                ");
	System.out.println("                 2 - Pesquisar Ve�culo por Marca, Modelo e Renavam ");
	System.out.println("                                                                   ");
	System.out.println("                 Escolha uma dessas op��es:                        ");
	}
	
	public static void PesquisaVeiculoRenavam() {
		Scanner PesquisarVP=new Scanner(System.in);	
		System.out.println("M�todo de Pesquisa pelo Renavam..");
		System.out.println("Digite o Renavam do Ve�culo:");
		String PesquisaRenavam=PesquisarVP.nextLine();
		System.out.println("- Renavam pesquisado -");
		System.out.println("Renavam: "+PesquisaRenavam);
		System.out.println("Ve�culos encontrados:");
		System.out.println("Ve�culo: ****** ***");
		System.out.println("...");
		
	}
	
	public static void PesquisaVeiculoMMR() {
		Scanner PesquisarP=new Scanner(System.in);	
		System.out.println("M�todo de Pesquisa por Marca, Modelo e Renavam..");
		System.out.println("Digite a Marca do ve�culo:");
		String PesquisaMarca=PesquisarP.nextLine();
		System.out.println("Digite o Modelo do ve�culo:");
		String PesquisaModelo=PesquisarP.nextLine();
		System.out.println("Digite o Renavam do ve�culo:");
		String PesquisaRenavamP=PesquisarP.nextLine();
		System.out.println(" - Dados pesquisados - ");
		System.out.println("Marca: "+PesquisaMarca);
		System.out.println("Modelo: "+PesquisaModelo);
		System.out.println("Renavam: "+PesquisaRenavamP);
		System.out.println("Ve�culos encontrados:");
		System.out.println("Ve�culo: ********");
		System.out.println("...");
		
	}
}

