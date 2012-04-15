public class Principal {
    public static void main (String [] p) {
        Interface aI = new Interface();
        int n = aI.askN();
        double ll = aI.askLL("");
        while (ll<0) {
            ll = aI.askLL("O valor digitado é inválido!\n");
        }
        Account acc = new Account(n, 0.0, ll);
        int x = 0;
        while (x == 0 ||x == 1 || x == 2 || x == 3 ) {
            x = aI.showMenu("Opções:");
            while (x !=1 && x !=2 && x!=3 && x!=4) {
                x = aI.showMenu("Opção Inválida! Por favor digite novamente:");
            }
            if (x==1) {
                double b = aI.askDeposit("");
                while (b<0 || b>acc.checkLimit()) {
                    b = aI.askDeposit("O valor digitado é inválido!\n");
                }
                double c = acc.makeDeposit (b);
                aI.depositMade();
            }
            if (x==2) {
                double b = aI.askWithdraw("");
                while (b> acc.checkBalance() || b>acc.checkLimit() || b<0) {
                    b = aI.askWithdraw ("Valor inválido ou superior ao seu limite!\n");
                }
                double c = acc.makeWithdraw (b);
            }
            if (x==3) {
                aI.showBalance (acc.checkBalance ());
            }
        }
    }
}