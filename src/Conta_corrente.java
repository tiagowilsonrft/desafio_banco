
public class Conta_corrente extends Conta{


    public Conta_corrente(Cliente cliente) {
        super(cliente);
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("Extrato Conta Corrente");
        super.imprimirInfoComuns();
    }
}
