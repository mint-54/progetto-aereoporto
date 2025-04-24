public class Amministratore extends Utente {

    public Amministratore(String id, String Username, String Password, String Nome) {
        super(id, Username, Password);
    }

    public void CambiaStatoVolo(Volo volo, StatoVolo nuovostato) {
        volo.stato = nuovostato;
    }

    public void cambiaGateVolo(VoloPartenza numeroGate, int nuovoGate) {
        VoloPartenza.numeroGate = nuovoGate;
    }

    public void cambiaStatoPrenotazione(Prenotazione TicketNumber, StatoPrenotazione nuovoStato) {
        Prenotazione.statoPrenotazione = nuovoStato;
    }
}

