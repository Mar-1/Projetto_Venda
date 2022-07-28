package Pessoa;

public class Funcionario extends Pessoa{
	private int idFuncionario;

	public Funcionario(String nome, int dataNascimento, String cpf, int idFuncionario) {
		super(nome, dataNascimento, cpf);

		this.idFuncionario = idFuncionario;
	}
	
	public int getIdFuncionario() {
		return idFuncionario;
	}
	public void setIdFuncionario(int idFuncionario) {
		this.idFuncionario = idFuncionario;
	}
	@Override
	public String toString() {
		return "funcionario [nome = " + getNome() + ", cpf = " + getCpf() + ", idFuncionario = " + idFuncionario + "]";
	} 

	
	
}
