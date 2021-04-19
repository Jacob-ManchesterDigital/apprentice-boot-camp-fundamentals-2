package bowling;

public class Bowling {
    public int calculateScoreFromRolls(int[] rolls) {
        int score = 0;

        for (int roll:rolls){
            score += roll;
        }

        return score;
    }
}
