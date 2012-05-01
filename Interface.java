import javax.swing.JOptionPane;
public class Interface {
    public Interface () {
    }
    public int showMenu (String a) {
        String o = JOptionPane.showInputDialog(a + "\n1. Efetuar Depósito" + "\n2. Efetuar Saque" + "\n3. Consultar Saldo" + "\n4. Sair (encerrar)");
        int m = Integer.parseInt (o);
        return m;
    }
    public String askN () {
        String x = JOptionPane.showInputDialog( "Digite seu Número de Identificação Bancária");
        return x;
    }
    public double askWithdraw (String a) {
        String b = JOptionPane.showInputDialog(a + "Digite o valor que deseja sacar:");
        double v = Double.parseDouble (b);
        return v;
    }
    public double askL (String a) {
        String x = JOptionPane.showInputDialog (a + "Digite o Valor Limite de sua conta:");
        double l = Double.parseDouble (x);
        return l;
    }
    public double askDeposit (String a) {
        String x = JOptionPane.showInputDialog (a + "Digite o valor a ser depositado:");
        double g = Double.parseDouble (x);
        return g;
    }
    public void showBalance (double x) {
        JOptionPane.showMessageDialog (null, "Seu saldo é:" + x);
    }
    public void depositMade () {
        JOptionPane.showMessageDialog (null, "Seu depósito foi efetuado.");
    }
}
