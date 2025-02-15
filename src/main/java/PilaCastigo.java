/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Vale Ceciliano
 */
public class PilaCastigo {
    private Castigo[] pilaCastigo;
    private int top; 
    private int maxSize;

    public PilaCastigo(int tamañoPila) {
        maxSize = tamañoPila; // inicializada con un tamaño
        pilaCastigo = new Castigo[maxSize];
        top = -1; //le pongo -1 porque la pila está vacía
    }
    
    public void pushPremio(Castigo castigo){
        if (top == (maxSize -1)){
            System.out.println("Error de desbordamiento. Pila llena");
        } else {
            //si la pila tiene campo entonces inserte ese elemento
            top =top + 1;
            pilaCastigo[top] = castigo; //insertar en el top de la pila
            //pila[++top] = elemento
        }
    }
    
    public Castigo pop(){
        if (top == -1){ //subdesbordamiento. pila vacia
            System.out.println("Error de subdespordamiento. Pila vacía");
            return null; //indicador que la pila está vacía
        } else{
            //si la pila tiene elementos, retorne el que está en la cima
            
            //MANERA 1
            Castigo temp = pilaCastigo[top]; //guardo en una variable temporal lo que está en la cima 
            top = top -1; //muevo la cima una posicion antes
            return temp; //retorno el elemento que saqué de la pila
            
            //MANERA 2
            // return pila[top--];
        }
    }
}
