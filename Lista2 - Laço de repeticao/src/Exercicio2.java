import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		/*
		 * Fa�a um programa que entre com tr�s n�meros e coloque em ordem crescente.
		 */
		
		//VARI�VEIS
		int numero1, numero2, numero3, aux;
		
		
		//INSTANCIANDO O TECLADO
		Scanner kb = new Scanner(System.in);
		
		
		//ENTRADA
		System.out.println("Digite o primeiro n�mero: ");
		numero1=kb.nextInt();
		
		System.out.println("Digite o segundo n�mero: ");
		numero2=kb.nextInt();
		
		System.out.println("Digite o terceiro n�mero: ");
		numero3=kb.nextInt();
		
		
		//L�GICA
	    if(numero1 > numero2) 
	    {
	        aux = numero1;
	        numero1 = numero2;
	        numero2 = aux;
	    }
	    
	    if(numero1 > numero3)
	    {
	        aux = numero1;
	        numero1 = numero3;
	        numero3 = aux;
	    }
	    
	    if(numero2 > numero3)
	    {
	        aux = numero2;
	        numero2 = numero3;
	        numero3 = aux;
	    }
	    		
		
		//SA�DA
	    System.out.printf("%d - %d - %d",numero1,numero2,numero3);
		
		
		//ENCERRAMENTO DO TECLADO
		kb.close();
		
		
	}

}
