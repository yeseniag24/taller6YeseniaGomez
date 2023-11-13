package com.yeseniagomezbuitrago.dominioyg;

import java.util.List;

public abstract class Recurso {
    private boolean prestadoYesenia;
    private String nombreYesenia;

    public Recurso(String nombreYesenia) {
        this.nombreYesenia = nombreYesenia;
        this.prestadoYesenia = false;
    }

    public boolean isPrestadoYesenia() {
        return prestadoYesenia;
    }

    public void setPrestadoYesenia(boolean prestadoYesenia) {
        this.prestadoYesenia = prestadoYesenia;
    }

    public String getNombre() {
        return nombreYesenia;
    }


    @Override
    public String toString() {
        return "Recurso{" +
                "prestadoYesenia=" + prestadoYesenia +
                ", nombreYesenia='" + nombreYesenia + '\'' +
                '}';
    }
}

