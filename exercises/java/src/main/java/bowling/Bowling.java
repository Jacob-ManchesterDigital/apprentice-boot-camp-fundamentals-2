package bowling;

import java.util.Arrays;

public class Bowling {
    public int calculateScoreFromRolls(int[] rolls) {
        int score = 0;

        int rollIndex = 0;
        for (int frame = 0; frame < 10; frame++) {
            int firstRoll = rolls[rollIndex];
            int secondRoll = rolls[rollIndex + 1];

            score += firstRoll + secondRoll;

            rollIndex += 2;
        }

        return score;
    }
}
