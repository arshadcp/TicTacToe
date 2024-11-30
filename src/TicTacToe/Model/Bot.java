package TicTacToe.Model;

import TicTacToe.BotDifficultyLevel;

import TicTacToe.PlayerType;

public class Bot extends Player{
    //id symbol name
    private BotDifficultyLevel botdifficultyLevel;
    int id;
    char Symbol;
  public Bot(int id,char Symbol,BotDifficultyLevel botdifficultyLevel ){
      super(id,"chitti",Symbol, PlayerType.BOT);
      this.botdifficultyLevel=botdifficultyLevel;
  }
  public Move makeMove(Board board){
      return null;
  }
}
