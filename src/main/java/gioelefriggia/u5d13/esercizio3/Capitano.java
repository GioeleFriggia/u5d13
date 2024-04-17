package gioelefriggia.u5d13.esercizio3;

public class Capitano extends BaseUfficiale {
    public Capitano(String nome, double stipendio) {
        super(nome, stipendio);
    }

    @Override
    public void gestisciRichiesta(Richiesta richiesta) {
        if (richiesta.getLivello() <= 6) {
            System.out.println("Richiesta gestita dal Capitano " + getNome());
        } else {
            inviaRichiestaAlResponsabile(richiesta);
        }
    }
}