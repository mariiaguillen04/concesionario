package concesionario.vehiculo.ciclomotor;

public class Quad extends Ciclomotor{
	//Atributos
	private Tamano tamanoquad;
	//Constructor
	public Quad(String marca, String modelo, String matricula, int cilindrada, String tamano) {
		super(marca, modelo, matricula, cilindrada);
		setTamanoquad(tamano);
	}
	//Getter y Setters
	public Tamano getTamanoquad() {
		return tamanoquad;
	}

	public void setTamanoquad(String tamano2) {
		this.tamanoquad = Tamano.valueOf(tamano2);
	}
	//Metodos
	
	@Override
	public void acelerar() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public String toString() {
		return "Quad [Marca=" + getMarca() + "modelo= " + getModelo() + "matricula= "
				+ getMatricula() + "cilindrada= " + getCilindrada() +  "tamano= " + this.tamanoquad + "]";
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