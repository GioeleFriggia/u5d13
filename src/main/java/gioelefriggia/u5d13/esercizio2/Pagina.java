package gioelefriggia.u5d13.esercizio2;

// Implementazione concreta di Pagina
public class Pagina implements ElementoLibro {
    private int numeroPagine;

    public Pagina(int numeroPagine) {
        this.numeroPagine = numeroPagine;
    }

    @Override
    public int getNumeroPagine() {
        return numeroPagine;
    }

    @Override
    public void stampa() {
        System.out.println("Stampa della pagina.");
    }
}
