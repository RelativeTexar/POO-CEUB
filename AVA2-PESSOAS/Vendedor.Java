import java.util.Date;

public class Vendedor extends Empregado {
    private double comissao;

    public Vendedor(String nome, Endereco endereco, String telefone, String email, String cpf, Date dataNascimento,
                    String matricula, double salario, double comissao) {
        super(nome, endereco, telefone, email, cpf, dataNascimento, matricula, salario);
        this.comissao = comissao;
    }

    public double getComissao() { return comissao; }
    public void setComissao(double comissao) { this.comissao = comissao; }
}
