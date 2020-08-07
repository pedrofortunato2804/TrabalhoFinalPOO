package Classes;

import java.util.Observable;

import Interface.Carro;

public class CarroRoubado extends Observable implements Carro {
	
	private String acao = "";
	
	public void frente() {
		acao = "frente";
		System.out.println("Carro roubado segue em frente.");
		this.mudaEstado();
	}
	
	public void direita() {
		acao = "direita";
		System.out.println("Carro roubado virou a direita.");
		this.mudaEstado();
	}

	public void esquerda() {
		acao = "esquerda";
		System.out.println("Carro roubado virou a esquerda.");
		this.mudaEstado();
	}

	public void para() {
		acao = "para";
		System.out.println("Carro roubado parou.");
		this.mudaEstado();
	}
	
	public void mudaEstado() {
		setChanged();//Muda o estado
		notifyObservers(acao);// Notifica os observadores sobre a mudança
	}
}
