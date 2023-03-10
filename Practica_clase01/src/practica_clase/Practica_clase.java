/**
 1)	Pedir por consola tu nombre y tu edad 
 * y mostrar el siguiente mensaje:
 * “Te llamas ” <nombre> ” y tienes ” <años> ” años”
 */
package practica_clase;

import javax.swing.JOptionPane;


public class Practica_clase {

    
    public static void main(String[] args) {
        String nombre;
        int edad;
        
       nombre = JOptionPane.showInputDialog("Ingrese su Nombre:");
       edad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su edad:"));
    
        System.out.println("Te llamas " + nombre + " y tiene " + edad + " años");
    }
    
}
