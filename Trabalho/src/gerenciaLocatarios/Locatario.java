package gerenciaLocatarios;

import gerenciaReserva.Reserva;

public class Locatario {
	
	private String email,
				   celular;
	
	private Endereco endereco;
	
	private Reserva reserva[];

	public Locatario(String email, String celular, Endereco endereco) {
		this.email = email;
		this.celular = celular;
		this.setEndereco(endereco);
	}
	
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public void setCelular(String celular) {
		this.celular = celular;
	}
	
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	
	private void setReserva(Reserva reserva) {
		// Inicializar o tamanho do vetor.
		this.reserva[0] = reserva;
	}
	
	public String getEmail() {
		return email;
	}

	public String getCelular() {
		return celular;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public Reserva getReserva() {
		// Fazer um loop com o id.
		return reserva[0];
	}
}
