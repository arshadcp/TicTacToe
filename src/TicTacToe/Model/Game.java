package TicTacToe.Model;

import TicTacToe.Exceptions.InvalidPlayerCountException;
import TicTacToe.Exceptions.InvalidSymbolException;
import TicTacToe.Exceptions.botException;
import TicTacToe.GameStatus;
import TicTacToe.PlayerType;
import TicTacToe.Service.Strategy.WinningStrategy;
import TicTacToe.WinningStrategyName;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Game {
  //Builder design as we want to make to sure certain inputs are provided
    private int Dimension;
    private Board board;
    private List<Player>players;
    private Player currentPlayer;//player object
    private List<Board>boardss;//board object
    private List<Move>moves;//for replay/
    private WinningStrategy winningStrategy;
    private GameStatus gameStatus;

    private Game( Board board, List<Player> players,WinningStrategy winningStrategy) {

        this.players = new ArrayList<>();//initialize the player list
        this.currentPlayer = null;//no current player at starting of game
        this.boardss = new ArrayList<>();
        this.moves = new ArrayList<>();//initialize the Move list
        this.gameStatus=GameStatus.IN_PROGRESS;
        this.board=board;
        this.winningStrategy=winningStrategy;
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

    public List<Board> getBoardss() {
        return boardss;
    }

    public void setBoardss(List<Board> boardss) {
        this.boardss = boardss;
    }

    public WinningStrategy getWinningStrategy() {
        return winningStrategy;
    }

    public void setWinningStrategy(WinningStrategy winningStrategy) {
        this.winningStrategy = winningStrategy;
    }

    public GameStatus getGameStatus() {
        return gameStatus;
    }

    public void setGameStatus(GameStatus gameStatus) {
        this.gameStatus = gameStatus;
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
    public static Builder builder(){
        return new Builder();
    }
    //Builder
    public static class Builder{
       // we don't need all attributes of the main class here

        private int Dimension;
        private Board board;
        private List<Player>players;
        private WinningStrategy winningStrategy;;

        public int getDimension() {
            return Dimension;
        }

        public List<Player> getPlayers() {
            return players;
        }

        public Builder setPlayers(List<Player> players) {
            this.players = players;
            return this;
        }


        public Builder setWinningStrategy(WinningStrategy winningStrategy) {
            this.winningStrategy = winningStrategy;
            return this;
        }

        public WinningStrategy getWinningStrategy() {
            return winningStrategy;
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
              if (players.size() <Dimension - 2 || players.size() >=Dimension) {
                  throw new InvalidPlayerCountException("check the player count");
              }
          }
          public void validateSymbol(){
              HashSet<Character> hs = new HashSet<>();
              for (Player p : players) { //iterate through the list
                  hs.add(p.getSymbol());//p is a variable
              }
              if (hs.size() !=players.size()){
                  throw new InvalidSymbolException("Symbol should be eaual to number of players");
              }
          }
          public void validateBot(){
              int botcount = 0;
              for (Player p : players) {//iterate through the list
                  if (p.getPlayertype().equals( PlayerType.BOT)) {
                      botcount++;
                  }
              }
              if (botcount > 1|| botcount < 0) {
                  throw new botException("bot count should be 1");
              }
          }
        public void validat() {
            validatePlayer();
            validateSymbol();
            validateBot();
        }
        public Game build(){
            validat();
            return new Game(new Board(Dimension),players,winningStrategy);
        }
    }
}
