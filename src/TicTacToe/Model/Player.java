package TicTacToe.Model;

import TicTacToe.PlayerType;

public class Player {
    int id;
    char Symbol;
    String name;
    PlayerType playertype;

    public Player(int id, char symbol, String name) {
        this.id = id;
        Symbol = symbol;
        this.name = name;
    }
    public Player(){

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public char getSymbol() {
        return Symbol;
    }

    public void setSymbol(char symbol) {
        Symbol = symbol;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public PlayerType getPlayertype() {
        return playertype;
    }

    public void setPlayertype(PlayerType playertype) {
        this.playertype = playertype;
    }
}
