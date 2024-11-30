package TicTacToe.controller;

import TicTacToe.GameStatus;
import TicTacToe.Model.Board;
import TicTacToe.Model.Game;
import TicTacToe.Model.Move;
import TicTacToe.Model.Player;
import TicTacToe.Service.Strategy.Order1WinningStrategy;
import TicTacToe.Service.Strategy.WinningStrategy;
import TicTacToe.Service.Strategy.WinningStrategyFactory;
import TicTacToe.WinningStrategyName;

import java.util.ArrayList;

import static jdk.internal.classfile.Classfile.build;

public class GameController {
    public Game createGame(int Dimension, ArrayList<Player>players, WinningStrategyName StrategyName){
        return Game.builder()
                .setDimension(Dimension)
                .setPlayers(players)
                .setWinningStrategy(WinningStrategyFactory.getWinningStrategy(StrategyName,Dimension))
                .build();
    }
    public void displayBoard(Game game){
        game.getBoard().displayboard();
    }
    public Move excecuteMove(Game game,Player player){
       return player.makeMove(game.getBoard());
    }
    public  GameStatus gameStatus(Game game){
        return game.getGameStatus();
    }
    public Board undo(Game game, Move Lastmove){
        return null;
    }
    public void replay(){

    }
    public Player checkWinner(Game game, Move lastMovePlayed){
        return game.getWinningStrategy().checkWinner(game.getBoard(),lastMovePlayed);
    }
}
