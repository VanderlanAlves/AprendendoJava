package entidades;

public class Fornecedores extends Pessoas
{
/*
 * 2. Considere, como subclasse da classe Pessoa (desenvolvida no exerc�cio anterior) 
 * a classe Fornecedor. Considere que cada inst�ncia da classe Fornecedor tem, para al�m 
 * dos atributos que caracterizam a classe Pessoa, os atributos 
 * valorCredito (correspondente
 * ao cr�dito m�ximo atribu�do ao fornecedor) e valorDivida 
 * (montante da d�vida para com o fornecedor).
 * Implemente na classe Fornecedor, para al�m dos usuais m�todos seletores e modificadores, um m�todo
 * obterSaldo() que devolve a diferen�a entre os valores dos atributos valorCredito e valorDivida. 
 * Depois de implementada a classe Fornecedor, crie um programa de teste adequado que lhe permita verificar 
 * o funcionamento dos m�todos implementados na classe Fornecedor e os herdados da classe Pessoa. 
 */
	
	//ATRIBUTOS
	public double valorCredito, valorDivida, credito, divida;
	
	//CONSTRUTORES

	
	public Fornecedores (double valorCredito, double valorDivida)
	{
		this.valorCredito=valorCredito;
		this.valorDivida=valorDivida;
	}

	public double getValorCredito() {
		return valorCredito;
	}

	public void setValorCredito(double valorCredito) {
		this.valorCredito = valorCredito;
	}

	public double getValorDivida() {
		return valorDivida;
	}

	public void setValorDivida(double valorDivida) {
		this.valorDivida = valorDivida;
	}
	
	public double getObterSaldo()
	{
		if(valorCredito>valorDivida)
		{
			credito=valorCredito-valorDivida;
			System.out.printf("O valor de cr�dito do cliente �: ", credito);
		}
		
		if(valorDivida>valorCredito)
		{
			divida=valorDivida-valorCredito;
			System.out.println("O valor da d�vida do cliente �: "+ divida);
		
		}
		return credito;
		
		
	}
	

	
	
	
	
	
}
