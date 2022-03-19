package gerenciaFrota;

public class UtilitarioCarga extends VeiculoUtilitario {
	
	private String tipoCompartimento;
	private Float taraVeiculo,
				  tamCompartimento;
	
	public UtilitarioCarga(String tipoCompartimento, Float taraVeiculo, Float tamCompartimento, String categoriaUtilitario, 
						   Float capacidadeDeCarga, String marca, String modelo, int anoFabricacao, int anoModelo, int renavam, 
						   int capacidadeTanque, Diaria diaria) {
		super(categoriaUtilitario, capacidadeDeCarga, marca, modelo, anoFabricacao, anoModelo, renavam, capacidadeTanque, diaria);
		this.tipoCompartimento = tipoCompartimento;
		this.taraVeiculo = taraVeiculo;
		this.tamCompartimento = tamCompartimento;
	}

	public String getTipoCompartimento() {
		return tipoCompartimento;
	}

	public void setTipoCompartimento(String tipoCompartimento) {
		this.tipoCompartimento = tipoCompartimento;
	}

	public Float getTaraVeiculo() {
		return taraVeiculo;
	}

	public void setTaraVeiculo(Float taraVeiculo) {
		this.taraVeiculo = taraVeiculo;
	}

	public Float getTamCompartimento() {
		return tamCompartimento;
	}

	public void setTamCompartimento(Float tamCompartimento) {
		this.tamCompartimento = tamCompartimento;
	}
	
}
