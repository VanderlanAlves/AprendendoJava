
public class cliente 
{
	
	/*
	 * 1) Crie uma classe cliente e apresente os atributos e m�todos referentes esta classe,
	 * em seguida crie um objeto cliente, defina as inst�ncias deste objeto e apresente as 
	 * informa��es deste objeto no console.
	 */
	
	//ATRIBUTOS
	public String nome;
	public int idade;
	public int codigo;
	
	//CONSULTOR
	public cliente (String nome, int idade, int codigo)
	{
		this.nome=nome;
		this.idade=idade;
		this.codigo=codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	
	
	
}
