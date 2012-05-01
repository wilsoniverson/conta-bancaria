public class Principal {
    public static void main (String [] p) {
        Interface aI = new Interface();
        String n = aI.askN();
        double l = aI.askL("");
        while (l<=0) {
            l = aI.askL("Valor inválido! Por favor digite um valor positivo\n");
        }
        Account acc = new Account(n, 0.0, l);
        int x = 0;
        while (x == 0 ||x == 1 || x == 2 || x == 3 ) {
            x = aI.showMenu("Opções:");
            while (x !=1 && x !=2 && x!=3 && x!=4) {
                x = aI.showMenu("Opção inválida! Por favor digite novamente:");
            }
            if (x==1) {
                double a = aI.askDeposit("");
                boolean b = acc.makeDeposit (a);
                while (b == false) {
                    a = aI.askDeposit("Valor inválido!\n");
                    b = acc.makeDeposit (a);
                }
                aI.depositMade();
            }
            if (x==2) {
                double a = aI.askWithdraw("");
                boolean b = acc.makeWithdraw(a);
                while (b == false) {
                    a = aI.askWithdraw ("Valor inválido, superior ao seu limite ou saldo insuficiente!\n");
                    b = acc.makeWithdraw(a);
                }
            }
            if (x==3) 
                aI.showBalance (acc.checkBalance ());
        }
    }
}
