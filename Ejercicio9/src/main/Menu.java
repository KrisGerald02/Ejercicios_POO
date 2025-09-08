package main;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class Menu extends JPanel {
    private JLabel player1Label;
    private JLabel player2Label;
    private JLabel player1Image;
    private JLabel player2Image;
    private JTextField player1NameField;
    private JTextField player2NameField;
    private JButton startButton;

    public Menu() {
        setPreferredSize(new Dimension(384, 384));
        setBackground(Color.black);
        setLayout(null);

        Font pixelFont = new Font("Monospaced", Font.BOLD, 18);

        player1Image = new JLabel();
        player1Image.setBounds(60, 20, 128, 128);
        player1Image.setOpaque(true);
        player1Image.setBackground(Color.darkGray);
        add(player1Image);

        player1Label = new JLabel("Jugador 1", SwingConstants.CENTER);
        player1Label.setBounds(60, 150, 128, 20);
        player1Label.setForeground(Color.white);
        player1Label.setFont(pixelFont);
        add(player1Label);

        player1NameField = new JTextField();
        player1NameField.setBounds(60, 180, 128, 25);
        player1NameField.setFont(pixelFont);
        add(player1NameField);

        player2Image = new JLabel();
        player2Image.setBounds(200, 20, 128, 128);
        player2Image.setOpaque(true);
        player2Image.setBackground(Color.darkGray);
        add(player2Image);

        player2Label = new JLabel("Jugador 2", SwingConstants.CENTER);
        player2Label.setBounds(200, 150, 128, 20);
        player2Label.setForeground(Color.white);
        player2Label.setFont(pixelFont);
        add(player2Label);

        player2NameField = new JTextField();
        player2NameField.setBounds(200, 180, 128, 25);
        player2NameField.setFont(pixelFont);
        add(player2NameField);

        startButton = new JButton("START");
        startButton.setBounds(142, 250, 100, 40);
        startButton.setFont(pixelFont);
        add(startButton);

        repaint();
    }

    public String getPlayer1Name() {
        return player1NameField.getText();
    }

    public String getPlayer2Name() {
        return player2NameField.getText();
    }

    public JButton getStartButton() {
        return startButton;
    }

    public JLabel getPlayer1Image() {
        return player1Image;
    }

    public JLabel getPlayer2Image() {
        return player2Image;
    }

    @Override
    public void paintComponents(Graphics g) {
        super.paintComponents(g);
    }
    public void setStartAction(ActionListener action) {
        startButton.addActionListener(action);
    }
}
