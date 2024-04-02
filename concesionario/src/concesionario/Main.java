package concesionario;

import concesionario.instalacion.Concesionario;
import concesionario.vehiculo.*;
import concesionario.vehiculo.ciclomotor.Moto;
import concesionario.vehiculo.ciclomotor.Quad;
import concesionario.vehiculo.coche.Ranchera;
import concesionario.vehiculo.coche.Sedan;
import concesionario.vehiculo.furgoneta.Camper;
import concesionario.vehiculo.furgoneta.Furgoneta;
import concesionario.vehiculo.camion.*;

public class Main {

		public static void main(String[] args) {
			Concesionario concesionario = new Concesionario(10); 
			
			Vehiculo moto = new Moto("Honda", "CBR", "1234ABC", 500, "Deportiva"); 
			Vehiculo quad = new Quad("Yamaha", "Raptor", "5678XYZ", 700, "Grande"); 
			Vehiculo sedan = new Sedan("Toyota", "Corolla", "9876DEF", "Gasolina", 4); 
			Vehiculo ranchera = new Ranchera("Volkswagen", "Passat", "5432GHI", "Diesel", 600); 
			Vehiculo camion = new Camion("Mercedes", "Actros", "3210JKL", 2000); 
			Vehiculo furgoneta = new Furgoneta("Ford", "Transit", "6789MNO", "L2H2"); 
			Vehiculo camper = new Camper("Volkswagen", "California", "1111PPP", "L3H2", "Rosa", 2, 2.5); 


			concesionario.aniadirVehiculo(moto); 
			concesionario.aniadirVehiculo(quad); 
			concesionario.aniadirVehiculo(sedan);
			concesionario.aniadirVehiculo(ranchera); 
			concesionario.aniadirVehiculo(camion); 
			concesionario.aniadirVehiculo(furgoneta); 
			concesionario.aniadirVehiculo(camper); 

			System.out.println("Vehículos en el concesionario: " + concesionario); 
			
			Vehiculo[] vehiculos = {moto, quad, sedan, ranchera, camion, furgoneta, camper};
		}
}