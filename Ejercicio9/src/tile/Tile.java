package tile;

import main.GamePanel;

import java.awt.*;

public class Tile {
    private Image image;
    private int tileSize;
    private String symbol;
    private int x, y;

    public Tile(Image image, int tileSize, String symbol) {
        this.image = image;
        this.tileSize = tileSize;
        this.symbol = symbol;
    }
    public Tile(Image image, int tileSize) {
        this.image = image;
        this.tileSize = tileSize;
        this.symbol = null;
    }
    public String getSymbol() {
        return symbol;
    }

    public void setPosition(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public int getX() {
        return x;
    }
    public int getY() {
        return y;
    }
    public Image getImage() {
        return image;
    }
    public void setImage(Image image) {
        this.image = image;
    }
    public int getTileSize() {
        return tileSize;
    }
}
