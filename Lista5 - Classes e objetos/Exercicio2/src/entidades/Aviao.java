package entidades;

public class Aviao {
		
		/*
		 * Crie uma classe avi�o e apresente os atributos 
		 * e m�todos referentes esta classe, em seguida crie 
		 * um objeto avi�o, defina as inst�ncias deste objeto e 
		 * apresente as informa��es deste objeto no console.
		 */
		
		//ATRIBUTOS
		public String modelo, piloto;
		public int anoFabricacao;
		
		//CONSULTOR
		public Aviao (String modelo, String piloto, int anoFabricacao)
		{
			this.modelo=modelo;
			this.piloto=piloto;
			this.anoFabricacao=anoFabricacao;
		}

		public String getModelo() {
			return modelo;
		}

		public void setModelo(String modelo) {
			this.modelo = modelo;
		}

		public String getPiloto() {
			return piloto;
		}

		public void setPiloto(String piloto) {
			this.piloto = piloto;
		}

		public int getAnoFabricacao() {
			return anoFabricacao;
		}

		public void setAnoFabricacao(int anoFabricacao) {
			this.anoFabricacao = anoFabricacao;
		}

		//M�TODOS
	
}
