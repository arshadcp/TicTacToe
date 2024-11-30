package TicTacToe.Model;

import java.awt.*;
import java.util.ArrayList;

public class Board {
    //Board is list of list of cells
   private int Dimension;
    private ArrayList<ArrayList<Cell>> matrix;


    public Board(int dimension) {//creating Board with dimension
        Dimension = dimension;
        matrix=new ArrayList<>();
        for(int i=0;i<Dimension;i++){
            matrix.add(new ArrayList<>());
            for(int j=0;j<Dimension;j++){// adding cells
                matrix.get(i).add(new Cell(i,j));
            }
        }

    }
    public Board() {//empty constructor


    }

    public ArrayList<ArrayList<Cell>> getMatrix() {
        return matrix;
    }

    public void setMatrix(ArrayList<ArrayList<Cell>> matrix) {
        this.matrix = matrix;
    }

    public int getDimension() {
        return Dimension;

    }

    public void setDimension(int dimension) {
        Dimension = dimension;
    }


    public void displayboard(int Dimension){
        //iterate cell and display
        for(int i=0;i<Dimension;i++) {
            ArrayList<Cell> cells = matrix.get(i);//pulling out row from board(matrix)
            for(Cell c:cells){//loop through cell
                c.displayCell();
            }
            System.out.println();//each row in separate line
        }
    }
}
