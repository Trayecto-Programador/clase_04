/**
 * Escribir un programa que convierta un valor dado en grados Fahrenheit 
 * a grados Celsius.  
 * Recordar que la fórmula para la conversión es: C = (F-32)*5/9
 */
package actividad05;

import javax.swing.JOptionPane;


public class Actividad05 {

    public static void main(String[] args) {
        double valorFahrenheit, resultadoCentigrados;
        
        valorFahrenheit = Double.parseDouble(JOptionPane.showInputDialog("Ingrese una tempertura en Fahrenheit"));
        resultadoCentigrados = (valorFahrenheit - 32)*5/9;
        
        System.out.println("La conversion de fahrengeit: " + valorFahrenheit + " es equivalente a " + resultadoCentigrados + " grados centigrados");
    }
    
}
