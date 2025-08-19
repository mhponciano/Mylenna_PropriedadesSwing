import javax.swing.*;
import java.awt.*;

public class exercicio6 {
    public static void main(String[] args) {
        // Cria a janela principal
        JFrame janela = new JFrame("exercício6");
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setSize(600, 400);

        // Painel da esquerda
        JPanel painelEsquerda = new JPanel();
        painelEsquerda.setBackground(Color.RED);
        painelEsquerda.add(new JLabel("Esquerda"));

        // Painel da direita
        JPanel painelDireita = new JPanel();
        painelDireita.setBackground(Color.BLUE);
        painelDireita.add(new JLabel("Direita"));

        // SplitPane para dividir a tela em duas partes
        JSplitPane divisor = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT, painelEsquerda, painelDireita);
        divisor.setDividerLocation(0.4); 
        // Adiciona o SplitPane à janela
        janela.add(divisor);

        janela.setVisible(true);
    }
}