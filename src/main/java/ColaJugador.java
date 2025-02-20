
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Vale Ceciliano
 */
public class ColaJugador {
    private Nodo frente;
    private Nodo ultimo;

    public ColaJugador() {
        frente = null;
        ultimo = null;
    }

    public Nodo getFrente() {
        return frente;
    }

    public void setFrente(Nodo frente) {
        this.frente = frente;
    }

    public Nodo getUltimo() {
        return ultimo;
    }

    public void setUltimo(Nodo ultimo) {
        this.ultimo = ultimo;
    }
    
    public void encolar(Jugador juador){
        //Creamos el nodo
        Nodo aux = new Nodo();
        aux.setJugador(juador);
        
        if (this.ultimo != null){ //no está vacía
            this.getUltimo().setSiguiente(aux);
        } else {
            //si está vacía
            this.setFrente(aux);
        }
        this.setUltimo(aux);
    }
    
    public void imprimir(){
        String info = "LISTA DE JUGADORES";
        if (this.frente == null){
            JOptionPane.showMessageDialog(null, "No hay jugadores registrados");
        } else {
            Nodo temp = this.frente;
            while (temp != null){
                info += "\n\nNombre: " + temp.getJugador().getNombre() + 
                        "\nPosición: " + temp.getJugador().getPosicion();
                temp = temp.getSiguiente();
            }
            JOptionPane.showMessageDialog(null, info);
        }
    }
}
