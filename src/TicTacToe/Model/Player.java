package TicTacToe.Model;

import TicTacToe.PlayerType;

import java.util.Scanner;

public class Player {
    Board board;
    private int id;
    private char Symbol;
   private String name;
    private PlayerType playertype;

    public Player(int id, char symbol, String name) {
        this.id = id;
        Symbol = symbol;
        this.name = name;
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
    public void makeMove(Board board){
        //player make move in the board--set cell filled

    }
}
