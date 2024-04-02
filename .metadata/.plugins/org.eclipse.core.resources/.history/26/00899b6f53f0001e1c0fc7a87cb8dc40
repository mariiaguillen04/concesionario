package concesionario.vehiculo;

public abstract class Vehiculo {

	//Atributos
	private Marca marca;
	private String modelo;
	private String matricula;
	
	//Copnstructores
	public Vehiculo(String marca, String modelo, String matricula ) {
		setMarca(Marca marca);
		this.modelo = modelo;
		this.matricula = matricula;
		
	}

	//Get y set
	public Marca getMarca() {
		return this.marca;
	}

	public void setMarca(Marca marca) {
		this.marca = Marca.valueOf(marca).toString();
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
	
	//Métodos 

	public abstract void acelerar();
	
}
