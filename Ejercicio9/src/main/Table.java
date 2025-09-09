package main;

import tile.Tile;
import tile.TileManager;

import java.awt.*;

public class Table {
    private String[][] tilesSymbols;
    private TileManager tileManager;
    public Table() {
        tilesSymbols = new String[3][3];
        tileManager = new TileManager();
    }
    public String[][] getTiles() {
        return tilesSymbols;
    }
    public void addTile(int row, int col, String tile) {
        tilesSymbols[row][col] = tile;
    }
    public WinningLine checkWinner(){
        int xCount = 0;
        int oCount = 0;
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                if(tilesSymbols[i][j] != null && tilesSymbols[i][j].equals("X")){
                    xCount++;
                }else if(tilesSymbols[i][j] != null && tilesSymbols[i][j].equals("O")){
                    oCount++;
                }
            }
            if (xCount == 3 || oCount == 3) {
                return new WinningLine(WinningLine.Type.ROW, i, -1);
            }
            xCount = 0;
            oCount = 0;
        }
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                if(tilesSymbols[j][i] != null && tilesSymbols[j][i].equals("X")){
                    xCount++;
                }else if(tilesSymbols[j][i] != null && tilesSymbols[j][i].equals("O")){
                    oCount++;
                }
            }
            if (xCount == 3 || oCount == 3) {
                return new WinningLine(WinningLine.Type.COLUMN, i, -1);
            }
            xCount = 0;
            oCount = 0;
        }
        for(int i = 0; i < 3; i++){
            if(tilesSymbols[i][i] != null && tilesSymbols[i][i].equals("X")){
                xCount++;
            }else if(tilesSymbols[i][i] != null && tilesSymbols[i][i].equals("O")){
                oCount++;
            }
        }
        if (xCount == 3 || oCount == 3) {
            return new WinningLine(WinningLine.Type.DIAGONAL_MAIN, -1, 1);
        }
        xCount = 0;
        oCount = 0;
        for(int i = 0; i < 3; i++){
            if(tilesSymbols[i][2 - i] != null && tilesSymbols[i][2 - i].equals("X")){
                xCount++;
            }else if(tilesSymbols[i][2 - i] != null && tilesSymbols[i][2 - i].equals("O")){
                oCount++;
            }
        }
        if (xCount == 3 || oCount == 3) {
            return new WinningLine(WinningLine.Type.DIAGONAL_SECONDARY, -1, 2);
        }
        return null;
    }
    public void drawTable(Graphics2D g2){
        tileManager.getTiles()[0].setPosition(0,0);
        g2.drawImage(tileManager.getTiles()[0].getImage(), 0, 0,
                GameConstants.getTileScale() * 8, GameConstants.getTileScale() * 8, null);
    }
    public void drawTile(Graphics2D g2){
        int cellSize = (GameConstants.getTileScale() * 8) / 3;
        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 3; col++) {
                if (tilesSymbols[row][col] != null) {
                    int tileNum = tilesSymbols[row][col].equals("X") ? 1 : 2;
                    int x = col * cellSize;
                    int y = row * cellSize;

                    g2.drawImage(
                            tileManager.getTiles()[tileNum].getImage(),
                            x + 36, y + 36,
                            tileManager.getTiles()[tileNum].getTileSize(), tileManager.getTiles()[tileNum].getTileSize(),
                            null
                    );
                }
            }
        }
    }
    public void drawWinnerLine(Graphics2D g2) {
        WinningLine winningLine = checkWinner();
        if (winningLine == null) return;

        int cellSize = (GameConstants.getTileScale() * 8) / 3;

        switch (winningLine.getType()) {
            case ROW -> {
                int row = winningLine.getIndex();
                int y = row * cellSize + (cellSize / 2) + 36;
                g2.drawImage(
                        tileManager.getTiles()[3].getImage(),
                        0, y - 165,
                        cellSize * 3, cellSize * 2,
                        null
                );
            }
            case COLUMN -> {
                int col = winningLine.getIndex();
                int x = col * cellSize + (cellSize / 2) + 36;
                g2.drawImage(
                        tileManager.getTiles()[4].getImage(),
                        x - 165, 0,
                        cellSize * 2, cellSize * 3,
                        null
                );
            }
            case DIAGONAL_MAIN -> {
                g2.drawImage(
                        tileManager.getTiles()[5].getImage(),
                        0, 0,
                        cellSize * 3, cellSize * 3,
                        null
                );
            }
            case DIAGONAL_SECONDARY -> {
                g2.drawImage(
                        tileManager.getTiles()[6].getImage(),
                        0, 0,
                        cellSize * 3, cellSize * 3,
                        null
                );
            }
        }
    }
}
