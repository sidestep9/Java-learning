package grade;

public enum Grade {
    A(90),
    B(80),
    C(70),
    D(60),
    F(0);
    
    private final int minScore;
    
    Grade(int minScore) {
        this.minScore = minScore;
    }
    
    public int getMinScore() {
        return this.minScore;
    }
    
    public static Grade finalScore(int score) {
        for(Grade grade : Grade.values()) {
            if(score >= grade.getMinScore()) {
                return grade;
            }
        }
        return F;
    }
}