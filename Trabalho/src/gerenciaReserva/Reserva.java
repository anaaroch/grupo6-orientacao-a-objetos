package gerenciaReserva;

public class Reserva {
	
	private int id,
		    diarias,
		    dataInicioDia,
		    dataInicioMes,
	            dataFimDia,
	            dataFimMes,
	            qntDias;

	
	private String nomePF, nomePJ;
	
	// Pendente: adicionar os valores do registro de veiculos da reserva.
	
	private ValorTotal total;
	
	public Reserva(String nomePF, String nomePJ, int id, int diarias, int dataInicioDia, int dataInicioMes,
			int dataFimDia, int dataFimMes, int qntDias) {
		this.nomePF = nomePF;
		this.nomePJ = nomePJ;
		this.id = id;
		this.diarias = diarias;
		this.dataInicioDia = dataInicioDia;
		this.dataInicioMes = dataInicioMes;
		this.dataFimDia = dataFimDia;
		this.dataFimMes = dataFimMes;
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

	public int getQntDias() {
		return qntDias;
	}

	public void setQntDias(int qntDias) {
		this.qntDias = qntDias;
	}
	
}