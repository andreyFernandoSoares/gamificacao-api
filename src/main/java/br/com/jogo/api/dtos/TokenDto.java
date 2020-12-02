package br.com.jogo.api.dtos;

public class TokenDto {
	
	private String token;
	private String tipo;
	private Long usuarioId;

	public TokenDto(String token, String tipo, Long usuarioId) {
		this.token = token;
		this.tipo = tipo;
		this.usuarioId = usuarioId;
	}

	public String getToken() {
		return token;
	}

	public String getTipo() {
		return tipo;
	}

	public Long getUsuarioId() {
		return usuarioId;
	}

	public void setUsuarioId(Long usuarioId) {
		this.usuarioId = usuarioId;
	}
}
