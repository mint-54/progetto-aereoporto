public class Utentegenerico extends Utente {
    String Nome;

    public Utentegenerico(String id, String Username, String Password, String Nome) {
        super(id, Username, Password);
        this.Nome = Nome;
    }

    public Prenotazione prenotaVolo(Volo volo, int TicketNumber, String postoAssegnato) {
        return new Prenotazione(this, TicketNumber, postoAssegnato);
    }

}

