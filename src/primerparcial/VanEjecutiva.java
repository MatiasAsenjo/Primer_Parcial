package primerparcial;


public class VanEjecutiva extends Vehiculo{
    private boolean aireAcondicionado;

    public VanEjecutiva(boolean aireAcondicionado, String patente, String marca, int capacidadPasajeros, int anioFabricacion) {
        super(patente, marca, capacidadPasajeros, anioFabricacion);
        this.aireAcondicionado = aireAcondicionado;
    }
    
    public String tieneAire(boolean aireAcondicionado){
        if (aireAcondicionado) {
            return "Si";
        }else{
            return "No";
        }
    }

    @Override
    public String toString() {
        return "Van Ejecutiva: " + super.toString() + "\n-Aire acondicionado: " + tieneAire(aireAcondicionado) + "\n"; 
    }

    @Override
    public void realizarServicio() {
        System.out.println("La van ejecutiva con patente: " + getPatente() + " a iniciado su servicio"); 
    }
    
    
    
}
