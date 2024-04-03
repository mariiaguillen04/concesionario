package concesionario;

import concesionario.instalacion.Concesionario;
import concesionario.vehiculo.*;
import concesionario.vehiculo.ciclomotor.Ciclomotor;
import concesionario.vehiculo.ciclomotor.Moto;
import concesionario.vehiculo.ciclomotor.Quad;
import concesionario.vehiculo.coche.Coche;
import concesionario.vehiculo.coche.Ranchera;
import concesionario.vehiculo.coche.Sedan;
import concesionario.vehiculo.furgoneta.Camper;
import concesionario.vehiculo.furgoneta.Furgoneta;
import concesionario.vehiculo.camion.*;

public class Main {

		private static final Ciclomotor[] Vehiculo = null;

		public static void main(String[] args) {
	
			Concesionario concesionario = new Concesionario(7);
			
			Ciclomotor moto = new Moto("Honda", "CBR", "1234ABC", 500, "Deportiva"); 
			Ciclomotor quad = new Quad("Yamaha", "Raptor", "5678XYZ", 700, "Grande"); 
			Coche sedan = new Sedan("Toyota", "Corolla", "9876DEF", "Gasolina", 4); 
			Coche ranchera = new Ranchera("Volkswagen", "Passat", "5432GHI", "Diesel", 600); 
			Camion camion = new Camion("Mercedes", "Actros", "3210JKL", 2000); 
			Furgoneta furgoneta = new Furgoneta("Ford", "Transit", "6789MNO", "L2H2"); 
			Furgoneta camper = new Camper("Volkswagen", "California", "1111PPP", "L3H2", "Rosa", 2, 2.5); 
			
			concesionario.aniadirVehiculo(moto); 
			concesionario.aniadirVehiculo(quad); 
			concesionario.aniadirVehiculo(sedan);
			concesionario.aniadirVehiculo(ranchera); 
			concesionario.aniadirVehiculo(camion); 
			concesionario.aniadirVehiculo(furgoneta); 
			concesionario.aniadirVehiculo(camper); 
			
			sedan.bloqueoPuertas();
			ranchera.girarCoche(1);;
			camion.cargarCamion(2);
			furgoneta.descargarFurgoneta();
			camper.descargarFurgoneta();
			
			
			
			System.out.println("Vehículos en el concesionario: " + concesionario );
	
		

			System.out.println("Vehículos en el concesionario: " + concesionario); 
			
			Vehiculo[] vehiculos = {moto, quad, sedan, ranchera, camion, furgoneta, camper};
		}
}