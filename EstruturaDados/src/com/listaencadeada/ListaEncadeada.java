package com.listaencadeada;

public class ListaEncadeada<T> {
	
	No<T> referenciaEntrada;
	
	public ListaEncadeada() {
		this.referenciaEntrada = null;
	}
	
	public void add(T conteudo) {
		No<T> novoNo = new No<>(conteudo);
		if(this.isEmpty()) {
			referenciaEntrada = novoNo;
			return;
		}
		
		No<T> noAuxiliar = referenciaEntrada;
		for(int i = 0; i < this.size() - 1; i++) {
			noAuxiliar = noAuxiliar.getProximono();
		}
		
		noAuxiliar.setProximono(novoNo);
	}
	
	public T get(int index) {
		return getNo(index).getConteudo();
	}
	
	private No<T> getNo(int index){
		
		validarIndice(index);
		No<T> noAuxiliar = referenciaEntrada;
		No<T> noRetorno = null;
		
		for(int i = 0; i <= index; i++) {
			noRetorno = noAuxiliar;
			noAuxiliar = noAuxiliar.getProximono();
		}
		return noRetorno;
	}
	
	public T remove(int index) {
		No<T> noPivor = this.getNo(index);
		if(index == 0) {
			referenciaEntrada = noPivor.getProximono();
			return noPivor.getConteudo();
		}
		
		No<T> noAnterior = getNo(index -1);
		noAnterior.setProximono(noPivor.getProximono());
		return noPivor.getConteudo();
	}
	
	public int size() {
		int tamanhoLista = 0;
		No<T> referenciaAux = referenciaEntrada;
		while(true) {
			if (referenciaEntrada != null) {
				tamanhoLista++;
				if(referenciaAux.getProximono() != null) {
					referenciaAux = referenciaAux.getProximono();
				}else {
					break;
				}
			}else {
				break;
			}
		}
		return tamanhoLista;
	}
	
	public boolean isEmpty() {
		return referenciaEntrada == null ? true : false;
//		if(referenciaEntrada == null) {
//			return true;
//		} else {
//			return false;
//		}
	}
	
	private void validarIndice(int index) {
		int ultimoIndice = size() - 1;
		if(index >= size()) {
			throw new IndexOutOfBoundsException("Nao existe conteudo no indice " + index + 
					" Desta lista. Esta lista so vai ate o indice " + ultimoIndice + ".");
		}
	}

	@Override
	public String toString() {
		String strRetorno = "";
		No<T> noAuxiliar = referenciaEntrada;
		for(int i = 0; i < this.size(); i++) {
			strRetorno += "No[conteudo " + (i+1) + " = " + noAuxiliar.getConteudo() + "] ---> ";
			noAuxiliar = noAuxiliar.getProximono();
		}
		strRetorno += "null";
		
		return strRetorno;
	}
	
	
}
