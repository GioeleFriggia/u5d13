package gioelefriggia.u5d13.esercizio3;

public class Colonnello extends BaseUfficiale {
    public Colonnello(String nome, double stipendio) {
        super(nome, stipendio);
    }

    @Override
    public void gestisciRichiesta(Richiesta richiesta) {
        if (richiesta.getLivello() <= 12) {
            System.out.println("Richiesta gestita dal Colonnello " + getNome());
        } else {
            inviaRichiestaAlResponsabile(richiesta);
        }
    }
}