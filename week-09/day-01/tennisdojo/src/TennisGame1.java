import java.util.Arrays;
import java.util.List;

public class TennisGame1 implements TennisGame {

    private int player1Score = 0;
    private int player2Score = 0;
    private String score = "";
    private int tempScore = 0;

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
            switch (tempScore) {
                case 0:
                    score += "Love";
                    break;
                case 1:
                    score += "Fifteen";
                    break;
                case 2:
                    score += "Thirty";
                    break;
                case 3:
                    score += "Forty";
                    break;
            }
        }
        return score;

    }

    public String getEqualScores() {
        String score = "";
        switch (player1Score) {
            case 0:
                score += "Love-All";
                break;
            case 1:
                score += "Fifteen-All";
                break;
            case 2:
                score += "Thirty-All";
                break;
            case 3:
                score += "Forty-All";
                break;
            default:
                score += "Deuce";
                break;
        }
        return score;
    }


}