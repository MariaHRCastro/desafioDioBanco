package entidades;

import interfaces.IConta;


public abstract class Conta implements IConta {

	private static final int AGENCIA_PADRAO = 1;
	private static int SEQUENCIAL = 1;

	protected Banco banco;
	protected int agencia;
	protected int numero;
	protected double saldo;
	protected Cliente cliente;

	public Conta() {
		this.agencia = Conta.AGENCIA_PADRAO;
		this.numero = SEQUENCIAL++;
	}
	

	public int getAgencia() {
		return agencia;
	}


	public int getNumero() {
		return numero;
	}


	public double getSaldo() {
		return saldo;
	}


	@Override
	public void sacar(double valor) {
		saldo -= valor;
	}


	@Override
	public void depositar(double valor) {
		saldo+= valor;
	}


	@Override
	public void transferir(double valor, Conta contaDestino) {
		//o this sacar garante que a conta que está chamando a transferencia sofra o saque
		this.sacar(valor);
		contaDestino.depositar(valor);
	}
	
	
	
	protected void imprimirInfos() {

		System.out.println(String.format("Agência: %d", this.agencia));
		System.out.println(String.format("Conta: %d", this.numero));
		System.out.println(String.format("Saldo: %.2f", this.saldo));
			
	}


	
}
