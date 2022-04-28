package MenuGerenciaFrota;

import java.util.Scanner;

import Excecoes.CampoEmBrancoException;

import gerenciaFrota.Diaria;
import gerenciaFrota.Motocicleta;
import gerenciaFrota.UtilitarioCarga;
import gerenciaFrota.UtilitarioPassageiros;
import gerenciaFrota.Veiculo;
import gerenciaFrota.VeiculoDePasseio;
import gerenciaFrota.VeiculoUtilitario;

public class CadastrarVeículos {
	
	// Criando um leitor que pode ser usado em toda a classe.
	public static Scanner leitor = new Scanner(System.in);
	
	public static Veiculo cadastro() {

		// Mensagem inicial.
		System.out.println("			Atencao!!!			");
		System.out.println("Para cadastrar um veiculo os dados" +
						   " sobre a marca, o modelo e o renavam são obrigatórios!");
		System.out.println("Os outros campos podem ser deixados em branco, caso queira.");
		
		// Obtendo os dados iniciais do veículo.
		System.out.println("Digite a Marca do Veículo:");
		String Marca = leitor.nextLine();

		System.out.println("Coloque o Modelo do Veículo:");
		String Modelo = leitor.nextLine();
		
		System.out.println("Coloque o Número do Renavam:");
		int Renavam = leitor.nextInt();
		
		// Verificando se as Strings estão em branco.
		boolean validaMarca = checaCampoBranco(Marca);
		boolean validaModelo = checaCampoBranco(Modelo);
		// Convertendo o Renavam para uma string e calculando seu tamanho.
		int tamanhoRenavam = String.valueOf(Renavam).length();
		
		// Verificando as condições para o lançamento da exceção "CampoEmBrancoException".
		try {
			if (validaMarca == false || validaModelo == false || tamanhoRenavam == 0 ) {
				throw new CampoEmBrancoException("Erro! Um campo foi deixado em branco!");
			}
		} catch (CampoEmBrancoException e) {
			System.out.println(e.getMessage());
		}
		
		if (validaMarca == true && validaModelo == true && tamanhoRenavam != 0) {
			
			System.out.println("Coloque o Ano de Fabricação:");
			int AnoFab = leitor.nextInt();
			
			System.out.println("Coloque o Ano de Modelo:");
			int AnoMod = leitor.nextInt();
					
			System.out.println("Coloque a capacidade do tanque: ");
			int CapacidadedoTanque = leitor.nextInt();
			
			System.out.println("Coloque o valor da diaria normal: ");
			float DiariaNormal = leitor.nextFloat();
			
			System.out.println("Coloque o valor da diaria reduzida: ");
			float DiariaReduzida = leitor.nextFloat();
			
			System.out.println("Coloque o valor da diaria empresarial: ");
			float DiariaEmpresarial = leitor.nextFloat();
			
			System.out.println("Coloque o valor mensal da diaria:");
			float ValorMensal = leitor.nextFloat();
			
			Diaria diariaAuxiliar = new Diaria(DiariaNormal, DiariaReduzida, DiariaEmpresarial, ValorMensal);
			
			// Mostrando os dados digitados
			System.out.println("\n");
			System.out.println("Dados cadastrados: ");
			System.out.println("Marca: " + Marca);
			System.out.println("Modelo: " + Modelo);
			System.out.println("Ano de Fabricação: " + AnoFab);
			System.out.println("Ano Modelo: " + AnoMod);
			System.out.println("Renavam: " + Renavam);
			System.out.println("Capacidade do Tanque: " + CapacidadedoTanque);
			
			Veiculo veiculoAuxiliar = new Veiculo(Marca, Modelo, AnoFab, AnoMod, 
												  Renavam, CapacidadedoTanque, diariaAuxiliar);
			return veiculoAuxiliar;
		}
		
		return null;
		
	}
	
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

	public static void CadastrarVeiculo() {
		System.out.println("-------------------- Cadastro de Veículos -----------------\n");
		System.out.println("                 1 - Cadastrar Veículo de Passeio            ");
		System.out.println("                 2 - Cadastrar Veículo Utilitário            ");
		System.out.println("                 3 - Cadastrar Motocicleta                   ");
		System.out.println("                                                             ");
		System.out.println("                 Escolha uma dessas opções:                  ");
	}
	
