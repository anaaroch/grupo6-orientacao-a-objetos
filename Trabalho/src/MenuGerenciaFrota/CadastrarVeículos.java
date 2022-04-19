package MenuGerenciaFrota;

import java.util.Scanner;

import gerenciaFrota.Veiculo;
import gerenciaFrota.VeiculoDePasseio;

public class CadastrarVeículos {
	
	public static void cadastro() {
		
		Veiculo veiculo=new Veiculo(null, null, 0, 0, 0, 0, null);
		Scanner cadastrarV=new Scanner(System.in);		
		
		// Obtendo os dados iniciais do veículo.
		System.out.println("Cadastrando...");
		System.out.println("Coloque a Marca do Veículo:");
		veiculo.setMarca(cadastrarV.nextLine());
		
		System.out.println("Coloque o Modelo do Veículo:");
		veiculo.setModelo(cadastrarV.nextLine());
		
		System.out.println("Coloque o Ano de Fabricação:");
		veiculo.setAnoFabricacao(cadastrarV.nextInt());
		
		System.out.println("Coloque o Ano de Modelo:");
		veiculo.setAnoModelo(cadastrarV.nextInt());
		
		System.out.println("Coloque o Número do Renavam:");
		veiculo.setRenavam(cadastrarV.nextInt());
		
		System.out.println("Coloque a Capacidade do TANQUE:");
		veiculo.setCapacidadeTanque(cadastrarV.nextInt());
		
		// Mostrando os dados digitados
		System.out.println("\n\n\n");
		System.out.println("Dados cadastrados: ");
		System.out.println("Marca: "+veiculo.getMarca());
		System.out.println("Modelo: "+veiculo.getModelo());
		System.out.println("Ano de Fabricação: "+veiculo.getAnoFabricacao());
		System.out.println("Ano Modelo: "+veiculo.getAnoModelo());
		System.out.println("Renavam: "+veiculo.getRenavam());
		System.out.println("Capacidade do Tanque: "+veiculo.getCapacidadeTanque());
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
		VeiculoDePasseio VeiculoPasseio=new VeiculoDePasseio(null, false, false, false, null, null, 0, 0, 0, 0, null);
		
		Scanner cadastrarP=new Scanner(System.in);
		
		// Obtendo os dados dos itens opcionais de veículos de passeio.
		System.out.println("Cadastrando Veículo de Passeio...");
		System.out.println("Coloque a Categoria do Veículo:");
		VeiculoPasseio.setCategoriaPasseio(cadastrarP.nextLine());
		
		System.out.println("O veículo possui Ar-Condicionado? (Digite Sim/sim ou Não/não)");
		String Arcondicionado=cadastrarP.nextLine();
		String Ar;
		Ar=Arcondicionado;
		if(Ar.equals("Sim")||Ar.equals("sim")){
			Ar="Possui";
		} else if(Ar.equals("Não")||Ar.equals("não")){
			Ar="Não Possui";
		}
		else {
			System.out.println("Opção inválida. Tente novamente!");
		}
		System.out.println("O veículo possui Direção Hidraulica? (Digite Sim/sim ou Não/não");
		String DirecaoHidraulica=cadastrarP.nextLine();;
		String Direcao;
		Direcao=DirecaoHidraulica;
		if(Direcao.equals("Sim")||Direcao.equals("sim")){
			Direcao="Possui";
		} else if(Direcao.equals("Não")|Direcao.equals("não")){
			Direcao="Não Possui";
		}
		else {
			System.out.println("Opção inválida. Tente novamente!");
		}
		System.out.println("O veículo tem Câmbio Automático? (Digite Sim/sim ou Não/não");
		String CambioAutomatico=cadastrarP.nextLine();;
		String Cambio;
		Cambio=CambioAutomatico;
		if(Cambio.equals("Sim")||Cambio.equals("sim")){
			Cambio="Possui";
		} else if(Cambio.equals("Não")||Cambio.equals("não")){
			Cambio="Não Possui";
		}
		else {
			System.out.println("Opção inválida. Tente novamente!");
		}
		System.out.println("Dados cadastrados: ");
		System.out.println("Categoria do Veículo: "+VeiculoPasseio.getCategoriaPasseio());
		System.out.println("Arcondicionado: "+Ar);
		System.out.println("Direção Hidráulica: "+Direcao);
		System.out.println("Câmbio Automático: "+Cambio);
	}
	
