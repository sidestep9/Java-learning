
public class Record {
    int num = 0;
    static int counter = 1;
    String cause;
    double initialBalance;
    double sum;
    double finalBalance;
    
    Record(String cause, double initialBalance, double sum, double finalBalance) {
        this.num = counter++;
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