	public static VeiculoDePasseio CadastrarPasseio(Veiculo dadosBasicos) {

		// Obtendo os dados dos itens opcionais de veículos de passeio.
		Scanner leitorP = new Scanner(System.in);
		
		System.out.println("Coloque a Categoria do Veículo:");
		System.out.println("(Compacto, Compacto de Luxo, Sedan ou SUVs)");
		String CategoriaVeiculo = leitorP.nextLine();

		System.out.println("O veículo possui Ar-Condicionado? (Digite sim ou nao)");
		String Arcondicionado = leitorP.nextLine();
		boolean Ar = false;
		if (Arcondicionado.equals("sim")){
			Ar = true;
		} else if (Arcondicionado.equals("nao")){
			Ar = false;
		} else {
			System.out.println("Opção inválida. Tente novamente!");
		}
		
		
		System.out.println("O veículo possui Direção Hidraulica? (Digite sim ou nao");
		String DirecaoHidraulica = leitorP.nextLine();
		boolean Direcao = false;
		if(DirecaoHidraulica.equals("sim")){
			Direcao = true;
		} else if(DirecaoHidraulica.equals("nao")){
			Direcao = false;
		}
		else {
			System.out.println("Opção inválida. Tente novamente!");
		}
		
		
		System.out.println("O veículo tem Câmbio Automático? (Digite sim ou nao");
		String CambioAutomatico = leitorP.nextLine();;
		boolean Cambio = false;
		if(CambioAutomatico.equals("sim")){
			Cambio = true;
		} else if(CambioAutomatico.equals("nao")){
			Cambio = false;
		}
		else {
			System.out.println("Opção inválida. Tente novamente!");
		}
		
		System.out.println("\n\n");
		System.out.println("+------Dados cadastrados------+");
		System.out.println("Categoria do Veículo: "+ CategoriaVeiculo);
		System.out.println("Arcondicionado: "+ Ar);
		System.out.println("Direção Hidráulica: "+ Direcao);
		System.out.println("Câmbio Automático: "+ Cambio);
		System.out.println("\n\n");
		
		VeiculoDePasseio passeioAuxiliar = new VeiculoDePasseio(CategoriaVeiculo, Ar, Direcao, Cambio, 
																dadosBasicos.getMarca(), dadosBasicos.getModelo(),
																dadosBasicos.getAnoFabricacao(), dadosBasicos.getAnoModelo(),
																dadosBasicos.getRenavam(), dadosBasicos.getCapacidadeTanque(),
																dadosBasicos.getDiaria());
	
		return passeioAuxiliar;
		
	}
	
	public static VeiculoUtilitario CadastrarUtilitario(Veiculo dadosBasicos) {
		
		Scanner leitorU = new Scanner(System.in);
		
		VeiculoUtilitario veiculoAuxiliar = null;
		
		// Obtendo os dados dos itens opcionais de veículos utilitários.

	    System.out.println("Cadastrando Utilitario");

	    System.out.println("O veículo é do tipo Carga o Passageiro? (Digite Carga/carga ou Passageiro/passageiro)");		
		String EscolhaU = "";
		EscolhaU = leitorU.nextLine();
	    System.out.println("Qual é a capacidade de carga?");
		float Carga = leitorU.nextFloat();

	    
	    // Caso seja de passageiros.
		if (EscolhaU.equals("Passageiro") || (EscolhaU.equals("passageiro"))) {
			System.out.println("Veículo de passageiro");
			
			System.out.println("O veículo de carga possui Ar Condicionado? (Digite sim ou nao)");
			String Arcondicionado = leitorU.nextLine();
			boolean Ar = false;
			if (Arcondicionado.equals("sim")){
				Ar = true;
			} else if (Arcondicionado.equals("nao")){
				Ar = false;
			}
			else {
				System.out.println("Opção inválida. Tente novamente!");
			}
			
			
			System.out.println("O veículo de carga possui Direção Hidraulica? (Digite sim ou nao)");
			String DirecaoHidraulica = leitorU.nextLine();;
			boolean Direcao = false;
			if (DirecaoHidraulica.equals("sim")){
				Direcao = true;
			} else if (DirecaoHidraulica.equals("nao")){
				Direcao = false;
			}
			else {
				System.out.println("Opção inválida. Tente novamente!");
			}
			
			
			System.out.println("O veículo de carga possui Tv a bordo? (Digite sim ou nao)");
			String Tvabordo = leitorU.nextLine();;
			boolean TV = false;
			if(Tvabordo.equals("sim")){
				TV = true;
			} else if(Tvabordo.equals("nao")){
				TV = false;
			}
			else {
				System.out.println("Opção inválida. Tente novamente!");
			}
			
			
			System.out.println("Dados cadastrados: ");
			System.out.println("Categoria do Veículo: " + EscolhaU);
			System.out.println("Capacidade de Carga: " + Carga);
			System.out.println("Arcondicionado: " + Ar);
			System.out.println("Direção Hidráulica: " + Direcao);
			System.out.println("Câmbio Automático: " + TV);
			
			veiculoAuxiliar = new UtilitarioPassageiros(Ar, Direcao, TV, EscolhaU, Carga,
																		dadosBasicos.getMarca(), dadosBasicos.getModelo(),
																		dadosBasicos.getAnoFabricacao(), dadosBasicos.getAnoModelo(),
																		dadosBasicos.getRenavam(), dadosBasicos.getCapacidadeTanque(),
																		dadosBasicos.getDiaria());

			
		}
		
		// Caso seja de carga.
		else if (EscolhaU.equals("Carga")||EscolhaU.equals("carga")){
				
				System.out.print("Veículo de Carga");
				System.out.println("Qual é a tara do veículo? ");
				float Tara = leitorU.nextFloat();
				
				System.out.println("Qual é o tamanho do compartimento de carga (Em litros)? ");
				float Compartimento = leitorU.nextFloat();
								
				System.out.println("Digite o tipo de carga:");
				System.out.println("0 para Báu");
				System.out.println("1 para Graneleiro");
				System.out.println("2 para Basculante");
				int numeroTipo = leitorU.nextInt();
				String Tipo = "";
				if(numeroTipo == 0) {
					Tipo = "Báu";
				} else if(numeroTipo == 1) {
					Tipo = "Graneleiro";
				} else if(numeroTipo == 2) {
					Tipo = "Basculante";
				}
				else {
					System.out.println("Opção inválida!");
				}
				
				System.out.println("\n\n");
				System.out.println("Dados cadastrados: ");
				System.out.println("Categoria do Veículo: " + EscolhaU);
				System.out.println("Capacidade de Carga: " + Carga);
				System.out.println("Arcondicionado: " + Tara);
				System.out.println("Direção Hidráulica: " + Compartimento);
				System.out.println("Câmbio Automático: " + Tipo);
				
				veiculoAuxiliar = new UtilitarioCarga(Tipo, Tara, Compartimento,EscolhaU, Carga,
																dadosBasicos.getMarca(), dadosBasicos.getModelo(),
																dadosBasicos.getAnoFabricacao(), dadosBasicos.getAnoModelo(),
																dadosBasicos.getRenavam(), dadosBasicos.getCapacidadeTanque(),
																dadosBasicos.getDiaria());
				

			}
		
		return veiculoAuxiliar;
	}
	
