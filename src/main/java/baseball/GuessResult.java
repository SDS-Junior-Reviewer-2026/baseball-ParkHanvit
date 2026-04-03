package baseball;

public class GuessResult {
    public GuessResult(boolean solved,  int strikes, int balls) {
        this.solved = solved;
        this.strikes = strikes;
        this.balls = balls;
    }

    private boolean solved;
    private int strikes;
    private int balls;

    public boolean isSolved() {
        return solved;
    }

    public int getStrikes() {
        return strikes;
    }

    public int getBalls() {
        return balls;
    }
}
