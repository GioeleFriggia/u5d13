package gioelefriggia.u5d13;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        // Creiamo un'istanza della classe Info
        Info info = new Info();
        info.setNome("Mario");
        info.setCognome("Rossi");
        info.setDataDiNascita(new Date(1990 - 1900, 5 - 1, 15)); // Mese -1 perché inizia da 0

        // Creiamo un'istanza dell'Adapter passando l'istanza di Info
        Adapter adapter = new Adapter(info);

        // Creiamo un'istanza della classe UserData
        UserData userData = new UserData();

        // Utilizziamo il metodo getData passando l'Adapter
        userData.getData(adapter);

        // Stampiamo i dati ottenuti
        System.out.println("Nome completo: " + userData.getNomeCompleto());
        System.out.println("Età: " + userData.getEta());
    }
}
