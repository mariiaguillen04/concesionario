package concesionario.vehiculo.ciclomotor;

public class Moto extends Ciclomotor{
	//Atributos 
	private Tipo tipoMoto;
	//Constructor
	public Moto(String marca, String modelo, String matricula, int cilindrada, String tipoMoto) {
		super(marca, modelo, matricula, cilindrada);
		setTipoMoto(tipoMoto);
	}
	//Getters y Setters
	public Tipo getTipoMoto() {
		return tipoMoto;
	}

	public void setTipoMoto(String tipoMoto2) {
		this.tipoMoto = Tipo.valueOf(tipoMoto2);
	}
	
	//Metodos
		@Override
		public String toString() {
			return "Moto [Marca=" + getMarca() + "modelo= " + getModelo() + "matricula= " +
					getMatricula() + "cilindrada= " + getCilindrada() + "tipo= " + this.tipoMoto + "]";
		}
		
		public void mostrarInformacion() {
			System.out.println(this.toString());
		}
		
	@Override
	public void acelerar() {
		
		
	}

}
