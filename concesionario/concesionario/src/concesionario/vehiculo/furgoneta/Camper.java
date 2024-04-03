package concesionario.vehiculo.furgoneta;

public class Camper extends Furgoneta{

	//Atributos
		private TipoFurgoneta tipoFurgoneta;
		private int numeroCamas;
		private String color;
		private double tamanio;
		
	//Constructor
	public Camper(String marca, String modelo, String matricula, String tipoFurgoneta, String color, int numeroCamas, double tamaño) {
		super(marca, modelo, matricula, tipoFurgoneta);
		this.numeroCamas = numeroCamas;
		this.color = color;
		this.tamanio = tamanio;
	}

	//Getters y Setters
	public TipoFurgoneta getTipoFurgoneta() {
		return this.tipoFurgoneta;
	}

	public void setTipoFurgoneta(TipoFurgoneta tipoFurgoneta) {
		this.tipoFurgoneta = tipoFurgoneta;
	}

	public int getNumeroCamas() {
		return this.numeroCamas;
	}

	public void setNumeroCamas(int numeroCamas) {
		this.numeroCamas = numeroCamas;
	}

	public String getColor() {
		return this.color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public double getTamaño() {
		return this.tamanio;
	}

	public void setTamaño(double tamaño) {
		this.tamanio = tamaño;
	}
	
	
	@Override
	public void acelerar() {
		if(getVelocidadInicial() <= 120) {
			setVelocidadInicial(getVelocidadInicial()  + 10);
			System.out.printf("La camper está acelerando, su velocidad es de %d "+ getVelocidadInicial()+ "Km");
		}else{
			throw new IllegalArgumentException("Ha alcanzado el límite de velocidad. No puede acelerar más");
		}
		
	}
	
	@Override
    public String toString() {
		return "Camper [Marca=" + getMarca() + "modelo= " + getModelo() 
		+ "matricula= " + getMatricula() 
		+ "Tipo de Furgoneta= " + this.tipoFurgoneta + "numero de camas= " + this.numeroCamas
		+ "color= " + this.color + "tamaño= " + this.tamanio + "]";
	}
	
}
