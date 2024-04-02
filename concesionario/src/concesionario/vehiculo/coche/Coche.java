package concesionario.vehiculo.coche;

import concesionario.vehiculo.Vehiculo;

public abstract class Coche extends Vehiculo{
	
	// Atributos
    private Combustible combustible;

    // Constructor
    public Coche(String marca, String modelo, String matricula, Combustible combustible) {
    	super(marca, modelo,matricula);
    	this.combustible = combustible;
    }

    // Getters y setters
    public Combustible getCombustible() {
        return combustible;
    }

    public void setCombustible(String combustible) {
        this.combustible = Combustible.valueOf(combustible);
    }
    
    
  //Métodos
    
    public void girarCoche(int direccion) {
    	if(direccion == 1) {
    		System.out.println("Está usted girando a la derecha");
    	}
    	if(direccion == 2) {
    		System.out.println("Está usted girando a la izquierda");
    	}
    	if(direccion != 1 || direccion != 2) {
    		throw new IllegalArgumentException("Error. Giro en direción incorrecta.");
    	}
    	
    }

    public void consumoCombustible() {
    	if(this.combustible == Combustible.DIESEL ) {
    		System.out.println("Consumo de carburante bajo");
    	}
    	if(this.combustible == Combustible.GASOLINA ) {
    		System.out.println("Consumo de carburante elevado");
    	}
    }
    
    public void bloqueoPuertas(boolean bloqueo) {
    	if(bloqueo == true) {
    		System.out.println("Puertas bloqueadas");
    	}
    	if(bloqueo == false) {
    		System.out.println("Puertas desbloqueadas");
    	}
    }

	//toString
    @Override
    public String toString() {
		return "Coche [Marca=" + getMarca() + "modelo= " + getModelo() 
		+ "matricula= " + getMatricula() 
		+ "Combustible= " + this.combustible + "]";
	}   
    
}
