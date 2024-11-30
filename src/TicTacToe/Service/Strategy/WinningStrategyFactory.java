package TicTacToe.Service.Strategy;

import TicTacToe.WinningStrategyName;

public class WinningStrategyFactory {
    public static WinningStrategy getWinningStrategy(WinningStrategyName winningStrategyName, int dimension){
        return new Order1WinningStrategy(dimension);//constructor of Order1WinningStrategy take dimension as parameter
    }
}
