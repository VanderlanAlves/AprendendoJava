import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		/*
		 * Ler 10 n�meros e imprimir quantos s�o pares e quantos s�o �mpares. (FOR)
		 */
		
		//VARI�VEIS
		int i, numero=0, contPar=0, contImpar=0;
		
		
		//INSTANCIANDO O TECLADO
		Scanner kb = new Scanner(System.in);

		
		//ENTRADA
		
		
		
		//L�GICA
		for(i=0; i<10; i++)
		{
			System.out.println("Digite um n�mero: ");
			numero = kb.nextInt();
			
			if(numero%2==0) 
			{
				contPar++;
			}
			
			else
			{
				contImpar++;
			}
		}
		
		System.out.printf("\nEntre os 10 n�meros digitados, h� %d pares e %d �mpares. ", contPar, contImpar);
		
		
		//SA�DA
		
		
		
		//ENCERRAMENTO DO TECLADO
		kb.close();
		
	}

}

