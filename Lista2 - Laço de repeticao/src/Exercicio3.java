import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		/*
		 * Fa�a um programa que receba a idade de uma pessoa e mostre na sa�da em qual categoria ela se encontra:
�                     10-14 infantil
�                     15-17 juvenil
�                     18-25 adulto

		 */
		
		//VARI�VEIS
		int idade;
		
		
		//INSTANCIANDO O TECLADO
		Scanner kb = new Scanner(System.in);
		
		
		//ENTRADA
		System.out.println("Digite sua idade");
		idade = kb.nextInt();
		
		//L�GICA
		if(idade>=10 && idade<=14) 
		{
			System.out.println("Sua categoria � infantil.");
		}
		
		if(idade>=15 && idade<=17) 
		{
			System.out.println("Sua categoria � juvenil.");
		}
		
		if(idade>=18 && idade<=25) 
		{
			System.out.println("Sua categoria � adulta.");
		}
		
		//ENCERRAMENTO DO TECLADO
		kb.close();

	}

}