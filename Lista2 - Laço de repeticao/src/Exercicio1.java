import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		/*
		 *Fa�a um programa que receba tr�s inteiros e diga qual deles � o maior.
		 */
		
		//VARIAVEIS
		int numero1, numero2, numero3;
		
		//INSTANCIANDO O TECLADO
		Scanner kb = new Scanner(System.in);
		
		//ENTRADA
		System.out.println("Digite o primeiro n�mero: ");
		numero1=kb.nextInt();
		
		System.out.println("Digite o segundo n�mero: ");
		numero2=kb.nextInt();
		
		System.out.println("Digite o terceiro n�mero: ");
		numero3=kb.nextInt();
		
		//L�GICA E SA�DA
		if(numero1<=numero3 && numero2<=numero3) {
			System.out.printf("\nO maior n�mero �: %d", numero3);
		}
		
		if(numero1<=numero2 && numero3<=numero2) {
			System.out.printf("\nO maior n�mero �: %d", numero2);
			
		}
		
		if(numero2<=numero1 && numero3<=numero1) {
			System.out.printf("\nO maior n�mero �: %d", numero1);
			
		}
	}

}
