package java_4;

import java.util.Scanner;

public class Atividade_3 {

	public static void main(String[] args) {
	Scanner ler= new Scanner(System.in);
		
	 float sal_bruto, ad_noturno, hrs_extras, descontos, sal_liquido;
			
	 System.out.println("Digite seu Salário Bruto:  ");
	  sal_bruto = ler.nextFloat();
		  
     System.out.println("Digite o Adicional Noturno: ");
	  ad_noturno = ler.nextFloat();
		  
     System.out.println("Digite o valor das Horas Extras: ");
	  hrs_extras = ler.nextFloat();
		  
     System.out.println("Digite o valor dos Descontos: ");
	  descontos = ler.nextFloat();
		  

	  sal_liquido = sal_bruto + ad_noturno + (hrs_extras*5) - descontos ;
	
	 System.out.printf("Salário Líquido: %.2f ", sal_liquido);

	}

}
