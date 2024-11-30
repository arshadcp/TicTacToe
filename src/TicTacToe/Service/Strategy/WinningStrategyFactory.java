package TicTacToe.Service.Strategy;

import TicTacToe.WinningStrategyName;

public class WinningStrategyFactory {
    public static WinningStrategy getWinningStrategy(WinningStrategyName winningStrategyName){
        return new Order1WinningStrategy(WinningStrategyName.ORDER_1);
    }
}
