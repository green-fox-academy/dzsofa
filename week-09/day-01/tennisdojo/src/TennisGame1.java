import java.util.Arrays;
import java.util.List;

public class TennisGame1 implements TennisGame {

    private int player1Score = 0;
    private int player2Score = 0;
    private String score = "";
    private int tempScore = 0;
    private List<String> scoreOptions = Arrays.asList("Love", "Fifteen", "Thirty", "Forty", "Deuce");

    public TennisGame1(String player1Name, String player2Name) {
    }

    public void wonPoint(String playerName) {
        if (playerName.equals("player1")) {
            player1Score++;
        } else {
            player2Score++;
        }
    }

    public String getScore() {
        if (player1Score == player2Score) {
            score = getEqualScores();
        } else if (player1Score >= 4 || player2Score >= 4) {
            score = getAdvantage();
        } else {
            score = getDifferentScores();
        }
        return score;
    }

    private String getAdvantage() {
        int scoreDifference = player1Score - player2Score;
        if (scoreDifference == 1) {
            score = "Advantage player1";
        } else if (scoreDifference == -1) {
            score = "Advantage player2";
        } else if (scoreDifference >= 2) {
            score = "Win for player1";
        } else {
            score = "Win for player2";
        }
        return score;
    }


    private String getDifferentScores() {
        for (int i = 1; i < 3; i++) {
            if (i == 1) {
                tempScore = player1Score;
            } else {
                score += "-";
                tempScore = player2Score;
            }
            score += scoreOptions.get(tempScore);
        }
        return score;

    }

    public String getEqualScores() {
        if (player1Score <= 3) {
            score += scoreOptions.get(player1Score) + "-All";
        } else {
            score += scoreOptions.get(player1Score);
        }
        return score;
    }


}