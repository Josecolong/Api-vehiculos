package apVehiculo;

// INTEGRANTES //
//JOSE GREGORIO COLON GAMARRA//
//RAFAEL POLO//
// JUAN CAMILO DIAZ//

import api.services.*;
import api.modelo.*;
import java.util.Scanner;

public class ApVehiculo {
    public static void main(String[] args) {

        AccionesMoto accMotos = new AccionesMoto();
        AccionesCarro accCarro = new AccionesCarro();

        Scanner s = new Scanner(System.in);

        System.out.println("Ingrese los datos de un carro: \n");

        System.out.println("Ingrese la marca del carro: ");
        String marcaCarro = s.nextLine();

        System.out.println("Ingrese la modelo del carro: ");
        String modeloCarro = s.nextLine();

        System.out.println("Ingrese la placa del carro: ");
        String placaCarro = s.nextLine();

        System.out.println("Ingrese la velocidad maxima del carro: ");
        int velocidadMaximaCarro = s.nextInt();

        System.out.println("Ingrese la traccion (automatico o mecanico) del carro: ");
        String traccionCarro = s.nextLine();

        Carro carro1 = new Carro(traccionCarro, marcaCarro, modeloCarro, placaCarro, velocidadMaximaCarro);
        
        accCarro.acelerar(carro1.getVelocidadMaxima());
        accCarro.direccion("12345");
        accCarro.estacionamiento();
        accCarro.frenado();

        System.out.println("-----------------------------------");
        System.out.println("Ingrese los datos de una moto: \n");

        System.out.println("Ingrese la marca de la moto: ");
        String marcaMoto = s.nextLine();

        System.out.println("Ingrese la modelo de la moto: ");
        String modeloMoto = s.nextLine();

        System.out.println("Ingrese la placa de la moto: ");
        String placaMoto = s.nextLine();

        System.out.println("Ingrese la velocidad maxima de la moto: ");
        int velocidadMaximaMoto = s.nextInt();

        System.out.println("Ingrese la traccion de la moto: ");
        String cilindrajeMoto = s.nextLine();

        Moto moto1 = new Moto(cilindrajeMoto, marcaMoto, modeloMoto, placaMoto, velocidadMaximaMoto);

        accMotos.acelerar(moto1.getVelocidadMaxima());
        accMotos.direccion("12345");
        accMotos.estacionamiento();
        accMotos.frenado();

    }

}
