package TicTacToe.Service.Strategy;

public class BotPlayingStrategyFactory {
    public static BotPlayingStrategy getbotPlayingStrategy(){
        return new RandomBotPlayingStrategy();

    }
}
