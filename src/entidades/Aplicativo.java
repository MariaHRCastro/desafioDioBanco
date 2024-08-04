package entidades;

public class Aplicativo {

	public static void main(String[] args) {

		Conta cc = new ContaCorrente();
		Conta cp = new ContaPoupanca();
		
		cc.depositar(100);

		cp.depositar(50);
		
		cc.imprimirExtrato();
		cp.imprimirExtrato();

		
		cc.imprimirExtrato();



		cc.transferir(25, cp);
		
		System.out.println("TRANSFERÊNCIA");
		
		cc.imprimirExtrato();
		cp.imprimirExtrato();
				
	}

}
