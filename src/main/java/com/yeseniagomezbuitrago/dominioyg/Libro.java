package com.yeseniagomezbuitrago.dominioyg;

public class Libro extends Recurso implements Prestable {

    public Libro(String nombreYesenia){
        super(nombreYesenia);}

    @Override
    public boolean prestarGomez() {
        if (!isPrestadoYesenia()) {
            setPrestadoYesenia(true);
            return true;
        } else {return false;}
    }

    @Override
    public boolean devolverGomez() {
        if (isPrestadoYesenia()) {
            setPrestadoYesenia(false);
            return true;
        } else { return false;}
    }



    @Override
    public String toString() {
        return "Libro: " + getNombre() +
                " - Prestado: " + isPrestadoYesenia();
    }
     }



