import java.awt.*;
import javax.swing.*;
import javax.swing.border.Border;

public class exercicio4 extends JFrame {
    public exercicio4 () {
        super("Título da Janela");

        // Configura o fechamento da janela
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        // Centraliza a janela na tela
        setLocationRelativeTo(null);

        // Define o tamanho da janela
        setSize(300, 200);

        JPanel painel = new JPanel();

        // Define a cor de fundo do painel
        painel.setBackground(Color.CYAN);

        Border bordaComTitulo = BorderFactory.createTitledBorder("Meu Painel");
        painel.setBorder(bordaComTitulo); // aplica a borda no painel

        // cria um botão com texto
        JButton botao = new JButton("Clique aqui");

        // Adiciona o botão 
        painel.add(botao);

        add(painel);

        // Torna a janela visível
        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new exercicio4());
    }
}

