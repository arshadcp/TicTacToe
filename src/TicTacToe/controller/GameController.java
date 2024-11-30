package TicTacToe.controller;

import TicTacToe.Model.Board;
import TicTacToe.Model.Game;
import TicTacToe.Model.Move;
import TicTacToe.Model.Player;
import TicTacToe.Service.Strategy.WinningStrategy;
import TicTacToe.WinningStrategyName;

public class GameController {
    public Game createGame(Board board, Player player,WinningStrategyName winningStrategyName){
        Game game=Game.new builder()
                .board()
                .player
                .winningStrategy
                .build()
    }
    public void displayBoard(Game game){
        game.getBoard().displayboard(game.getDimension());
    }
    public Move makeMove(Game game){
        game.getCurrentPlayer().makeMove(game.getBoard());
    }
    public Move undo(){
        return null;
    }
    public void replay(){

    }
}
