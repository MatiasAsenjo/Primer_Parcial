
package primerparcial;


public abstract class Vehiculo{
    
    private String patente;
    private String marca;
    private int capacidadPasajeros;
    private int anioFabricacion;

    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getCapacidadPasajeros() {
        return capacidadPasajeros;
    }

    public void setCapacidadPasajeros(int capacidadPasajeros) {
        this.capacidadPasajeros = capacidadPasajeros;
    }

    public int getAnioFabricacion() {
        return anioFabricacion;
    }

    public void setAnioFabricacion(int anioFabricacion) {
        this.anioFabricacion = anioFabricacion;
    }

    public Vehiculo(String patente, String marca, int capacidadPasajeros, int anioFabricacion) {
        this.patente = patente;
        this.marca = marca;
        this.capacidadPasajeros = capacidadPasajeros;
        this.anioFabricacion = anioFabricacion;
    }
    
    public abstract void realizarServicio();

    @Override
    public String toString() {
        return "\n-Patente: " + patente + 
               "\n-Marca: " + marca + 
                "\n-Capacidad de Pasajeros: " + capacidadPasajeros + 
                "\n-Año de Fabricacion: " + anioFabricacion; 
        
    }
    
    @Override
    public boolean equals(Object o){
        if (this == o)return true;
        if(o == null || getClass() != o.getClass()) return false;
        Vehiculo vehiculo = (Vehiculo) o;
        return this.patente.equalsIgnoreCase(vehiculo.patente);
    }
              
     
    
}
