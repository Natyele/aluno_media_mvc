package mvc.model;

public class AlunoMediaModel {

	// Resposável por obter o valor do cálculo
	private int resultado;

	// Realizar o cálculo da soma
	public void somar(int nota1, int nota2, int nota3, int nota4) {

		this.resultado = (nota1 + nota2 + nota3 + nota4) / 4;
	}

	// Exibir o cálculo
	public int retornarResultado() {
		return this.resultado;
	}

}

   