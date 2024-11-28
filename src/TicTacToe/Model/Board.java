package TicTacToe.Model;

import java.awt.*;
import java.util.ArrayList;

public class Board {
   private int Dimension;
    private Cell cell;

    public Board(int dimension {
        Dimension = dimension;

    }
    public Board() {//empty constructor


    }

    public int getDimension() {
        return Dimension;
    }

    public void setDimension(int dimension) {
        Dimension = dimension;
    }

    public Cell getCell() {
        return cell;
    }

    public void setCell(Cell cell) {
        this.cell = cell;
    }
    public void displayboard(int Dimension){
        List<List<Cell>>matrix;
        for(int i=0;i<Dimension;i++){
            matrix=new List();
            for(int j=0;j<Dimension;j++){
                matrix.get(i).add(Cell.)
            }
        }
    }
}
