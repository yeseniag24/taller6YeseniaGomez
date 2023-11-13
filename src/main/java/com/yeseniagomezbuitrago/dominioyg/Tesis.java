package com.yeseniagomezbuitrago.dominioyg;


public class Tesis extends Recurso {

    public Tesis(String nombreYesenia){super(nombreYesenia);}

    @Override
    public String toString() {
        return "Tesis: " + getNombre() +
                " -Prestado: " + isPrestadoYesenia();
    }
}


