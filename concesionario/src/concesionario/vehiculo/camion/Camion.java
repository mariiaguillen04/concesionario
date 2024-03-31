package concesionario.vehiculo.camion;

import concesionario.vehiculo.Vehiculo;

class Camion extends Vehiculo {
	    private int capacidadCarga;

	    public Camion(String marca, String modelo, String matricula, int capacidadCarga) {
	        super(marca, modelo, matricula);
	        this.capacidadCarga = capacidadCarga;
	    }

		public int getCapacidadCarga() {
			return capacidadCarga;
		}

		public void setCapacidadCarga(int capacidadCarga) {
			this.capacidadCarga = capacidadCarga;
		}

		@Override
		public void acelerar() {
			// TODO Auto-generated method stub
			
		}
	    
	    
	    

	}
