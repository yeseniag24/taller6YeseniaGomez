package com.yeseniagomezbuitrago.aplicacionyg;
import com.yeseniagomezbuitrago.dominioyg.*;

public class BibliotecaApp {

    public static void main(String[] args) {

        Biblioteca bibliotecaPublica = new Biblioteca();

        Libro libro1 = new Libro("cien años de soledad");
        Libro libro2 = new Libro("el alquimista");
        Revista revista1 = new Revista("Educación Superior en América Latina");
        Revista revista2 = new Revista("People");
        Periodico periodico1 = new Periodico("El colombiano");
        Periodico periodico2 = new Periodico("El rionegrero");
        Tesis tesis1 = new Tesis("La mitología y su relación con la realidad en los pueblos originarios");
        Tesis tesis2 = new Tesis("Medio ambiente y desarrollo sostenible");
        LibroIlustrado libroilustrado1 = new LibroIlustrado("El regreso de Sherlock Holmes");
        LibroIlustrado libroilustrado2 = new LibroIlustrado("El cascanueces");

        bibliotecaPublica.agregarRecursoGomez(libro1);
        bibliotecaPublica.agregarRecursoGomez(libro2);
        bibliotecaPublica.agregarRecursoGomez(revista1);
        bibliotecaPublica.agregarRecursoGomez(revista2);
        bibliotecaPublica.agregarRecursoGomez(periodico1);
        bibliotecaPublica.agregarRecursoGomez(periodico2);
        bibliotecaPublica.agregarRecursoGomez(tesis1);
        bibliotecaPublica.agregarRecursoGomez(tesis2);
        bibliotecaPublica.agregarRecursoGomez(libroilustrado1);
        bibliotecaPublica.agregarRecursoGomez(libroilustrado2);

        bibliotecaPublica.prestarRecursoGomez((Prestable) libro1);
        bibliotecaPublica.prestarRecursoGomez((Prestable) libro2);
        bibliotecaPublica.prestarRecursoGomez((Prestable) revista1);
        bibliotecaPublica.prestarRecursoGomez((Prestable) revista2);
        bibliotecaPublica.prestarRecursoGomez((Prestable) periodico1);
        bibliotecaPublica.prestarRecursoGomez((Prestable) periodico2);

        bibliotecaPublica.listarPrestadosGomez();



        bibliotecaPublica.devolverRecursoGomez((Prestable)revista1);
        bibliotecaPublica.devolverRecursoGomez((Prestable)periodico2);
    }


}














