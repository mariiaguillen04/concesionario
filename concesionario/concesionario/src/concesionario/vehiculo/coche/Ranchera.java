package concesionario.vehiculo.coche;

public class Ranchera extends Coche {

	// Atributos
    private double capacidadMaletero;

 // Constructor
    public Ranchera(String marca, String modelo, String matricula, String combustible, double capacidadMaletero) {
        super(marca, modelo, matricula, combustible);
        this.capacidadMaletero = capacidadMaletero;
    }

	public double getCapacidadMaletero() {
		return this.capacidadMaletero;
	}

	public void setCapacidadMaletero(double capacidadMaletero) {
		this.capacidadMaletero = capacidadMaletero;
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
		+ "Combustible= " + getCombustible() + "Capacidad Maletero = " + this.capacidadMaletero + "]";
	}   

		

}
