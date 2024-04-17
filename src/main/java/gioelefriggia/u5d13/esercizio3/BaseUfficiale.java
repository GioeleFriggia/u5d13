package gioelefriggia.u5d13.esercizio3;


// Classe base per gli ufficiali militari
public abstract class BaseUfficiale implements Ufficiale {
    private Ufficiale responsabile;
    private String nome;
    private double stipendio;

    public BaseUfficiale(String nome, double stipendio) {
        this.nome = nome;
        this.stipendio = stipendio;
    }

    public void setResponsabile(Ufficiale responsabile) {
        this.responsabile = responsabile;
    }

    public String getNome() {
        return nome;
    }

    public double getStipendio() {
        return stipendio;
    }

    public void setStipendio(double stipendio) {
        this.stipendio = stipendio;
    }

    // Metodo per gestire una richiesta
    protected void inviaRichiestaAlResponsabile(Richiesta richiesta) {
        if (responsabile != null) {
            responsabile.gestisciRichiesta(richiesta);
        } else {
            System.out.println("Nessun responsabile per l'ufficiale " + nome);
        }
    }

    // Metodo astratto per gestire una richiesta specifica dell'ufficiale
    public abstract void gestisciRichiesta(Richiesta richiesta);
}
