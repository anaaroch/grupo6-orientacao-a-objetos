package gerenciaFrota;

public class Motocicleta extends Veiculo{

	private String modosPilotagem;
	private Boolean controleTracao,
					freiosABS,
					pilotoAutomatico;
	
	public Motocicleta(String modosPilotagem, boolean controleTracao, boolean freiosABS, 
			boolean pilotoAutomatico, String marca, String modelo, int anoFabricacao, int anoModelo, 
			int renavam, int capacidadeTanque, Diaria diaria) {
		super(marca, modelo, anoFabricacao, anoModelo, renavam, capacidadeTanque, diaria);
		this.modosPilotagem = modosPilotagem;
		this.controleTracao = controleTracao;
		this.freiosABS = freiosABS;
		this.pilotoAutomatico = pilotoAutomatico;
	}
	
	public void cadastraMoto(){
		// Reservado método cadastraMoto.
	}

	public String getModosPilotagem() {
		return modosPilotagem;
	}

	public void setModosPilotagem(String modosPilotagem) {
		this.modosPilotagem = modosPilotagem;
	}

	public Boolean getControleTracao() {
		return controleTracao;
	}

	public void setControleTracao(Boolean controleTracao) {
		this.controleTracao = controleTracao;
	}

	public Boolean getFreiosABS() {
		return freiosABS;
	}

	public void setFreiosABS(Boolean freiosABS) {
		this.freiosABS = freiosABS;
	}

	public Boolean getPilotoAutomatico() {
		return pilotoAutomatico;
	}

	public void setPilotoAutomatico(Boolean pilotoAutomatico) {
		this.pilotoAutomatico = pilotoAutomatico;
	}
}
