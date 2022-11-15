public abstract class Conta implements Iconta{
    private static final int AGENCIA_PADRAO = 1;
    private static  int SEQUECIAL = 1;
    protected int agencia;
    protected int numero;
    protected double saldo;
    protected Cliente cliente;



    public Conta(Cliente cliente) {
        this.agencia = AGENCIA_PADRAO;
        this.numero = SEQUECIAL++;
        this.cliente = cliente;
    }

    protected Conta() {
    }

    @Override
    public void sacar(double valor) {
        saldo -= valor;

    }

    @Override
    public void depositar(double valor) {
        saldo += valor;

    }

    @Override
    public void transferir(double valor, Conta contaDestino) {
        this.sacar(valor);
        contaDestino.depositar(valor);

    }

    public int getAgencia() {
        return agencia;
    }


    public int getNumero() {
        return numero;
    }


    public Double getSaldo() {
        return saldo;
    }
    protected void imprimirInfoComuns() {
        System.out.println(String.format("Cliente: %s", this.cliente.getNome_cli()));
        System.out.println(String.format("Cliente: %s", this.cliente.getEndereco()));
        System.out.println(String.format("Cliente: %s", this.cliente.getTelefone()));
        System.out.println(String.format("Agencia: %d", this.agencia));
        System.out.println(String.format("Numero: %d", this.numero));
        System.out.println(String.format("Saldo: %.2f", this.saldo));
    }



}
