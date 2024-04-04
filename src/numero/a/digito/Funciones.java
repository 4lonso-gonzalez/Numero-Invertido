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

    public int getInvertir(int numero, int invertido) {
        if (numero == 0) {
            return invertido;
        } else {
            int resto = numero % 10;
            invertido = invertido * 10 + resto;
            return getInvertir(numero / 10, invertido);
        }
    }
}


