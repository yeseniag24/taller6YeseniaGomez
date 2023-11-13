package com.yeseniagomezbuitrago.dominioyg;

public class LibroIlustrado extends Recurso {

    public LibroIlustrado(String nombreYesenia)
    { super(nombreYesenia);}


    @Override
    public String toString() {
        return "Libro Ilustrado: " + getNombre() +
                " -Prestado: " + isPrestadoYesenia();
    }
}



