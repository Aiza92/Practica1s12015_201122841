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
public class NodoMatriz {

    //columnas

    public NodoMatriz arriba;
    public NodoMatriz abajo;
    //filas
    public NodoMatriz derecha;
    public NodoMatriz izquierda;
    public int x, y;

    public NodoColumna ncolumna;
    public NodoFila nfila;
    public Nodo Zombie, Planta;

    public NodoMatriz primero;

    public NodoMatriz() {
        arriba = abajo = derecha = izquierda = null;
        ncolumna = null;
        nfila = null;
        Zombie=Planta=null;
          //  impactos = null;

    }

    public NodoMatriz(int x, int y) {

        this.x = x;
        this.y = y;
        arriba = abajo = derecha = izquierda = null;
        Zombie=Planta=null;
        ncolumna = null;
        nfila = null;

    }

}
