import java.time.LocalDateTime;

public class VoloPartenza extends Volo {
    static int numeroGate;
    String Partenza;
    public VoloPartenza(String idvolo, String CompagniaAerea, String DestinazioneAereoporto, double OrarioRitardo, LocalDateTime DataVolo, StatoVolo stato, int numeroGate, Utente chiamante) {
        super(idvolo, DataVolo, CompagniaAerea, DestinazioneAereoporto, OrarioRitardo, stato, numeroGate, chiamante);
        this.Partenza = "Napoli";
        this.numeroGate = numeroGate;
    }
}
