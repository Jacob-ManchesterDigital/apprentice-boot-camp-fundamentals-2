package bowling;

public class Bowling {
    public int calculateScoreFromRolls(int[] rolls) {
        int score = 0;

        for (int rollIndex = 0; rollIndex < rolls.length; rollIndex += 2) {
            int firstRoll = rolls[rollIndex];
            int secondRoll = rolls[rollIndex + 1];



            score += firstRoll;
            score += secondRoll;
        }

        return score;
    }
}
