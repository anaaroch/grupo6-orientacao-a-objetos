package MenuReserva;

import java.util.ArrayList;
import java.util.Scanner;

import MenuGerenciaLocatario.PesquisarLocatario;
import gerenciaFrota.Veiculo;
import gerenciaLocatarios.PessoaFisica;
import gerenciaReserva.Reserva;

public class MenuGerenciaReserva {
	
	public static Scanner leitorR = new Scanner(System.in);
	
	public static ArrayList<Reserva> Res = new ArrayList<Reserva>();
	
	public static void MenuLocatario() {
		
		System.out.println("------------- Menu [Ger�ncia Reserva] ---------------\n");
		System.out.println("                 1 - Cadastrar reserva                       ");
		System.out.println("                                                             ");
		}
	
	public static void CadastrarReservaPessoa(ArrayList<Veiculo> veiculos) {

		
		String PFReserva = null, PJReserva = null, HoraInicio = null, HoraFim = null, DataInicioDia = null, DataInicioMes = null,
				DataFimDia = null, DataFimMes = null; // Novos metodos nomePF, nomePJ e hora de inicio e fim na classe Reserva.
		int Diarias = 0, DTotal = 0, DiInt, DfInt, HiInt, HfInt = 0;
		
		Reserva NovaRes = new Reserva(DataFimMes, DataFimMes, HfInt, HfInt, HfInt, HfInt, HfInt, HfInt, HfInt, HfInt);
		
		System.out.println("Digite o Renavam do Ve�culo:");
		int RenavamPesquisado = leitorR.nextInt();
		System.out.println("Renavam pesquisado: " + RenavamPesquisado + "\n");
		Veiculo veiculoAuxiliar = null;
		
		for (Veiculo v : veiculos) {
			if (v.getRenavam()==RenavamPesquisado);
				veiculoAuxiliar = v; // Guardando o ve�culo no objeto auxiliar.
				break;	
		}
		
		System.out.println("Criando Reserva...");
		
		System.out.println("Coloque o n�mero da reserva");
		NovaRes.setId(leitorR.nextInt());
		
		System.out.println("Coloque o dia data de expedi��o da Reserva:");
		NovaRes.setDataInicioDia(leitorR.nextInt());
		
		System.out.println("Coloque o mes data de expedi��o da Reserva:");
		NovaRes.setDataInicioMes(leitorR.nextInt());

		System.out.println("Coloque a hora de expedi��o da Reserva:");
		NovaRes.setHoraInicio(leitorR.nextInt());

		System.out.println("Coloque o dia data do fim da Reserva:");
		NovaRes.setDataFimDia(leitorR.nextInt());
		
		System.out.println("Coloque o mes data do fim da Reserva:");
		NovaRes.setDataFimMes(leitorR.nextInt());

		System.out.println("Coloque a hora do fim da Reserva:");
		NovaRes.setHoraFim(leitorR.nextInt());
	
		
		System.out.println("Digite o Id do :");
		int IdPesquisado = leitorR.nextInt();
		System.out.println("Renavam pesquisado: " + RenavamPesquisado + "\n");
		Veiculo veiculoAuxiliar1 = null;
		
		for (Veiculo v : veiculos) {
			if (v.getRenavam()==RenavamPesquisado);
				veiculoAuxiliar1 = v; // Guardando o ve�culo no objeto auxiliar.
				break;	
		}
		
        System.out.println("Reserva:"+NovaRes.getId());

        System.out.println("** Dados da Loca��o **");

        System.out.println("In�cio:"+NovaRes.getDataInicioDia());
        System.out.println("Fim:"+NovaRes.getDataFimDia());
        System.out.println("N�mero de di�rias calculadas: < numero >");

        System.out.println("Ve�culo: "+veiculoAuxiliar.getMarca()+" "+veiculoAuxiliar.getModelo());
        System.out.println("Ano de fabrica��o / modelo:"+veiculoAuxiliar.getAnoFabricacao()+veiculoAuxiliar.getAnoModelo());
        System.out.println("Renavam:"+veiculoAuxiliar.getRenavam());
		
		
		// M�todo registra ve�culos em andamento
		
		// C�lculo das di�rias ser� feito com os valores retornados pela classe veiculo dentro da classe reserva
		
		
		//...
		
		Res.add(NovaRes);
		
	}
}
