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

public class HiloCatalogo extends Thread{
    public HiloCatalogo(){
    
    }
    
    CATALOGO_PLANTAS catplanta=new CATALOGO_PLANTAS();
    
    CATALOGO_ZOMBIES catzombie=new CATALOGO_ZOMBIES();
public void run(){
    System.out.println("EJECUTANDO HILO CATALOGO");
    if (PRINCIPAL.Planta==true&& PRINCIPAL.Zombie==true) {
        catplanta.show();
        
    }
}
}
