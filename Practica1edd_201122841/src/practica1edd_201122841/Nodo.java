
package practica1edd_201122841;

/**
 *
 * @author Any
 */

public class Nodo {

   String Nombre,Imagen;
   boolean TipoAtaque, TipoPersonaje;
   int Ataque,Defensa;
   Nodo anterior, siguiente;
   
   public Nodo(){
      this.siguiente = null;
      this.anterior = null;
   }
    public Nodo(String Nombre, String Imagen, boolean TipoAtaque, boolean TipoPersonaje, int Ataque, int Defensa) {
        this.Nombre = Nombre;
        this.Imagen = Imagen;
        this.TipoAtaque = TipoAtaque;
        this.TipoPersonaje = TipoPersonaje;
        this.Ataque = Ataque;
        this.Defensa = Defensa;
        this.siguiente = null;
        this.anterior = null;
    }
   
   
}
