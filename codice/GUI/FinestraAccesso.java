package GUI;

import controller.Controller;
import javax.swing.*;
import java.awt.*;

public class FinestraAccesso extends JFrame {
    private JTextField campoUtente;
    private JPasswordField campoPassword;
    private JComboBox<String> casellaRuolo;

    public FinestraAccesso() {
        setTitle("Accesso Aeroporto");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel pannello = new JPanel();
        pannello.setLayout(new GridLayout(4, 2));

        pannello.add(new JLabel("Nome utente:"));
        campoUtente = new JTextField();
        pannello.add(campoUtente);

        pannello.add(new JLabel("Password:"));
        campoPassword = new JPasswordField();
        pannello.add(campoPassword);

        pannello.add(new JLabel("Ruolo:"));
        casellaRuolo = new JComboBox<>(new String[]{"Amministratore", "Utente"});
        pannello.add(casellaRuolo);

        JButton pulsanteAccesso = new JButton("Accedi");
        pannello.add(pulsanteAccesso);

        pulsanteAccesso.addActionListener(e -> {
            String utente = campoUtente.getText();
            String password = new String(campoPassword.getPassword());
            String ruolo = (String) casellaRuolo.getSelectedItem();

            if (Controller.accesso(utente, password, ruolo)) {
                if (ruolo.equals("Amministratore")) {
                    new PannelloAmministratore(utente).setVisible(true);
                } else {
                    new PannelloUtente(utente).setVisible(true);
                }
                dispose();
            } else {
                JOptionPane.showMessageDialog(FinestraAccesso.this, "Credenziali non valide", "Errore", JOptionPane.ERROR_MESSAGE);
            }
        });

        add(pannello);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new FinestraAccesso().setVisible(true));
    }
}


