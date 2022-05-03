package gerenciaFrota;

public class VeiculoUtilitario extends Veiculo{

	private String categoriaUtilitario;
	private Float capacidadeDeCarga;
	
	public VeiculoUtilitario(String categoriaUtilitario, Float capacidadeDeCarga, String marca, String modelo, 
			   				 int anoFabricacao, int anoModelo, int renavam, int capacidadeTanque, Diaria diaria) {
		super(marca, modelo, anoFabricacao, anoModelo, renavam, capacidadeTanque, diaria);
		this.categoriaUtilitario = categoriaUtilitario;
		this.capacidadeDeCarga = capacidadeDeCarga;
	}

	public void cadastraVut() {
		
	}

	public String getCategoriaUtilitario() {
		return categoriaUtilitario;
	}

	public void setCategoriaUtilitario(String categoriaUtilitario) {
		this.categoriaUtilitario = categoriaUtilitario;
	}

	public Float getCapacidadeDeCarga() {
		return capacidadeDeCarga;
	}

	public void setCapacidadeDeCarga(Float capacidadeDeCarga) {
		this.capacidadeDeCarga = capacidadeDeCarga;
	}

}