package concesionario.vehiculo.furgoneta;

import concesionario.vehiculo.Vehiculo;

public class Furgoneta extends Vehiculo {
	//Atributos
		private TipoFurgoneta tipoFurgoneta;
	
		
	//Constructor
	public Furgoneta(String marca, String modelo, String matricula, String tipoFurgoneta ) {
		super(marca, modelo, matricula);
		setTipoFurgoneta(tipoFurgoneta);
	}
	
	//Getters y Setters
	
	public String getTipoPista() {
		return this.tipoFurgoneta.toString();
	}

	public void setTipoFurgoneta(String tipoFurgoneta) {
		this.tipoFurgoneta = TipoFurgoneta.valueOf(tipoFurgoneta);
	}

	@Override
	public void acelerar() {
		// TODO Auto-generated method stub
		
	}
	
	
}


