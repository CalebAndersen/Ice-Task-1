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
public class Animal {
    protected int IDtag;
    protected String species;

    public void input() 
    {
        IDtag = Integer.parseInt(JOptionPane.showInputDialog("Enter IDtag"));
        species = JOptionPane.showInputDialog("Enter the species");
    }
        
    public void output() 
    {
        System.out.println("IDtag: " + IDtag);
        System.out.println("Species: " + species);
    }
}
