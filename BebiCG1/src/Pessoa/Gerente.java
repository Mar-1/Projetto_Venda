package Pessoa;


public class Gerente extends Pessoa{	

	private int idGerente;
	public Gerente(String nome, String cpf, int idGerente) {
		super();

		this.idGerente = idGerente;
	}

	public int getIdGerente() {
		return idGerente;
	}


	public void setIdGerente(int idGerente) {
		this.idGerente = idGerente;
	}

	@Override
	public String toString() {
		return "Gerente [nome = " + getNome() + ", cpf = " + getCpf() + ", idGerente = " + idGerente + "]";
	}



	
}
