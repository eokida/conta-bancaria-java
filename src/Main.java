
public class Main {

	public static void main(String[] args) {
		Cliente eric = new Cliente();
		eric.setNome("Eric");
		
		Conta cc = new ContaCorrente(eric);
		Conta poupanca = new ContaPoupanca(eric);

		cc.depositar(100.50);
		cc.transferir(14.50, poupanca);
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
	}

}
