
public enum Meal {
    BREAKFAST("08:00 A.M", 500),
    LUNCH("12:00 P.M", 900),
    DINNER("07:00 P.M", 700);
    
    private final String time;
    private final int calories;
    
    Meal(String time, int calories) {
        this.time = time;
        this.calories = calories;
    }
    
    public String getTime() {
        return this.time;
    }
    public int getCalories() {
        return this.calories;
    }
}