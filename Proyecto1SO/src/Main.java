
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
        Drive drive = new Drive(10,10,10,10,10);
        Semaphore mutex = new Semaphore(1);
        
        Developer guionistas = new Developer(3,0,20,2000,mutex,2,1,drive);
        Developer animadores = new Developer(1,2,40,2000,mutex,1,1,drive);
        Developer dobladores = new Developer(2,3,10,2000,mutex,3,1,drive);
        Developer escenarios = new Developer(2,1,35,2000,mutex,1,1,drive);
        Developer plotTwist = new Developer(2,4,34,2000,mutex,3,1,drive);
        Assembler ensamblador = new Assembler(1, 50, 2000, mutex, 2, drive, 1, 2, 6, 5, 1, 3);
        
        ensamblador.start();
        guionistas.start();
        animadores.start();
        dobladores.start();
        escenarios.start();
        plotTwist.start();
        
    }
    
}
