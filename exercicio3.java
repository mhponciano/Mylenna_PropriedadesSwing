import java.awt.*;         
import javax.swing.*;     

public class exercicio3 extends JFrame {  // 

    public exercicio3() {
        // Título da janela
        super("Exemplo com JScrollPane");

        // Fecha o programa quando a janela for fechada
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        // Define o tamanho da janela
        setSize(300, 200);

        // Centraliza a janela na tela
        setLocationRelativeTo(null);

        // Texto que sera exibido 
        String textoGrande = "Java Swing é uma biblioteca para criar interfaces gráficas. "
                           + "Com ela, podemos fazer janelas, botões, menus e muito mais. "
                           + "Ela funciona em qualquer sistema operacional e é muito usada "
                           + "para criar programas com janela.";

        // Cria uma área de texto
        JTextArea areaTexto = new JTextArea(10, 30);
        areaTexto.setText(textoGrande);                       
        areaTexto.setBackground(Color.LIGHT_GRAY);              // Define a cor de fundo
        areaTexto.setFont(new Font("Arial", Font.PLAIN, 12));   // Define o tipo e tamanho da fonte

        areaTexto.setLineWrap(true);        
        areaTexto.setWrapStyleWord(true);   // Quebra a linha no final da palavra

        JScrollPane rolagem = new JScrollPane(areaTexto);
        add(rolagem);
        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new exercicio3());
    }
}
