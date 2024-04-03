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
		return capacidadMaletero;
	}

	public void setCapacidadMaletero(double capacidadMaletero) {
		this.capacidadMaletero = capacidadMaletero;
	}

	@Override
	public void acelerar() {
	
		
	}

		

}
