package concesionario.instalacion;

import concesionario.vehiculo.Vehiculo;


public class Concesionario {

	    private int idConcesionario;
	    private Vehiculo vehiculos[];
	    private int numMaxVehiculos;
	    private int numVehiculos;

	    private static int contIdConcesionario= 1;
	    
	    public Concesionario(int numMaxVehiculos) {
	    	this.setIdConcesionario(contIdConcesionario++);
	        this.numMaxVehiculos = numMaxVehiculos;
	        this.vehiculos = new Vehiculo[numMaxVehiculos];
	        this.numVehiculos = 0;
	    }
	    
	    
	    
	    public Vehiculo[] getVehiculos() {
			return this.vehiculos;
		}



		public void setVehiculos(Vehiculo[] vehiculos) {
			this.vehiculos = vehiculos;
		}



		public int getNumMaxVehiculos() {
			return this.numMaxVehiculos;
		}



		public void setNumMaxVehiculos(int numMaxVehiculos) {
			this.numMaxVehiculos = numMaxVehiculos;
		}



		public int getNumVehiculos() {
			return this.numVehiculos;
		}



		public void setNumVehiculos(int numVehiculos) {
			this.numVehiculos = numVehiculos;
		}



		public int getIdConcesionario() {
			return this.idConcesionario;
		}

		public void setIdConcesionario(int idConcesionario) {
			this.idConcesionario = idConcesionario;
		}

	    public void aniadirVehiculo(Vehiculo vehiculo) {
	        if (numVehiculos < numMaxVehiculos) {
	            vehiculos[numVehiculos] = vehiculo;
	            numVehiculos++;
	        } else {
	            System.out.println("El concesionario está lleno, no hay más espacio para más vehículos");
	        }
	    }

	    public void eliminarVehiculo(Vehiculo vehiculo) {
	        for (int i = 0; i < numVehiculos; i++) {
	            if (vehiculos[i].equals(vehiculo)) {
	                System.arraycopy(vehiculos, i + 1, vehiculos, i, numVehiculos - i - 1);
	                numVehiculos--;
	                vehiculos[numVehiculos] = null;
	                System.out.println("Vehículo eliminado.");
	                return;
	            }
	        }
	        System.out.println("El vehículo no está en el concesionario");
	    }

	    @Override
	    public boolean equals(Object obj) {
			Concesionario otro = (Concesionario) obj;
			boolean result = false;
			
			if(this.idConcesionario==otro.idConcesionario) {
				result = true;
			}
			
			return result;
		}

		@Override
		public String toString() {
			return "Concesionario [numero=" + this.getIdConcesionario()
					+ ", Vehiculos=" + this.getVehiculos()
					+ ", numVehiculos=" + this.getNumVehiculos()
					+ ", numMaxVehiculos=" + this.getNumMaxVehiculos() + "]";
		}

		
}
