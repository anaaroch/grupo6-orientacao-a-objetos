package MenuGerenciaFrota;

import java.util.ArrayList;
import java.util.Scanner;

import gerenciaFrota.Veiculo;
import gerenciaFrota.VeiculoDePasseio;

public class MetodoAtualizaDados {

	public static void MenuAtualizaDadosFrota() {
		System.out.println("+------------------------------------------------------------+");
		System.out.println("                 1 - Atualizar Dados Básicos                      ");
		System.out.println("                 2 - Atualizar Dados Veiculo de Passeio                      ");
		System.out.println("                 3 - Atualizar Dados Veiculo Utilitario           ");
		System.out.println("                 4 - Atualizar Dados Motocicleta                 ");
		System.out.println("                                                             ");
		System.out.println("                 Escolha uma dessas opções:                  ");
	}

	public static void AtualizaBasico(ArrayList<Veiculo> veiculos) {
		
		// O metodo atualiza todos os dados de uma vez, nao permitindo atualizar um dados em especifico e nem o renavam.
		
		Scanner leitorB = new Scanner(System.in);
		
		System.out.println("Digite o numero de renavam");
		int renavamPesquisado = leitorB.nextInt();

		for (Veiculo v : veiculos) {
			if (v.getRenavam() == renavamPesquisado) {
				
				System.out.println("Digite a Marca");
				String marca = leitorB.nextLine();
				v.setMarca(marca);
				
				System.out.println("Digite o Modelo");
				String modelo = leitorB.nextLine();
				v.setModelo(modelo);
				
				System.out.println("Digite o Ano de Fabricacao");
				int anoFab = leitorB.nextInt();
				v.setAnoFabricacao(anoFab);
				
				System.out.println("Digite o Ano do Modelo");
				int anoMod = leitorB.nextInt();
				v.setAnoModelo(anoMod);
				
				System.out.println("Digite a capacidade de tanque");
				int capacidade = leitorB.nextInt();
				v.setCapacidadeTanque(capacidade);
				
			}
		}
		
	}

	
}
