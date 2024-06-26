package concesionario.vehiculo;

import concesionario.vehiculo.ciclomotor.Moto;

public abstract class Vehiculo {

	//Atributos
	private String marca;
	private String modelo;
	private String matricula;
	private int velocidadInicial = 0;
	
	//Copnstructores
	public Vehiculo(String marca, String modelo, String matricula) {
		this.marca = marca;
		this.modelo = modelo;
		this.matricula = matricula;
	
		
	}

	//Get y set
	public String getMarca() {
		return this.marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}
	
	public String getModelo() {
		return this.modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getMatricula() {
		return this.matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
		
	}
	
	public int getVelocidadInicial() {
		return this.velocidadInicial;
	}

	public void setVelocidadInicial(int velocidadInicial) {
		this.velocidadInicial = velocidadInicial;
	}

	
	//Métodos 
	public abstract void acelerar();
	
	
	//Equals
	public boolean equals(Object obj) {
		Vehiculo otro = (Vehiculo) obj;
		boolean result = false;
		
		if(this.matricula.equals(otro.matricula)) {
			result = true;
		}
		
		return result;
	}


	

	
}
