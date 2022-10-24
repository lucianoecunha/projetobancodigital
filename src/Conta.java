

public abstract class Conta implements IConta {



	protected Integer numero;
	protected float saldo;
	protected Integer agencia;
	protected Cliente cliente;
	protected static int AGENCIA_PADRAO = 1;
	protected static int SEQUENCIA = 1;
	
	
	public Conta(Cliente cliente) {
		super();
		this.agencia = AGENCIA_PADRAO;
		this.numero = SEQUENCIA++;
		this.cliente = cliente;
	}
	



	public Integer getNumero() {
		return numero;
	}




	public float Saldo() {
		return this.saldo;
	}
	
	
	
	
	
	public Cliente getCliente() {
		return cliente;
	}





	@Override
	public void depositar(float valor) {
		this.saldo += valor;
		
	}

	@Override
	public void sacar(float valor) {
		if (valor <= this.saldo) {
			this.saldo -=  valor;

			// pensar num metod para receber a transferencia;

		} else {
			System.out.println("Saldo insuficiente!");
		}
		
	}

	@Override
	public void transferir(float valor, Conta contaDestino) {
		if (valor <= this.saldo) {
			sacar(valor);
			contaDestino.depositar(valor);
		
		} else {
			System.out.println("Saldo insuficiente!");
		}
		
	}
	
	
	
	
	@Override
	public String toString() {
		return "Conta [numero=" + numero + ", agencia=" + agencia + ", cliente=" + cliente + "]";
	}




	protected void imprimirInfosComuns()
	{
		System.out.println(String.format("Agencia: %d", this.agencia));
		System.out.println(String.format("Conta: %d", this.numero));
		System.out.println("Cliente: "+this.cliente.getNome());
		System.out.println(String.format("Saldo: %.2f", this.saldo));
	}

}
