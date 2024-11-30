package TicTacToe.Model;

import TicTacToe.BotDifficultyLevel;

import TicTacToe.PlayerType;
import TicTacToe.Service.Strategy.BotPlayingStrategyFactory;

public class Bot extends Player{
    //id symbol name
    private BotDifficultyLevel botdifficultyLevel;

  public Bot(int id,char Symbol,BotDifficultyLevel botdifficultyLevel ){
      super(id,"chitti",Symbol, PlayerType.BOT);
      this.botdifficultyLevel=botdifficultyLevel;
  }
    public Move makeMove(Board board){
        return BotPlayingStrategyFactory.getBotPlayingStrategy().makeMove(board, this);
    }
}
