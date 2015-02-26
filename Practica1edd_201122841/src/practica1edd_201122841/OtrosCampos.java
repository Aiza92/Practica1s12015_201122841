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
public class OtrosCampos extends Nodo {
    //public String txt;
    public OtrosCampos siguiente;
    public OtrosCampos anterior;
    
    public OtrosCampos(String texto){
        Nombre = texto;
        this.siguiente = null;
    }
}
