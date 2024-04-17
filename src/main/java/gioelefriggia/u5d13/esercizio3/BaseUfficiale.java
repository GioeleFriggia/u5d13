package gioelefriggia.u5d13.esercizio3;

import lombok.Getter;
import lombok.Setter;

// Classe base per gli ufficiali militari
public abstract class BaseUfficiale implements Ufficiale {
    @Setter
    private Ufficiale responsabile;
    @Getter
    private String nome;
    @Getter
    @Setter
    private double stipendio;

    public BaseUfficiale(String nome, double stipendio) {
        this.nome = nome;
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
