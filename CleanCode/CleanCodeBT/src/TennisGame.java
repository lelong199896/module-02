public class TennisGame {
    private static final int Zero = 0;
    private static final int ONE = 1;
    private static final int TWO = 2;
    private static final int THREE = 3;
    public static String getScore(String player1Name, String player2Name, int m_score1, int m_score2) {
        StringBuilder score = new StringBuilder();
        int tempScore=0;
        if (m_score1==m_score2)
        {
            score = switch (m_score1) {
                case Zero -> new StringBuilder("Love-All");
                case ONE -> new StringBuilder("Fifteen-All");
                case TWO -> new StringBuilder("Thirty-All");
                case THREE -> new StringBuilder("Forty-All");
                default -> new StringBuilder("Deuce");
            };
        }
        else if (m_score1>=4 || m_score2>=4)
        {
            int minusResult = m_score1-m_score2;
            if (minusResult==ONE) score = new StringBuilder("Advantage player1");
            else if (minusResult ==-ONE) score = new StringBuilder("Advantage player2");
            else if (minusResult>=TWO) score = new StringBuilder("Win for player1");
            else score = new StringBuilder("Win for player2");
        }
        else
        {
            for (int i=ONE; i<THREE; i++)
            {
                if (i==ONE) tempScore = m_score1;
                else { score.append("-"); tempScore = m_score2;}
                switch(tempScore)
                {
                    case Zero:
                        score.append("Love");
                        break;
                    case ONE:
                        score.append("Fifteen");
                        break;
                    case TWO:
                        score.append("Thirty");
                        break;
                    case THREE:
                        score.append("Forty");
                        break;
                }
            }
        }
        return score.toString();
    }
}