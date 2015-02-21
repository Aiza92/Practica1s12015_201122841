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
public class probar {
        public static void main(String[] args) {
            boolean matar = false;
            boolean zombie = false;
            ListaNodo cola = new ListaNodo();
            ListaNodo pila = new ListaNodo();
            
            
            
            cola.addFinal(new Nodo("Ejemplo de nombre1","Url", matar,zombie, 1, 100));
            cola.addFinal(new Nodo("Ejemplo de nombre2","Url", matar,zombie, 1, 100));
            cola.addFinal(new Nodo("Ejemplo de nombre3","Url", matar,zombie, 1, 100));
            cola.addFinal(new Nodo("Ejemplo de nombre4","Url", matar,zombie, 1, 100));
            cola.addFinal(new Nodo("Ejemplo de nombre5","Url", matar,zombie, 1, 100));
            System.out.println("cola");
            cola.Mostrar();
            
            pila.addInicio(new Nodo("Ejemplo de nombre1","Url", matar,zombie, 1, 100));
            pila.addInicio(new Nodo("Ejemplo de nombre2","Url", matar,zombie, 1, 100));
            pila.addInicio(new Nodo("Ejemplo de nombre3","Url", matar,zombie, 1, 100));
            pila.addInicio(new Nodo("Ejemplo de nombre4","Url", matar,zombie, 1, 100));
            pila.addInicio(new Nodo("Ejemplo de nombre5","Url", matar,zombie, 1, 100));
            System.out.println("pila");
            
            pila.Mostrar();
            
            cola.getPrimero();
            pila.getPrimero();
            System.out.println("cola");
            
            cola.Mostrar();
            System.out.println("pila");
            
            pila.Mostrar();
            
            
            
            
        }
    
}
