public class Nota {
    private Atividade atividade;
    private double valor;
    private Conceito conceito;

    public Nota(Atividade atividade, double valor, Conceito conceito) {
        this.atividade = atividade;
        this.valor = valor;
        this.conceito = conceito;
    }

    public Atividade getAtividade() {
        return atividade;
    }

    public double getValor() {
        return valor;
    }

    public Conceito getConceito() {
        return conceito;
    }
}
