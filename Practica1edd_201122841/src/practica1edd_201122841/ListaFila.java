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
public class ListaFila {

    public NodoFila primero;

    public void IngresarFila(int fila) {
        //para ordenar mi matriz
        NodoFila ant, nuevo, recorre;
        nuevo = new NodoFila(fila);
        int salir = 0;
        recorre = primero;
        //si esta vacio entonces se crea el primer nodo
        if (vacio()) {
            primero = nuevo;
        } else {
            //sino el anterior es el primero 
            ant = recorre;
            while (recorre != null && salir == 0) {
                if (fila == recorre.Fila) {
                    salir = 4;
                    break;
                }
                if (fila > recorre.Fila) {
                    ant = recorre;
                    recorre = recorre.derecha;
                    if (recorre == null) {
                        salir = 1;
                    }
                } else if (primero != recorre) {
                    salir = 2;
                } else {
                    salir = 3;
                }
            }
            switch (salir) {
                case 1:
                    ant.derecha = nuevo;
                    nuevo.izquierda = ant;
                    break;

                case 2:
                    ant.derecha = nuevo;
                    nuevo.izquierda = ant;
                    recorre.izquierda = nuevo;
                    nuevo.derecha = recorre;
                    break;

                case 3:
                    recorre.izquierda = nuevo;
                    nuevo.derecha = recorre;
                    primero = nuevo;
                    break;

            }

        }
    }

    //public static string Recorrelista="";
//        public void recorrer()
//        {
//            String texto = "Digraph G { rankdir = LR;  node [shape = record,height = .1]; ";//llenar el archivo 
////            const string fic = "C:\\Imagenes\\dotFila.dot";
////            StreamWriter sw = new StreamWriter(fic);
////            sw.WriteLine(texto);
////            
//            if (primero == null) { return; }
//            NodoFila aux=primero;
//
//            int i=0;
//            while (aux!=null)
//            {
//                if (aux.derecha == null) {break; }
////                sw.WriteLine("node" + i + " [label ="+"\"" +" {|" + aux.Fila + "| }"+"\""+"]");
////                sw.WriteLine("node" + (i+1) + " [label =" + "\"" + " {|" + aux.siguiente.Fila + "| }" + "\"" + "]");
////
////                sw.WriteLine("node" + i + "->" + "node" + (i + 1));
////                sw.WriteLine("node" + (i+1) + "->" + "node" + i);
////                
//
////                Recorrelista += aux.Fila + " -> ";
////              
////                aux = aux.siguiente;
//                i++;
//                    
//            }
//            
//
////            sw.WriteLine("}");
////            sw.Close();
////            
//  }
    public void recorrer() {
        String texto = "Las filas son: ";//llenar el archivo 

        if (primero == null) {
            return;
        }
        NodoFila aux = primero;

        while (aux != null) {
            if (aux.derecha == null) {
                break;
            }
            texto = texto + aux.Fila + "->" ;
            aux = aux.derecha;
        }
        System.out.println(texto);

    }

    public boolean vacio() {
        //si es null retorna un true porque no hay nada en la lista
        if (primero == null) {
            return true;
        }
        //sino la lista no esta vacia
        return false;
    }
}
