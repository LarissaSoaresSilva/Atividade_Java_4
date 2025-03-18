package java_4;

import java.util.Scanner;

public class Atividade_1 {

	public static void main(String[] args) {
		
	Scanner ler= new Scanner(System.in);
	
   float salario, abono, novosalario;
   
   System.out.println("Digite seu Sálario: ");
   salario  = ler.nextFloat();
   
   System.out.println("Digite o abono: ");
   abono = ler.nextFloat();
		
 	novosalario = salario + abono;
		
	System.out.printf("Novo salário é: = %.2f ", + novosalario);
		
	}

}
