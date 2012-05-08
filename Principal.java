public class Principal {
    public static void main (String [] p) {
        Interface aI = new Interface();
        String n = aI.askN();
        double l = aI.askL("");
        while (l<=0) {
            l = aI.askL("Valor inválido! Por favor digite um valor positivo\n");
        }
        Account acc = new Account(n, 0.0, l);
        int x;
        do{
            x = aI.showMenu("Opções:");
            while (x !=1 && x !=2 && x!=3 && x!=4)
                x = aI.showMenu("Opção inválida! Por favor digite novamente:");
                switch(x){
                case 1:
                    double deposit = aI.askDeposit("");
                    boolean aux = acc.makeDeposit (deposit);
                    while (aux == false) {
                        deposit = aI.askDeposit("Valor inválido!\n");
                        aux = acc.makeDeposit (deposit);
                    }
                    aI.depositMade();
                    break;
                case 2:
                    double withdraw = aI.askWithdraw("");
                    aux = acc.makeWithdraw(withdraw);
                    while (aux == false) {
                        withdraw = aI.askWithdraw ("Valor inválido, superior ao seu limite ou saldo insuficiente!\n");
                        aux = acc.makeWithdraw(withdraw);
                    }
                    break;
                case 3: 
                    aI.showBalance (acc.checkBalance ());
                break;
            }
        }while (x==1 || x==2 || x==3);
    }
}
