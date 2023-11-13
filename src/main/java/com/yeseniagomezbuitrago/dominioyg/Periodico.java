package com.yeseniagomezbuitrago.dominioyg;

public class Periodico extends Recurso implements Prestable {
    public Periodico(String nombreYesenia)
    {super(nombreYesenia);}
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
        return "Periódico: " + getNombre() +
                " -Prestado: " + isPrestadoYesenia();
    }
}


