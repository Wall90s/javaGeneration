package atividade02Funcionario;

public class TestaFuncionario {

	public static void main(String[] args) {
		
		Funcionario f1 = new Funcionario("Bárbara Elaine Baptista", 
															33, 
															"ayla_isabelle_goncalves@publiconsult.com.br", 
															"(91) 2647-7046", 
															1, 
															10919d);
		
		Funcionario f2 = new Funcionario("Catarina Aline da Mata", 
															38, 
															"catarina.aline.damata@tecnew.net", 
															"(79) 2809-5581", 
															3, 
															5553d);
		
		f1.visualizar();
		f2.visualizar();

	}

}
