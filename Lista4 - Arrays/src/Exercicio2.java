import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		/*
2- Fa�a um programa que receba 6 n�meros inteiros e mostre: 
� Os n�meros pares digitados;  
� A soma dos n�meros pares digitados; 
� Os n�meros �mpares digitados; 
� A quantidade de n�meros �mpares digitados

		 */
		
		//VARI�VEIS
		int[] vetor= new int[6]; 
		int contPar=0, somaPar=0, contImpar=0, somaImpar=0, i=0;
		
		
		//INSTANCIANDO O TECLADO
		Scanner kb = new Scanner(System.in);
		
		
		//ENTRADA
		for(i=0; i<vetor.length; i++)
		{
			System.out.printf("Digite a posi��o %d do vetor de 6 posi��es: ", i);
			vetor[i]=kb.nextInt();
		}
		
		System.out.printf("\n");
		
		//L�GICA
		for(i=0; i<vetor.length; i++)
		{
			if(vetor[i]%2==0 && vetor[i]>=1)
			{
				contPar++;
				somaPar+=vetor[i];
				System.out.printf("O n�mero %d � par.\n", vetor[i]);
			}
			
			else if(vetor[i]<=0)
			{
				System.out.printf("O n�mero %d n�o � par nem �mpar.\n", vetor[i]);
				
			}
			else
			{
				contImpar++;
				somaImpar+=vetor[i];
				System.out.printf("O n�mero %d � �mpar. \n", vetor[i]);
			}
		
		}
		
		
		//SA�DA
		System.out.printf("\nA soma dos %d n�meros pares digitados � de: %d. \nA soma dos %d n�meros �mpares digitados � de: %d.", contPar, somaPar, contImpar, somaImpar);
		
		
		//ENCERRAMENTO DO TECLADO
		kb.close();
	}

}
