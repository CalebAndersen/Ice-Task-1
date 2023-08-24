/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ice.task.pkg1;

/**
 *
 * @author caleb
 */
public class IceTask1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        Bird brd = new Bird();
        Reptile rept = new Reptile();

        System.out.println("Input values for the bird");
        brd.input();
        
        System.out.println("Input values for the reptile");
        rept.input();
        
        System.out.println("\nBird information:");
        brd.output();
        
        System.out.println("\nReptile information:");
        rept.output();
    }
}
