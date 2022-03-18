package gerenciaFrota;

public class VeiculoDePasseio extends Veiculo{
	
	private String categoriaPasseio;
	private Boolean arCondicionado,
					direcaoHidraulica,
					cambioAutomatico;
	
	public VeiculoDePasseio(String categoriaPasseio, boolean arCondicionado, boolean direcaoHidraulica, 
			boolean cambioAutomatico, String marca, String modelo, int anoFabricacao, int anoModelo, 
			int renavam, int capacidadeTanque) {
		super(marca, modelo, anoFabricacao, anoModelo, renavam, capacidadeTanque);
		this.categoriaPasseio = categoriaPasseio;
		this.arCondicionado = arCondicionado;
		this.direcaoHidraulica = direcaoHidraulica;
		this.cambioAutomatico = cambioAutomatico;
	}
	
	public void cadastraVpass(){
		
	}

	public String getCategoriaPasseio() {
		return categoriaPasseio;
	}

	public void setCategoriaPasseio(String categoriaPasseio) {
		this.categoriaPasseio = categoriaPasseio;
	}

	public Boolean getArCondicionado() {
		return arCondicionado;
	}

	public void setArCondicionado(Boolean arCondicionado) {
		this.arCondicionado = arCondicionado;
	}

	public Boolean getDirecaoHidraulica() {
		return direcaoHidraulica;
	}

	public void setDirecaoHidraulica(Boolean direcaoHidraulica) {
		this.direcaoHidraulica = direcaoHidraulica;
	}

	public Boolean getCambioAutomatico() {
		return cambioAutomatico;
	}

	public void setCambioAutomatico(Boolean cambioAutomatico) {
		this.cambioAutomatico = cambioAutomatico;
	}
	
	
}
