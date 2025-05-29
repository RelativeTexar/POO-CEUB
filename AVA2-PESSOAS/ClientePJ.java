public class ClientePJ extends PessoaJuridica {
    private String codigo;

    public ClientePJ(String nome, Endereco endereco, String telefone, String email, String cnpj, String razaoSocial, String codigo) {
        super(nome, endereco, telefone, email, cnpj, razaoSocial);
        this.codigo = codigo;
    }

    public String getCodigo() { return codigo; }
    public void setCodigo(String codigo) { this.codigo = codigo; }
}
