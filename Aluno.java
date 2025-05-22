import java.util.ArrayList;
import java.util.List;

public class Aluno extends Usuario {
    private String turma;
    private List<Nota> notas;

    public Aluno(String nome, String matricula, String turma) {
        super(nome, matricula);
        this.turma = turma;
        this.notas = new ArrayList<>();
    }

    public void adicionarNota(Nota nota) {
        notas.add(nota);
    }

    public List<Nota> getNotas() {
        return notas;
    }
}
