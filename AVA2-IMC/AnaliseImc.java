import java.util.Scanner;

// Classe que representa uma Pessoa
class Pessoa {
    private String nome;
    private double peso;
    private double altura;

    public Pessoa(String nome, double peso, double altura) {
        this.nome = nome;
        this.peso = peso;
        this.altura = altura;
    }

    public String getNome() {
        return nome;
    }

    public double getPeso() {
        return peso;
    }

    public double getAltura() {
        return altura;
    }
}

// Classe que faz o cálculo do IMC e retorna a análise
class IMC {
    public static double calcularIMC(Pessoa pessoa) {
        return pessoa.getPeso() / (pessoa.getAltura() * pessoa.getAltura());
    }

    public static String analisarIMC(double imc) {
        if (imc < 18.5) {
            return "Baixo peso. Consulte um médico.";
        } else if (imc >= 18.5 && imc < 25) {
            return "Peso adequado.";
        } else if (imc >= 25 && imc < 30) {
            return "Sobrepeso. Atenção aos hábitos.";
        } else if (imc >= 30 && imc < 35) {
            return "Obesidade grau I. Busque orientação médica.";
        } else if (imc >= 35 && imc < 40) {
            return "Obesidade grau II. Risco elevado, procure um médico.";
        } else {
            return "Obesidade grau III. Alto risco, consulte um médico urgentemente.";
        }
    }
}

// Classe principal para interação com o usuário
public class AnaliseImc {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        String nome = scanner.nextLine();

        System.out.print("Digite seu peso (kg): ");
        double peso = scanner.nextDouble();

        System.out.print("Digite sua altura (m): ");
        double altura = scanner.nextDouble();

        Pessoa pessoa = new Pessoa(nome, peso, altura);
        double imc = IMC.calcularIMC(pessoa);
        String analise = IMC.analisarIMC(imc);

        System.out.printf("\nNome: %s\nIMC: %.2f\nAnálise: %s\n", pessoa.getNome(), imc, analise);

        scanner.close();
    }
}
