package practica1edd_201122841;

/**
 *
 * @author Any
 */
public class Practica1edd_201122841 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       PRINCIPAL principal = new PRINCIPAL ();
       ListaNodo usuario=new ListaNodo();
       principal.show();
       boolean matar = true;
     //probando lista
       ListaNodo list = new ListaNodo(new Nodo("Ejemplo de nombre","Url", matar, 1, 100));
       System.out.println("inicio");
       list.Mostrar();
       list.addFinal(new Nodo("2","Url", matar ,1, 100));
       list.addFinal(new Nodo("3","Url", matar ,1, 100));
       list.addFinal(new Nodo("4","Url", matar ,1, 100));
       
           list.addInicio(new Nodo("0","Url", matar ,1, 100));
           System.out.println("Con datos");
           list.Mostrar();
           
           list.getPrimero();
           System.out.println("eliminnando");
           list.Mostrar();
   
           
           System.out.println("------------------------------------------------------------------------------");
           
      
           
           
           
    }
}
