

public class ContaCorrente extends Conta {

	
	

	public ContaCorrente(Cliente cliente) {
		super(cliente);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void extrato() {
		System.out.println(String.format("Conta Corrente"));
		super.imprimirInfosComuns();
		
	}
	
	

}
