import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		/*
		 * Escreva um sistema que leia tr�s n�meros inteiros e positivos (A, B, C) e
		 * calcule a seguinte express�o:
		 *	
		 */

		//DECLARANDO AS VARI�VEIS
		int A, B, C;
		double R, S, D;
		
		//INSTANCIANDO O TECLADO
		Scanner kb = new Scanner(System.in);
		
		//ENTRADA
		System.out.println("Escreva o valor de A: ");
		A = kb.nextInt();
		
		System.out.println("Escreva o valor de B: ");
		B = kb.nextInt();
		
		System.out.println("Escreva o valor de C: ");
		C = kb.nextInt();
		
		//CONTAS
		R=(Math.pow(A, 2) + Math.pow(B, 2));
		
		S=(Math.pow(B, 2) + Math.pow(C, 2));
		
		D=(R+S)/2;
		
		//SA�DA
		System.out.printf("O valor de D �: %f", D);
		
		//FECHAR O TECLADO
		kb.close();
		
		
	}

}
