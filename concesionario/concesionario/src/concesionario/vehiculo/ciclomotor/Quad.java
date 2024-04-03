package concesionario.vehiculo.ciclomotor;

public class Quad extends Ciclomotor{
	//Atributos
	private Tamano tamanoQuad;
	//Constructor
	public Quad(String marca, String modelo, String matricula, int cilindrada, String tamano) {
		super(marca, modelo, matricula, cilindrada);
		setTamanoQuad(tamano);
	}
	//Getter y Setters
	public Tamano getTamanoQuad() {
		return this.tamanoQuad;
	}

	public void setTamanoQuad(String tamano2) {
		this.tamanoQuad = Tamano.valueOf(tamano2);
	}
	//Metodos
	
	@Override
	public void acelerar() {
		if(getVelocidadInicial() <= 120) {
			setVelocidadInicial(getVelocidadInicial()  + 10);
			System.out.printf("La moto está acelerando, su velocidad es de %d Km", getVelocidadInicial());
		}else{
			throw new IllegalArgumentException("Ha alcanzado el límite de velocidad. No puede acelerar más");
		}
		
	}
	
	@Override
	public String toString() {
		return "Quad [Marca=" + getMarca() + "modelo= " + getModelo() + "matricula= "
				+ getMatricula() + "cilindrada= " + getCilindrada() +  "tamano= " + this.tamanoQuad + "]";
	}
	
	
	
	@Override
	public boolean equals(Object obj) {
		Quad otro = (Quad) obj;
		boolean result = false;
		if(this.getMatricula().equals(otro.getMatricula())) {
			result = true;
		}
		return result;
}
}