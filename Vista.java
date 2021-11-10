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
                        System.out.println("Que desea agregar?  \n1 Smartphone, \n2 telefono celular, \n3 telefono fijo, \n4 camara fotograficca, \n5 Computadora desktop, \n6 Computadora laptop, \n7 Smart TV, \n8 tablets, \n9 smart watch");
                        int opcion1 = sn.nextInt(); // 1 smartphone, 2 telefono celulatr, 3 telefono fijo, 4 camara fotograficca, 5 computado desktop, 6 Computadora lptop, 7 Smart TV, 8 tablets, 9 smart watch
                        if (opcion1 == 1){
                            System.out.println ("Se es agregando un Smartphone:  Samsung  de precio: 1322  creado el:  11/11/2021  con código AR: KJN544");
                        } else if (opcion1 == 2){
                            System.out.println ("Se es agregando un telefono celular:  Nokia  de precio: 300  creado el:  24/07/2021  con código AR: UAN089");
                        } else if (opcion1 == 3){
                            System.out.println ("Se es agregando un telefono fijo:  Nokia  de precio: 300  creado el:  24/07/2021  con código AR: UAN089");
                        } else if (opcion1 == 4){
                            System.out.println("Se es agregando un camara fotografica:  Canon  de precio: 8500  creado el:  29/07/2021  con código AR: JLH350"); 
                        } else if (opcion1 == 5){
                            System.out.println("Se es agregando un computador desktop:  Corsair  de precio: 12500  creado el:  30/09/2021  con código AR: NAS682"); 
                        } else if (opcion1 == 6){
                            System.out.println("Se es agregando un computador laptop:  Lenovo  de precio: 12000  creado el:  26/05/2021  con código AR: QJN368");
                        } else if (opcion1 == 7){
                            System.out.println("Se es agregando un smart tv:  LG  de precio: 4000  creado el:  29/09/2021  con código AR: OUD505"); 
                        } else if (opcion1 == 8){
                            System.out.println("Se es agregando un tablets:  Apple  de precio: 8000  creado el:  19/07/2021  con código AR: QUT570"); 
                        } else {
                            System.out.println("Se es agregando un smartwatch:  Samsung  de precio: 4000  creado el:  28/03/2021 con código AR: XCP352");
                        }
                        break;

                    case 2:
                        System.out.println("Que producto quiere probar? \n1 Smartphone, \n2 telefono celular, \n3 telefono fijo, \n4 camara fotograficca, \n5 Computadora desktop, \n6 Computadora laptop, \n7 Smart TV, \n8 tablets, \n9 smart watch");
                        System.out.println("");
                        int opcion2= sn.nextInt(); // 1 smartphone, 2 telefono celulatr, 3 telefono fijo, 4 camara fotograficca, 5 computado desktop, 6 Computadora lptop, 7 Smart TV, 8 tablets, 9 smart watch
                        if (opcion2 == 1){
                            System.out.println ("Esta llamando: true Esta tomando fotografias: true Esta navegando por Internete: true  Esta reproduciendeo videos: true");
                        } else if (opcion2 == 2){
                            System.out.println ("Esta llamando: true");
                        } else if (opcion2 == 3){
                            System.out.println ("Esta llamando: true");
                        } else if (opcion2 == 4){
                            System.out.println("Esta tomando fotos: true  Esta reproduciendo videos: true"); 
                        } else if (opcion2 == 5){
                            System.out.println("Esta navegando por Internet: true  Esta reproduciendo videos:  true  Esta ejecutando videojuegos: true"); 
                        } else if (opcion2 == 6){
                            System.out.println("Esta navegando por Internet: true  Esta reproduciendo videos:  true  Esta ejecutando videojuegos: true");
                        } else if (opcion2 == 7){
                            System.out.println("Esta navegando por Internet: true  Esta reproduciendo videos:  true"); 
                        } else if (opcion2 == 8){
                            System.out.println("Esta tomando fotografias: true Esta navegando por Internete: true  Esta reproduciendeo videos: true"); 
                        } else {
                            System.out.println("Esta tomando fotografias: true  Esta llamando: true");
                        }
                        break;

                    case 3:
                        System.out.println("Ver Carrito");
                        int opcion3 = sn.nextInt(); // 1 smartphone, 2 telefono celulatr, 3 telefono fijo, 4 camara fotograficca, 5 computado desktop, 6 Computadora lptop, 7 Smart TV, 8 tablets, 9 smart watch
                        if (opcion3 == 1){
                            System.out.println ("Hay un Smartphone:  Samsung  de precio: 1322  creado el:  11/11/2021  con código AR: KJN544");
                        } else if (opcion3 == 2){
                            System.out.println ("Hay un telefono celular:  Nokia  de precio: 300  creado el:  24/07/2021  con código AR: UAN089");
                        } else if (opcion3 == 3){
                            System.out.println ("Hayun telefono fijo:  Nokia  de precio: 300  creado el:  24/07/2021  con código AR: UAN089");
                        } else if (opcion3 == 4){
                            System.out.println("Hay un camara fotografica:  Canon  de precio: 8500  creado el:  29/07/2021  con código AR: JLH350"); 
                        } else if (opcion3 == 5){
                            System.out.println("Hay un computador desktop:  Corsair  de precio: 12500  creado el:  30/09/2021  con código AR: NAS682"); 
                        } else if (opcion3 == 6){
                            System.out.println("Hay un computador laptop:  Lenovo  de precio: 12000  creado el:  26/05/2021  con código AR: QJN368");
                        } else if (opcion3 == 7){
                            System.out.println("Hay un smart tv:  LG  de precio: 4000  creado el:  29/09/2021  con código AR: OUD505"); 
                        } else if (opcion3 == 8){
                            System.out.println("Hay un tablets:  Apple  de precio: 8000  creado el:  19/07/2021  con código AR: QUT570"); 
                        } else {
                            System.out.println("Hay un smartwatch:  Samsung  de precio: 4000  creado el:  28/03/2021 con código AR: XCP352");
                        } 
                        break;

                    case 4:
                        System.out.println("Ordenar Articulos del carrito");
                        System.out.println("**********Carrito de Pruba********* \nOrdenar por precios \nSmartphones,1322,Samsung,11/11/2021,KJN544 \nTelefonoFijo,200,Nokia,19/08/2021,AIU680\nTelefonoFijo,100,Sony,09/09/2021,NKA328");
                        break;

                    case 5:
                        System.out.println("Eliminar Articulo del carrito");
                        System.out.println("Eliminando carrito: true");
                        System.out.println("{null, null, null, null, null, null}");
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