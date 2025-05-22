public class Atividade {
    private String descricao;
    private Aluno alunoDestino;

    public Atividade(String descricao, Aluno alunoDestino) {
        this.descricao = descricao;
        this.alunoDestino = alunoDestino;
    }

    public String getDescricao() {
        return descricao;
    }

    public Aluno getAlunoDestino() {
        return alunoDestino;
    }
}
