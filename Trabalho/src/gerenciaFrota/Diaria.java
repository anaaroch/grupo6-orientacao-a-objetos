package gerenciaFrota;

public class Diaria {
	
	private Float diariaNormal,
				  diariaReduzida,
				  diariaEmpresarial,
				  valorMensal;
	
	public Diaria(Float diariaNormal, Float diariaReduzida, Float diariaEmpresarial, Float valorMensal) {
		this.diariaNormal = diariaNormal;
		this.diariaReduzida = diariaReduzida;
		this.diariaEmpresarial = diariaEmpresarial;
		this.valorMensal = valorMensal;
	}

	public Float getDiariaNormal() {
		return diariaNormal;
	}

	public void setDiariaNormal(Float diariaNormal) {
		this.diariaNormal = diariaNormal;
	}

	public Float getDiariaReduzida() {
		return diariaReduzida;
	}

	public void setDiariaReduzida(Float diariaReduzida) {
		this.diariaReduzida = diariaReduzida;
	}

	public Float getDiariaEmpresarial() {
		return diariaEmpresarial;
	}

	public void setDiariaEmpresarial(Float diariaEmpresarial) {
		this.diariaEmpresarial = diariaEmpresarial;
	}

	public Float getValorMensal() {
		return valorMensal;
	}

	public void setValorMensal(Float valorMensal) {
		this.valorMensal = valorMensal;
	}

}
