/**
 * 1)	La compañía de autobuses “La curva loca” 
 * requiere determinar el costo que tendrá el boleto de un viaje sencillo, 
 * esto basado en los kilómetros por recorrer y en el costo por kilómetro. 
 * Realice un programa que represente el algoritmo para tal fin.
 */
package practica_clase02;

import javax.swing.JOptionPane;


public class Practica_clase02 {

    
    public static void main(String[] args) {
        
        int kilometrosRecorridos, costoKilometro,valorAbonar;
        
        
        kilometrosRecorridos = Integer.parseInt(JOptionPane.showInputDialog("Ingrese los kilometros recorridos"));
        costoKilometro = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el valor x Kilometros"));
        
        valorAbonar = kilometrosRecorridos * costoKilometro;
        
        //Testeo no solicitada
        System.out.println("Importe Abonar: " + valorAbonar);
        
        
    }
    
}
