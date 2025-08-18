import java.awt.*;
import javax.swing.*;

public class exercicio2 extends JFrame {

    public exercicio2() {
        super("Painel com Guias (TabbedPane)");

        // Configuração da janela principal
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(400, 300);
        setLocationRelativeTo(null); // Centraliza a janela na tela

        // Criação do componente com abas
        JTabbedPane painelComAbas = new JTabbedPane();

        
        JPanel abaConfiguracoes = new JPanel();
        abaConfiguracoes.add(new JLabel("Bem-vindo às Configurações!"));

        painelComAbas.addTab("Configurações", abaConfiguracoes);

        // Carrega o ícone da imagem 
        ImageIcon iconeOriginal = new ImageIcon(getClass().getResource("./img/img.png"));

        // Redimensiona a imagem para caber bem na aba
        Image imagemRedimensionada = iconeOriginal.getImage().getScaledInstance(16, 16, Image.SCALE_SMOOTH);
        ImageIcon iconeAjustado = new ImageIcon(imagemRedimensionada);

        JPanel abaPerfil = new JPanel();
        abaPerfil.setBackground(Color.BLUE);

        JTextField campoNome = new JTextField("Digite um nome", 15);
        abaPerfil.add(campoNome);

        painelComAbas.addTab("Perfil", iconeAjustado, abaPerfil);

        JPanel abaAjuda = new JPanel(new BorderLayout());

        JTextArea areaTextoAjuda = new JTextArea("Digite suas dúvidas aqui.", 8, 20);
        JScrollPane scrollAjuda = new JScrollPane(areaTextoAjuda); // Adiciona rolagem

        abaAjuda.add(scrollAjuda, BorderLayout.CENTER);

        painelComAbas.addTab("Ajuda", abaAjuda);

        // Adiciona o painel de abas à janela principal
        add(painelComAbas);

        setVisible(true); // Exibe a janela
    }

    public static void main(String[] args) {
       
        SwingUtilities.invokeLater(() -> new exercicio2());
    }
}
