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
public class Bird extends Animal {
    private int colour;
    
    @Override
    public void input() 
    {
        super.input();
        colour = Integer.parseInt(JOptionPane.showInputDialog("Enter the feather colour:\n1: Grey\n2: White\n3: Black"));
    }
    
    @Override
    public void output() 
    {
        super.output();
        System.out.println("Feather colour: " + colour);
    }
}
