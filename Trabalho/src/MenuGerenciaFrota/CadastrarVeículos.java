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

public class CadastrarVe�culos {
	
	// Criando um leitor que pode ser usado em toda a classe.
	public static Scanner leitor = new Scanner(System.in);
	
	public static Veiculo cadastro() {

		// Criando os objetos auxiliares.
		Veiculo veiculoAuxiliar = new Veiculo(null, null, 0, 0, 0, 0, null);
		Diaria diariaAuxiliar = new Diaria(null, null, null, null);
		
		Scanner leitorC = new Scanner(System.in);
		
		// Mensagem inicial.
		System.out.println("			Atencao!!!			");
		System.out.println("Para cadastrar um veiculo os dados" +
						   " sobre a marca, o modelo e o renavam s�o obrigat�rios!");
		System.out.println("Os outros campos podem ser deixados em branco, caso queira.\n");
		
		// Obtendo os dados iniciais do ve�culo.
		System.out.println("Digite a Marca do Ve�culo:");
		veiculoAuxiliar.setMarca(leitorC.nextLine());

		System.out.println("Coloque o Modelo do Ve�culo:");
		veiculoAuxiliar.setModelo(leitorC.nextLine());
		
		System.out.println("Coloque o N�mero do Renavam:");
		veiculoAuxiliar.setRenavam(leitorC.nextInt());
		
		// Verificando se as Strings est�o em branco.
		boolean validaMarca = checaCampoBranco(veiculoAuxiliar.getMarca());
		boolean validaModelo = checaCampoBranco(veiculoAuxiliar.getModelo());
		// Convertendo o Renavam para uma string e calculando seu tamanho.
		int tamanhoRenavam = String.valueOf(veiculoAuxiliar.getRenavam()).length();
		
		// Verificando as condi��es para o lan�amento da exce��o "CampoEmBrancoException".
		try {
			if (validaMarca == false || validaModelo == false || tamanhoRenavam == 0 ) {
				throw new CampoEmBrancoException("Erro! Um campo foi deixado em branco!");
			}
		} catch (CampoEmBrancoException e) {
			System.out.println(e.getMessage());
		} catch (Exception e) {
			System.out.println("Ocorreu um erro!");
			e.printStackTrace();
		}
		
		
		if (validaMarca == true && validaModelo == true && tamanhoRenavam != 0) {
			
			System.out.println("Coloque o Ano de Fabrica��o:");
			veiculoAuxiliar.setAnoFabricacao(leitorC.nextInt()); 
			
			System.out.println("Coloque o Ano de Modelo:");
			veiculoAuxiliar.setAnoModelo(leitorC.nextInt());
					
			System.out.println("Coloque a capacidade do tanque: ");
			veiculoAuxiliar.setCapacidadeTanque(leitorC.nextInt());
			
			System.out.println("Coloque o valor da diaria normal: ");
			diariaAuxiliar.setDiariaNormal(leitorC.nextFloat());
			
			System.out.println("Coloque o valor da diaria reduzida: ");
			diariaAuxiliar.setDiariaReduzida(leitorC.nextFloat());
		
			System.out.println("Coloque o valor da diaria empresarial: ");
			diariaAuxiliar.setDiariaEmpresarial(leitorC.nextFloat());
			
			System.out.println("Coloque o valor mensal da diaria:");
			diariaAuxiliar.setValorMensal(leitorC.nextFloat());
			
			// Guardando os valores da di�ria.
			veiculoAuxiliar.setDiaria(diariaAuxiliar);
			
			// Mostrando os dados digitados
			System.out.println("\n");
			System.out.println("+---------------------------------------------------------+");
			System.out.println(" Dados cadastrados:");
			System.out.println("+---------------------------------------------------------+");
			System.out.println("		Marca: " + veiculoAuxiliar.getMarca());
			System.out.println("		Modelo: " + veiculoAuxiliar.getModelo());
			System.out.println("		Ano de Fabrica��o: " + veiculoAuxiliar.getAnoFabricacao());
			System.out.println("		Ano Modelo: " + veiculoAuxiliar.getAnoModelo());
			System.out.println("		Renavam: " + veiculoAuxiliar.getRenavam());
			System.out.println("		Capacidade do Tanque: " + veiculoAuxiliar.getCapacidadeTanque());
			System.out.println("+---------------------------------------------------------+");
			
			return veiculoAuxiliar;
		}
		
		return null;
		
	}
	
