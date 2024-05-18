package one.digital;

public class NoDuplo<T> {
	
	private T conteudo;
	private NoDuplo<T> Noproximo;
	private NoDuplo<T> NoPrevio;
	
	public NoDuplo(T conteudo) {
		this.conteudo = conteudo;
	}

	public T getConteudo() {
		return conteudo;
	}

	public void setConteudo(T conteudo) {
		this.conteudo = conteudo;
	}

	public NoDuplo<T> getNoproximo() {
		return Noproximo;
	}

	public void setNoproximo(NoDuplo<T> noproximo) {
		Noproximo = noproximo;
	}

	public NoDuplo<T> getNoPrevio() {
		return NoPrevio;
	}

	public void setNoPrevio(NoDuplo<T> noPrevio) {
		NoPrevio = noPrevio;
	}

	@Override
	public String toString() {
		return "NoDuplo [conteudo=" + conteudo + ", Noproximo=" + Noproximo + ", NoPrevio=" + NoPrevio + "]";
	}
	

}
