package one.digital;

public class ListaDuplamenteEncadeada<T> {
	
	private NoDuplo<T> primeiroNo;
	private NoDuplo<T> ultimoNo;
	
	
	private int tamanhoLista = 0;
	
	public ListaDuplamenteEncadeada() {
		this.primeiroNo = null;
		this.ultimoNo = null;
		this.tamanhoLista = 0;
	}
	
	public T get(int index) {
		return this.getNo(index).getConteudo();
	}
	
	public void add(T elemento) {
		NoDuplo<T> novoNo = new NoDuplo<>(elemento);
		novoNo.setNoproximo(null);
		novoNo.setNoPrevio(ultimoNo);
		if(primeiroNo == null) {
			primeiroNo = novoNo;
		}
		if(ultimoNo != null) {
			ultimoNo.setNoproximo(novoNo);
		}
		ultimoNo = novoNo;
		tamanhoLista++;
	}
	
	public void add(int index, T elemento) {
		NoDuplo<T> noAuxiliar = getNo(index);
		NoDuplo<T> novoNo = new NoDuplo<>(elemento);
		novoNo.setNoproximo(noAuxiliar);
		
		
		if(novoNo.getNoproximo() != null) {
			novoNo.setNoPrevio(noAuxiliar.getNoPrevio());
			novoNo.getNoproximo().setNoPrevio(novoNo);
		}else {
			novoNo.setNoPrevio(ultimoNo);
			ultimoNo = novoNo;
		}
		if(index == 0) {
			primeiroNo = novoNo;
		}else {
			novoNo.getNoPrevio().setNoproximo(novoNo);
		}
		tamanhoLista++;
	}
	
	public void remove(int index) {
		if(index == 0) {
			primeiroNo = primeiroNo.getNoproximo();
			if(primeiroNo != null) {
				primeiroNo.setNoPrevio(null);
			}
		}else {
			NoDuplo<T> noAuxiliar = getNo(index);
			noAuxiliar.getNoPrevio().setNoproximo(noAuxiliar.getNoproximo());
			if(noAuxiliar != ultimoNo) {
				noAuxiliar.getNoproximo().setNoPrevio(noAuxiliar.getNoPrevio());
			}else {
				ultimoNo = noAuxiliar;
		}
		}
		this.tamanhoLista--;
	}
	
	private NoDuplo<T> getNo(int index){
		NoDuplo<T> NoAuxiliar = primeiroNo ;
		
		for(int i = 0; (i < index) && ( NoAuxiliar != null); i++) {
			NoAuxiliar = NoAuxiliar.getNoproximo();
		}
		return NoAuxiliar;
	} 
	
	public int size() {
		return this.tamanhoLista;
	}

	@Override
	public String toString() {
	String strRetorno = "";
	
		NoDuplo<T> noAuxiliar = primeiroNo;
		for(int i = 0; i < size(); i++) {
			 
			strRetorno += "[No{conteudo=" + noAuxiliar.getConteudo() +"}]-->";
			noAuxiliar = noAuxiliar.getNoproximo();
		}
			strRetorno += "Null";
			return strRetorno;
	
	}
	   
}