	private static boolean checaCampoBranco(String string) {
		
	    // Checando se a string � "null".
	    if (string == null) {
	      return false;
	    }
	    // Checando se a string esta vazio (s� contem espa�os).
	    else if (string.trim().isEmpty()){
	      return false;
	    }

	    return true;

	}

	public static void MenuCadastrarVeiculo() {
		System.out.println("-------------------- Cadastro de Ve�culos -----------------\n");
		System.out.println("                 1 - Cadastrar Ve�culo de Passeio            ");
		System.out.println("                 2 - Cadastrar Ve�culo Utilit�rio            ");
		System.out.println("                 3 - Cadastrar Motocicleta                   ");
		System.out.println("                                                             ");
		System.out.println("                 Escolha uma dessas op��es:                  ");
	}
	
	public static VeiculoDePasseio CadastrarPasseio(Veiculo dadosBasicos) {

		// Obtendo os dados dos itens opcionais de ve�culos de passeio.
		Scanner leitorP = new Scanner(System.in);
		
		System.out.println("Coloque a Categoria do Ve�culo:");
		System.out.println("(Compacto, Compacto de Luxo, Sedan ou SUVs)");
		String CategoriaVeiculo = leitorP.nextLine();

		System.out.println("O ve�culo possui Ar-Condicionado? (Digite sim ou nao)");
		String Arcondicionado = leitorP.nextLine();
		boolean Ar = false;
		if (Arcondicionado.equals("sim")){
			Ar = true;
		} else if (Arcondicionado.equals("nao")){
			Ar = false;
		} else {
			System.out.println("Op��o inv�lida. Tente novamente!");
		}
		
		
		System.out.println("O ve�culo possui Dire��o Hidraulica? (Digite sim ou nao");
		String DirecaoHidraulica = leitorP.nextLine();
		boolean Direcao = false;
		if(DirecaoHidraulica.equals("sim")){
			Direcao = true;
		} else if(DirecaoHidraulica.equals("nao")){
			Direcao = false;
		}
		else {
			System.out.println("Op��o inv�lida. Tente novamente!");
		}
		
		
		System.out.println("O ve�culo tem C�mbio Autom�tico? (Digite sim ou nao");
		String CambioAutomatico = leitorP.nextLine();;
		boolean Cambio = false;
		if(CambioAutomatico.equals("sim")){
			Cambio = true;
		} else if(CambioAutomatico.equals("nao")){
			Cambio = false;
		}
		else {
			System.out.println("Op��o inv�lida. Tente novamente!");
		}
		
		System.out.println("\n\n");
		System.out.println("+--------------------------------------------+");
		System.out.println(" Dados Cadastrados:");
		System.out.println("+--------------------------------------------+");
		System.out.println("	Categoria do Ve�culo: "+ CategoriaVeiculo);
		System.out.println("	Arcondicionado: "+ Ar);
		System.out.println("	Dire��o Hidr�ulica: "+ Direcao);
		System.out.println("	C�mbio Autom�tico: "+ Cambio);
		System.out.println("+--------------------------------------------+\n");
		
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
		
		// Obtendo os dados dos itens opcionais de ve�culos utilit�rios.

	    System.out.println("Cadastrando Utilitario");

	    System.out.println("O ve�culo � do tipo Carga ou Passageiro? (Digite Carga/carga ou Passageiro/passageiro)");		
		String EscolhaU = "";
		EscolhaU = leitorU.nextLine();
	    System.out.println("Qual � a capacidade de carga?");
		float Carga = leitorU.nextFloat();

	    
	    // Caso seja de passageiros.
		if (EscolhaU.equals("Passageiro") || (EscolhaU.equals("passageiro"))) {
			System.out.println("Ve�culo de passageiro");
			
			System.out.println("O ve�culo de carga possui Ar Condicionado? (Digite sim ou nao)");
			String Arcondicionado = leitorU.nextLine();
			boolean Ar = false;
			if (Arcondicionado.equals("sim")){
				Ar = true;
			} else if (Arcondicionado.equals("nao")){
				Ar = false;
			}
			else {
				System.out.println("Op��o inv�lida. Tente novamente!");
			}
			
			
			System.out.println("O ve�culo de carga possui Dire��o Hidraulica? (Digite sim ou nao)");
			String DirecaoHidraulica = leitorU.nextLine();;
			boolean Direcao = false;
			if (DirecaoHidraulica.equals("sim")){
				Direcao = true;
			} else if (DirecaoHidraulica.equals("nao")){
				Direcao = false;
			}
			else {
				System.out.println("Op��o inv�lida. Tente novamente!");
			}
			
			
			System.out.println("O ve�culo de carga possui Tv a bordo? (Digite sim ou nao)");
			String Tvabordo = leitorU.nextLine();;
			boolean TV = false;
			if(Tvabordo.equals("sim")){
				TV = true;
			} else if(Tvabordo.equals("nao")){
				TV = false;
			}
			else {
				System.out.println("Op��o inv�lida. Tente novamente!");
			}
			
			System.out.println("+---------------------------------------------------------+");
			System.out.println(" Dados cadastrados:");
			System.out.println("+---------------------------------------------------------+");
			System.out.println("	Categoria do Ve�culo: " + EscolhaU);
			System.out.println("	Capacidade de Carga: " + Carga);
			System.out.println("	Arcondicionado: " + Ar);
			System.out.println("	Dire��o Hidr�ulica: " + Direcao);
			System.out.println("	C�mbio Autom�tico: " + TV);
			System.out.println("+---------------------------------------------------------+");
			
			veiculoAuxiliar = new UtilitarioPassageiros(Ar, Direcao, TV, EscolhaU, Carga,
																		dadosBasicos.getMarca(), dadosBasicos.getModelo(),
																		dadosBasicos.getAnoFabricacao(), dadosBasicos.getAnoModelo(),
																		dadosBasicos.getRenavam(), dadosBasicos.getCapacidadeTanque(),
																		dadosBasicos.getDiaria());

			
		}
		
		// Caso seja de carga.
		else if (EscolhaU.equals("Carga")||EscolhaU.equals("carga")){
				
				System.out.print("Ve�culo de Carga \n");
				System.out.println("Qual � a tara do ve�culo? ");
				float Tara = leitorU.nextFloat();
				
				System.out.println("Qual � o tamanho do compartimento de carga (Em litros)? ");
				float Compartimento = leitorU.nextFloat();
								
				System.out.println("Digite o tipo de carga:");
				System.out.println("0 para B�u");
				System.out.println("1 para Graneleiro");
				System.out.println("2 para Basculante");
				int numeroTipo = leitorU.nextInt();
				String Tipo = "";
				if(numeroTipo == 0) {
					Tipo = "B�u";
				} else if(numeroTipo == 1) {
					Tipo = "Graneleiro";
				} else if(numeroTipo == 2) {
					Tipo = "Basculante";
				}
				else {
					System.out.println("Op��o inv�lida!");
				}
				
				System.out.println("+---------------------------------------------------------+");
				System.out.println(" Dados cadastrados:");
				System.out.println("+---------------------------------------------------------+");
				System.out.println("	Categoria do Ve�culo: " + EscolhaU);
				System.out.println("	Capacidade de Carga: " + Carga);
				System.out.println("	Arcondicionado: " + Tara);
				System.out.println("	Dire��o Hidr�ulica: " + Compartimento);
				System.out.println("	C�mbio Autom�tico: " + Tipo);
				System.out.println("+---------------------------------------------------------+");
				
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
		System.out.println("O veiculo possui Controle de Tra��o? (Digite sim ou nao)");
		String ControleTracao = leitorM.nextLine();
		boolean Controle = false;
		if(ControleTracao.equals("sim")){
			Controle = true;
		} else if(ControleTracao.equals("nao")){
			Controle = false;
		}
		else {
			System.out.println("Op��o inv�lida. Tente novamente!");
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
			System.out.println("Op��o inv�lida. Tente novamente!");
		}
		
		
		System.out.println("O ve�culo tem Piloto Automatico? (Digite sim ou nao)");
		String PilotoAutomatico = leitorM.nextLine();
		boolean Piloto = false;
		if (PilotoAutomatico.equals("sim")){
			Piloto = true;
		} else if (PilotoAutomatico.equals("nao")){
			Piloto = false;
		}
		else {
			System.out.println("Op��o inv�lida. Tente novamente!");
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
			System.out.println("Op��o inv�lida. Tente novamente!");
		}
		
		System.out.println("\n\n");
		System.out.println("+------Dados cadastrados------+");
		System.out.println("Controle de Tra��o: " + Controle);
		System.out.println("Freio ABS: " + Freio);
		System.out.println("Piloto Autom�tico: " + Piloto);
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