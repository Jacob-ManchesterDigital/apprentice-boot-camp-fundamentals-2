package bowling;

import org.assertj.core.api.Assertions;
import org.junit.Test;

public class BowlingTest {
    @Test
    public void whenAllZerosScoredThenReturnZero() {
        // Arrange
        int[] rolls = new int[]{0,0, 0,0, 0,0, 0,0, 0,0,
                0,0, 0,0, 0,0, 0,0, 0,0};

        Bowling bowlingGame = new Bowling();

        // Assert
        Assertions.assertThat(bowlingGame.calculateScoreFromRolls(rolls)).isEqualTo(0);
    }

    @Test
    public void whenAllOnesScoredThenReturnTwenty() {
        // Arrange
        int[] rolls = new int[]{1,1, 1,1, 1,1, 1,1, 1,1,
                1,1, 1,1, 1,1, 1,1, 1,1};

        Bowling bowlingGame = new Bowling();

        // Assert
        Assertions.assertThat(bowlingGame.calculateScoreFromRolls(rolls)).isEqualTo(20);
    }
}
