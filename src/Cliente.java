
public class Cliente {
	
	private  Integer codigo;
	private  String nome;
	private String Senha;
	protected static int SEQUENCIA = 1;
	
	
	
	public Cliente() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Cliente(String nome, String senha) {
		super();
		this.codigo = SEQUENCIA++;
		this.nome = nome;
		Senha = senha;
	}


	public Integer getCodigo() {
		return codigo;
	}


	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getSenha() {
		return Senha;
	}


	public void setSenha(String senha) {
		Senha = senha;
	}


	@Override
	public String toString() {
		return "Cliente [codigo=" + codigo + ", nome=" + nome + ", Senha=" + Senha + "]";
	}
	
	


}