	public static void CadastrarUtilitario() {
		// Obtendo os dados dos itens opcionais de veículos utilitários.
		Scanner cadastrarU=new Scanner(System.in);	
	    System.out.println("Cadastrando Utilitario");
	    System.out.println("O veículo é do tipo Carga o Passageiro? (Digite Carga/carga ou Passageiro/passageiro)");		
		String EscolhaU=cadastrarU.nextLine();
		String EscolhaUt;
	    EscolhaUt=EscolhaU;
		if(EscolhaUt.equals("Carga")||(EscolhaUt.equals("carga"))) {
			System.out.println("Veículo de Carga");
			System.out.println("Qual é a capacidade de carga?");
			String CargaC=cadastrarU.nextLine();
			System.out.println("O veículo de carga possui Ar Condicionado? (Digite Sim/sim ou Não/não)");
			String Arcondicionado=cadastrarU.nextLine();
			String Ar;
			Ar=Arcondicionado;
			if (Ar.equals("Sim")||Ar.equals("sim")){
				Ar="Possui";
			} else if(Ar.equals("Não")||Ar.equals("não")){
				Ar="Não Possui";
			}
			else {
				System.out.println("Opção inválida. Tente novamente!");
			}
			System.out.println("O veículo de carga possui Direção Hidraulica? (Digite Sim/sim ou Não/não)");
			String DirecaoHidraulica=cadastrarU.nextLine();;
			String Direcao;
			Direcao=DirecaoHidraulica;
			if(Direcao.equals("Sim")||Direcao.equals("sim")){
				Direcao="Possui";
			} else if(Direcao.equals("Não")||Direcao.equals("não")){
				Direcao="Não Possui";
			}
			else {
				System.out.println("Opção inválida. Tente novamente!");
			}
			System.out.println("O veículo de carga possui Tv a bordo? (Digite Sim/sim ou Não/não)");
			String Tvabordo=cadastrarU.nextLine();;
			String TV;
			TV=Tvabordo;
			if(TV.equals("Sim")||TV.equals("sim")){
				TV="Possui";
			} else if(TV.equals("Não")|TV.equals("não")){
				TV="Não Possui";
			}
			else {
				System.out.println("Opção inválida. Tente novamente!");
			}
			System.out.println("Dados cadastrados: ");
			System.out.println("Categoria do Veículo: "+EscolhaUt);
			System.out.println("Capacidade de Carga: "+CargaC);
			System.out.println("Arcondicionado: "+Ar);
			System.out.println("Direção Hidráulica: "+Direcao);
			System.out.println("Câmbio Automático: "+TV);
			
		}  
			else if(EscolhaUt.equals("Passageiro")||EscolhaUt.equals("passageiro")){
				System.out.print("Veículo de Passageiro");
				
				System.out.println("Qual é a tara do veículo? ");
				String Tara=cadastrarU.nextLine();
				
				System.out.println("Qual é o tamanho do compartimento de carga (Em litros)? ");
				String Compartimento=cadastrarU.nextLine();
				
				System.out.println("Qual é a capacidade de carga? ");
				String CargaP=cadastrarU.nextLine();
				
				System.out.println("Digite o tipo de carga: Báu/Graneleiro/Basculante");
				String TipoCarga=cadastrarU.nextLine();
				String Tipo;
				Tipo=TipoCarga;
				if(Tipo.equals("Báu")){
					Tipo="Báu";
				} else if(Tipo.equals("Graneleiro")){
					Tipo="Graneleiro";
				}     else if(Tipo.equals("Basculante")){
					   Tipo="Basculante";
				}
				else {
					System.out.println("Opção inválida. Tente novamente!");
				}
				
				System.out.println("\n\n\n");
				System.out.println("Dados cadastrados: ");
				System.out.println("Categoria do Veículo: "+EscolhaUt);
				System.out.println("Capacidade de Carga: "+CargaP);
				System.out.println("Arcondicionado: "+Tara);
				System.out.println("Direção Hidráulica: "+Compartimento);
				System.out.println("Câmbio Automático: "+Tipo);
			}
	}
	public static void CadastrarMotocicleta() {
		// Obtendo os dados dos itens opcionais de Motocicletas.
		Scanner cadastrarM=new Scanner(System.in);	
		System.out.println("Cadastrando Motocicleta...");
		
		System.out.println("O veículo tem Controle de Tração? (Digite Sim/sim ou Não/não)");
		String ControleTracao=cadastrarM.nextLine();;
		String Controle;
		Controle=ControleTracao;
		if(Controle.equals("Sim")||Controle.equals("sim")){
			Controle="Possui";
		} else if(Controle.equals("Não")||Controle.equals("não")){
			Controle="Não Possui";
		}
		else {
			System.out.println("Opção inválida. Tente novamente!");
		}
		
		System.out.println("O veículo tem Freio ABS? (Digite Sim/sim ou Não/não)");
		String FreioAbs=cadastrarM.nextLine();
		String Freio;
		Freio=FreioAbs;
		if(Freio.equals("Sim")||Freio.equals("sim")){
			Freio="Possui";
		} else if(Freio.equals("Não")||Freio.equals("não")){
			Freio="Não Possui";
		}
		else {
			System.out.println("Opção inválida. Tente novamente!");
		}
		
		System.out.println("O veículo tem Piloto Automatico? (Digite Sim/sim ou Não/não)");
		String PilotoAutomatico=cadastrarM.nextLine();
		String Piloto;
		Piloto=PilotoAutomatico;
		if(Piloto.equals("Sim")||Piloto.equals("sim")){
			Piloto="Possui";
		} else if(Piloto.equals("Não")||Piloto.equals("não")){
			Piloto="Não Possui";
		}
		else {
			System.out.println("Opção inválida. Tente novamente!");
		}
		
		System.out.println("Digite o Modo de Pilotagem: Cidade/Estrada/Sport/Off-Road");
		String MododePilotagem=cadastrarM.nextLine();
		String Modo;
		Modo=MododePilotagem;
		if(Modo.equals("Cidade")){
			Modo="Cidade";
		} else if(Modo.equals("Estrada")){
			Modo="Estrada";
		}     else if(Modo.equals("Sport")){
			   Modo="Sport";
		}       else if(Piloto.equals("Off-Road")){
			     Modo="Off-Road";
		}
		else {
			System.out.println("Opção inválida. Tente novamente!");
		}
		
		System.out.println("\n\n\n");
		System.out.println("Dados cadastrados: ");
		System.out.println("Controle de Tração: "+Controle);
		System.out.println("Freio ABS: "+Freio);
		System.out.println("Piloto Automático: "+Piloto);
		System.out.println("Modo de Pilotagem: "+Modo);
	}
}
