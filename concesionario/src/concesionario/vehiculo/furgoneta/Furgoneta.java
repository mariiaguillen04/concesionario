package concesionario.vehiculo.furgoneta;



public class Furgoneta extends Vehiculo {
	//Atributos
		private TipoFurgoneta tipoFurgoneta;
	
		
	//Constructor
	public Furgoneta(String marca, String modelo, String matricula, TipoFurgoneta tipoFurgoneta ) {
		super(marca, modelo, matricula);
		setTipoFurgoneta(TipoFurgoneta tipoFurgoneta);
	}
	
	//Getters y Setters
	public TipoFurgoneta  getTipoFurgoneta(){
		return this.tipoFurgoneta; 
	}
	
	public void setTipoFurgoneta(TipoFurgoneta tipoFurgoneta) {
		
	}
	
}


