package Pessoa;

public class Cliente extends Pessoa {
	private int dataNascimento;

	public Cliente(String nome, int dataNascimento, String cpf) {
		super(nome, dataNascimento, cpf);
		this.dataNascimento = dataNascimento;
	}
	
	public int getIdade() {
		return dataNascimento;
	}
	
	public void setIdade(int idade) {
		this.dataNascimento = idade;
	}
	@Override
	public String toString() {
		return "Cliente [nome = " + getNome() + ", cpf = " + getCpf() + ", idade = " + dataNascimento + "]";
	}
	
	
}
