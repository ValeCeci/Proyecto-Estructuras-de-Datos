
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author Vale Ceciliano
 */
public class Menu {

    ColaJugador cola = new ColaJugador();
    PilaCastigo miCastigo = new PilaCastigo(5);
    PilaPremio miPremio = new PilaPremio(5);
    int opcion = 0;
    String botones[] = {"Jugar", "Premios", "Castigos", "Ver jugadores", "Salir"};

    public void MostrarMenu() {
        do {
            opcion = JOptionPane.showOptionDialog(null, "Bienvenid@ \n\nEscoje una opción", "Menu Principal",
                    JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE, null, botones, botones[0]);
            switch (opcion) {
                case 0:
                    int cantJugadores = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de jugadores"));
                    if (cantJugadores <= 4) {
                        for (int i = 0; i < cantJugadores; i++) {
                            String jugador = JOptionPane.showInputDialog("Nombre del Jugador " + (i+1));
                            Jugador j = new Jugador(jugador, (i+1));
                            cola.encolar(j);
                        }
                    } else {
                        JOptionPane.showMessageDialog(null, "Cantidad Máxima de Jugadores: 4");
                    }
                    break;
                case 1:
                    Premio p1 = new Premio(2, "Suma 2 posiciones");
                    Premio p2 = new Premio(8, "Suma 8 posiciones");
                    Premio p3 = new Premio(0, "Posición actual");

                    miPremio.pushPremio(p1);
                    miPremio.pushPremio(p2);
                    miPremio.pushPremio(p3);
                    
                    System.out.println("LISTA DE PREMIOS");
                    miPremio.imprimirPila();
                    break;
                case 2:
                    Castigo c1 = new Castigo(3, "Resta 3 posiciones");
                    Castigo c2 = new Castigo(1, "Ir a la posición 1");
                    Castigo c3 = new Castigo(5, "Resta 5 posiciones");

                    miCastigo.push(c1);
                    miCastigo.push(c2);
                    miCastigo.push(c3);

                    System.out.println("LISTA DE CASTIGOS");
                    miCastigo.imprimirPila();
                    break;
                case 3:
                    cola.imprimir();
                    break;
                case 4:
                    System.exit(0);
            }
        } while (opcion != 4);
    }
}
