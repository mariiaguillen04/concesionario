package concesionario.vehiculo.camion;

import concesionario.vehiculo.Vehiculo;

public class Camion extends Vehiculo {
	
	    private int capacidadCarga;
	    private boolean esArticulado;
	    private int pesoMercancia;

	    public Camion(String marca, String modelo, String matricula, int capacidadCarga) {
	        super(marca, modelo, matricula);
	        this.capacidadCarga = capacidadCarga;
	    }

		public int getCapacidadCarga() {
			return this.capacidadCarga;
		}

		public void setCapacidadCarga(int capacidadCarga) {
			this.capacidadCarga = capacidadCarga;
		}

	    
		public boolean isEsArticulado() {
			return this.esArticulado;
		}

		public void setEsArticulado(boolean esArticulado) {
			this.esArticulado = esArticulado;
		}

		public int getPesoMercancia() {
			return this.pesoMercancia;
		}

		public void setPesoMercancia(int pesoMercancia) {
			this.pesoMercancia = pesoMercancia;
		}

		public String toString() {
			return "Camion [marca=" + this.getMarca() 
			+ ", modelo=" + this.getModelo() 
			+ ", matricula=" + this.getMatricula() 
			+ ", capacidadCarga=" + this.capacidadCarga + "]";
		}
		
		
		
		public void infoTipoCamion() {
	        if (capacidadCarga < 3500) {
	        	System.out.println("El vehiculo es un camión ligero");
	        } else {
				if (esArticulado) {
					System.out.println("El vehículo es un camión tipo trailer");
	            } else {
	            	System.out.println("El vehículo es un camión rígido");
	            }
	        }
		  }
	        
		public void cargarCamion(int pesoMercancia) {
		    if (pesoMercancia <= capacidadCarga) {
		        
		    	System.out.println("Proceda a cargar el camión");
		    } else {
		      
		    	throw new IllegalArgumentException("Error. El peso de la carga supera la capacidad del camión.NO ES POSIBLE cargar la mercancia.");
		    }
		}
		
		
			public void acelerar() {
				
				
			}
			
	}
