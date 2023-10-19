/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calculocajacss;

import javax.swing.JOptionPane;

/**
 *
 * @author ander
 */
public class CalculoCajaCSS {

    public static void main(String[] args) {
        
        String input = JOptionPane.showInputDialog("Ingrese la cantidad de empleados:");
        int empleados = Integer.parseInt(input);

        double MontoTotal = 0.0;

        for (int j = 1; j <= empleados; j++) {
            String salarioInput = JOptionPane.showInputDialog("Ingrese el salario del empleado " + j + ":");
            double salario = Double.parseDouble(salarioInput);

            double SEM = salario * 0.0925;
            double IVM = salario * 0.0508;

            MontoTotal += SEM + IVM;
        }

        JOptionPane.showMessageDialog(null, "La empresa deberá abonar a la CCSS el monto de ₡" + MontoTotal + " por concepto de SEM y IVM");
}

}
