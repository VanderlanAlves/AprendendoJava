import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		/*
		 
Uma empresa desenvolveu uma pesquisa para saber as caracter�sticas 
psicol�gicas dos indiv�duos de uma regi�o. Para tanto, a cada uma das pessoas
era perguntado: idade, sexo (1-feminino / 2-masculino), e as op��es 
(1, se a pessoa era calma; 2, se a pessoa era nervosa e 3, se a pessoa era agressiva).
Pede-se para elaborar um sistema que permita ler os dados de 150 pessoas, calcule e mostre: (WHILE)

o n�mero de pessoas calmas; 
o n�mero de mulheres nervosas; 
o n�mero de homens agressivos; 
o n�mero de pessoas nervosas com mais de 40 anos; 
o n�mero de pessoas calmas com menos de 18 anos.

		 */
		
		//VARI�VEIS
		int LIMITE=150, pessoas=0, idade=0, sexo=0, temperamento=0, pessoasCalmas=0, mulheresNervosas=0, homensAgressivos=0, pessoasNervosas40=0, pessoasCalmas18=0;
		
		
		//INSTANCIANDO O TECLADO
		Scanner kb = new Scanner(System.in);
		
		
		//L�GICA
		while(pessoas<LIMITE)
		{
			pessoas++;
			
			System.out.println("Digite a idade: ");
			idade = kb.nextInt();
			
			System.out.println("Digite o sexo: 1-Feminino 2-Masculino ");
			sexo = kb.nextInt();
			
			System.out.println("Digite o temperamento: 1-Calma(o) 2-Nervosa(o) 3-Agressiva(o) ");
			temperamento = kb.nextInt();
			
			if(temperamento==1)
			pessoasCalmas++;
			{
				if(idade<18)
				{
					pessoasCalmas18++;
				}
			}
			
			if(temperamento==2)
			{
				if(idade>40)
				{
					pessoasNervosas40++;
			
				}
			}
			
			if(temperamento==3)
			{
				if(sexo==2)
				{
					homensAgressivos++;
				}
			}
			
			if(temperamento==2)
			{
				if(sexo==1)
				{
					mulheresNervosas++;
				}
			}
			
		}
		
		//SA�DA
		System.out.printf("\nO n�mero de pessoas calmas � de: %d.", pessoasCalmas);
		System.out.printf("\nO n�mero de mulheres nervosas � de: %d.", mulheresNervosas);
		System.out.printf("\nO n�mero de homens agressivos � de: %d.", homensAgressivos);
		System.out.printf("\nO n�mero de pessoas nervosas com mais de 40 anos � de: %d.", pessoasNervosas40);
		System.out.printf("\nO n�mero de pessoas calmas com menos de 18 anos � de: %d.", pessoasCalmas18);


		//ENCERRAMENTO DO TECLADO
		kb.close();
	}

}
