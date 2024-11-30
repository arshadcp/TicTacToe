package TicTacToe.Service.Strategy;

import TicTacToe.Model.Board;
import TicTacToe.Model.Move;
import TicTacToe.Model.Player;

public interface WinningStrategy {
    public Player checkWinner(Board board, Move lastMove);


}