
package api.services;

public class AccionesCarro implements AccionesVehiculos {

  
    public void acelerar(int vel) {
        System.out.println("La velocidad del carro es de: " + vel);
    }

   
    public void frenado() {
        System.out.println("Frenando...");
    }

 
    public void direccion(String dir) {
        System.out.println("La dirección del carro es: " + dir);
    }

    
    public void estacionamiento() {
        System.out.println("Estacionando...");
    }
    
}
