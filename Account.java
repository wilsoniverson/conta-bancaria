public class Account {
    private String  number = "";
    private double balance = 0.0;
    private double limit = 0.0;
    public Account (String N, double B, double L) {
        number = N;
        if (B<0)
            balance = 0;
        else
            balance = B;
        if (L<0)
            limit = 0;
        else
            limit = L;
    }
    public Account (String N, double L) {
        number = N;
        balance = 0.0;
        if (L<0)
            limit = 0;
        else
            limit = L;
    }
    public String checkNumber (){
        return number;
    }
    public double checkBalance() {
        return balance;
    }
    public double checkLimit() {
        return limit;
    }
    public void askN (String x) {
        number = x;
    }
    public boolean askLimit (double d) {
        if (d<=0)
            return false;
        limit = d;
        return true;
    }
    public boolean makeDeposit (double d) {
        if (d<=0)
            return false;
        balance += d;
        return true;
    }
    public boolean makeWithdraw (double d) {
        if (d<0 || d>limit || d>balance)
            return false;
        balance -= d;
        return true;
    }
    //metodo para tranferir dinheiro para a conta
    public boolean makeTransfer (double d) {
        if (d>0) {
            balance += d;
            return true;
        }
        return false;
    }
}
