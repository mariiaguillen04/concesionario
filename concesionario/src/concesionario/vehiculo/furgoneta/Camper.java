package concesionario.vehiculo.furgoneta;

public class Camper extends Furgoneta{

	//Atributos
		private TipoFurgoneta tipoFurgoneta;
		private int numeroCamas;
		private String color;
		private double tamaño;
		
	//Constructor
	public Camper(String marca, String modelo, String matricula, String tipoFurgoneta, String color, int numeroCamas, double tamaño) {
		super(marca, modelo, matricula, tipoFurgoneta);
		this.numeroCamas = numeroCamas;
		this.color = color;
		this.tamaño = tamaño;
	}

	//Getters y Setters
	public TipoFurgoneta getTipoFurgoneta() {
		return tipoFurgoneta;
	}

	public void setTipoFurgoneta(TipoFurgoneta tipoFurgoneta) {
		this.tipoFurgoneta = tipoFurgoneta;
	}

	public int getNumeroCamas() {
		return numeroCamas;
	}

	public void setNumeroCamas(int numeroCamas) {
		this.numeroCamas = numeroCamas;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public double getTamaño() {
		return tamaño;
	}

	public void setTamaño(double tamaño) {
		this.tamaño = tamaño;
	}
	
	@Override
	public void acelerar() {
		// TODO Auto-generated method stub
		
	}
	
}
