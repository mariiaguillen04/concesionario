package concesionario.vehiculo.coche;

import concesionario.vehiculo.Vehiculo;

public abstract class Coche extends Vehiculo{
	
	// Atributos
    private Combustible combustible;
    private boolean bloqueo = false;

    // Constructor
    public Coche(String marca, String modelo, String matricula, String combustible) {
    	super(marca, modelo,matricula);
    	setCombustible(combustible);
    }

    // Getters y setters
    public Combustible getCombustible() {
        return this.combustible;
    }

    public void setCombustible(String combustible) {
        this.combustible = Combustible.valueOf(combustible);
    }
    
    
  //Métodos
    
    public void girarCoche(int direccion) {
    	if(direccion == 1) {
    		System.out.println("Está usted girando a la derecha");
    	}
    	else if(direccion == 2) {
    		System.out.println("Está usted girando a la izquierda");
    	}
    	else {
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
    
    public void bloqueoPuertas() {
    	if(!bloqueo ) {
    		System.out.println("Puertas bloqueadas");
    	}else {
    		System.out.println("Puertas desbloqueadas");
    	}
    }
    
	@Override
	public void acelerar() {
		if(getVelocidadInicial() <= 120) {
			setVelocidadInicial(getVelocidadInicial()  + 10);
			System.out.printf("La moto está acelerando, su velocidad es de %d Km", getVelocidadInicial());
		}else{
			throw new IllegalArgumentException("Ha alcanzado el límite de velocidad. No puede acelerar más");
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
