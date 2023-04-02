package atividade06Curso;

import java.util.ArrayList;

public class TestaCurso {

	public static void main(String[] args) {
		
		ArrayList<String> professores1 = new ArrayList<String>();
		professores1.add("Sophie Rocha");
		professores1.add("Bárbara Monteiro");
		Curso c1 = new Curso("Aplicações Para Internet", 
											80, 
											3, 
											professores1, 
											40);
		
		ArrayList<String> professores2 = new ArrayList<String>();
		professores2.add("Bárbara Monteiro");
		Curso c2 = new Curso("Língua Brasileira de Sinais", 
											40, 
											1, 
											professores2, 
											28);
		
		c1.visualizar();
		c2.visualizar();
	}

}
