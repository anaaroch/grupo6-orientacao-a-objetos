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
	
	public static void CadastrarReserva(){
		System.out.println("Deseja realizar uma reserva para uma pessoa física ou jurídica dentro do sistema?");
		System.out.println("                                                                                 ");
		System.out.println("                                  1 - Pessoa Física                              ");
		System.out.println("                                  2 - Pessoa Jurídica                            ");
		
		int escolhaR = 0;
		
		escolhaR = leitorR.nextInt();
		
		switch(escolhaR) {
		case 1: 
			CadastrarReservaPessoaFisica(null); //Função retorna string com o nome pesquisado 
			break;
		case 2:	
			PesquisarLocatario.PesquisaPessoaJuridicaNome(null); //Função retorna string com o nome pesquisado
			System.out.println("                                                               ");
			System.out.println("Agora cadastre uma pessoa física como responsável pela locação:");
			System.out.println("                                         					   ");
			PesquisarLocatario.PesquisaFisicaPessoaNome(null); //Função retorna string com o nome pesquisado
			break;
		default:
			System.out.println("Escolha inválida. Tente novamente!!");	
		}
		
	}
	
	public static void CadastrarReservaPessoaFisica(ArrayList<PessoaFisica> Pessoas) {
		
		System.out.println("Pesquise o nome do locatário desejado: ");
		MenuGerenciaLocatario.PesquisarLocatario.PesquisaFisicaPessoaNome(Pessoas);
		
		String PFReserva = null, PJReserva = null, HoraInicio = null, HoraFim = null, DataInicio = null, DataFim = null; // Novos metodos nomePF, nomePJ e hora de inicio e fim na classe Reserva.
		int Diarias = 0, DTotal = 0, DiInt, DfInt, HiInt, HfInt = 0;
		
		Reserva NovaRes = new Reserva(DataFim, DataFim, HfInt, HfInt, HfInt, HfInt, HfInt, HfInt);
		
		System.out.println("Criando Reserva...");
		
		System.out.println("Coloque a data de expedição da Reserva:");
		NovaRes.setDataInicio(leitorR.nextInt());

		
		System.out.println("Coloque a hora de expedição da Reserva:");
		NovaRes.setHoraInicio(leitorR.nextInt());

		
		System.out.println("Coloque a data do fim da Reserva:");
		NovaRes.setDataFim(leitorR.nextInt());

		
		System.out.println("Coloque a hora do fim da Reserva:");
		NovaRes.setHoraFim(leitorR.nextInt());
		
		DataInicio = DataInicio.substring(0,2);
		DiInt = Integer.parseInt(DataInicio);
		
		DataFim = DataFim.substring(0,2);
		DfInt = Integer.parseInt(DataFim);
		
		HoraInicio = HoraInicio.substring(0,2);
		HiInt = Integer.parseInt(HoraInicio);
		
		HoraFim = HoraFim.substring(0,2);
		HiInt = Integer.parseInt(HoraInicio);

		DTotal = DfInt - DiInt;
		
		if (DfInt >= DiInt) {
			DTotal = DTotal + 1;
		} else {
			if (DfInt < DiInt) {
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
	}
	public static void EmitirRelatorioConsolidado() {
		System.out.println("Método - Emitir Relatório Consolidade de Reserva...");
	}
}
