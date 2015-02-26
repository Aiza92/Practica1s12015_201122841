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
public class ListaZombies {
    //nodo raiz zombie  

    public Nodo r;

    public ListaZombies() {
        this.r = null;
    }

    public void Insertar_LZ(String Nombre, String Imagen, boolean TipoAtaque, int Ataque, int Defensa) {
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
    //recorriendo la lista de zombies
    public void recorrer(){
        Nodo aux = r;
        
        while(aux!=null){
            System.out.println(aux.Nombre);
            aux = aux.siguiente;
        }
    }

    public void LlenarZombie() {
        Nodo aux = r;
        while (aux != null) {

            TABLERO.cola.addInicio(aux);
            aux = aux.siguiente;
        }
    }
}
