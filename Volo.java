import java.time.LocalDateTime;

public class Volo {
    String idvolo;
    String CompagniaAerea;
    String OrigineAereoporto;
    String DestinazioneAereoporto;
    double OrarioArrivo;
    double OrarioRitardo;
    LocalDateTime DataVolo;
    StatoVolo stato;

    public Volo(String id, String CompagniaAerea, String OrigineAereoporto, String DestinazioneAereoporto, double OrarioArrivo, double OrarioRitardo, LocalDateTime DataVolo, StatoVolo StatoVolo, Utente chiamante) {
        if (!(chiamante instanceof Amministratore)) {
            System.out.println("Azione disponibile solo per gli Amministratori.");
        } else {
            this.idvolo = id;
            this.CompagniaAerea = CompagniaAerea;
            this.OrigineAereoporto = OrigineAereoporto;
            this.DestinazioneAereoporto = DestinazioneAereoporto;
            this.OrarioArrivo = OrarioArrivo;
            this.OrarioRitardo = OrarioRitardo;
            this.DataVolo = DataVolo;
            this.stato = StatoVolo;
        }
    }

    void ModificaStato(StatoVolo nuovostato, Utente chiamante) {
        if (!(chiamante instanceof Amministratore)) {
            System.out.println("Azione disponibile solo per gli Amministratori.");
        }
        StatoVolo stato = nuovostato;
    }
}


