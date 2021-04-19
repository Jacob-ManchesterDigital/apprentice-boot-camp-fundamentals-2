package bowling;

import org.assertj.core.api.Assertions;
import org.junit.Ignore;
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

    @Test
    public void singleSpare() {
        // Arrange
        int[] rolls = new int[]{5,5, 1,0, 0,0, 0,0, 0,0,
                0,0, 0,0, 0,0, 0,0, 0,0};

        Bowling bowlingGame = new Bowling();

        // Assert
        Assertions.assertThat(bowlingGame.calculateScoreFromRolls(rolls)).isEqualTo(12);
    }

    @Test
    public void singleStrike() {
        // Arrange
        int[] rolls = new int[]{10, 1,1, 0,0, 0,0, 0,0,
                0,0, 0,0, 0,0, 0,0, 0,0};

        Bowling bowlingGame = new Bowling();

        // Assert
        Assertions.assertThat(bowlingGame.calculateScoreFromRolls(rolls)).isEqualTo(14);
    }
}
