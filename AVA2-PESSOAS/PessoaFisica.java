import java.util.Date;

public abstract class PessoaFisica extends Pessoa {
    private String cpf;
    private Date dataNascimento;

    public PessoaFisica(String nome, Endereco endereco, String telefone, String email, String cpf, Date dataNascimento) {
        super(nome, endereco, telefone, email);
        this.cpf = cpf;
        this.dataNascimento = dataNascimento;
    }

    public String getCpf() { return cpf; }
    public void setCpf(String cpf) { this.cpf = cpf; }

    public Date getDataNascimento() { return dataNascimento; }
    public void setDataNascimento(Date dataNascimento) { this.dataNascimento = dataNascimento; }
}
