package Pessoa;

public class Venda {
	private int idVenda;
	private char dataVenda;
	private int tipoVenda;
	private char enderecoEntraga;
	
	public Venda(int idVenda, char dataVenda) {
		super();
		this.idVenda = idVenda;
		this.dataVenda = dataVenda;
	}
	
	
	public int getIdVenda() {
		return idVenda;
	}
	public void setIdVenda(int idVenda) {
		this.idVenda = idVenda;
	}
	public char getDataVenda() {
		return dataVenda;
	}
	public void setDataVenda(char dataVenda) {
		this.dataVenda = dataVenda;
	}
	
	
	
	
	
	
}
