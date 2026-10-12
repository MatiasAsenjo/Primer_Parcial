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
            
            while(!scanner.hasNextInt()){
                System.out.println("Error: Ingrese un numero: ");
                scanner.next();
            }
             
            opcion = scanner.nextInt();
            
            switch (opcion) {
                case 1:
                    
                case 2:
                    
                case 3:
                
                case 4:
                
                case 5:
                
                case 6:
                
                case 7:
                    
                case 8:
                    
                default:
                   
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
