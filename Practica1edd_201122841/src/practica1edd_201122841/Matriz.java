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
public class Matriz {

    ListaFila filas = new ListaFila();
    ListaColumna columnas = new ListaColumna();

    public Matriz() {
        ListaFila filas = new ListaFila();
        ListaColumna columnas = new ListaColumna();
    }

    public void AgregarFila(int fila) {
        filas.IngresarFila(fila);
    }

    public void AgregarColumna(int columna) {
        columnas.IngresarColumna(columna);
    }

    public void AgregarMatriz(int fila, int columna) {
        AgregarColumna(columna);
        AgregarFila(fila);
        int x = buscarfila(fila);
        int y = buscarcolumna(columna);
        NodoMatriz nuevo = new NodoMatriz(fila, columna);

        NodoFila NFB = retornaFila(fila);
        NodoColumna NCB = retornarColumna(columna);

        if (NFB == null || NCB == null) {
            return;
        }
        agregarencolumna(NCB, nuevo, fila);
        agregarenfila(NFB, nuevo, columna);

    }

    public NodoFila retornaFila(int fila) {
        NodoFila aux = new NodoFila();
        aux = filas.primero;
        int i = 1;
        while (aux != null) {
            if (aux.Fila == fila) {
                return aux;
            } else {
                i++;
                aux = aux.derecha;
            }
        }
        return null;
    }

    public int buscarfila(int fila) {
        NodoFila aux = new NodoFila();
        aux = filas.primero;//saber que putas
        int i = 1;
        while (aux != null) {
            if (aux.Fila == fila) {
                return i;
            } else {
                i++;
                aux = aux.derecha;
            }
        }
        return 0;
    }

    public NodoColumna retornarColumna(int columna) {
        NodoColumna aux = new NodoColumna();
        aux = columnas.primero;
        int i = 1;
        while (aux != null) {
            if (aux.Columna == columna) {
                return aux;
            } else {
                i++;
                aux = aux.abajo;
            }
        }
        return null;
    }

    public int buscarcolumna(int columna) {
        NodoColumna aux = new NodoColumna();
        aux = columnas.primero;//saber que putas
        int i = 1;
        while (aux != null) {
            if (aux.Columna == columna) {
                return i;
            } else {
                i++;
                aux = aux.abajo;
            }
        }
        return 0;

    }

    public void agregarenfila(NodoFila NF, NodoMatriz NM, int x) {
        if (NF.inicioFila == null) {
            NF.inicioFila = NM;
            NM.nfila = NF;
        } else {
            NodoMatriz aux = new NodoMatriz();
            aux = NF.inicioFila;

            while (aux != null) {

                //if (y<aux.y)
                if (x < aux.x) {
                    NM.derecha = aux;
                    aux.izquierda = NM;
                    aux.nfila = null;
                    NF.inicioFila = NM;
                    NM.nfila = NF;
                    return;

                } // else if (aux.derecha == null && y>aux.y)
                else if (aux.derecha == null && x > aux.x) //if (Cadena.comparar(y, aux.y) < 0)
                {
                    NM.izquierda = aux;
                    aux.derecha = NM;
                    return;
                } else if (x > aux.x && x < aux.derecha.x) //else if (y>aux.y && y<aux.derecha.y)
                {
                    NodoMatriz auxma = aux.derecha;
                    aux.derecha = NM;
                    auxma.izquierda = NM;
                    NM.derecha = auxma;
                    NM.izquierda = aux;
                    return;
                } else if (x == aux.x) {

                    return;
                } else {
                    aux = aux.derecha;
                }

            }
        }
    }

    public boolean fila = false;

    public void agregarencolumna(NodoColumna NC, NodoMatriz NM, int y) {
        if (NC.inicioColumna == null) {
            NC.inicioColumna = NM;
            NM.ncolumna = NC;
        } else {
            NodoMatriz aux = new NodoMatriz();
            aux = NC.inicioColumna;

            while (aux != null) {
                if (y < aux.y) {
                    NM.abajo = aux;
                    aux.arriba = NM;
                    aux.ncolumna = null;
                    NC.inicioColumna = NM;
                    NM.ncolumna = NC;
                    return;

                } else if (aux.abajo == null && y > aux.y) {
                    NM.arriba = aux;
                    aux.abajo = NM;
                    return;
                } else if (y > aux.y && y < aux.abajo.y) {
                    NodoMatriz auxma = aux.abajo;
                    aux.abajo = NM;
                    auxma.arriba = NM;
                    NM.abajo = auxma;
                    NM.arriba = aux;
                    return;
                } else if (y == aux.y) {
                    return;
                } else {
                    return;
                }
            }
            aux = aux.abajo;
        }
    }
    public void recorrer() {
        filas.recorrer();
        columnas.recorrer();

    }
}
