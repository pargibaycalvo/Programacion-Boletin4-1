
package boletin4_3;

import javax.swing.JOptionPane;

public class Boletin4_3 {

    public static void main(String[] args) {
      Circulo unCirculo = new Circulo(Double.parseDouble(JOptionPane.showInputDialog("Introduzca el Radio de la circunferencia:")));
        JOptionPane.showMessageDialog(null,"El area de la circunferencia es "+unCirculo.calcularArea()+" Y la longitud es "+unCirculo.calcularLonxitude());
        Circulo otroCirculo = new Circulo();
        otroCirculo.setRadio(Double.parseDouble(JOptionPane.showInputDialog("Radio del Circulo:")));
        JOptionPane.showMessageDialog(null,"El area de la circunferencia es "+otroCirculo.calcularArea()+" Y la longitud es "+otroCirculo.calcularLonxitude());
    }  
        
    
}
