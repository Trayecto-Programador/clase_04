/**
 * Se requiere determinar el sueldo semanal de un trabajador 
 * con base en las horas que trabaja y el pago por hora que recibe
 */
package actividad03;

import javax.swing.JOptionPane;


public class Actividad03 {

    
    public static void main(String[] args) {
       // 1 - Analisis
        
        //* Proposito: : Determinar Sueldo semanal. 
        //* PreCondiciones: no tiene.
        
        
// 2 - Estrategia de solucion
        /** 
         * Solicitar el ingreso total de horas semanales
         * Solicitar el valor hora.
         * Calcular Sueldo Semanal
         */
        
        
// 3 - Implementacion
        
        // Definir variables
       int totalHoras, valorHora, sueldoSemanal;
       
        
        // Asignar los datos de entrada en las variables
        totalHoras = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el total de horas Semanales"));
        valorHora = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el importe hora"));
       sueldoSemanal = 0;
       
        //Proceso de resolucion
      sueldoSemanal = totalHoras * valorHora;

        
        
// 4- Etapa Prueba 
/*Empleada domestica tarea generales, con retiro valor hora: 611,50
Prueba 1: 48 hs trabajada <---29376--->
Prueba 2: 24 hs trabajada <---14688--->
Prueba 3: 1 hs trabajada <---612--->*/
        System.out.println("El importe del sueldo semanal a cobrar es de: " +sueldoSemanal);

    }
    
}
