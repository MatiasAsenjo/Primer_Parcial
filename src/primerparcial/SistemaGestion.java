package primerparcial;

import java.util.ArrayList;
import java.util.*;
import java.util.Scanner;


public class SistemaGestion {
    
    private ArrayList<Vehiculo> vehiculos;
    
    Scanner scanner = new Scanner(System.in);

    public SistemaGestion() {
        this.vehiculos = new ArrayList<>();
    }

    public ArrayList<Vehiculo> getVehiculos() {
        return vehiculos;
    }
    
    public void agregarVehiculo(){
        
        int tipo = 0;
        String patente;
        String marca;
        int pasajeros = 0;
        int anioFabricacion = 0;
        boolean tipoValido = false;
        boolean patenteValido = false;
        boolean pasajerosValido = false;
        boolean anioValido = false;
    
        
        do{
            System.out.println("=== Agregar vehiculo ===");
            System.out.println("\nTipo de Vehiculo:");
            System.out.println("1. Colectivo Turistico");
            System.out.println("2. Van ejecutiva");
            System.out.println("3. Lancha turistica");
            System.out.print("Seleccione un tipo de vehiculo: ");
        
            try {
                tipo = Integer.parseInt(scanner.nextLine());
            
                if (tipo >=1 && tipo <= 3){
                    tipoValido = true;
                }
                else{
                    System.out.println("opcion de vehiculo invalido");
                }
            } catch (NumberFormatException e) {
                System.out.println("Error: Debe ingresar un numero: ");
            }   
        }while(!tipoValido);
        
        
        do{
            System.out.println("=============================");
            System.out.println("Ingrese la patente: ");
            patente = scanner.nextLine().trim();
            if (patente.trim().isEmpty()) {
                System.out.println("Error: La patente no puede estar vacía.");
                continue;
            }else{
                boolean patenteDupicada = false;
                for (int i = 0; i < vehiculos.size(); i++){
                    if(vehiculos.get(i).getPatente().equalsIgnoreCase(patente)){
                        System.out.println("Error: la patente " + patente + " ya le pertenece a otro vehiculo");
                        patenteDupicada = true;
                        break;
                }
            }
            if (!patenteDupicada){
                patenteValido = true;
            }
            }
        }while(!patenteValido);
        
        do{
            System.out.println("=============================");
            System.out.println("Ingrese la marca: ");
            marca = scanner.nextLine().trim();
            
            if(marca.isEmpty()){
               System.out.println("Error: Marca esta vacia: ");
               continue;
            }else{
                break;
            }
        }while(true);
        
        do{
            System.out.println("=============================");
            System.out.println("Ingrese la cantidad de pasajeros: ");
            
            try {
                pasajeros = Integer.parseInt(scanner.nextLine());
                if (pasajeros <= 0) {
                System.out.println("Error: la catidad de pasajeros es 0 o menor. ingresar una cantidad superior: ");
            } else {
                pasajerosValido = true;
            }   
            } catch (NumberFormatException e) {
                System.out.println("Error: Debe ingresar un numero: ");
            }
            
        }while(!pasajerosValido);
        
        
        
        do{
            System.out.println("=============================");
            System.out.println("Ingrese el año de fabricacion del vehiculo: ");
            
            try {
                anioFabricacion = Integer.parseInt(scanner.nextLine());
                if (anioFabricacion >= 1990 && anioFabricacion <= 2026){
                    anioValido = true;
                }
                else{
                    System.out.println("Año invalido debe estar entre 1990 a 2026. Ingrese el año correcto: ");
                }
            } catch (NumberFormatException e) {
                System.out.println("Error: Debe ingresar un numero: ");
            }
            
            
        }while(!anioValido);
        
        switch (tipo) {
            case 1:
                System.out.println("=============================");
                System.out.println("Ingrese la cantidad de pisos (1 o 2): ");
                int cantPisos;
                do{
                    try{
                        cantPisos = Integer.parseInt(scanner.nextLine());
                        if (cantPisos != 1 && cantPisos != 2) {
                            System.out.println("Error: La cantidad de pisos debe ser 1 o 2:");
                        }else{
                            break;
                        }
                    }catch(NumberFormatException e){
                        System.out.println("Error: Ingreso un valor no numerico. Ingrese una opcion valida (1 o 2): ");
                        }
                }while(true);
                vehiculos.add(new ColectivoTuristico(cantPisos, patente, marca, pasajeros, anioFabricacion));
                break;
            case 2:
                boolean tieneAire = false;
                boolean aireValido = false;
                do{
                    System.out.println("=============================");
                    System.out.print("¿Tiene aire acondicionado? (S/N): ");
                    String respuesta = scanner.nextLine().trim().toUpperCase();
                    if (respuesta.equals("S")) {
                        tieneAire = true;
                        aireValido = true;
                    } else if (respuesta.equals("N")) {
                        tieneAire = false;
                        aireValido = true;
                    } else {
                        System.out.println("Error: Debe ingresar S o N.");
                    }
                }while(!aireValido);
                vehiculos.add(new VanEjecutiva(tieneAire, patente, marca, pasajeros, anioFabricacion));
                break;
            
            case 3:
                String tipoMotor = "";
                boolean motorValido = false;
                do{
                    System.out.println("=============================");
                    System.out.print("Ingrese el tipo de motor (NAFTA, DIESEL, ELECTRICO): ");
                    tipoMotor = scanner.nextLine().trim().toUpperCase();
                    if (tipoMotor.equals("NAFTA") || tipoMotor.equals("DIESEL") || tipoMotor.equals("ELECTRICO")) {
                        motorValido = true;
                    } else {
                        System.out.println("Error: Motor inválido. Ingrese NAFTA, DIESEL o ELECTRICO.");
                    }
                }while(!motorValido);
                vehiculos.add(new LanchaTuristica(tipoMotor, patente, marca, pasajeros, anioFabricacion));
                break;
    }
        
        System.out.println("Vehiculo agregado exitosamente");
        System.out.println("==============================\n");


    }
    
