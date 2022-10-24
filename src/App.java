import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {

	public static void main(String[] args) {

		List<Conta> contas = new ArrayList<>();

		Banco b1 = new Banco(1, "Banco do Brasil", contas);

		Cliente c1 = new Cliente("Joao", "123");
		Cliente c2 = new Cliente("Maria", "abc123");

		ContaCorrente cc = new ContaCorrente(c1);
		ContaPoupanca pp = new ContaPoupanca(c2);

		b1.getContas().add(cc);
		b1.getContas().add(pp);

	
		int opcao = -1;
		
		while (opcao != 0) {
			
			System.out.println("***********INCIALIZAR BANCO***************");
			System.out.println("Cadastrar novo Cliente: 1");
			System.out.println("Imprimir relação de contas: 2");
			System.out.println("Acessar como cliente: 3");
			System.out.println("Para finalizar: 0 ");
			System.out.println("Informe a opção : ");
			
			Scanner sc = new Scanner(System.in);
			 opcao = sc.nextInt();

			switch (opcao) {
			case 1:
				System.out.println("********** CADASTRA NOVO CLIENTE *******************");
				System.out.print("Nome: ");
				String nome = sc.next();
				System.out.println(" ");
				System.out.print("Senha: ");
				String senha = sc.next();
				// System.out.println(" ");
				Cliente novo = new Cliente(nome, senha);
				System.out.println(novo.toString());
				System.out.println("Informe o tipo de conta 1 - Poupanca, 2 - Conta Corrente: ");
				Integer  tipConta = sc.nextInt();
				if(tipConta == 1 )
				{
					b1.getContas().add(new ContaPoupanca(novo));
				}
				if(tipConta == 2 )
				{
					b1.getContas().add(new ContaCorrente(novo));
				}
				
				
				break;
			case 2:

				System.out.println("********** RELAÇÃO DE CONTAS *******************");

				for (Conta c : b1.getContas()) {
					System.out.println(c.toString());
				}
				break;

			case 3:

				menuCliente(b1);
				break;

			case 0:

				System.out.println("Sair do Sistema");
				break;

			}

		}

		// System.out.println("Informe a opção : ");

		/*
		 * cc.depositar(100); cc.extrato(); pp.depositar(20); pp.extrato();
		 * 
		 * cc.transferir(50, pp); cc.extrato(); pp.extrato();
		 * 
		 * 
		 */
	}

	public static void menuCliente(Banco b1) {

		Scanner sc = new Scanner(System.in);
		System.out.print("informe o sua conta:");
		Integer conta = sc.nextInt();
		System.out.println("----------");
		System.out.print("informe sua senha:");
		String senha = sc.next();
		Conta contaLogado = null;
		for (Conta c1 : b1.getContas()) {
			if (c1.getNumero() == conta) {
				System.out.println(c1.toString());
				System.out.println(senha);
				if (c1.getCliente().getSenha().equals(senha))
				{
					
					System.out.println("Cliente Autenticado!");
					contaLogado = c1;
					
					 int opcao = -1;
					
					 while(opcao !=0)
					 {
						 
							System.out.println("**** Bem vindo a sua conta ");
							System.out.println("Consultar Extrato: 1 ");
							System.out.println("Fazer Saque: 2 ");
							System.out.println("Fazer Deposito: 3 ");
							System.out.println("Fazer Transferencia: 4 ");
							System.out.println("Para finalizar: 0 ");
							opcao = sc.nextInt();
							
							System.out.println("  ");
							
						 switch (opcao) {
							
						
							
							case 1:
								
								System.out.println("********** Extrato *******************");
								contaLogado.extrato();

								break;
							case 2:
								System.out.print("Informe o  valor do saque: ");
								float valor = sc.nextFloat();
								contaLogado.sacar(valor);

								break;
								
								
							case 3:
								System.out.print("Informe o  valor do Deposito: ");
								 valor = sc.nextFloat();
								contaLogado.depositar(valor);

								break;

							case 4:
								System.out.print("Informe o numero da conta de Destino: ");
								Integer numero = sc.nextInt();
								System.out.println("-------------");
								System.out.print("Informe o valor da Transferencia: ");
								valor = sc.nextFloat();
								Conta contaDest = findConta(b1, numero);

								contaLogado.transferir(valor, contaDest);

								break;
							}
					 }
					 
					 
						
				
					
					
					
					
				} else {
					System.out.println("Conta ou senha incorretos!!!");
				}

			}
		}

		
	}

	public static Conta findConta(Banco b1, Integer numero) {

		for (Conta c1 : b1.getContas()) {
			if (numero == c1.getNumero()) {
				return c1;
			} else {
				return null;
			}

		}

		return null;

	}

}
