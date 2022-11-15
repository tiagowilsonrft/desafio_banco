import java.util.ArrayList;
import java.util.List;

public class Cliente extends Conta{
    protected String nome_cli;
    protected String cpf;
    protected String telefone;
    protected String endereco;

    public Cliente(String nome_cli, String cpf, String telefone, String endereco) {
        this.nome_cli = nome_cli;
        this.cpf = cpf;
        this.telefone = telefone;
        this.endereco = endereco;
    }

    public String getNome_cli() {
        return nome_cli;
    }

    public void setNome_cli(String nome_cli) {
        this.nome_cli = nome_cli;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    @Override
    public void imprimirExtrato() {

    }
}
