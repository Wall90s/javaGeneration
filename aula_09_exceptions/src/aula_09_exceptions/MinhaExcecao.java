package aula_09_exceptions;

public class MinhaExcecao extends Exception{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	
	public MinhaExcecao() {}
	
	public MinhaExcecao(String mensagem) {
		super(mensagem);
	}
	
}
