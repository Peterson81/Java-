//2. Área de um Círculo
//Desenvolva um programa que leia o raio de um círculo e calcule sua área.
//
//Fórmula: Área = π * raio²
//
//Considere π = 3.14159.

package fase1;

import java.util.Scanner;

public class area {
	public static void main(String[] args) {
		Scanner cir= new Scanner(System.in);
		System.out.print("digite o raio:");
		double raio = cir.nextDouble(); 
	
		double calculoArea = 3.14159 + (raio * raio);

		System.out.print("Sua área:" + calculoArea);
	}

}
