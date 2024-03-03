
package api.modelo;

public class Moto extends Vehiculo {
    private String cilindraje;

    public Moto() {
    }

    public Moto(String cilindraje) {
        this.cilindraje = cilindraje;
    }

    public Moto(String cilindraje, String marca, String modelo, String placa, int velocidadMaxima) {
        super(marca, modelo, placa, velocidadMaxima);
        this.cilindraje = cilindraje;
    }

    public String getCilindraje() {
        return cilindraje;
    }

    public void setCilindraje(String cilindraje) {
        this.cilindraje = cilindraje;
    }
    
    
}
