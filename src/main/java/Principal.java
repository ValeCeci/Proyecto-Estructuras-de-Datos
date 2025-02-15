/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Vale Ceciliano
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        PilaPremio mipremio1 = new PilaPremio(10);
        
        Premio p1 = new Premio(2, "Suma dos posiciones");
        Premio p2 = new Premio(8, "Suma ocho posiciones");
        Premio p3 = new Premio(0, "Posición actual");

        mipremio1.pushPremio(p1);
        mipremio1.pushPremio(p2);
        mipremio1.pushPremio(p3);
        
        mipremio1.imprimirPila();
        
        //Prueba
    }
    
}
