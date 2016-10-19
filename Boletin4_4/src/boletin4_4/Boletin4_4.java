
package boletin4_4;

import javax.swing.JOptionPane;

public class Boletin4_4 {

    public static void main(String[] args) {
        Pulperia unPulpo = new Pulperia (Integer.parseInt(JOptionPane.showInputDialog("Introduzca los kg de pataca que teña")),Integer.parseInt(JOptionPane.showInputDialog("Introduzca los kg de pulpo que teña")));
        unPulpo.engadirPolbo(Integer.parseInt(JOptionPane.showInputDialog("Introduzca los kg de polbo que chegou no reparto")));
        unPulpo.engadirPatacas(Integer.parseInt(JOptionPane.showInputDialog("Introduzca los kg de pataca que chegou no reparto ")));
        unPulpo.amosarPatacas();
        unPulpo.amosarPolbo();
        unPulpo.clientes(unPulpo.getPataca(), unPulpo.getPulpo());
    }
    
}
