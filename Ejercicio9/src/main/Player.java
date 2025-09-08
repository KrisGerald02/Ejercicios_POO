package main;

import javax.swing.*;

public class Player {
    private String playerName;
    private String Symbol;

    public Player(String playerName, String symbol) {
        this.playerName = playerName;
        this.Symbol = symbol;
    }
    public String getPlayerName() {
        return playerName;
    }
    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }
    public String getSymbol() {
        return Symbol;
    }
    public void setSymbol(String symbol) {
        this.Symbol = symbol;
    }
}
