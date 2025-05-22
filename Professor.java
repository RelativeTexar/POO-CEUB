import java.util.ArrayList;
import java.util.List;

public class Professor extends Usuario {
    private String turma;
    private List<Aluno> alunos;
    private List<Atividade> atividades;

    public Professor(String nome, String matricula, String turma) {
        super(nome, matricula);
        this.turma = turma;
        this.alunos = new ArrayList<>();
        this.atividades = new ArrayList<>();
    }

    public void cadastrarAluno(Aluno aluno) {
        alunos.add(aluno);
    }

    public void cadastrarAtividade(Atividade atividade) {
        atividades.add(atividade);
    }

    public void corrigirAtividade(Atividade atividade, double valor, Conceito conceito) {
        Nota nota = new Nota(atividade, valor, conceito);
        atividade.getAlunoDestino().adicionarNota(nota);
    }

    public List<Aluno> getAlunos() {
        return alunos;
    }
}
