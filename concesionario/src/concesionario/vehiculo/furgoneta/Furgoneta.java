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
	
	public void cargarFurgoneta() {
        boolean cargada = false;
		if (!cargada) {
            System.out.println("Cargando furgoneta");
           
            System.out.println("La furgoneta ha sido cargada.");
            cargada = true;
        } else {
            System.out.println("La furgoneta ya está cargada.");
        }
    }
	
	public void descargarFurgoneta() {
        boolean cargada = false;
		if (cargada) {
            System.out.println("Descargando furgoneta");
            
            System.out.println("La furgoneta ha sido descargada.");
            cargada = false;
        } else {
            System.out.println("La furgoneta ya está vacía.");
        }
    }
	
	public void limpiarFurgoneta() {
		boolean limpiar = false;
		if(limpiar) {
			System.out.println("Limpiando la furgoneta");
        
        	System.out.println("Furgoneta limpia y lista para usar");
		} else {
			System.out.println("La furgoneta ya esta lo vastante limpia");
		}
	}
}

