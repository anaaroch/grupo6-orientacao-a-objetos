package MenuReserva;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

import MenuGerenciaLocatario.PesquisarLocatario;
import gerenciaFrota.Diaria;
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
	
	public static void CadastrarReservaPessoa(ArrayList<Veiculo> veiculos, ArrayList<PessoaFisica> Pessoas) {

		
		String PFReserva = null, PJReserva = null, HoraInicio = null, HoraFim = null, DataInicioDia = null, DataInicioMes = null,
				DataFimDia = null, DataFimMes = null; // Novos metodos nomePF, nomePJ e hora de inicio e fim na classe Reserva.
		int Diarias = 0, DTotal = 0, DiInt, DfInt, HiInt, HfInt = 0;
		
		Reserva NovaRes = new Reserva(DataFimMes, DataFimMes, HfInt, HfInt, HfInt, HfInt, HfInt, HfInt, HfInt);
		
		System.out.println("Digite o Renavam do Ve�culo:");
		int RenavamPesquisado = leitorR.nextInt();
		System.out.println("Renavam pesquisado: " + RenavamPesquisado + "\n");
		Veiculo veiculoAuxiliar = null;
		Float DiariaAuxiliar;
		
		for (Veiculo v : veiculos) {
			if (v.getRenavam()==RenavamPesquisado);
				veiculoAuxiliar = v; // Guardando o ve�culo no objeto auxiliar.
				break;	
		}
		
		System.out.println("Digite o CPF do Locatario:");
		String CPFPesquisado = leitorR.next();
		System.out.println("CPF Pesquisado: " + CPFPesquisado + "\n");
		PessoaFisica CPFAuxiliar = null;
		
		for (PessoaFisica PessoaF : Pessoas) {
			if (PessoaF.getCpf()==CPFPesquisado);
				CPFAuxiliar = PessoaF; // Guardando o ve�culo no objeto auxiliar.
				break;	
		}
		
		System.out.println("Criando Reserva...");
		
		System.out.println("Coloque o n�mero da reserva");
		NovaRes.setId(leitorR.nextInt());
		
		System.out.println("Coloque o dia data de expedi��o da Reserva:");
		NovaRes.setDataInicioDia(leitorR.nextInt());
		
		System.out.println("Coloque o mes data de expedi��o da Reserva:");
		NovaRes.setDataInicioMes(leitorR.nextInt());

		System.out.println("Coloque o dia data do fim da Reserva:");
		NovaRes.setDataFimDia(leitorR.nextInt());
		
		System.out.println("Coloque o mes data do fim da Reserva:");
		NovaRes.setDataFimMes(leitorR.nextInt());
		
		System.out.println("Coloque a quantidade de dias da sua reserva");
		NovaRes.setQntDias(leitorR.nextInt());
		
		System.out.println("Coloque o valor da diaria normal: ");
		DiariaAuxiliar=(leitorR.nextFloat());
		
		System.out.println("Digite o Id do :");
		int IdPesquisado = leitorR.nextInt();
		System.out.println("Renavam pesquisado: " + RenavamPesquisado + "\n");
		Veiculo veiculoAuxiliar1 = null;
		
		for (Veiculo v : veiculos) {
			if (v.getRenavam()==RenavamPesquisado);
				veiculoAuxiliar1 = v; // Guardando o ve�culo no objeto auxiliar.
				break;	
		}
		
		boolean seguro=false;
		
		System.out.println("Deseja Optar por seguro? (No valor de 8% da loca��o) [Digite Sim/sim ou N�o/n�o]");
		String Escolha=leitorR.next();
		if(Escolha.equals("Sim")||Escolha.equals("sim")){
			seguro=true;
		}
		
		int NumeroDiarias = NovaRes.getQntDias();
		int ValorLocacao=(int) (DiariaAuxiliar*NumeroDiarias);
		float ValorTotal;
		float ValorSeguroTerceiro = (float) 0.12*ValorLocacao;
		float ValorSeguroProt=(float) 0.08*ValorLocacao;
		float ValorImpostos=(float) 0.05*ValorLocacao;
		
		if(seguro==true) {
			ValorTotal=(ValorLocacao+(ValorSeguroTerceiro)+(ValorSeguroProt)+(ValorImpostos));
		} else {
			ValorTotal=(ValorLocacao+(ValorSeguroTerceiro)+(ValorImpostos));
		}
		
		
        System.out.println("Reserva:"+NovaRes.getId());
        System.out.println("Locat�rio:"+CPFAuxiliar.getNome());
        System.out.println("CPF:"+CPFAuxiliar.getCpf());

        System.out.println("** Dados da Loca��o **");

        System.out.println("In�cio:"+NovaRes.getDataInicioDia());
        System.out.println("Fim:"+NovaRes.getDataFimDia());
        System.out.println("Quantidade de di�rias:"+NovaRes.getQntDias());

        System.out.println("Ve�culo: "+veiculoAuxiliar.getMarca()+"/"+veiculoAuxiliar.getModelo());
        System.out.println("Ano de fabrica��o / modelo:"+veiculoAuxiliar.getAnoFabricacao()+"/"+veiculoAuxiliar.getAnoModelo());
        System.out.println("Renavam:"+veiculoAuxiliar.getRenavam());

        System.out.println("Valor da di�ria:"+DiariaAuxiliar);
        System.out.println("Valor do seguro de terceiros:"+ValorSeguroTerceiro);
        System.out.println("Valor do seguro pr�prio:"+ValorSeguroProt);
        System.out.println("Valor dos impostos:"+ValorImpostos);
        System.out.println("Valor total da loca��o:"+ValorTotal);
		
		
		Res.add(NovaRes);
		
	}
}
