package primerparcial;


public class LanchaTuristica extends Vehiculo{
    private String tipoMotor;

    public LanchaTuristica(String tipoMotor, String patente, String marca, int capacidadPasajeros, int anioFabricacion) {
        super(patente, marca, capacidadPasajeros, anioFabricacion);
        this.tipoMotor = tipoMotor;
    }

    @Override
    public String toString() {
        return "Lancha: " + super.toString() + "\n-Tipo de Motor: " + tipoMotor; 
    }

    @Override
    public void realizarServicio() {
        System.out.println("La Lancha turistica con patente: " + getPatente() + " a iniciado su servicio");
    }
    
    
    
    
}
