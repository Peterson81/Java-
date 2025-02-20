//
//4. Cálculo de Média Simples
//Faça um programa que solicite ao usuário três notas (valores decimais) e exiba a média aritmética delas.

package fase1;

import java.util.Scanner;

public class CalcuroMedia {
	
	public static void main (String[] args) {
		Scanner nota = new Scanner (System.in);
		System.out.print("digite sua nota:");
		Double numero1 = nota.nextDouble();
		
	
		System.out.print("digite sua nota:");
		Double numero2 = nota.nextDouble();
		
		System.out.print("digite sua nota:");
		double numero3 = nota.nextDouble();
		
		double media = numero1 + numero2 + numero3 / 3;
		
		System.out.print("sua média:" + media);
	}
	

}
