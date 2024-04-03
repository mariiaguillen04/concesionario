package concesionario.vehiculo.furgoneta;

import concesionario.vehiculo.Vehiculo;

public class Furgoneta extends Vehiculo {
	//Atributos
		private TipoFurgoneta tipoFurgoneta;
		private boolean cargada = false;
		private boolean limpiar = false;
		
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

	
	
	public void cargarFurgoneta() {
         cargada = false;
		if (!cargada) {
            System.out.println("Cargando furgoneta");
           
            System.out.println("La furgoneta ha sido cargada.");
            cargada = true;
        } else {
            System.out.println("La furgoneta ya está cargada.");
        }
    }
	
public void descargarFurgoneta() {
        
		if (cargada) {
            System.out.println("Descargando furgoneta");
            
            System.out.println("La furgoneta ha sido descargada.");
            cargada = false;
        } else {
            System.out.println("La furgoneta ya está vacía.");
        }
    }
	
 	public void limpiarFurgoneta() {
		
		if(!limpiar) {
			limpiar = true;
			System.out.println("Limpiando la furgoneta");
        
        	System.out.println("Furgoneta limpia y lista para usar");
		} else {
			System.out.println("La furgoneta ya esta lo bastante limpia");
		}
	}
	
	@Override
	public void acelerar() {
		if(getVelocidadInicial() <= 120) {
			setVelocidadInicial(getVelocidadInicial()  + 10);
			System.out.printf("La furgoneta está acelerando, su velocidad es de %d ", getVelocidadInicial(), "Km");
		}else{
			throw new IllegalArgumentException("Ha alcanzado el límite de velocidad. No puede acelerar más");
		}
		
	}
	
	@Override
    public String toString() {
		return "Coche [Marca=" + getMarca() + "modelo= " + getModelo() 
		+ "matricula= " + getMatricula() 
		+ "Tipo de Furgoneta= " + this.tipoFurgoneta + "]";
	} 
	
	
}

