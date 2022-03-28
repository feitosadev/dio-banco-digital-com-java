
public class Main {

	public static void main(String[] args) {

		Cliente jose = new Cliente();
		jose.setNome("Jose");
		
		Conta cc = new ContaCorrente(jose);
		Conta cp = new ContaPoupanca(jose);
		
		cc.imprimirExtrato();
		cp.imprimirExtrato();

	}

}
