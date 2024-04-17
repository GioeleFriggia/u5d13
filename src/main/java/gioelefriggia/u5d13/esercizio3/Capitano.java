package gioelefriggia.u5d13.esercizio3;

public class Capitano extends BaseUfficiale {
    public Capitano(String nome, double stipendio) {
        super(nome, stipendio);
    }

    @Override
    public void gestisciRichiesta(Richiesta richiesta) {
        if (richiesta.getImporto() <= getStipendio()) {
            System.out.println(getNome() + " può gestire la richiesta di $" + richiesta.getImporto());
        } else {
            inviaRichiestaAlResponsabile(richiesta);
        }
    }
}
