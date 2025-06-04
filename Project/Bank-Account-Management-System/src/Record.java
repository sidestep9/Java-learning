
public class Record {
    int num = 0;
    String cause;
    double initialBalance;
    double sum;
    double finalBalance;
    
    Record(int num, String cause, double initialBalance, double sum, double finalBalance) {
        this.num = num;
        this.cause = cause;
        this.initialBalance = initialBalance;
        this.sum = sum;
        this.finalBalance = finalBalance;
    }
    
    void showRecord() {
        System.out.println("TRANSACTION " + num);
        System.out.println("TYPE: " + cause);
        System.out.printf("INITIAL BALANCE: %.2f\n", initialBalance);
        System.out.printf("SUM            : %.2f\n", sum);
        System.out.printf("FINAL BALANCE  : %.2f\n", finalBalance);
    }
}