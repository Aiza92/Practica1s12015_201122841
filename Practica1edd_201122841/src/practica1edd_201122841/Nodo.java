
package practica1edd_201122841;

/**
 *
 * @author Any
 */

public class Nodo{

   String Nombre,Imagen,NombrePlantas,NombreZombie;
   boolean TipoAtaque;
   int Ataque,Defensa,CantidadPlantas,CantidadZombies;
   Nodo anterior, siguiente;
   
   public Nodo(){
      this.siguiente = null;
      this.anterior = null;
   }
    public Nodo(String Nombre, String Imagen, boolean TipoAtaque, int Ataque, int Defensa) {
        this.Nombre = Nombre;
        this.Imagen = Imagen;
        this.TipoAtaque = TipoAtaque;
        this.Ataque = Ataque;
        this.Defensa = Defensa;
        this.siguiente = null;
        this.anterior = null;
    }
   
   
}
