package GUI;

import javax.swing.*;
import java.awt.*;

public class PannelloAmministratore extends JFrame {
    public PannelloAmministratore(String nomeUtente) {
        setTitle("Area Amministratore");
        setSize(400, 200);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel pannello = new JPanel(new GridLayout(2, 1));

        JButton bottoneVisualizza = new JButton("Visualizza Voli");
        JButton bottoneEsci = new JButton("Esci");

        bottoneVisualizza.addActionListener(e -> new FinestraVisualizzaVoli().setVisible(true));
        bottoneEsci.addActionListener(e -> dispose());

        pannello.add(bottoneVisualizza);
        pannello.add(bottoneEsci);

        add(pannello);
    }
}


