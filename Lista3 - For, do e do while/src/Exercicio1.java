import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		/*
		 * 
		 *Informar todos os n�meros de 1000 a 1999 que quando divididos por 11 obtemos resto = 5. (FOR)
		 *
		 */

		//VARI�VEIS
		int i;
		
		
		//INSTANCIANDO O TECLADO
		Scanner kb = new Scanner(System.in);
		

		//L�GICA E SA�DA
		for(i=1000; i<=1999;i++)
		{
			if(i%11==5)
			{
				System.out.printf("\n %d", i);
			}
			
		}
		
		
		//ENCERRAMENTO DO TECLADO
		kb.close();
		
	}

}