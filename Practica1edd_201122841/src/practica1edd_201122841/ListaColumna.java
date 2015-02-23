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
public class ListaColumna {

    public NodoColumna primero;

    public void IngresarColumna(int columna) {
        //para ordenar mi matriz
        NodoColumna ant, nuevo, recorre;
        nuevo = new NodoColumna(columna);
        int salir = 0;
        recorre = primero;
        //si esta vacio entonces se crea el primer nodo
        if (vacio()) {
            primero = nuevo;
        } else {
            //sino el anterior es el primero 
            ant = recorre;
            while (recorre != null && salir == 0) {
                if (columna == recorre.Columna) {
                    salir = 4;
                    break;
                }
                if (columna > recorre.Columna) {
                    ant = recorre;
                    recorre = recorre.abajo;
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
                    ant.abajo = nuevo;
                    nuevo.arriba = ant;
                    break;

                case 2:
                    ant.abajo = nuevo;
                    nuevo.arriba = ant;
                    recorre.arriba = nuevo;
                    nuevo.arriba = recorre;
                    break;

                case 3:
                    recorre.arriba = nuevo;
                    nuevo.abajo = recorre;
                    primero = nuevo;
                    break;

            }

        }
    }

        //public static string Recorrelista="";
     //   public void recorrer()
    // {
//            String texto = "Digraph G { rankdir = LR;  node [shape = record,height = .1]; ";//llenar el archivo 
//           // const string fic = "C:\\Imagenes\\dotFila.dot";
//            //StreamWriter sw = new StreamWriter(fic);
//          //  sw.WriteLine(texto);
//            
//            if (primero == null) { return; }
//            NodoFila aux=primero;
//
//            int i=0;
//            while (aux!=null)
//            {
//                if (aux.siguiente == null) {break; }
//                sw.WriteLine("node" + i + " [label ="+"\"" +" {|" + aux.Fila + "| }"+"\""+"]");
//                sw.WriteLine("node" + (i+1) + " [label =" + "\"" + " {|" + aux.siguiente.Fila + "| }" + "\"" + "]");
//
//                sw.WriteLine("node" + i + "->" + "node" + (i + 1));
//                sw.WriteLine("node" + (i+1) + "->" + "node" + i);
//                
//
//                Recorrelista += aux.Fila + " -> ";
//              
//                aux = aux.siguiente;
//                i++;
            //}
//            sw.WriteLine("}");
//            sw.Close();
//            
    // }
    public void recorrer() {
        String texto = "Las columnas son: ";//llenar el archivo 

        if (primero == null) {
            return;
        }
        NodoColumna aux = primero;

        while (aux != null) {
            if (aux.abajo == null) {
                break;
            }
            texto = texto + aux.Columna + "->" ;
            aux = aux.abajo;
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
