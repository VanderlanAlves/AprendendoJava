import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		/*
		 * 3- Leia uma matriz 3 x 3, conte e escreva quantos valores maiores que 10 ela possui.

		 */
		
		//VARI�VEIS
		
		int[][] matriz=new int[3][3];
		int cont=0, LIMITELINHA=3, LIMITECOLUNA=3, linha=0, coluna=0;
		
		
		//INSTANCIANDO O TECLADO
		Scanner kb = new Scanner(System.in);
		
		
		//ENTRADA E L�GICA
		for(linha=0; linha<LIMITELINHA; linha++)
		{
			for(coluna=0; coluna<LIMITECOLUNA; coluna++)
			{
				System.out.printf("Digite o valor da posi��o [%d][%d] da matriz 3x3: \n", linha, coluna);
				matriz[linha][coluna] = kb.nextInt();
				
				if(matriz[linha][coluna]>10)
				{
					cont++;
				}
			}
		}
		

		//SA�DA
		System.out.printf("\nH� %d n�mero(s) maior(es) que 10 na matriz 3x3.", cont);
		
		
		//ENCERRAMENTO DO TECLADO
		kb.close();

	}

}
