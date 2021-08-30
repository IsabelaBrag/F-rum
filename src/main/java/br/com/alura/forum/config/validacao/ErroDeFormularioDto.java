package br.com.alura.forum.config.validacao;

// Json devolvido não vai ser mais aquele antigo gigante, vai ser representado por essa classe

public class ErroDeFormularioDto {
	
	private String campo;
	private String erro;
	public ErroDeFormularioDto(String campo, String erro) {
		super();
		this.campo = campo;
		this.erro = erro;
	}
	public String getCampo() {
		return campo;
	}
	public String getErro() {
		return erro;
	}
	
	

}
