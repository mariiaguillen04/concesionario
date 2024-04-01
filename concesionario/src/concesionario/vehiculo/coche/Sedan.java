package concesionario.vehiculo.coche;


public class Sedan  extends Coche {
	// Atributos
    private int puertas;

 // Constructor
    public Sedan(Combustible combustible, int puertas) {
		super(combustible);
		this.puertas  = puertas;
	}

	public double getPuertas() {
		return this.puertas;
	}

	public void setPuertas(int puertas) {
		this.puertas = puertas;
	}
}
