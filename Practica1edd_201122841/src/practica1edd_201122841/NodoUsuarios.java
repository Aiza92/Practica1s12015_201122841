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
public class NodoUsuarios extends Nodo{
    int Cantidad;
    ListaNodo OtrosCampos;
    
    public NodoUsuarios(){
     
    }
  public NodoUsuarios(String Nombre, int Cantidad, ListaNodo OtrosCampos){
    this.Nombre=Nombre;
    this.Cantidad=Cantidad;
    this.OtrosCampos=OtrosCampos;
   
    }   
     public NodoUsuarios(String Nombre, int Cantidad){
    this.Nombre=Nombre;
    this.Cantidad=Cantidad;
   
    }   
    
    
}
