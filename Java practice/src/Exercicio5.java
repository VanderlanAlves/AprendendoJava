import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		/*
		 * Fa�a um sistema que leia as 3 notas de um aluno e calcule a m�dia final deste
         * aluno. Considerar que a m�dia � ponderada e que o peso das notas �: 2,3 e 5,
         * respectivamente.
		 */
		
		//VARI�VEIS
		double N1, N2, N3, media;
		
		//INSTANCIANDO O TECLADO
		Scanner kb = new Scanner(System.in);
				
		//ENTRADA
		System.out.println("Digite a primeira nota: ");
		N1 = kb.nextDouble();
		
		System.out.println("Digite a segunda nota: ");
		N2 = kb.nextDouble();
		
		System.out.println("Digite a segunda nota: ");
		N3 = kb.nextDouble();
		
		//CONTAS
		media=((N1*2)+(N2*3)+(N3*5))/10;
				
		//SA�DA
		System.out.printf("A m�dia ponderada das notas digitadas �: %.2f", media);
		
		//ENCERRAMENTO DO TECLADO
		kb.close();

	}

}
