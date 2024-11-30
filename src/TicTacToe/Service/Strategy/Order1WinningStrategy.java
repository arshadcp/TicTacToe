package TicTacToe.Service.Strategy;

import TicTacToe.Model.Board;
import TicTacToe.Model.Move;
import TicTacToe.Model.Player;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Order1WinningStrategy implements WinningStrategy{
    int Dimension;
    private List<HashMap<Character,Integer>> rowhashmap;//hashmap store Symbol and count of symbol
    private ArrayList<HashMap<Character,Integer>> colhashmap;
    private HashMap<Character,Integer> leftdia;
    private HashMap<Character,Integer> rightdia;
    private HashMap<Character,Integer> corner;

   public Order1WinningStrategy(int Dimension){
       this.Dimension=Dimension;
       leftdia=new HashMap<>();
       rightdia=new HashMap<>();
       corner=new HashMap<>();
       rowhashmap=new ArrayList<>();//?
       colhashmap=new ArrayList<>();
       for(int i=0;i<Dimension;i++){//adding hashmaps in the list
           rowhashmap.add(new HashMap<>());
           colhashmap.add(new HashMap<>());
       }
   }




    @Override
    public Player checkWinner(Board board, Move lastMove) {
       Player player=lastMove.getPlayer();
       int row=lastMove.getCell().getRow();
        int col=lastMove.getCell().getCol();
        char Symbol=player.getSymbol();
       boolean winner=(rowCheck(row, Symbol)||colCheck( col, Symbol)
                ||(leftdiagonal( row,  col)&&leftdiagonalCheck( Symbol))
                ||(rightdiagonal( row, col) && rightdiagonalCheck( Symbol))
                || cornerCheck( Symbol));
       if(winner){
           return player;
       }else{
           return null;
       }
    }
    public boolean rowCheck(int row, char Symbol){
      //check how many symbols are present in row(rowhashmap)
       if( rowhashmap.get(row).containsKey(Symbol)){
           rowhashmap.get(row).put(Symbol,rowhashmap.get(row).get(Symbol)+1);
           return rowhashmap.get(row).get(Symbol) ==Dimension;//if symbol=dimension then return true
       }else{
           //if symbol not present
           rowhashmap.get(row).put(Symbol,1);
       }
       return false;
    }
    public boolean colCheck(int col, char Symbol){
        //check how many symbols are present in column(colhashmap)
        if( colhashmap.get(col).containsKey(Symbol)){
            colhashmap.get(col).put(Symbol,colhashmap.get(col).get(Symbol)+1);
            return colhashmap.get(col).get(Symbol) ==Dimension;//if symbol=dimension then return true
        }else{
            //if symbol not present
            rowhashmap.get(col).put(Symbol,1);
        }
        return false;
    }
    public boolean leftdiagonalCheck(char Symbol){
        if(leftdia.containsKey(Symbol)){
            leftdia.put(Symbol,leftdia.get(Symbol)+1);
            return leftdia.get(Symbol)==Dimension;
        }else{
            leftdia.put(Symbol,1);
        }
        return false;
    }
    public boolean rightdiagonalCheck(char Symbol){
        if(rightdia.containsKey(Symbol)){
            rightdia.put(Symbol,rightdia.get(Symbol)+1);
            return rightdia.get(Symbol)==Dimension;
        }else{
            rightdia.put(Symbol,1);
        }
        return false;
    }
    public boolean cornerCheck(char Symbol){
        if(corner.containsKey(Symbol)){
            corner.put(Symbol,corner.get(Symbol)+1);
            return corner.get(Symbol)==4;
        }else{
            corner.put(Symbol,1);
        }
        return false;
    }
    public boolean leftdiagonal(int row, int col){
       return row==col;
    }
    public boolean rightdiagonal(int row,int col){
        return (row+col==Dimension-1);
    }
}
