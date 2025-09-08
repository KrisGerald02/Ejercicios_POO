package main;
import tile.Tile;
import tile.TileManager;
import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class GamePanel extends JPanel {
    private final int tileSize = GameConstants.getTileScale();
    private final int screenWidth = GameConstants.getTileScale() * GameConstants.getMaxCol();
    private final int screenHeight = GameConstants.getTileScale() * GameConstants.getMaxRow();
    private Table table;
    private MouseAdapter mouseAdapter;
    Player p1;
    Player p2;
    Player curr;

    public GamePanel() {
        this.setPreferredSize(new java.awt.Dimension(screenWidth, screenHeight));
        this.setBackground(java.awt.Color.black);
        this.table = new Table();
        this.mouseAdapter = new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                int mouseX = e.getX();
                int mouseY = e.getY();
                int cellSize = (GameConstants.getTileScale() * 8) / 3;
                int row = mouseY / cellSize;
                int col = mouseX / cellSize;
                if (row < 3 && col < 3 && table.getTiles()[row][col] == null && table.checkWinner() == null) {
                    table.addTile(row, col, curr.getSymbol());
                    switchPlayer();
                    repaint();
                }
            }
        };
        addMouseListener(mouseAdapter);
    }
    public int getscreenWidth() {
        return screenWidth;
    }
    public int getscreenHeight() {
        return screenHeight;
    }

    public void StartGame(Player player1, Player player2) {
        this.p1 = player1;
        this.p2 = player2;
        this.curr = player1;
        update();
    }
    public void update() {
        repaint();
    }
    public void switchPlayer(){
        if(curr == p1){
            curr = p2;
        }else if(curr == p2){
            curr = p1;
        }
    }

    public void paintComponent(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;
        super.paintComponent(g2);
        table.drawTable(g2);
        table.drawTile(g2);
        if(table.checkWinner() != null) {
            table.drawWinnerLine(g2);
        }
    }
}