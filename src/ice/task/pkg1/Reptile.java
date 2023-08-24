/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ice.task.pkg1;

import javax.swing.JOptionPane;

/**
 *
 * @author caleb
 */
public class Reptile extends Animal {
    private double bloodTemp;

    @Override
    public void input() {
        super.input();
        bloodTemp = Double.parseDouble(JOptionPane.showInputDialog("Enter blood temperature: "));
    }

    @Override
    public void output() {
        super.output();
        System.out.println("Blood temperature: " + bloodTemp);
    }
}
