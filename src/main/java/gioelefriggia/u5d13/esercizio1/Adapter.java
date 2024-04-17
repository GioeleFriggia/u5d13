package gioelefriggia.u5d13.esercizio1;

import java.util.Calendar;
import java.util.Date;

// Adapter
public class Adapter implements DataSource {
    private Info info;

    public Adapter(Info info) {
        this.info = info;
    }

    @Override
    public String getNomeCompleto() {
        return info.getNome() + " " + info.getCognome();
    }

    @Override
    public int getEta() {
        // Calcoliamo l'età dalla data di nascita
        Date dataDiNascita = info.getDataDiNascita();
        int eta = calcolaEta(dataDiNascita);
        return eta;
    }

    private int calcolaEta(Date dataDiNascita) {
        Calendar dataDiNascitaCal = Calendar.getInstance();
        dataDiNascitaCal.setTime(dataDiNascita);
        Calendar now = Calendar.getInstance();

        int eta = now.get(Calendar.YEAR) - dataDiNascitaCal.get(Calendar.YEAR);
        if (now.get(Calendar.DAY_OF_YEAR) < dataDiNascitaCal.get(Calendar.DAY_OF_YEAR)) {
            eta--;
        }

        return eta;
    }
}
