package fase1;

import java.util.Scanner;

public class ConversaoTemp {
	
	 public static void main(String[] args) { //meio que a "main"//
	        Scanner sc = new Scanner(System.in); //seria um ponteiro apontado para um objeto//

	        System.out.print("Digite a temperatura em Fahrenheit: ");
	        double fahrenheit = sc.nextDouble(); //double seria o tipo de variavel//

	        double celsius = (5.0 / 9.0) * (fahrenheit - 32);

	        System.out.println( "A temperatura em Celsius é: " + celsius);
	        sc.close(); //fechar o sc//
	    }
	}