import java.awt.*;
import javax.swing.*;

public class exercicio1 extends JFrame {

    public exercicio1() {
        super("Exemplo de Painel com Botão");

        // Configurações básicas da janela
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(300, 200);
        setLocationRelativeTo(null); // Centraliza na tela

        // Criação do painel principal
        JPanel painelPrincipal = new JPanel();
        painelPrincipal.setBackground(Color.GREEN); // Cor de fundo verde
        painelPrincipal.setBorder(BorderFactory.createTitledBorder("Painel de Controle")); // Borda com título

        // Criação do botão
        JButton botaoClique = new JButton("Clique Aqui");
        botaoClique.setBackground(Color.YELLOW);

        botaoClique.addActionListener(e -> {
            JOptionPane.showMessageDialog(this, "Você clicou no botão!");
        });

        // Adiciona o botão ao painel
        painelPrincipal.add(botaoClique);

        // Adiciona o painel à janela
        add(painelPrincipal);

        // Torna a janela visível
        setVisible(true);
    }

    public static void main(String[] args) {
    
        SwingUtilities.invokeLater(() -> new exercicio1());
    }
}
