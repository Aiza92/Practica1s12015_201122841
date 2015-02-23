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
   public class NodoFila
    {
        public NodoFila derecha;
        public NodoFila izquierda;
        public int Fila;
        public NodoMatriz inicioFila = null;
         

        public NodoFila()
        {
            this.derecha = this.izquierda = null;
        }

        public NodoFila(int num)
        {
            this.Fila = num;
            this.izquierda = this.derecha = null;
        }
    }

