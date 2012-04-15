public class Account {
    private int  number = 0;
    private double balance = 0.0;
    private double limit = 0.0;
    public Account (int N, double B, double L) {
        number = N;
        balance = B;
        limit = L;
    }
    public double makeDeposit (double d) {
        balance = balance + d;
        return balance;
    }
    public double makeWithdraw (double d) {
        balance = balance - d;
        return balance;
    }
    public double checkBalance() {
        return balance;
    }
    public double checkLimit() {
        return limit;
    }
}