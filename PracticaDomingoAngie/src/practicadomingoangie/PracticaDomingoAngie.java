
package practicadomingoangie;

import javax.swing.JOptionPane;


public class PracticaDomingoAngie {

    
    public static void main(String[] args) {
        String valor;
        int valor2;
       
        /*slucion :1 
        valor = JOptionPane.showInputDialog("Ingrese el numero 29");
        valor2 = Integer.parseInt(valor);
        */
        //solucion 2
        
        valor2 =Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero 29"));
        
        //prueba 1: 29 <----"29"---->
        //System.out.println(valor + 1);
        
        //prueba 2: "29" <----29--->
        System.out.println(valor2 + 1);
    }
    
}
