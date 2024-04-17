package gioelefriggia.u5d13.esercizio3;

public class Generale extends BaseUfficiale {
    public Generale(String nome, double stipendio) {
        super(nome, stipendio);
    }

    @Override
    public void gestisciRichiesta(Richiesta richiesta) {
        System.out.println("Richiesta gestita dal Generale " + getNome());
    }
}