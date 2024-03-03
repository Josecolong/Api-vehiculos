
package api.services;

public class AccionesMoto implements AccionesVehiculos{

    
    @Override
    public void acelerar(int vel) {
        System.out.println("La velocidad de la moto es de: " + vel);
    }

    @Override
    public void frenado() {
        System.out.println("Frenando...");
    }

    @Override
    public void direccion(String dir) {
        System.out.println("La dirección de la moto es: " + dir);
    }

    @Override
    public void estacionamiento() {
        System.out.println("Estacionando...");
    }
    
}