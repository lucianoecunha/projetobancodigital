

public interface IConta {
	
	 void depositar(float valor);
	 void sacar(float valor);
	 void transferir(float valor, Conta conta);
	 void extrato();
	 
}
