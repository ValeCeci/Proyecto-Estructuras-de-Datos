/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Vale Ceciliano
 */
public class PilaPremio {
    
    private Premio[] pilaPremio;
    private int top; 
    private int maxSize;

    public PilaPremio(int tamañoPila) {
        maxSize = tamañoPila; // inicializada con un tamaño
        pilaPremio = new Premio[maxSize];
        top = -1; //le pongo -1 porque la pila está vacía
    }
    
    public void pushPremio(Premio premio){
        if (top == (maxSize -1)){
            System.out.println("Error de desbordamiento. Pila llena");
        } else {
            //si la pila tiene campo entonces inserte ese elemento
            top =top + 1;
            pilaPremio[top] = premio; //insertar en el top de la pila
            //pila[++top] = elemento
        }
    }
    
    public Premio pop(){
        if (top == -1){ //subdesbordamiento. pila vacia
            System.out.println("Error de subdespordamiento. Pila vacía");
            return null; //indicador que la pila está vacía
        } else{
            //si la pila tiene elementos, retorne el que está en la cima
            
            //MANERA 1
            Premio temp = pilaPremio[top]; //guardo en una variable temporal lo que está en la cima 
            top = top -1; //muevo la cima una posicion antes
            return temp; //retorno el elemento que saqué de la pila
            
            //MANERA 2
            // return pila[top--];
        }
    }
    
    public void imprimirPila(){
       if (top == -1){
           System.out.println("La pila está vacía");
       } else{
           Premio actual = pilaPremio[top]; //Creo una variable temporal y la igualo al top
           while (actual != null){
               System.out.println(actual.getDescripcion());
               actual = pilaPremio[top-1];
           }
       }
   }
}