	public static Motocicleta CadastrarMotocicleta(Veiculo dadosBasicos) {
		
		Scanner leitorM = new Scanner(System.in);
		
		// Obtendo os dados dos itens opcionais de Motocicletas.
		System.out.println("O veiculo possui Controle de Tração? (Digite sim ou nao)");
		String ControleTracao = leitorM.nextLine();
		boolean Controle = false;
		if(ControleTracao.equals("sim")){
			Controle = true;
		} else if(ControleTracao.equals("nao")){
			Controle = false;
		}
		else {
			System.out.println("Opção inválida. Tente novamente!");
		}
		
		
		System.out.println("O veiculo possui Freio ABS? (Digite sim ou nao)");
		String FreioAbs = leitorM.nextLine();
		boolean Freio = false;
		if(FreioAbs.equals("sim")){
			Freio = true;
		} else if(FreioAbs.equals("nao")){
			Freio = false;
		}
		else {
			System.out.println("Opção inválida. Tente novamente!");
		}
		
		
		System.out.println("O veículo tem Piloto Automatico? (Digite sim ou nao)");
		String PilotoAutomatico = leitorM.nextLine();
		boolean Piloto = false;
		if (PilotoAutomatico.equals("sim")){
			Piloto = true;
		} else if (PilotoAutomatico.equals("nao")){
			Piloto = false;
		}
		else {
			System.out.println("Opção inválida. Tente novamente!");
		}
		
		
		System.out.println("Digite o Modo de Pilotagem: Cidade/Estrada/Sport/Off-Road");
		String MododePilotagem = leitorM.nextLine();
		String Modo = "";
		if (MododePilotagem.equals("Cidade")){
			Modo = "Cidade";
		} else if (MododePilotagem.equals("Estrada")){
			Modo = "Estrada";
		} else if (MododePilotagem.equals("Sport")){
			Modo = "Sport";
		} else if (MododePilotagem.equals("Off-Road")){
			Modo = "Off-Road";
		}
		else {
			System.out.println("Opção inválida. Tente novamente!");
		}
		
		System.out.println("\n\n");
		System.out.println("+------Dados cadastrados------+");
		System.out.println("Controle de Tração: " + Controle);
		System.out.println("Freio ABS: " + Freio);
		System.out.println("Piloto Automático: " + Piloto);
		System.out.println("Modo de Pilotagem: " + Modo);
		System.out.println("+-----------------------------+");
		System.out.println("\n\n");
		
		Motocicleta motoAuxiliar = new Motocicleta(Modo, Controle, Freio, Piloto, 
												   dadosBasicos.getMarca(), dadosBasicos.getModelo(),
												   dadosBasicos.getAnoFabricacao(), dadosBasicos.getAnoModelo(),
												   dadosBasicos.getRenavam(), dadosBasicos.getCapacidadeTanque(),
												   dadosBasicos.getDiaria());
		
		return motoAuxiliar;
		
	}
	
}