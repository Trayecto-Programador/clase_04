/** 
 * Pedir dos números al usuario por teclado y decir que número es el mayor
 */
package actividad01;

import javax.swing.JOptionPane;


public class Actividad01 {

    
    public static void main(String[] args) {
        // 1 - Analisis
        
        //* Proposito: Encontrar el mayor numero
        //* PreCondiciones: Solicitar dos numeros por teclado
        
        
        // 2 - Estrategia de solucion
        /**
         * Pedir el ingreso de los dos valores x separado y almacenarlos.
         * Comparar los valores ingresados.
         * Determinar el mayor valor ingresado.
         */
        
        // 3 - Implementacion
        
        // Definir variables
        int valor1, valor2;
        
        // Asignar los datos de entrada en las variables
       valor1 = Integer.parseInt( JOptionPane.showInputDialog("Ingrese un valor numerico del tipo entero"));
       valor2 = Integer.parseInt( JOptionPane.showInputDialog("Ingrese un valor numerico del tipo entero"));
       
        //Proceso de resolucion
        if(valor1 > valor2){
            System.out.println("valor numerico mayor es: " + valor1);
        }
        if(valor2 > valor1){
            System.out.println("valor numerico mayor es: " + valor2);
        }

        
        
        // Datos de salida (4- Etapa Prueba )
        
        //Valor 1 = 100 Valor2= 50 <-------100---------->
        //Valor 1 = 100 Valor2= 500 <-------500---------->
    }
    
}
