package primerparcial;

public class ColectivoTuristico extends Vehiculo{
    private int cantidadPisos;

    public ColectivoTuristico(int cantidadPisos, String patente, String marca, int capacidadPasajeros, int anioFabricacion) {
        super(patente, marca, capacidadPasajeros, anioFabricacion);
        this.cantidadPisos = cantidadPisos;
    }

    @Override
    public String toString() {
        return "Colectivo: " + super.toString() + "\n-Cantidad de Pisos: " + cantidadPisos; 
    
    }
    
    @Override
    public void realizarServicio(){
        System.out.println("El Colectivo con patente: " + getPatente() + " a iniciado su servicio");
    }
    
    
    
}
