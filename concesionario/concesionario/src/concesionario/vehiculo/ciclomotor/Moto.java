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
		return this.tipoMoto;
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
		if(getVelocidadInicial() <= 120) {
			setVelocidadInicial(getVelocidadInicial()  + 10);
			System.out.printf("La moto está acelerando, su velocidad es de %d Km", getVelocidadInicial());
		}else{
			throw new IllegalArgumentException("Ha alcanzado el límite de velocidad. No puede acelerar más");
		}
		
	}

}
