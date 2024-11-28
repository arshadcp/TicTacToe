package TicTacToe.Model;

import TicTacToe.Exceptions.InvalidPlayerCountException;
import TicTacToe.Exceptions.InvalidSymbolException;
import TicTacToe.Exceptions.botException;
import TicTacToe.PlayerType;
import TicTacToe.Strategy.WinningStrategy;

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
    private WinningStrategy winningStrategy;

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
      public void  validate() {
          public void validatePlayer () {
              if (players.size() > Dimension - 1 || players.size() < Dimension - 2) {
                  throw new InvalidPlayerCountException("check the player count");
              }
          }
          public void validateSymbol () {
              HashSet<Character> hs = new HashSet<>();
              for (Player p : players) { //iterate through the list
                  hs.add(p.getSymbol());//p is a variable
              }
              if (hs.size() < Dimension - 1) {
                  throw new InvalidSymbolException("Symbol should be eaual to number of players");
              }
          }
          public void validatBot () {
              int bot = 0;
              for (Player p : players) {//iterate through the list
                  if (p.getPlayertype() == PlayerType.BOT) {
                      bot++;
                  }
              }
              if (bot != 1) {
                  throw new botException("bot count should be 1");
              }
          }
      }
        public Game build(){
            validate();
            return null;
        }
    }
}
