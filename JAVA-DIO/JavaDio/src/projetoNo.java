
public class projetoNo<T> {

	private T conteudo;
	private projetoNo proximoNo;
	
	public projetoNo(T conteudo) {
		this.proximoNo = null;
		this.conteudo = conteudo;
	}

	public T getConteudo() {
		return conteudo;
	}

	public void setConteudo(T conteudo) {
		this.conteudo = conteudo;
	}
 
	public projetoNo getProximoNo() {
		return proximoNo;
	}

	public void setProximoNo(projetoNo proximoNo) {
		this.proximoNo = proximoNo;
	}

	@Override
	public String toString() {
		return "projetoNo [conteudo = " + conteudo + "]";
	}
	

}
 