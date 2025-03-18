package java_4;

import java.util.Scanner;

public class Atividade_2 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
				
		float nota_1, nota_2 , nota_3 , nota_4, mediafinal;
		float media = 4f;
		
		 System.out.println("Digite a Nota 1 : ");
		  nota_1 = ler.nextFloat();
		  
		  System.out.println("Digite a Nota 2 : ");
		  nota_2 = ler.nextFloat();
		  
		  System.out.println("Digite a Nota 3 : ");
		  nota_3 = ler.nextFloat();
		  
		  System.out.println("Digite a Nota 4 : ");
		  nota_4 = ler.nextFloat();
		  

		 mediafinal = (nota_1 + nota_2 + nota_3 + nota_4) / media;
	
		System.out.printf("Média Final: %.1f " , mediafinal);
		
	}

}
