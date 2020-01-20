package br.edu.ifal.leilao;

public class Lance {

	private Cliente cliente;
	private double ValorDoLance;

	public Lance(Cliente cliente, double valorDoLance) {
		super();
		this.cliente = cliente;
		ValorDoLance = valorDoLance;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public double getValorDoLance() {
		return ValorDoLance;
	}

	public void setValorDoLance(double valorDoLance) {
		ValorDoLance = valorDoLance;
	}

}
