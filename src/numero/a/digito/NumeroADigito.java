/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package numero.a.digito;

import java.util.Scanner;

/**
 *
 * @author alons
 */
public class NumeroADigito {

    public static void main(String[] args) {
        int numero;

        Scanner leer = new Scanner(System.in);

        do {
            System.out.println("Ingrese su numero: ");
            try {
                numero = leer.nextInt();
                break;
            } catch (Exception e) {
                System.out.println("El valor ingresado no es un numero entero. Intente nuevamente.");
                leer.nextLine();
            }
        } while (true);

        Funciones operacion = new Funciones(numero);
        int separar = operacion.getInvertir();

        int opcion;
        do {
            System.out.println("SELECCIONE UNA OPCION");
            System.out.println("1. Iniciar programa");
            System.out.println("2. Cerrar menu");
            opcion = leer.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("El numero invertido es: " + separar);
                    break;
                    
                case 2:
                    System.out.println("Cerrando menu");
                    break;
                    
                default:
                    System.out.println("Opcion incorrecta");
                    break;
                    
            }
        } while (opcion != 2);
    }
}
