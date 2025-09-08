package tile;

import main.GameConstants;
import main.GamePanel;

import javax.imageio.IIOException;
import javax.imageio.ImageIO;
import java.io.IOException;

public class TileManager {
    private Tile[] tiles;
    public TileManager() {
        tiles = new Tile[8];
        getImage();
    }
    public Tile[] getTiles() {
        return tiles;
    }

    public void getImage() {
        try{
            tiles[0] = new Tile(ImageIO.read(getClass().getResourceAsStream("/tiles/table.png")), GameConstants.getTileScale() * 8);
            tiles[1] = new Tile(ImageIO.read(getClass().getResourceAsStream("/tiles/x.png")), GameConstants.getTileScale(), "X");
            tiles[2] = new Tile(ImageIO.read(getClass().getResourceAsStream("/tiles/O.png")), GameConstants.getTileScale(), "O");
            tiles[3] = new Tile(ImageIO.read(getClass().getResourceAsStream("/tiles/horizontal.png")), GameConstants.getTileScale());
            tiles[4] = new Tile(ImageIO.read(getClass().getResourceAsStream("/tiles/vertical.png")), GameConstants.getTileScale());
            tiles[5] = new Tile(ImageIO.read(getClass().getResourceAsStream("/tiles/diagonal_1.png")), GameConstants.getTileScale());
            tiles[6] = new Tile(ImageIO.read(getClass().getResourceAsStream("/tiles/diagonal_2.png")), GameConstants.getTileScale());
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
