package concesionario.vehiculo.coche;

public class Sedan extends Coche {
	
	
	// Atributos
    private int puertas;

 // Constructor
    public Sedan(String marca, String modelo, String matricula, Combustible combustible, int puertas) {
        super(marca, modelo, matricula, combustible);
		this.puertas  = puertas;
	}
    
    // Getters y Setters

	public double getPuertas() {
		return this.puertas;
	}

	public void setPuertas(int puertas) {
		this.puertas = puertas;
	}

	@Override
	public void acelerar() {
		// TODO Auto-generated method stub
		
	}


		
	}

