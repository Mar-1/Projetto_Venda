package Pessoa;

public abstract class Pessoa {
	protected String nome;
	protected String cpf;
	
	Pessoa(){		
	}
	Pessoa(String nome, int idade, String cpf){
		this.nome=nome;
		this.cpf=cpf;		
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
		

	@Override
	public String toString() {
		return "Pessoa [nome = " + nome + ", cpf = " + cpf + "]";
	}	

}
