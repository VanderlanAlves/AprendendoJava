package entidades;

public class Empregados extends Pessoas{

	/*
	 * 3. Considere, como subclasse da classe Pessoa, 
	 * a classe Empregado. Considere que cada inst�ncia da 
	 * classe Empregado tem, para al�m dos atributos que caracterizam 
	 * a classe Pessoa, os atributos codigoSetor (inteiro), salarioBase 
	 * (vencimento base) e imposto (porcentagem retida dos impostos).
	 * Implemente a classe Empregado com m�todos seletores e modificadores 
	 * e um m�todo calcularSalario. Escreva um programa de teste adequado 
	 * para a classe Empregado. 
	 */
	
	public int codigoSetor;
	public double salarioBase, imposto, salario;
	
	public Empregados(int codigoSetor, double salarioBase, double imposto)
	{
		this.codigoSetor=codigoSetor;
		this.salarioBase=salarioBase;
		this.imposto=imposto;
	}
	
	public double getCalcularSalario()
	{
		salario=salarioBase-imposto;
		System.out.println("O valor do sal�rio do empregado �: "+salario);
		return salario;
	}
	
}
