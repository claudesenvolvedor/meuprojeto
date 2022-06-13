package tiposdecontas;

import contas.Conta;

public class ContaCorrente extends Conta{

	@Override
	public boolean sacar(double valor) {
		if (this.saldo >= valor) {
			this.saldo -= valor;
			return true;
		} else {
			return false;
		}
	}

}
