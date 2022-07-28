package Pessoa;



public class Bebida {
	protected  int idBebida;
	private String nomeBebida;
	protected int quantidadeEstoque;
	private double precoBalcao;
	private int precoDelevery;
	
	//estoque de bebidas
	
	
	
	
	
	
	public Bebida(int idBebida, String nomeBebida, double precoBalcao) {
		super();
		this.idBebida = idBebida;
		this.nomeBebida = nomeBebida;

		this.precoBalcao = precoBalcao;
	}
	public int getIdBebida() {
		return idBebida;
	}
	public void setIdBebida(int idBebida) {
		this.idBebida = idBebida;
	}
	public String getNomeBebida() {
		return nomeBebida;
	}
	public void setNomeBebida(String nomeBebida) {
		this.nomeBebida = nomeBebida;
	}
	public int getQuantidadeEstoque() {
		return quantidadeEstoque;
	}
	public void setQuantidadeEstoque(int quantidadeEstoque) {
		this.quantidadeEstoque = quantidadeEstoque;
	}
	public double getPrecoBalcao() {
		return precoBalcao;
	}
	public void setPrecoBalcao(int precoBalcao) {
		this.precoBalcao = precoBalcao;
	}
	
	@Override
	public String toString() {
		return "Bebida [idBebida=" + idBebida + ", nomeBebida=" + nomeBebida + ", quantidadeEstoque="
				+ quantidadeEstoque + ", precoBalcao=" + precoBalcao + "]";
	
	}
}
