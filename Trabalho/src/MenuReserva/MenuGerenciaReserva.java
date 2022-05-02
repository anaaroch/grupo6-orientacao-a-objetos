package MenuReserva;

import java.util.ArrayList;

import java.util.Scanner;


import MenuGerenciaLocatario.PesquisarLocatario;
import gerenciaLocatarios.PessoaFisica;
import gerenciaReserva.Reserva;


public class MenuGerenciaReserva {
	
	public static Scanner leitorR = new Scanner(System.in);
	
	public static ArrayList<Reserva> Res = new ArrayList<Reserva>();
	
	public static void MenuLocatario() {
		
		System.out.println("------------- Menu [Gerência Reserva] ---------------\n");
		System.out.println("                 1 - Cadastrar reserva                       ");
		System.out.println("                 2 - Emitir relatório                        ");
		System.out.println("                 3 - Emitir relatório consolidade de reserva ");
		System.out.println("                                                             ");
		System.out.println("                 Escolha uma dessas opções:                  ");
		}
	
	public static void CadastrarReserva() {
		
		String PFReserva = null, PJReserva = null; // Novos metodos nomePF, nomePJ e hora de inicio e fim na classe Reserva.
		int Diarias = 0, DTotal = 0, HoraInicio, HoraFim, DataInicio, DataFim;
		
		System.out.println("Deseja realizar uma reserva para uma pessoa física ou jurídica dentro do sistema?");
		System.out.println("                                                                                 ");
		System.out.println("                                  1 - Pessoa Física                              ");
		System.out.println("                                  2 - Pessoa Jurídica                            ");
		
		int escolhaR;
		
		escolhaR = leitorR.nextInt();
		
		switch(escolhaR) {
		case 1: 
			PFReserva = PesquisarLocatario.PesquisaFisicaPessoaNome(null); //Função retorna string com o nome pesquisado 
			break;
		case 2:	
			PJReserva = PesquisarLocatario.PesquisaPessoaJuridicaNome(null); //Função retorna string com o nome pesquisado
			System.out.println("                                                               ");
			System.out.println("Agora cadastre uma pessoa física como responsável pela locação:");
			System.out.println("                                         					   ");
			PFReserva = PesquisarLocatario.PesquisaFisicaPessoaNome(null); //Função retorna string com o nome pesquisado
			break;
		default:
			System.out.println("Escolha inválida. Tente novamente!!");	
		}
		
		Reserva NovaRes = new Reserva(null, null, 0, 0, 0, 0, 0, 0);
		
		System.out.println("Criando Reserva...");
		
		System.out.println("Coloque a data de expedição da Reserva:");
		DataInicio = leitorR.nextInt();
		NovaRes.setDataInicio(DataInicio);
		
		System.out.println("Coloque a hora de expedição da Reserva:");
		HoraInicio = leitorR.nextInt();
		NovaRes.setHoraInicio(HoraInicio);
		
		System.out.println("Coloque a data do fim da Reserva:");
		DataFim = leitorR.nextInt();
		NovaRes.setDataFim(DataFim);
		
		System.out.println("Coloque a hora do fim da Reserva:");
		HoraFim = leitorR.nextInt();
		NovaRes.setHoraFim(HoraFim);

		DTotal = DataFim - DataInicio;
		
		if (DataFim >= DataInicio) {
			DTotal = DTotal + 1;
		} else {
			if (DataFim < DataInicio) {
				DTotal = DTotal - 1;
			}
		}
		
		Diarias = DTotal;
		
		NovaRes.setDiarias(Diarias);
		
		
		// Método registra veículos em andamento
		
		// Cálculo das diárias será feito com os valores retornados pela classe veiculo dentro da classe reserva
		
		
		//...
		
		Res.add(NovaRes);
		
	}
	
	public static void EmitirRelatorio() {
		System.out.println("Método - Emitir Relatório..."); // Imprime arraylist Res
		
		System.out.println("Reserva: <numero_da_reserva>");
		System.out.println("Locatário: <nome_da_PF_ou_PJ>");
		System.out.println("Responsável pela locaçao: <nome_da_PF>");

		System.out.println("****************************** Dados da Locação ******************************");

		System.out.println("Início: <data_de_inicio> - <hora_de_inicio>");
		System.out.println("Fim: <data_de_fim> - <hora_de_fim>");
		System.out.println("Número de diárias calculadas: < numero >");

		System.out.println("Veículo: <Marca_do_Veiculo> - <Modelo_do_Veiculo>");
		System.out.println("Ano de fabricação / modelo: <ano_fabricacao> / <ano_modelo>");
		System.out.println("Placa: <numero_da_placa> Renavam: <numero_do_renavam>");
		System.out.println("Categoria: <nome_da_categoria_do_veiculo>");

		System.out.println("Valor da diária: <valor_diaria>");
		System.out.println("Valor do seguro de terceiros: <valor_seguro_terceiros>");
		System.out.println("Valor do seguro próprio: <valor_seguro_proprio>");
		System.out.println("Valor dos impostos: <valor_impostos>");
		System.out.println("Valor total da locação: <valor_total>");
		
	}
	public static void EmitirRelatorioConsolidado() {
		System.out.println("Método - Emitir Relatório Consolidade de Reserva...");
		
	}
}
