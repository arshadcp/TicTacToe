package TicTacToe.Model;

import TicTacToe.CellState;
import TicTacToe.PlayerType;

import java.util.Scanner;

public class Player {

    private int id;
    private char Symbol;
   private String name;
    private PlayerType playertype;

    public Player(int id,String name, char symbol,PlayerType playertype) {
        this.id = id;
        Symbol = symbol;
        this.name = name;
        this.playertype=playertype;
    }
    public Player(){

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public char getSymbol() {
        return Symbol;
    }

    public void setSymbol(char symbol) {
        Symbol = symbol;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public PlayerType getPlayertype() {
        return playertype;
    }

    public void setPlayertype(PlayerType playertype) {
        this.playertype = playertype;
    }
//    public void takeInput(){
//        Scanner sc=new Scanner(System.in);
//        System.out.println("Please enter the size of the board");
//        int s=sc.nextInt();
//        board=new Board();//create board object
//        board.displayboard(s);//display board of size s
//        System.out.println("please enter the name");
//        String a=sc.next();
//        this.name=a;
//
//    }
    public Move makeMove(Board board){
        //player make move in the board--set cell filled
        Scanner sc=new Scanner(System.in);
       System.out.println("Please enter the row");
       int row=sc.nextInt();
        System.out.println("Please enter the column");
        int col=sc.nextInt();
        //now go to specific row-col and update the board cell
        Cell playedMoveCell=board.getMatrix().get(row).get(col);
        playedMoveCell.setCellstate(CellState.FILLED);
        playedMoveCell.setPlayer(this);//player object
        return new Move(playedMoveCell,this);//move constructor need cell and player

    }
}
