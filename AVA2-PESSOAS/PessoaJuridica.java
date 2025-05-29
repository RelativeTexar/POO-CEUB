public abstract class PessoaJuridica extends Pessoa {
    private String cnpj;
    private String razaoSocial;

    public PessoaJuridica(String nome, Endereco endereco, String telefone, String email, String cnpj, String razaoSocial) {
        super(nome, endereco, telefone, email);
        this.cnpj = cnpj;
        this.razaoSocial = razaoSocial;
    }

    public String getCnpj() { return cnpj; }
    public void setCnpj(String cnpj) { this.cnpj = cnpj; }

    public String getRazaoSocial() { return razaoSocial; }
    public void setRazaoSocial(String razaoSocial) { this.razaoSocial = razaoSocial; }
}
