package TicTacToe.Service.Strategy;

import TicTacToe.Model.Board;
import TicTacToe.Model.Move;

public interface WinningStrategy {
    public void checkWinner(Board board, Move lastMove);


}
