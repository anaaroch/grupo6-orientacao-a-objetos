package gerenciaReserva;

public class Reserva {
	
	private int id,
		    diarias,
		    dataInicioDia,
		    dataInicioMes,
	            dataFimDia,
	            dataFimMes,
	            horaInicio,
	            horaFim;
	
	private String nomePF, nomePJ;
	
	// Pendente: adicionar os valores do registro de veiculos da reserva.
	
	private ValorTotal total;
	
	public Reserva(String nomePF, String nomePJ, int id, int diarias, int dataInicioDia, int dataInicioMes,
			int dataFimDia, int dataFimMes, int horaInicio, int horaFim) {
		this.nomePF = nomePF;
		this.nomePJ = nomePJ;
		this.id = id;
		this.diarias = diarias;
		this.dataInicioDia = dataInicioDia;
		this.dataInicioMes = dataInicioMes;
		this.dataFimDia = dataFimDia;
		this.dataFimMes = dataFimMes;
		this.horaInicio = horaInicio;
		this.horaFim = horaFim;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getDiarias() {
		return diarias;
	}

	public void setDiarias(int diarias) {
		this.diarias = diarias;
	}

	public String getPFisica() {
		return nomePF;
	}

	public void setPFisica(String nomePF) {
		this.nomePF = nomePF;
	}

	public String getPJuri() {
		return nomePJ;
	}

	public void setPJuri(String nomePJ) {
		this.nomePJ = nomePJ;
	}
	
	public int getDataFimDia() {
		return dataFimDia;
	}

	public void setDataFimDia(int dataFimDia) {
		this.dataFimDia = dataFimDia;
	}
	
	public int getDataFimMes() {
		return dataFimMes;
	}

	public void setDataFimMes(int dataFimMes) {
		this.dataFimMes = dataFimMes;
	}

	public ValorTotal getTotal() {
		return total;
	}

	public void setTotal(ValorTotal total) {
		this.total = total;
	}
	
	public void setHoraInicio(int horaInicio) {
		this.horaInicio = horaInicio;
	}
	
	public void setHoraFim(int horaFim) {
		this.horaFim = horaFim;
	}
	
	public int getDataInicioDia() {
		return dataInicioDia;
	}

	public void setDataInicioDia(int dataInicioDia) {
		this.dataInicioDia = dataInicioDia;
	}
	
	public int getDataInicioMes() {
		return dataInicioMes;
	}

	public void setDataInicioMes(int dataInicioMes) {
		this.dataInicioMes = dataInicioMes;
	}
	
}