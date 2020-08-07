package Main;

import Classes.CarroPolicial;
import Classes.CarroRoubado;

public class CarroMain {
	
	public static void main(String[] args) {
		//Observador
		CarroPolicial carroPolicial = new CarroPolicial();
		
		//Observado
		CarroRoubado carroRoubado = new CarroRoubado();
	
		//Adicionar o observador ao observado
		carroRoubado.addObserver(carroPolicial);
		
		carroRoubado.frente();
		carroRoubado.direita();
		carroRoubado.frente();
		carroRoubado.esquerda();
		carroRoubado.para();
		
	}	
	
}
