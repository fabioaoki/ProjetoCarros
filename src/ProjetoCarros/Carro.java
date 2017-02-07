package ProjetoCarros;

public class Carro {
	
	String cor; 
	String modelo;
	double velocidade;
	double velocidadeAtual;
	double velocidadeMaxima;
	Motor motor;
	
	// liga o carro 
	
	void liga() {
		System.out.println("Liga o carro ");
	}

	// acelera uma certa quantidade
	
	void acelera (double quantidade) {
		double velocidadeNova = this.velocidadeAtual + quantidade;
		this.velocidadeAtual = velocidadeNova;
	}
	
	// devolve a marcha do carro 
	
	int pegaMarcha () {
		if (this.velocidadeAtual < 0) {
			return - 1;
		}
		if (this.velocidadeAtual >= 0 && this.velocidadeAtual < 40) {
			return 1;
		}
		if (this.velocidadeAtual >= 40 && this.velocidadeAtual < 80) {
			return 2;
		}
		return 3;
	}
	
	class testaCArro {
		
	}
	
	class Motor {
		int potencia;
		String tipo;
	}
	public static void main(String[] args) {
		Carro meuCarro;
		meuCarro = new Carro();
		meuCarro.cor ="Verde";
		meuCarro.modelo ="Fusca";
		meuCarro.velocidadeAtual = 0;
		meuCarro.velocidadeMaxima = 80;
		
		// liga o carro 
		meuCarro.liga();
		
		//acelera carro 
		meuCarro.acelera(20);
		System.out.println(meuCarro.velocidadeAtual);
	}

}
//ss