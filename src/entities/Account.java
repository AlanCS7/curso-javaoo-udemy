package entities;

public class Account {

	private String name;
	private int numConta;
	private double saldo;

	public Account() {
	}

	public Account(String name, int numConta) {
		this.name = name;
		this.numConta = numConta;
	}

	public Account(String name, int numConta, double depositoInicial) {
		this.name = name;
		this.numConta = numConta;
		deposito(depositoInicial);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNumConta() {
		return numConta;
	}

	public double getSaldo() {
		return saldo;
	}

	public void deposito(double deposito) {
		saldo += deposito;
	}

	public void saque(double saque) {
		saldo -= saque + 5.00;
	}

	@Override
	public String toString() {
		return "Account " + numConta + ", Holder: " + name + ", Balance: $ " + String.format("%.2f", saldo);
	}

}
