package com.listaencadeada;

public class No<T> {
	private T conteudo;
	private No<T> proximono;
	
	public No(No<T> proximono) {
		this.proximono = null;
	}
	
	public No(T conteudo) {
		this.proximono = null;
		this.conteudo = conteudo;
	}

	public No(T conteudo, No<T> proximono) {
		this.conteudo = conteudo;
		this.proximono = proximono;
	}

	public T getConteudo() {
		return conteudo;
	}

	public void setConteudo(T conteudo) {
		this.conteudo = conteudo;
	}

	public No<T> getProximono() {
		return proximono;
	}

	public void setProximono(No<T> proximono) {
		this.proximono = proximono;
	}

	@Override
	public String toString() {
		return "No [conteudo=" + conteudo + "]";
	}
	
	public String toStringEncadeado() {
		String str = "No [conteudo=" + conteudo + "]";
		
		if(proximono != null) {
			str += "--->" + proximono.toString();
		} else {
			str += "Null";
		}
		return str;
	}
	
}
