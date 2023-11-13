package com.yeseniagomezbuitrago.dominioyg;


public class Revista extends Recurso implements Prestable {

    public Revista(String nombreYesenia) {
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
        return "Revista: " + getNombre()+
                " - Prestado: " + isPrestadoYesenia();
    }
}



