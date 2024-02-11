package br.com.universelife.course.controller.exceptions;

import java.io.Serializable;
import java.time.Instant;

import com.fasterxml.jackson.annotation.JsonFormat;

public class StandardError implements Serializable{


	private static final long serialVersionUID = 1L;
	@JsonFormat(shape= JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy'T'HH:mm'Z'",timezone ="GMT" )
	private Instant timestap;
	private Integer status;
	private String erro;
	private String mensage;
	private String path;
	
	public StandardError() {
		
	}

	public StandardError(Instant timestap, Integer status, String erro, String mensage, String path) {
		
		this.timestap = timestap;
		this.status = status;
		this.erro = erro;
		this.mensage = mensage;
		this.path = path;
	}

	public Instant getTimestap() {
		return timestap;
	}

	public void setTimestap(Instant timestap) {
		this.timestap = timestap;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public String getErro() {
		return erro;
	}

	public void setErro(String erro) {
		this.erro = erro;
	}

	public String getMensage() {
		return mensage;
	}

	public void setMensage(String mensage) {
		this.mensage = mensage;
	}

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}
	
}
