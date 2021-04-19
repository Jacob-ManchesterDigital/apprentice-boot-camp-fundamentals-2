package bowling;

public class Bowling {
    public int calculateScoreFromRolls(int[] rolls) {
        int score = 0;

        int rollIndex = 0;
        for (int frame = 0; frame < 10; frame++) {

            if (rolls[rollIndex] == 10){
                score +=  rolls[rollIndex] + rolls[rollIndex + 1] + rolls[rollIndex + 2];
                rollIndex += 1;
            }
            else if (rolls[rollIndex] + rolls[rollIndex + 1] == 10){
                score +=  rolls[rollIndex] + rolls[rollIndex + 1];
                score += rolls[rollIndex + 2];
                rollIndex += 2;
            }
            else{
                score +=  rolls[rollIndex] + rolls[rollIndex + 1];
                rollIndex += 2;
            }
        }

        return score;
    }
}
