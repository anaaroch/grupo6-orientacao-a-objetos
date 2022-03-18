package gerenciaReserva;

public class ValorTotal {
	
	private Float imposto,
				  seguroProtecaoTerceiros,
				  seguroProtecaoCarro;
	
	public ValorTotal(Float imposto, Float seguroProtecaoTerceiros, Float seguroProtecaoCarro) {
		this.imposto = imposto;
		this.seguroProtecaoTerceiros = seguroProtecaoTerceiros;
		this.seguroProtecaoCarro = seguroProtecaoCarro;
	}

	public Float getImposto() {
		return imposto;
	}

	public void setImposto(Float imposto) {
		this.imposto = imposto;
	}

	public Float getSeguroProtecaoTerceiros() {
		return seguroProtecaoTerceiros;
	}

	public void setSeguroProtecaoTerceiros(Float seguroProtecaoTerceiros) {
		this.seguroProtecaoTerceiros = seguroProtecaoTerceiros;
	}

	public Float getSeguroProtecaoCarro() {
		return seguroProtecaoCarro;
	}

	public void setSeguroProtecaoCarro(Float seguroProtecaoCarro) {
		this.seguroProtecaoCarro = seguroProtecaoCarro;
	}
	

}
