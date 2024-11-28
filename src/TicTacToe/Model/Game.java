package TicTacToe.Model;

import TicTacToe.Exceptions.InvalidPlayerCountException;
import TicTacToe.Exceptions.InvalidSymbolException;
import TicTacToe.PlayerType;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class Game {
  //Builder design as we want to make to sure certain inputs are provided
    private int Dimension;
    private List<Player>players;
    private Player currentPlayer;//player object
    private Board board;//board object
    private List<Move>moves;//for replay/

    private Game(int dimension, List<Player> players, Board board, List<Move> moves) {
        Dimension = dimension;
        this.players = new ArrayList<>();//initialize the player list
        this.currentPlayer = null;//no current player at starting of game
        this.board = board;
        this.moves = new ArrayList<>();//initialize the Move list
    }
    //getters&setter


    public int getDimension() {
        return Dimension;
    }

    public void setDimension(int dimension) {
        Dimension = dimension;
    }

    public List<Player> getPlayers() {
        return players;
    }

    public void setPlayers(List<Player> players) {
        this.players = players;
    }

    public Player getCurrentPlayer() {
        return currentPlayer;
    }

    public void setCurrentPlayer(Player currentPlayer) {
        this.currentPlayer = currentPlayer;
    }

    public Board getBoard() {
        return board;
    }

    public void setBoard(Board board) {
        this.board = board;
    }

    public List<Move> getMoves() {
        return moves;
    }

    public void setMoves(List<Move> moves) {
        this.moves = moves;
    }
public Builder builder(){
        return new Builder();
    }
    //Builder
    public class Builder{
       // we don't need all attributes of the main class here

        private int Dimension;
        private Board board;

        public int getDimension() {
            return Dimension;
        }

        public Builder setDimension(int dimension) {
            Dimension = dimension;
            return this;
        }

        public Board getBoard() {
            return board;
        }

        public Builder setBoard(Board board) {
            this.board = board;
            return this;
        }
        //validate
        public void validatePlayer(){
            if(players.size()>Dimension-1 || players.size()<Dimension-2){
                throw new InvalidPlayerCountException("check the player count");
            }
        }
        public void validateSymbol(){
            HashSet<char>hs=new HashSet<>();
            for(Player:players){
                hs.add(Player.getSymbol());
            }
            if(hs.size()<Dimension-1){
                throw new InvalidSymbolException("Symbol should be eaual to number of players");
            }
        }
        public void validatBot(){
            int bot=0;
            for(Player:player){
                if(Player.getPlayertype()== PlayerType.BOT){
                    bot++;
                }
            }
            if(bot!=1){
                throw new botException("bot count should be 1")
            }
        }
    }
}
