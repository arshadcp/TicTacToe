package TicTacToe.Model;

import TicTacToe.CellState;

public class Cell {
   private int row;
   private int col;
    private Player player;
    private CellState cellstate;

    public Cell(int row, int col) {
        this.row = row;
        this.col = col;
        this.player = null;
        this.cellstate = CellState.EMPTY;//initially empty
    }

    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public int getCol() {
        return col;
    }

    public void setCol(int col) {
        this.col = col;
    }

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public CellState getCellstate() {
        return cellstate;
    }

    public void setCellstate(CellState cellstate) {
        this.cellstate = cellstate;
    }
    public void displayCell(){
        if(player==null){
            System.out.print("| |");//empty cell
        }
        else{
            System.out.print("|"+player.getSymbol()+"|");//dispay cell with symbol
        }
    }
}