    public void mostrarVehiculos() {
        if (vehiculos.isEmpty()) {
            System.out.println("=========================");
            System.out.println("No hay vehiculos registrados.");
            System.out.println("=======================\n");
            return;
        }
        System.out.println("=== Los Vehiculos Registrados ====");
        for (int i = 0; i < vehiculos.size(); i++) {
            System.out.println(vehiculos.get(i).toString());
        }
        
        System.out.println("============================\n");
    }
    
    public void realizarServiciosTuristiccos(){
        if (vehiculos.isEmpty()){
            System.out.println("\n=========================");
            System.out.println("No hay vehiculos registrados.");
            System.out.println("\n=========================");
            return;
        }
        
        System.out.println("\n===  Iniciando Servicios de Vehiculos ===");
        
        for (int i = 0; i < vehiculos.size(); i++) {
            vehiculos.get(i).realizarServicio();
        
        }
        
        System.out.println("===========================\n");
    
    }
    
    public void busarVehiculoPatente(){
        
        if (vehiculos.isEmpty()){
            System.out.println("=======================");
            System.out.println("NO hay vehiculos registrados.");
            System.out.println("=======================\n");
            return;
        }
        
        boolean patenteEncontrada = false;
        
        System.out.println("\n=========================");
        System.out.println("Ingrese la patente a buscar: ");
        String patenteBuscar = scanner.nextLine().trim();
        
        for (int i = 0; i < vehiculos.size(); i++){
            if (vehiculos.get(i).getPatente().equalsIgnoreCase(patenteBuscar)){
                System.out.println("Vehiculo encontrado. la patente le pertenece al vehiculo: ");
                System.out.println(vehiculos.get(i).toString());
                patenteEncontrada = true;
                break;
            }    
        }
        
        if (!patenteEncontrada){
            System.out.println("No se encontro ningun vehiculo que la patente:" + patenteBuscar);
        }
        
        System.out.println("===============================\n");
    }
    
    public void vehiculoMayorCapacidad(){
        
        if (vehiculos.isEmpty()){
            System.out.println("=======================");
            System.out.println("NO hay vehiculos registrados.");
            System.out.println("=======================\n");
            return;
        }
        
        int capacidadMin = 0;
        boolean capacidadEncontrada = false;
        do{
            System.out.println("==================================");
            System.out.println("Ingrese el valor minimo de capacidad: ");
            try {
                capacidadMin =  Integer.parseInt(scanner.nextLine());
                if (capacidadMin <= 0){
                    System.out.println("Error: el valor ingresado debe ser mayor a 0: ");
                }else{
                    break;
                }
            }catch (NumberFormatException e) {
                System.out.println("Error: Debe de ingresar un numero.");
            }
        }while(true);
        
        System.out.println("=== Los vehiculos con capacidad maoyar a " + capacidadMin + " ===");
        for(int i = 0; i < vehiculos.size(); i ++){
            if (vehiculos.get(i).getCapacidadPasajeros() > capacidadMin){
                System.out.println(vehiculos.get(i).toString());
                capacidadEncontrada = true; 
            }
        }
        
        if (!capacidadEncontrada){
            System.out.println("No se encontro ningun vahiculo con capacidad mayor a la ingresada.");
        }
        
        System.out.println("========================================\n");
    }
    
    public void anioDescendente(){
        
        if (vehiculos.isEmpty()){
            System.out.println("=======================");
            System.out.println("NO hay vehiculos registrados.");
            System.out.println("=======================\n");
            return;
        }
        
        Collections.sort(vehiculos);
        
        System.out.println("=== Vehiculos Ordenados por Año Descendente ===");
        for(int i = 0; i < vehiculos.size(); i++){
            System.out.println(vehiculos.get(i).toString());
        }
        
        System.out.println("============================\n");
    }
    
    public void pasajerosDescendente(){
        
        if (vehiculos.isEmpty()){
            System.out.println("=======================");
            System.out.println("NO hay vehiculos registrados.");
            System.out.println("=======================\n");
            return;
        }
        
        
        Collections.sort(vehiculos, new Comparator<Vehiculo>(){
            @Override
            public int compare(Vehiculo primerVehiculo, Vehiculo segundoVehiculo){
                return Integer.compare(segundoVehiculo.getCapacidadPasajeros(), primerVehiculo.getCapacidadPasajeros());
            }
        });
        
        System.out.println("=== Vehiculos Ordenados por Capacidad de Pasajeros Descendente ===");
        for (int i = 0; i < vehiculos.size(); i++){
            System.out.println(vehiculos.get(i).toString());
        }
        
        System.out.println("============================");
    
    }
}

