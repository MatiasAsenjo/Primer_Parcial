package primerparcial;

import java.util.Scanner;

/**
 *
 * @author Maaj
 */
public class Main {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        int opcion = 0;
        
        do {
            mostrarMenu();
            System.out.println("Seleccione una opcion: ");
            
            try {
                opcion = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                opcion = 0;
            }
            
            switch (opcion) {
                case 1:
                    System.out.println("opcion 1");
                    //Vehiculos.agregarVehiculos();
                    break;
                case 2:
                    System.out.println("opcion 2");
                    break;
                case 3:
                    System.out.println("opcion 3");
                    break;
                case 4:
                    System.out.println("opcion 4");
                    break;
                case 5:
                    System.out.println("opcion 5");
                    break;
                case 6:
                    System.out.println("opcion 6");
                    break;
                case 7:
                    System.out.println("opcion 7");
                    break;
                case 8:
                    System.out.println("\n===============================");
                    System.out.println("Ha salido del sistema exitosamente");
                    System.out.println("===============================\n");
                    break;
                    
                default:
                    System.out.println("\n===============================");
                    System.out.println("Opcion invalida. porfavor vuelva a ingresar una opcion: ");
                    System.out.println("===============================\n");
                    break;
            }
            
            
        } while (opcion != 8);
        
        scanner.close();
     
     
     
    }
    
    public static void mostrarMenu(){
            System.out.println("\n=== Menu del Sistema de Transporte Turíostico ===");
            System.out.println("1. Agregar vehículo");
            System.out.println("2. Mostrar todos los vehículos");
            System.out.println("3. Realizar servicios turísticos");
            System.out.println("4. Buscar vehículo por patente");
            System.out.println("5. Mostrar vehículos con capacidad mayor a un valor ingresado");
            System.out.println("6. Mostrar vehículos ordenados por año de fabricación descendente");
            System.out.println("7. Mostrar vehículos ordenados por capacidad de pasajeros descendente");
            System.out.println("8. Salir"); 
        };
}
