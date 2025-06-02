
public class Record {
    static int num = 1;
    double initialBalance;
    double sum;
    double finalBalance;
    
    Record(double initialBalance, double sum, double finalBalance) {
        this.num = num++;
        this.initialBalance = initialBalance;
        this.sum = sum;
        this.finalBalance = finalBalance;
    }
}