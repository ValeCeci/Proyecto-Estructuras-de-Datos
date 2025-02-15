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
        PilaPremio miPremio = new PilaPremio(10);
        
        Premio p1 = new Premio(2, "Suma 2 posiciones");
        Premio p2 = new Premio(8, "Suma 8 posiciones");
        Premio p3 = new Premio(0, "Posición actual");

        miPremio.pushPremio(p1);
        miPremio.pushPremio(p2);
        miPremio.pushPremio(p3);
        
        miPremio.imprimirPila();
        
        PilaCastigo miCastigo = new PilaCastigo(10);
        
        Castigo c1 = new Castigo(3, "Resta 3 posiciones");
        Castigo c2 = new Castigo(1, "Ir a la posición 1");
        Castigo c3 = new Castigo(5, "Resta 5 posiciones");

        miCastigo.push(c1);
        miCastigo.push(c2);
        miCastigo.push(c3);
        
        miCastigo.imprimirPila();
    }
    
}
