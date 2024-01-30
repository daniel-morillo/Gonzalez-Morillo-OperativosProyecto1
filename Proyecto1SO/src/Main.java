
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
        
        
         
        Semaphore mutex = new Semaphore(1);
        
        //Realmente aqui solo se arrancan las interfaces, sin embargo esto es para probar.
        Company CN = new Company(2, 2, 2, 2, 2, 10, 20, 30, 20, 40, 3000, 1, 2, 3, 2, 1, 3, 2, 4, 5, 10, 5);
        Drive drive = CN.getDrive();
        Assembler ensamblador = new Assembler(1, 50, 3000, mutex, 2, drive, 1, 2, 6, 5, 1, 3);
        PM PMCN = new PM(3000, CN, mutex);
        
        CN.StartWorking();
        PMCN.start();
        ensamblador.start();
        
    }
    
}
