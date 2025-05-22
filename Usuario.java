public class Usuario extends Pessoa {
    protected String matricula;

    public Usuario(String nome, String matricula) {
        super(nome);
        this.matricula = matricula;
    }

    public String getMatricula() {
        return matricula;
    }
}
