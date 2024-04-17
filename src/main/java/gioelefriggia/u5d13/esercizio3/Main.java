package gioelefriggia.u5d13.esercizio3;

public class Main {
    public static void main(String[] args) {
        // Creazione degli ufficiali
        Ufficiale generale = new Generale("Generale Smith", 5000);
        Ufficiale colonnello = new Colonnello("Colonnello Johnson", 4000);
        Ufficiale maggiore = new Maggiore("Maggiore Brown", 3000);
        Ufficiale capitano = new Capitano("Capitano Davis", 2000);
        Ufficiale tenente = new Tenente("Tenente Wilson", 1000);

        // Definizione delle responsabilità gerarchiche
        tenente.setResponsabile(capitano);
        capitano.setResponsabile(maggiore);
        maggiore.setResponsabile(colonnello);
        colonnello.setResponsabile(generale);

        // Creazione di alcune richieste
        Richiesta richiesta1 = new Richiesta(300); // Importo della richiesta: $3500
        Richiesta richiesta2 = new Richiesta(4000); // Importo della richiesta: $10000

        // Gestione delle richieste
        tenente.gestisciRichiesta(richiesta1);
        System.out.println("--------");
        tenente.gestisciRichiesta(richiesta2);
    }
}
