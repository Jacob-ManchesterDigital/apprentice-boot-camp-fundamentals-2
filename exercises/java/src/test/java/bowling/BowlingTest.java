package bowling;

import org.assertj.core.api.Assertions;
import org.junit.Test;

public class BowlingTest {
    @Test
    public void whenAllZerosScoredThenReturnZero() {
        // Arrange
        int expectedScore = 0;
        int [] rolls = {0,0, 0,0, 0,0, 0,0, 0,0,
                0,0, 0,0, 0,0, 0,0, 0,0};

        // Act
        int outputScore = Bowling.calculateScoreFromRolls(rolls);

        // Assert
        Assertions.assertThat(outputScore).isEqualTo(expectedScore);
    }
}
