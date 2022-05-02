package MenuGerenciaFrota;

import java.util.ArrayList;
import java.util.Scanner;

import Excecoes.CampoEmBrancoException;
import gerenciaFrota.Veiculo;
import gerenciaFrota.VeiculoDePasseio;
import gerenciaFrota.VeiculoUtilitario;
import gerenciaFrota.Motocicleta;


public class MetodoAtualizaDados {

	public static Scanner leitor = new Scanner(System.in);
	
	private static boolean checaCampoBranco(String string) {
		
	    // Checando se a string é "null".
	    if (string == null) {
	      return false;
	    }
	    // Checando se a string esta vazio (só contem espaços).
	    else if (string.trim().isEmpty()){
	      return false;
	    }

	    return true;

	}
	
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
		
		// O método atualiza todos os dados de uma vez, não será permitido atualizar um dados em específico e nem o Renavam.
		
		System.out.println("Digite o número do Renavam");
		int renavamPesquisado = leitor.nextInt();

		for (Veiculo v : veiculos) {
			if (v.getRenavam() == renavamPesquisado) {
				
				Scanner leitorB = new Scanner(System.in);
				
				System.out.println("Digite a Marca");
				String Marca = leitorB.nextLine();
				
				System.out.println("Digite o Modelo");
				String Modelo = leitorB.nextLine();
				
				try {					
					// Verificando se as Strings estão em branco.
					boolean validaMarca = checaCampoBranco(Marca);
					boolean validaModelo = checaCampoBranco(Modelo);
					// Lançando a exceção caso não.
					if (validaMarca == false || validaModelo == false) {
						throw new CampoEmBrancoException("Erro! Um campo foi deixado em branco!");
					}
					
				} catch (CampoEmBrancoException e) {
					System.out.println(e.getMessage());
					break;
					
				} catch (Exception e) {
					System.out.println("Ocorreu um erro!");
					e.printStackTrace();
				}
				
				v.setMarca(Marca);
				v.setModelo(Modelo);
				
				System.out.println("Digite o Ano de Fabricacao");
				v.setAnoFabricacao(leitorB.nextInt());
				
				System.out.println("Digite o Ano do Modelo");
				v.setAnoModelo(leitorB.nextInt());
				
				System.out.println("Digite a capacidade de tanque");
				v.setCapacidadeTanque(leitorB.nextInt());

				System.out.println("Dados alterados com sucesso!\n\n");
			}
		}
		
	}
	
	public static void AtualizaPasseio(ArrayList<Veiculo> veiculos) {
		
		Scanner leitorP = new Scanner(System.in);
		
		System.out.println("Atenção! O método atualiza todos os dados!");
		System.out.println("O método atualiza todos os dados, não será permitido atualizar um dado específico!");
		System.out.println("\nDigite o número do Renavam:");
		int renavamPesquisado = leitorP.nextInt();

		for (Veiculo v : veiculos) {
			if (v.getRenavam() == renavamPesquisado) {
				
				System.out.println("Digite a Categoria do Veículo:");
				System.out.println("(Compacto, Compacto de Luxo, Sedan ou SUVs)");
				((VeiculoDePasseio) v).setCategoriaPasseio(leitorP.nextLine());

				System.out.println("O veículo possui Ar-Condicionado? (Digite sim ou nao)");
				String Arcondicionado = leitorP.nextLine();
				if (Arcondicionado.equals("sim")){
					((VeiculoDePasseio) v).setArCondicionado(true);
				} else if (Arcondicionado.equals("nao")){
					((VeiculoDePasseio) v).setArCondicionado(false);
				} else {
					System.out.println("Opção inválida!");
				}
				
				
				System.out.println("O veículo possui Direção Hidraulica? (Digite sim ou nao");
				String DirecaoHidraulica = leitorP.nextLine();
				if(DirecaoHidraulica.equals("sim")){
					((VeiculoDePasseio) v).setDirecaoHidraulica(true);
				} else if(DirecaoHidraulica.equals("nao")){
					((VeiculoDePasseio) v).setDirecaoHidraulica(false);
				}
				else {
					System.out.println("Opção inválida!");
				}
				
				
				System.out.println("O veículo tem Câmbio Automático? (Digite sim ou nao");
				String CambioAutomatico = leitorP.nextLine();;
				if(CambioAutomatico.equals("sim")){
					((VeiculoDePasseio) v).setCambioAutomatico(true);
				} else if(CambioAutomatico.equals("nao")){
					((VeiculoDePasseio) v).setCambioAutomatico(false);
				}
				else {
					System.out.println("Opção inválida!");
				}
				
				System.out.println("\n");
				System.out.println("+----------------------------------+");
				System.out.println("       Novos Dados do Veícolo       ");
				System.out.println("+----------------------------------+");
				System.out.println("Categoria do Veículo: " + ((VeiculoDePasseio) v).getCategoriaPasseio());
				System.out.println("Arcondicionado: " + ((VeiculoDePasseio) v).getArCondicionado());
				System.out.println("Direção Hidráulica: " + ((VeiculoDePasseio) v).getDirecaoHidraulica());
				System.out.println("Câmbio Automático: "+ ((VeiculoDePasseio) v).getCambioAutomatico());
				System.out.println("\n\n");
				
				
			}
		}

	}

	
}
