package concesionario.vehiculo.coche;


public class Ranchera extends Coche {

	// Atributos
    private double capacidadMaletero;

 // Constructor
    public Ranchera(Combustible combustible, double capacidadMaletero) {
        super(combustible);
        this.setCapacidadMaletero(capacidadMaletero);
    }

	public double getCapacidadMaletero() {
		return capacidadMaletero;
	}

	public void setCapacidadMaletero(double capacidadMaletero) {
		this.capacidadMaletero = capacidadMaletero;
	}
}
