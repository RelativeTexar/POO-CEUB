public class Main {
    public static void main(String[] args) {
        
        Professor prof = new Professor("Maria Silva", "P123", "1º Ano A");

        
        Aluno aluno1 = new Aluno("João Almeida", "A001", "1º Ano A");
        prof.cadastrarAluno(aluno1);

        
        Atividade atividade1 = new Atividade("Atividade de Matemática - Frações", aluno1);
        prof.cadastrarAtividade(atividade1);

        
        prof.corrigirAtividade(atividade1, 9.5, Conceito.A);

        
        System.out.println("Notas do aluno " + aluno1.getNome() + ":");
        for (Nota nota : aluno1.getNotas()) {
            System.out.println("Atividade: " + nota.getAtividade().getDescricao());
            System.out.println("Nota: " + nota.getValor());
            System.out.println("Conceito: " + nota.getConceito());
            System.out.println("-----------");
        }
    }
}
