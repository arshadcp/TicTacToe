package TicTacToe.Service.Strategy;

import TicTacToe.CellState;
import TicTacToe.Exceptions.GameOverException;
import TicTacToe.Model.Board;
import TicTacToe.Model.Cell;
import TicTacToe.Model.Move;
import TicTacToe.Model.Player;
import TicTacToe.PlayerType;

import java.util.ArrayList;

public class RandomBotPlayingStrategy implements BotPlayingStrategy {
    @Override
    public Move makeMove(Board board, Player bot) {
        ArrayList<ArrayList<Cell>> matrix = board.getMatrix();
        for(int i=0;i<matrix.size();i++){
            for(int j=0;j<matrix.size();j++){
                if(matrix.get(i).get(j).getCellstate().equals(CellState.EMPTY)){
                    board.getMatrix().get(i).get(j).setPlayer(bot);
                    board.getMatrix().get(i).get(j).setCellstate(CellState.FILLED);
                    return new Move(board.getMatrix().get(i).get(j), bot);
                }
            }
        }
        throw new GameOverException("There are no empty cells in the board");
    }
}
