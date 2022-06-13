package contas;

public abstract class Conta {

	private String cliente;
	private int agencia;
	private int numeroDaConta;
	private String cpf;
	protected double saldo;

	public Conta() {
		super();

	}

	public String getCliente() {
		return cliente;
	}

	public void setCliente(String cliente) {
		this.cliente = cliente;
	}

	public int getAgencia() {
		return agencia;
	}

	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}

	public int getNumeroDaConta() {
		return numeroDaConta;
	}

	public void setNumeroDaConta(int numeroDaConta) {
		this.numeroDaConta = numeroDaConta;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public boolean sacar(double valor) {
		if (this.saldo >= valor) {
			this.saldo -= valor;
			return true;
		} else {
			return false;
		}
	}

	public void depositar(double valor) {

		this.saldo += valor;

	}

	public boolean transferir(double valor, Conta destino) {

		if (this.saldo >= valor) {

			this.saldo -= valor;

			destino.depositar(valor);

			return true;

		} else {
			return false;

		}
	}

	public void mostrarDados() {

		System.out.println("Número da Agência : " + agencia);
		System.out.println("Número da Conta : " + numeroDaConta);
	}
}
