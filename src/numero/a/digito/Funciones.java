/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package numero.a.digito;

/**
 *
 * @author alons
 */
public class Funciones {
    
    // número ingresado por teclado y me lo devuelva invertido.
    private int numero;

    public Funciones(int numero){
        this.numero = numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getInvertir() {
        int invertido = 0;
        int resto;

        while (numero > 0) {
            resto = numero % 10;
            invertido = invertido * 10 + resto;
            numero /= 10;
        }

        return invertido;
    }
}


