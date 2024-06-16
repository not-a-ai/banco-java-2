
public class Main {

	public static void main(String[] args) {
		Cliente alexia = new Cliente();
		alexia.setNome("alexia");
		
		Conta cc = new ContaCorrente(alexia);
		Conta cp = new ContaPoupanca(alexia);
		
		cc.depositar(100);
		cc.transferir(50, cp);

		cc.imprimirExtrato();
		cp.imprimirExtrato();

	}

}
