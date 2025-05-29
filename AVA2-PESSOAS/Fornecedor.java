public class Fornecedor extends PessoaJuridica {
    private String setor;

    public Fornecedor(String nome, Endereco endereco, String telefone, String email, String cnpj, String razaoSocial, String setor) {
        super(nome, endereco, telefone, email, cnpj, razaoSocial);
        this.setor = setor;
    }

    public String getSetor() { return setor; }
    public void setSetor(String setor) { this.setor = setor; }
}
