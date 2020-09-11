import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		/*
		 * Crie um programa que leia um n�mero do teclado 
		 * at� que encontre um n�mero igual a zero. 
		 * No final, mostre a soma dos n�meros digitados.(DO...WHILE)
		 */
		
		//VARI�VEIS
		double numero, soma=0;
		
		
		//INSTANCIANDO O TECLADO
		Scanner kb = new Scanner(System.in);
		
		
		//L�GICA
		do
		{
			System.out.println("Digite um n�mero: ");
			numero = kb.nextDouble();
			
			soma=soma+numero;
			
		} while(numero!=0);

		
		
		//SA�DA
		System.out.printf("\nA soma dos n�meros digitados �: %.2f.", soma);
		
		
		//ENCERRAMENTO DO TECLADO
		kb.close();

	}

}
