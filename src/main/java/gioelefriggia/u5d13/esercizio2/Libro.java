package gioelefriggia.u5d13.esercizio2;

import java.util.List;

// Importa la classe Sezione
import gioelefriggia.u5d13.esercizio2.Sezione;

// Implementazione concreta di Libro
public class Libro {
    private List<String> autori;
    private double prezzo;
    private Sezione radice;

    public Libro(List<String> autori, double prezzo, Sezione radice) {
        this.autori = autori;
        this.prezzo = prezzo;
        this.radice = radice;
    }

    public int getNumeroPagine() {
        return radice.getNumeroPagine();
    }

    public double getPrezzo() {
        return prezzo;
    }

    public void stampa() {
        radice.stampa();
    }
}
