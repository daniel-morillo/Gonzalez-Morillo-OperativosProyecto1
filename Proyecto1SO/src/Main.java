
import Interfaces.InterfazPrincipal;
import java.util.concurrent.Semaphore;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Daniel Morillo
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
         
        //Realmente aqui solo se arrancan las interfaces, sin embargo esto es para probar.
        Company CN = new Company(2,2,2,2,2,2,10,20,30,40,50,60,3000, 1, 1, 1, 1, 1, 2, 1, 2, 3, 2, 5, 5,5, 2, 4, 5,  10) ;
        PM PMCN = new PM(3000, CN,20);
        
        CN.StartWorking();
        PMCN.start();
        
    }
    
}
