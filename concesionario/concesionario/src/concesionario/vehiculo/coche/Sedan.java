package concesionario.vehiculo.coche;

public class Sedan extends Coche {
	
	
	// Atributos
    private int puertas;

 // Constructor
    public Sedan(String marca, String modelo, String matricula, String combustible, int puertas) {
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
			+ "Combustible= " + getCombustible() + "puertas = " + this.puertas + "]";
		}   
	

		
	}

