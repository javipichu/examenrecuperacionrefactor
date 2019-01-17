/*
 * Examen Refactorizacion
 * 
 */

import javax.swing.JOptionPane;

public class LoVivido {

    public static void main(String[] args) {
        String n;
        String e;

        int mas;
        int das;
        int has;
        int aas;

        n = JOptionPane.showInputDialog("Escriba su nombre: ");
        e = JOptionPane.showInputDialog("Escriba su edad: ");

        aas = Integer.parseInt(e);

        mas = (aas * 12);
        das = (aas * 365);
        has = (das * 24);

        JOptionPane.showMessageDialog(null, "Meses: " + mas, "Numero de meses vividos de " + n, JOptionPane.INFORMATION_MESSAGE);

        JOptionPane.showMessageDialog(null, "Días: " + das, "Numero de días vividos de " + n, JOptionPane.INFORMATION_MESSAGE);

        JOptionPane.showMessageDialog(null, "Horas: " + has, "Numero de horas vividos de " + n, JOptionPane.INFORMATION_MESSAGE);

        System.exit(0);

    }

}
