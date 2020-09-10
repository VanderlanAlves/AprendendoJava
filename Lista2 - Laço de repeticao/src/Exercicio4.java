import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		/*
		 * 4-	Fa�a um programa em que permita a entrada
		 *  de um n�mero qualquer e exiba se este n�mero 
		 *  � par ou �mpar. Se for par exiba tamb�m a raiz 
		 *  quadrada do mesmo; se for �mpar exiba o n�mero 
		 *  elevado ao quadrado.	
		 */
		
		//VARI�VEIS
		double numero, raiz, quadrado;
		
		
		//INSTANCIANDO O TECLADO
		Scanner kb = new Scanner(System.in);
		
		
		//ENTRADA
		System.out.println("Digite um n�mero qualquer: ");
		numero = kb.nextDouble();
		
		//L�GICA
		if(numero%2==0)
		{
			raiz = Math.sqrt(numero);
			System.out.printf("O n�mero � par, e sua raiz quadrada �: %.2f", raiz);
		}
		
		else
		{
			quadrado = Math.pow(numero,2);
			System.out.printf("O n�mero � �mpar, e seu quadrado �: %.2f", quadrado);
		}
		

		//ENCERRAMENTO DO TECLADO
		kb.close();
		
		
	}

}