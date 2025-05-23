package controller;

import java.util.ArrayList;
import java.util.List;

public class Controller {

    private static List<String> listaVoli = new ArrayList<>();
    private static List<String> utenti = List.of("admin:admin", "utente:utente");

    public static boolean accesso(String utente, String password, String ruolo) {
        return utenti.contains(utente + ":" + password);
    }

    public static List<String> getVoli() {
        return new ArrayList<>(listaVoli);
    }

    static {
        listaVoli.add("AZ123 - ITA Airways - Roma - Gate: 1 - Data: 2025-06-01");
        listaVoli.add("LH456 - Lufthansa - Monaco - Gate: 2 - Data: 2025-06-02");
        listaVoli.add("AF789 - Air France - Parigi - Gate: 3 - Data: 2025-06-03");
        listaVoli.add("AB123 - Italy airlines - Torre Eiffeil - Gate: 7 - Data: 2025-06-04");
        listaVoli.add("CD456 - Ryanair - Germania - Gate: In Arrivo - Data: 2025-06-05");
    }
}