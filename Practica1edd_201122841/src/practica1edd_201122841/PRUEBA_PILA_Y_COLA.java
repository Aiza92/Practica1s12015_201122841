/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica1edd_201122841;

/**
 *
 * @author Any
 */
public class PRUEBA_PILA_Y_COLA {
        public static void main(String[] args) {
            boolean matar = false;
            boolean zombie = false;
            ListaNodo cola = new ListaNodo();
            ListaNodo pila = new ListaNodo();
           
//            cola.addFinal(new Nodo("Ejemplo de nombre1","Url", matar, 1, 100));
//            cola.addFinal(new Nodo("Ejemplo de nombre2","Url", matar, 1, 100));
//            cola.addFinal(new Nodo("Ejemplo de nombre3","Url", matar, 1, 100));
//            cola.addFinal(new Nodo("Ejemplo de nombre4","Url", matar, 1, 100));
//            cola.addFinal(new Nodo("Ejemplo de nombre5","Url", matar, 1, 100));
//            System.out.println("cola");
//            cola.Mostrar();
//            
//            pila.addInicio(new Nodo("Ejemplo de nombre1","Url", matar, 1, 100));
//            pila.addInicio(new Nodo("Ejemplo de nombre2","Url", matar, 1, 100));
//            pila.addInicio(new Nodo("Ejemplo de nombre3","Url", matar, 1, 100));
//            pila.addInicio(new Nodo("Ejemplo de nombre4","Url", matar, 1, 100));
//            pila.addInicio(new Nodo("Ejemplo de nombre5","Url", matar, 1, 100));
//            System.out.println("pila");
//            pila.Mostrar();
            
            
            //ZOMBIES
            cola.getPrimero();
            System.out.println("cola");
            cola.Mostrar();
            //PLANTAS
            pila.getPrimero();
            System.out.println("pila");
            pila.Mostrar();
            
            
            
            
        }
    
}
