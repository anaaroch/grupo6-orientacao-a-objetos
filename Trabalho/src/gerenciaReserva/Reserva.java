package gerenciaReserva;

public class Reserva {
	
	private int id,
				diarias,
				dataInicio,
				dataFim;
	
	private ValorTotal total;
	
	public Reserva(int id, int diarias, int dataInicio, int dataFim, ValorTotal total) {
		this.id = id;
		this.diarias = diarias;
		this.dataInicio = dataInicio;
		this.dataFim = dataFim;
		this.setTotal(total);
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

	public int getDataInicio() {
		return dataInicio;
	}

	public void setDataInicio(int dataInicio) {
		this.dataInicio = dataInicio;
	}

	public int getDataFim() {
		return dataFim;
	}

	public void setDataFim(int dataFim) {
		this.dataFim = dataFim;
	}

	public ValorTotal getTotal() {
		return total;
	}

	public void setTotal(ValorTotal total) {
		this.total = total;
	}

	
}
