import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class exercicio5 {
    public static void main(String[] args) {
        // Cria a janela principal
        JFrame janela = new JFrame("exercício5");
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setLayout(new FlowLayout());

        // Painel 
        JPanel painelOpcoes = new JPanel(new GridLayout(0, 1));

        // Botões de opção
        JRadioButton opcaoMasculino = new JRadioButton("Masculino");
        JRadioButton opcaoFeminino  = new JRadioButton("Feminino");
        JRadioButton opcaoOutro     = new JRadioButton("Outro");

        // Agrupa os botões
        ButtonGroup grupoOpcoes = new ButtonGroup();
        grupoOpcoes.add(opcaoMasculino);
        grupoOpcoes.add(opcaoFeminino);
        grupoOpcoes.add(opcaoOutro);

        // Adiciona os botões 
        painelOpcoes.add(opcaoMasculino);
        painelOpcoes.add(opcaoFeminino);
        painelOpcoes.add(opcaoOutro);

        JButton botaoConfirmar = new JButton("Selecionar");

        JLabel rotuloResultado = new JLabel("Nenhuma opção selecionada");

        // botão
        botaoConfirmar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (opcaoMasculino.isSelected()) {
                    rotuloResultado.setText("Selecionado: Masculino");
                } else if (opcaoFeminino.isSelected()) {
                    rotuloResultado.setText("Selecionado: Feminino");
                } else if (opcaoOutro.isSelected()) {
                    rotuloResultado.setText("Selecionado: Outro");
                } else {
                    rotuloResultado.setText("Nenhuma opção escolhida");
                }
            }
        });

        // Adiciona tudo na janela
        janela.add(painelOpcoes);
        janela.add(botaoConfirmar);
        janela.add(rotuloResultado);

        janela.pack();
        janela.setVisible(true);
    }
}