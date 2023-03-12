/**
 * En un almacén se hace un 20% de descuento a los clientes cuya compra 
 * supere los S/.1000 ¿Cuál será la cantidad 
 * que pagara una persona por su compra?
 */
package actividad02;

import javax.swing.JOptionPane;


public class Actividad02 {

    public static void main(String[] args) {
// 1 - Analisis
        
        //* Proposito: Determinar el Importe total Abonar de una compra.
        //* PreCondiciones: Se realizará un descuento en base a 
        // un determinado monto alcanzado.
        
        
// 2 - Estrategia de solucion
        /** 
         * Solicitar el ingreso del importe de la compra
         * Comparar el importe de la compra y el monto descuento 
         * Calcular el importe de la compra con el descuento si alcanzo 
             o supero el importe descuento
         * 
         */
        
        
// 3 - Implementacion
        
        // Definir variables
       double importeCompra,montoDescuento, valorDescuento, importeAbonar ;
        
        // Asignar los datos de entrada en las variables
       importeCompra = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el importe de la compra"));
       montoDescuento = 1000;
       valorDescuento = 0.2;
       importeAbonar = 0;
       
        //Proceso de resolucion
       if(importeCompra > montoDescuento){
           importeAbonar = importeCompra - importeCompra * valorDescuento;
       }
       if(importeAbonar < montoDescuento){
           importeAbonar = importeCompra;
       }

        
        
// 4- Etapa Prueba 
System.out.println("El valor abonar es de: "+ importeAbonar);
//Prueba1 : 2000 <-------- 1600------>
        
//Prueba : 900 <-------- 900------>
    }
    
}
