public class Main {
    public static void main(String[] args) {
        Cliente tiago = new Cliente("Tiago Wilson", "39784855563", "11973546352", "rua das dores");
        Cliente samuel = new Cliente("Samuel Jhones", "25124536512", "11973546352", "rua das Nações");
        Cliente manuel = new Cliente("Manoel oliveira", "14558632512", "11973546352", "rua das graças");

        Conta cc = new Conta_corrente(tiago);
        Conta poupanca = new ContaPoupanca(tiago);

        Conta cc1 = new Conta_corrente(samuel);
        Conta poupanca1 = new ContaPoupanca(samuel);

        Conta cc2 = new Conta_corrente(manuel);
        Conta poupanca2 = new ContaPoupanca(manuel);

        cc.depositar(1100);
        cc.transferir(72, poupanca);

        cc1.depositar(50);
        cc2.depositar(50);

        cc.transferir(72, cc1);


        cc.imprimirInfoComuns();
        poupanca.imprimirInfoComuns();

        cc1.imprimirInfoComuns();
        poupanca1.imprimirInfoComuns();

        cc2.imprimirInfoComuns();
        poupanca2.imprimirInfoComuns();
    }
}
