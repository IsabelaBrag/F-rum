package br.com.alura.forum.controller.dto;

import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.data.domain.Page;

import br.com.alura.forum.modelo.Topico;

public class TopicoDto {
	
	private Long id;
	private String titulo;
	private String mensagem;
	private LocalDateTime datadacriacao;
	
	public TopicoDto(Topico topico) {
	    this.id = topico.getId(); 
        this.titulo = topico.getTitulo();
        this.mensagem = topico.getMensagem();
        this.datadacriacao = topico.getDataCriacao();
	}
	
	// como só tenho os gets, tenho que falar da ond vai puxar os dados, entõa vou criar o construtor a cima
	
	public Long getId() {
		return id;
	}
	public String getTitulo() {
		return titulo;
	}
	public String getMensagem() {
		return mensagem;
	}
	public LocalDateTime getDatadacriacao() {
		return datadacriacao;
	}

	public static Page<TopicoDto> converter(Page<Topico> topicos) {
		return topicos.map(TopicoDto::new);
	}
	
	
	

}
