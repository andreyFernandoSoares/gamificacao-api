package br.com.jogo.api.dtos;

public class AtividadeDto {
	
	private String ativo;
	private String passivo;
	private Float valor;
	private Float valorAPrazo;
	
	public AtividadeDto() {}
	
	public String getAtivo() {
		return ativo;
	}
	public void setAtivo(String ativo) {
		this.ativo = ativo;
	}
	public String getPassivo() {
		return passivo;
	}
	public void setPassivo(String passivo) {
		this.passivo = passivo;
	}
	public Float getValor() {
		return valor;
	}
	public void setValor(Float valor) {
		this.valor = valor;
	}
	public Float getValorAPrazo() {
		return valorAPrazo;
	}

	public void setValorAPrazo(Float valorAPrazo) {
		this.valorAPrazo = valorAPrazo;
	}

	@Override
	public String toString() {
		return "AtividadeDto [ativo=" + ativo + ", passivo=" + passivo + ", valor=" + valor + ", valorAPrazo="
				+ valorAPrazo + "]";
	}
}
