package gerenciaFrota;

public class UtilitarioPassageiros extends VeiculoUtilitario{
	
	private Boolean arCondicionadoUT,
					direcaoHidraulicaUT,
					tvaBordo;
	
	public UtilitarioPassageiros(Boolean arCondicionadoUT, Boolean direcaoHidraulicaUT, Boolean tvaBordo,
								 String categoriaUtilitario, Float capacidadeDeCarga, String marca, String modelo,
			                     int anoFabricacao, int anoModelo, int renavam, int capacidadeTanque) {
		super(categoriaUtilitario, capacidadeDeCarga, marca, modelo, anoFabricacao, anoModelo, renavam, 
			  capacidadeTanque);
		this.arCondicionadoUT = arCondicionadoUT;
		this.direcaoHidraulicaUT = direcaoHidraulicaUT;
		this.tvaBordo = tvaBordo;
	}

	public Boolean getArCondicionadoUT() {
		return arCondicionadoUT;
	}

	public void setArCondicionadoUT(Boolean arCondicionadoUT) {
		this.arCondicionadoUT = arCondicionadoUT;
	}

	public Boolean getDirecaoHidraulicaUT() {
		return direcaoHidraulicaUT;
	}

	public void setDirecaoHidraulicaUT(Boolean direcaoHidraulicaUT) {
		this.direcaoHidraulicaUT = direcaoHidraulicaUT;
	}

	public Boolean getTvaBordo() {
		return tvaBordo;
	}

	public void setTvaBordo(Boolean tvaBordo) {
		this.tvaBordo = tvaBordo;
	}
	
}
