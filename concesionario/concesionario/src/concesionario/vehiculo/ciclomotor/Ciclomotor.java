package concesionario.vehiculo.ciclomotor;

import concesionario.vehiculo.Vehiculo;

public abstract class Ciclomotor extends Vehiculo {
	//atributos
	private int cilindrada;
	//constructor
	public Ciclomotor(String marca, String modelo, String matricula, int cilindrada) {
		super(marca, modelo, matricula);
		this.cilindrada= cilindrada;
	}
	//Getters y Setters
	public int getCilindrada() {
		return this.cilindrada;
	}
	public void setCilindrada(int cilindrada) {
		this.cilindrada = cilindrada;
	}
	
	
	
	

}