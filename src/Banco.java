
import java.util.List;

import lombok.*;
public @Data class Banco {
	
	private Integer codigoBanco;
	private String nome;
	private List<Conta> contas;
	
	
	public Banco(Integer codigoBanco, String nome, List<Conta> contas) {
		super();
		this.codigoBanco = codigoBanco;
		this.nome = nome;
		this.contas = contas;
	}


	public Integer getCodigoBanco() {
		return codigoBanco;
	}


	public void setCodigoBanco(Integer codigoBanco) {
		this.codigoBanco = codigoBanco;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public List<Conta> getContas() {
		return contas;
	}


	public void setContas(List<Conta> contas) {
		this.contas = contas;
	}


	@Override
	public String toString() {
		return "Banco [codigoBanco=" + codigoBanco + ", nome=" + nome + ", contas=" + contas + "]";
	}
	
	
	
	
	
	
	
	

	
	

}
