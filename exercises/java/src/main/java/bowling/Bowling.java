package bowling;

public class Bowling {
    public int calculateScoreFromRolls(int[] rolls) {
        int score = 0;
        int rollIndex = 0;

        for (int frame = 0; frame < 10; frame++) {

            // if strike
            if (isStrike(rollIndex,rolls)){
                score +=  rolls[rollIndex] + rolls[rollIndex + 1] + rolls[rollIndex + 2];
                rollIndex += 1;
            }
            // if spare
            else if (isSpare(rollIndex,rolls)){
                score +=  rolls[rollIndex] + rolls[rollIndex + 1] + rolls[rollIndex + 2];
                rollIndex += 2;
            } // not strike or spare
            else{
                score +=  rolls[rollIndex] + rolls[rollIndex + 1];
                rollIndex += 2;
            }
        }

        return score;
    }

    private boolean isStrike(int rollIndex, int[] rolls){
        return rolls[rollIndex] == 10;
    }

    private boolean isSpare(int rollIndex, int[] rolls){
        return rolls[rollIndex] + rolls[rollIndex + 1] == 10;
    }
}
