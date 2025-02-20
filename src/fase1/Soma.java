package fase1;

import java.util.Scanner;

public class Soma {
	public static void main (String[] args) {
		Scanner num = new Scanner(System.in);
		System.out.print("Qual valor 1?");
		int numero = num.nextInt();
		
		
		System.out.print("Qual valor 2?");
		int numero1 = num.nextInt();
	
		int soma = numero  + numero1;
		
		System.out.print("A soma é:" + soma);
	}

}
