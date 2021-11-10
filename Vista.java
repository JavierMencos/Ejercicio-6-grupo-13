import java.util.InputMismatchException;
import java.util.Scanner;
 
public class Vista {
 
    public static void main(String[] args) {
 
        Scanner sn = new Scanner(System.in);
        boolean salir = false;
        int opcion; //Guardaremos la opcion del usuario
 
        while (!salir) {
 
            System.out.println("1. Agregar Carrito");
            System.out.println("2. Probar funciones");
            System.out.println("3. Ver Carrito");
            System.out.println("4. Ordenar Articulos del carrito");
            System.out.println("5. Eliminar Articulo del carrito");
            System.out.println("6. Salir");
 
            try {
 
                System.out.println("Escribe una de las opciones");
                opcion = sn.nextInt();
 
                switch (opcion) {
                    case 1:
                        System.out.println("Agregar Carrito");
                        break;

                    case 2:
                        System.out.println("Probar funciones");
                        break;

                    case 3:
                        System.out.println("Ver Carrito");
                        break;

                    case 4:
                        System.out.println("Ordenar Articulos del carrito");
                        break;

                    case 5:
                        System.out.println("Eliminar Articulo del carrito");
                        break;

                    case 6:
                        salir = true;
                        break;

                    default:
                        System.out.println("Solo números entre 1 y 6");
                }
            } catch (InputMismatchException e) {
                System.out.println("Debes insertar un número");
                sn.next();
            }
        }
 
    }
 
}