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
public class NodoColumna
    {
        public NodoColumna abajo;
        public NodoColumna arriba;
        public int Columna;
        public NodoMatriz inicioColumna = null;
         

        public NodoColumna()
        {
            this.abajo = this.arriba = null;
        }

        public NodoColumna(int num)
        {
            this.Columna = num;
            this.abajo = this.arriba = null;
        }  
}
