import java.util.Scanner;

public class Exercicio6 {

	public static void main(String[] args) {
		/*
		 * Escrever um programa que receba v�rios n�meros inteiros no teclado. 
		 * E no final imprimir a m�dia dos n�meros m�ltiplos de 3.
		 *  Para sair digitar 0(zero).(DO...WHILE)
		 */
		
		//VARI�VEIS
		int numero, soma=0, mediaCont=0, mediaTotal=0;
		
		
		//INSTANCIANDO O TECLADO
		Scanner kb = new Scanner(System.in);
		
		
		//L�GICA
		do
		{
			System.out.println("Digite um n�mero: ");
			numero = kb.nextInt();
			
			if(numero%3==0)
			{
				mediaCont++;
				soma=soma+numero;
			
			}
			
		} while(numero!=0);
		
		mediaCont--;
		mediaTotal=soma/mediaCont;
		
		//SA�DA
		System.out.printf("\nA m�dia dos n�meros divis�veis por 3 digitados �: %d.", mediaTotal);
		
		
		//ENCERRAMENTO DO TECLADO
		kb.close();

	}

}
