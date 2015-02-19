
package practica1edd_201122841;

/**
 *
 * @author Any
 */
public class ZombiesPila {
      //Declaramos una variable tipo Lista
    private ListaNodo pila;
    
    //Contructor. Inicializacion de la lista
    public ZombiesPila(){
        pila = new ListaNodo();
    }
    
    //Funcion que inserta un elemento a la pila
    public void push(Object dato){
        pila.addInicio(dato);
    }
    
    //Funcion que elimina un elemento de la pila
    public Object pop(){
        Object Dato = pila.Mostrar()[0];
        pila.getPrimero();
        return Dato;
    }
}
