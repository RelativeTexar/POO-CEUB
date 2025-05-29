import java.util.Date;

public class ClientePF extends PessoaFisica {
    private String codigo;

    public ClientePF(String nome, Endereco endereco, String telefone, String email, String cpf, Date dataNascimento, String codigo) {
        super(nome, endereco, telefone, email, cpf, dataNascimento);
        this.codigo = codigo;
    }

    public String getCodigo() { return codigo; }
    public void setCodigo(String codigo) { this.codigo = codigo; }
}
