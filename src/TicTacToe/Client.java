package TicTacToe;

import TicTacToe.Model.Board;
import TicTacToe.Model.Game;
import TicTacToe.Model.Move;
import TicTacToe.Model.Player;
import TicTacToe.Service.Strategy.Order1WinningStrategy;
import TicTacToe.controller.GameController;

import java.awt.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;


public class Client {
    public static void main(String[] args) {
        GameController gameController=new GameController();
        ArrayList<Player>players=new ArrayList<>();//Arraylist of Player object
        Scanner sc=new Scanner(System.in);
        int id=1;
        System.out.println("Welcome to the game");
        System.out.println("Enter dimension of the board");
        int dimension=sc.nextInt();
        System.out.println("Do you want Bot-if yes press:Y else press:N");
        String ans=sc.next();
        if(ans.equals("Y")) {
            Player p1 = new Player(id++, "bot", '$', PlayerType.BOT);
            players.add(p1);
        }


        while(id< dimension){
            System.out.println("Please Enter the Player name");
            String name=sc.next();
            System.out.println("Please Enter the Player Symbol");
            char sym=sc.next().charAt(0);
            Player p=new Player(id++,name,sym,PlayerType.HUMAN);
            players.add(p);

        }
        System.out.println(players.size());
        Game game=gameController.createGame(dimension,players, WinningStrategyName.ORDER_1);

        Collections.shuffle(players);//randomise play
        int playerindex=-1;


        while(game.getGameStatus().equals(GameStatus.IN_PROGRESS)){
            System.out.println("current Board status");
            gameController.displayBoard(game);//print board
            playerindex++;
            playerindex=playerindex%players.size();//dimension--this make sure of looping
            Move playedmove=gameController.excecuteMove(game,players.get(playerindex));//index on the List give player
                  game.getMoves().add(playedmove);//storing move
              Player winner=gameController.checkWinner( game,playedmove);
              if (winner!=null){
                  System.out.println("The winner is "+winner.getName());
                  break;
              }
              System.out.println("final board status");
              gameController.displayBoard(game);

        }
    }
}
