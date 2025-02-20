package fase1;

import java.util.Scanner;

//5. Conversão de Idade para Dias
//Desenvolva um programa que leia a idade de uma pessoa em anos e exiba a quantidade aproximada de dias que ela já viveu.
//Considere um ano com 365 dias.


public class ConversaoIdade {
  public static void main(String[] args) {
	  Scanner idade = new Scanner(System.in);
	  System.out.print("digite sua idade:");
	  int Idade = idade.nextInt();
	  
	  int calculo = Idade * 365;
	  
	  System.out.print("seus dias de vida:" + calculo);
	  
	  		
  }
}
