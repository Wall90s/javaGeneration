package atividade02Funcionario;

public class TestaFuncionario {

	public static void main(String[] args) {
		
		/*Funcionario f1 = new Funcionario("Bárbara Elaine Baptista", 
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
		
		System.out.println();*/
		
		Gerente g1 = new Gerente("Francisco Thales Igor Baptista", 
								26, 
								"franciscothalesbaptista@chiba.net.br", 
								"(75) 3595-9233", 
								1, 
								15728d,
								2);
		
		Gerente g2 = new Gerente("Breno Arthur Thales Ferreira", 
								55, 
								"brenoarthurferreira@schaeffler.com", 
								"(27) 3833-1081", 
								3, 
								5427d,
								1);
		
		g1.visualizar();
		g2.visualizar();
		
		System.out.println();
		
		Vendedor v1 = new Vendedor("Silvana Vitória Bernardes", 
									37, 
									"silvana_vitoria_bernardes@fredericodiniz.com", 
									"(92) 3995-6201", 
									3, 
									3740d,
									73);
		
		Vendedor v2 = new Vendedor("Camila Bianca Emanuelly Barbosa", 
									27, 
									"camilabiancabarbosa@engeseg.com.br", 
									"(27) 3587-5153", 
									3, 
									4210d,
									102);
							
		v1.visualizar();
		v2.visualizar();
		
		
	}

}
