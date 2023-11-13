package com.yeseniagomezbuitrago.dominioyg;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    private List<Recurso> recursosYesenia = new ArrayList<>();
    public void agregarRecursoGomez(Recurso recurso) {
        recursosYesenia.add(recurso);
    }

    public boolean prestarRecursoGomez(Prestable prestable) {
        if (!prestable.prestarGomez()) {
            return prestable.prestarGomez();
        }
        return false;
    }


    public boolean devolverRecursoGomez(Prestable prestable) {
        if (prestable.prestarGomez()) {
            return prestable.devolverGomez();
        }
        return false;
    }



    public void listarPrestadosGomez() {
        System.out.println("Recursos prestados:");
        for (Recurso recurso : recursosYesenia) {
            if (recurso.isPrestadoYesenia()) {
                System.out.println(recurso);
            }
        }
    }


    @Override
    public String toString() {
        return "Biblioteca{" +
                "recursosYesenia=" + recursosYesenia +
                '}';
    }


}