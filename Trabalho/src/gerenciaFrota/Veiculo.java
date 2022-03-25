package gerenciaFrota;

public class Veiculo {
	
	private String marca,
				   modelo;
	private int anoFabricacao,
				anoModelo,
				renavam,
				capacidadeTanque;
	
	protected Diaria diaria;
	
	public Veiculo(String marca, String modelo, int anoFabricacao, int anoModelo, 
			       int renavam, int capacidadeTanque, Diaria diaria) {
		this.marca = marca;
		this.modelo = modelo;
		this.anoFabricacao = anoFabricacao;
		this.anoModelo = anoModelo;
		this.renavam = renavam;
		this.capacidadeTanque = capacidadeTanque;
		this.setDiaria(diaria);
	}
	
	public void cadastrarVeiculo() {
		// Reservado método cadastrarVeiculo.
	}
	
	public void excluirVeiculo() {
		// Reservado método excluirVeiculo.
	}

	public void atualizarDados() {
		// Reservado método atualizarDados.
	}
	
	public void pesquisarVeiculo() {
		// Reservado método pesquisarVeiculo.
	}
	
	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getAnoFabricacao() {
		return anoFabricacao;
	}

	public void setAnoFabricacao(int anoFabricacao) {
		this.anoFabricacao = anoFabricacao;
	}

	public int getAnoModelo() {
		return anoModelo;
	}

	public void setAnoModelo(int anoModelo) {
		this.anoModelo = anoModelo;
	}

	public int getRenavam() {
		return renavam;
	}

	public void setRenavam(int renavam) {
		this.renavam = renavam;
	}

	public int getCapacidadeTanque() {
		return capacidadeTanque;
	}

	public void setCapacidadeTanque(int capacidadeTanque) {
		this.capacidadeTanque = capacidadeTanque;
	}

	public Diaria getDiaria() {
		return diaria;
	}

	public void setDiaria(Diaria diaria) {
		this.diaria = diaria;
	}
		
}
