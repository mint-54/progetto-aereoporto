package GUI;

import controller.Controller;
import javax.swing.*;
import java.awt.*;
import java.util.List;

public class FinestraVisualizzaVoli extends JFrame {
    public FinestraVisualizzaVoli() {
        setTitle("Visualizza Voli");
        setSize(500, 400);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);

        JTextArea areaTesto = new JTextArea();
        areaTesto.setEditable(false);

        List<String> voli = Controller.getVoli();
        if (voli.isEmpty()) {
            areaTesto.setText("Nessun volo disponibile.");
        } else {
            StringBuilder sb = new StringBuilder();
            for (String volo : voli) {
                sb.append(volo).append("\n");
            }
            areaTesto.setText(sb.toString());
        }

        JScrollPane scrollPane = new JScrollPane(areaTesto);
        add(scrollPane);
    }
}