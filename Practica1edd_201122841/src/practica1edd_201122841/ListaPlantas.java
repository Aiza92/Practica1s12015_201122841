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
public class ListaPlantas {

    //nodo raiz planta    

    public Nodo r;

    public ListaPlantas() {
        this.r = null;
    }

    public void Insertar_LP(String Nombre, String Imagen, boolean TipoAtaque, int Ataque, int Defensa) {
        Nodo InsertarNuevo = new Nodo(Nombre, Imagen, TipoAtaque, Ataque, Defensa);

        if (r == null) {
            r = InsertarNuevo;
        } else {

            Nodo aux = r;
            while (aux.siguiente != null) {
                aux = aux.siguiente;
            }
            aux.siguiente = InsertarNuevo;
            InsertarNuevo.anterior = aux;
            aux = InsertarNuevo;
        }
    }

    public void LlenarPlanta() {
        Nodo aux = r;
        while (aux != null) {

            TABLERO.pila.addInicio(aux);
            aux = aux.siguiente;
        }
    }
}
