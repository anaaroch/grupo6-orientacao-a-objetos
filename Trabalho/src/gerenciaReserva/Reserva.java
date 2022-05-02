package gerenciaReserva;

public class Reserva {
	
	private int id,
				diarias;
	
	private String nomePF,
	               dataInicio,
	               dataFim,
	               horaInicio,
	               horaFim,
				   nomePJ;
	
	// Pendente: adicionar os valores do registro de veiculos da reserva.
	
	private ValorTotal total;
	
	public Reserva(String nomePF, String nomePJ, int id, int diarias, String dataInicio, String dataFim, String horaInicio, String horaFim) {
		this.nomePF = nomePF;
		this.nomePJ = nomePJ;
		this.id = id;
		this.diarias = diarias;
		this.dataInicio = dataInicio;
		this.dataFim = dataFim;
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
	
	public String getDataFim() {
		return dataFim;
	}

	public void setDataFim(String dataFim) {
		this.dataFim = dataFim;
	}

	public ValorTotal getTotal() {
		return total;
	}

	public void setTotal(ValorTotal total) {
		this.total = total;
	}
	
	public void setHoraInicio(String horaInicio) {
		this.horaInicio = horaInicio;
	}
	
	public void setHoraFim(String horaFim) {
		this.horaFim = horaFim;
	}
	
	public String getDataInicio() {
		return dataInicio;
	}

	public void setDataInicio(String dataInicio) {
		this.dataInicio = dataInicio;
	}
	
}
