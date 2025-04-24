public class Prenotazione {
   private Utentegenerico utentegerico;
   private int TicketNumber;
   private String postoAssegnato;
   public static StatoPrenotazione statoPrenotazione;

   public Prenotazione(Utentegenerico utentegerico, int TicketNumber, String postoAssegnato) {
       if (Utentegenerico == null) {
           System.out.println("Utente non esistente.");
       }
       this.utentegerico = utentegerico;
       this.TicketNumber = TicketNumber;
       this.postoAssegnato = postoAssegnato;
       this.statoPrenotazione = StatoPrenotazione.InAttesa;
   }

   public void cambiaStatoPrenotazione(StatoPrenotazione nuovoStato, Utente chiamante) {
       if (!(chiamante instanceof Amministratore)) {
           System.out.println("Azione valida solo per Amministratore.");
       }
   }
}
