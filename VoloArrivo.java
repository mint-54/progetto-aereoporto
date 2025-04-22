import java.time.LocalDateTime;

public class VoloArrivo extends Volo {
    String Destinazione;
        public VoloArrivo(String idvolo, String CompagniaAerea, String OrigineAereoporto, double OrarioRitardo, StatoVolo stato, Utente chiamante) {
            super(idvolo, CompagniaAerea, OrigineAereoporto, OrarioRitardo, stato, chiamante);
            this.Destinazione = "Napoli";
        }
    }
