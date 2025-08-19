import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class exercicio7 {
    public static void main(String[] args) {
        // Cria a janela principal
        JFrame janela = new JFrame("exercício7");
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setLayout(new FlowLayout());

        // Lista de países 
        String[] listaPaises = {"Brasil", "Argentina", "Chile"};

        JComboBox<String> comboPaises = new JComboBox<>(listaPaises);
        comboPaises.setSelectedItem("Argentina");

        JLabel rotuloResultado = new JLabel("Selecionado: Argentina");

        // Listener atualiza o rótulo 
        comboPaises.addItemListener(new ItemListener() {
            public void itemStateChanged(ItemEvent evento) {
                if (evento.getStateChange() == ItemEvent.SELECTED) {
                    rotuloResultado.setText("Selecionado: " + evento.getItem());
                }
            }
        });

        janela.add(comboPaises);
        janela.add(rotuloResultado);

        janela.pack();
        janela.setVisible(true);
    }
}