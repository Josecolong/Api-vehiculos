
package api.modelo;

public class Carro extends Vehiculo {
    private String traccion;

    public Carro() {
    }

    public Carro(String traccion) {
        this.traccion = traccion;
    }

    public Carro(String traccion, String marca, String modelo, String placa, int velocidadMaxima) {
        super(marca, modelo, placa, velocidadMaxima);
        this.traccion = traccion;
    }

    public String getTraccion() {
        return traccion;
    }

    public void setTraccion(String traccion) {
        this.traccion = traccion;
    }
    
    
}
