package gioelefriggia.u5d13.esercizio2;

import java.util.ArrayList;
import java.util.List;

// Importa la classe Libro
import gioelefriggia.u5d13.esercizio2.Libro;
import gioelefriggia.u5d13.esercizio2.Pagina;
import gioelefriggia.u5d13.esercizio2.Sezione;


public class Main {
    public static void main(String[] args) {
        // Creazione di alcune pagine
        Pagina pagina1 = new Pagina(2);
        Pagina pagina2 = new Pagina(3);

        // Creazione di una sezione con due pagine e una pagina singola
        Sezione sezione1 = new Sezione();
        sezione1.aggiungiElemento(pagina1);
        sezione1.aggiungiElemento(pagina2);
        sezione1.aggiungiElemento(new Pagina(4));

        // Creazione di una seconda sezione con una pagina singola
        Sezione sezione2 = new Sezione();
        sezione2.aggiungiElemento(new Pagina(5));

        // Creazione del libro con gli autori, il prezzo e la radice dell'albero di composizione
        List<String> autori = new ArrayList<>();
        autori.add("Autore 1");
        autori.add("Autore 2");

        Sezione radice = new Sezione();
        radice.aggiungiElemento(sezione1);
        radice.aggiungiElemento(sezione2);

        Libro libro = new Libro(autori, 19.99, radice);

        // Stampa delle informazioni sul libro
        System.out.println("Numero totale di pagine: " + libro.getNumeroPagine());
        System.out.println("Autori: " + autori);
        System.out.println("Prezzo: $" + libro.getPrezzo());

        // Esempio di stampa del libro
        System.out.println("\nStampa del libro:");
        libro.stampa();
    }
}
