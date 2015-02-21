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
public class ListaNodo {

    Nodo primero, ultimo;

    public ListaNodo() {
        this.primero = null;
        this.ultimo = null;
    }

    public ListaNodo(Nodo nodo) {
        this.primero = nodo;
        this.ultimo = nodo;
    }

    public boolean empty() {
        if (primero == null) {
            return true;
        }
        return false;
    }

    public void addFinal(Nodo nuevo) {
        if (empty()) {
            this.primero = nuevo;
            this.ultimo = nuevo;
        } else {
            this.ultimo.siguiente = nuevo;
            nuevo.anterior = ultimo;
            this.ultimo = nuevo;
        }
    }

    public void addInicio(Nodo nuevo) {
        if (empty()) {
            this.primero = nuevo;
            this.ultimo = nuevo;
        } else {
            this.primero.anterior = nuevo;
            nuevo.siguiente = primero;
            this.primero = nuevo;
        }
    }

    //devuelve el primero y lo elimina cola
    public Nodo getPrimero() {
        //esta vacia la lista?
        if (empty()) {
            return null;
            // solo hay un dato en la lista
        } else if (primero == ultimo) {
          
            primero = ultimo = null;
            return null;
        } else {
            //creando un nodo para retornar
            Nodo salida;
            salida = primero;
            primero = primero.siguiente;
            primero.anterior = null;
            salida.siguiente = null;
            salida.anterior = null;
            return salida;

        }
    }

    public Nodo getUltimo() {
        //esta vacia la lista?
        if (empty()) {
            return null;
        } else if(primero == ultimo){
            primero = ultimo = null;
            return null;
        }else {
            //creando un nodo para retornar
            Nodo salida;
            salida = ultimo;
            ultimo = ultimo.anterior;
            ultimo.siguiente = null;
            salida.anterior = null;
            salida.siguiente = null;
            return salida;

        }
    }

    public void Mostrar() {
        Nodo aux;
        aux = primero;
        while (aux != null) {
            System.out.println(aux.Nombre);
            aux = aux.siguiente;
        }

    }
//llevando control de los usuarios

    public int Contador() {
        int cantidadusuarios = 0;
        Nodo aux = primero;
        while (aux != null) {
            cantidadusuarios++;
            aux = aux.siguiente;
        }
        return cantidadusuarios;
    }
}
