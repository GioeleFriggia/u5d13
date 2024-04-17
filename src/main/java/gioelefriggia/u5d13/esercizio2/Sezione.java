package gioelefriggia.u5d13.esercizio2;

import java.util.ArrayList;
import java.util.List;

// Implementazione concreta di Sezione
public class Sezione implements ElementoLibro {
    private List<ElementoLibro> elementi = new ArrayList<>();

    public void aggiungiElemento(ElementoLibro elemento) {
        elementi.add(elemento);
    }

    @Override
    public int getNumeroPagine() {
        int numeroPagine = 0;
        for (ElementoLibro elemento : elementi) {
            numeroPagine += elemento.getNumeroPagine();
        }
        return numeroPagine;
    }

    @Override
    public void stampa() {
        for (ElementoLibro elemento : elementi) {
            elemento.stampa();
        }
    }
}
