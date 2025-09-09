package main;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        JFrame frame = new JFrame("Tic tac toe");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 400);
        frame.setResizable(false);
        CardLayout layout = new CardLayout();
        JPanel mainPanel = new JPanel(layout);
        Menu menu = new Menu();
        GamePanel gamePanel = new GamePanel();
        mainPanel.add(menu, "Menu");
        mainPanel.add(gamePanel, "Game");
        frame.add(mainPanel);
        frame.pack();
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
        menu.setStartAction(e -> {
            String player1Name = menu.getPlayer1Name();
            String player2Name = menu.getPlayer2Name();
            if (player1Name.isEmpty() || player2Name.isEmpty()) {
                JOptionPane.showMessageDialog(mainPanel, "¡Ingresa el nombre de ambos jugadores!");
            }else{
                Player player1 = new Player(player1Name, "X");
                Player player2 = new Player(player2Name, "O");
                layout.show(mainPanel, "Game");
                gamePanel.StartGame(player1, player2);
            }
        });
    }
}