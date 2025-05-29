import java.util.Date;

public class Empregado extends PessoaFisica {
    private String matricula;
    private double salario;

    public Empregado(String nome, Endereco endereco, String telefone, String email, String cpf, Date dataNascimento,
                     String matricula, double salario) {
        super(nome, endereco, telefone, email, cpf, dataNascimento);
        this.matricula = matricula;
        this.salario = salario;
    }

    public String getMatricula() { return matricula; }
    public void setMatricula(String matricula) { this.matricula = matricula; }

    public double getSalario() { return salario; }
    public void setSalario(double salario) { this.salario = salario; }
}
