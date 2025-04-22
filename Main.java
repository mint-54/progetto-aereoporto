import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {
        Amministratore almin = new Amministratore("1", "Megatron4000", "123stella");
        Utentegenerico utente = new Utentegenerico("2", "gattino8000", "meow", "meoooowww");

        LocalDateTime dataPartenza = LocalDateTime.of(2025, 4, 5, 17, 30);
        LocalDateTime dataArrivo = LocalDateTime.of(2025, 4, 5, 23, 00);

        VoloPartenza voloPartenza = new VoloPartenza("AB123", "Italy airlines", "Torre Eiffeil", 0, dataPartenza, StatoVolo.Programmato, 7, almin);
        VoloArrivo voloArrivo = new VoloArrivo("CD456", "Ryanair", "Germania", 0, StatoVolo.Decollato, utente);

        Prenotazione Prenotazione = utente.prenotaVolo(VoloPartenza, "69420", "16A");

        almin.cambiaGateVolo(voloPartenza, 4);
        almin.cambiaStatoPrenotazione("69420", StatoPrenotazione.Cancellato);
        almin.CambiaStatoVolo(voloPartenza, StatoVolo.Cancellato);
    }
}