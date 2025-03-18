package java_4;

import java.util.Scanner;

public class Atividade_4 {

	public static void main(String[] args) {
    Scanner ler= new Scanner(System.in);
		
	float n1, n2, n3, n4, resul;
		
		
	 System.out.println("Digite o número 1:  ");
	  n1 = ler.nextFloat();
		  
	  System.out.println("Digite o número 2: ");
	  n2 = ler.nextFloat();
		  
	  System.out.println("Digite o número 3: ");
	  n3 = ler.nextFloat();
	  
	  System.out.println("Digite o número 4: ");
	  n4 = ler.nextFloat();
		  

	  resul = (n1*n2) - (n3*n4) ;
	
	System.out.printf("Diferença: %.1f ", resul);

	}

}
