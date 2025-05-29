import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Nome: ");
            String nome = sc.nextLine();

            System.out.print("Rua: ");
            String rua = sc.nextLine();

            System.out.print("Número: ");
            String numero = sc.nextLine();

            System.out.print("Cidade: ");
            String cidade = sc.nextLine();

            System.out.print("Estado: ");
            String estado = sc.nextLine();

            System.out.print("CEP: ");
            String cep = sc.nextLine();

            Endereco endereco = new Endereco(rua, numero, cidade, estado, cep);

            System.out.print("Telefone: ");
            String telefone = sc.nextLine();

            System.out.print("Email: ");
            String email = sc.nextLine();

            System.out.print("CPF: ");
            String cpf = sc.nextLine();

            System.out.print("Data de nascimento (dd/MM/yyyy): ");
            String dataStr = sc.nextLine();
            Date dataNascimento = new SimpleDateFormat("dd/MM/yyyy").parse(dataStr);

            ClientePF cliente = new ClientePF(nome, endereco, telefone, email, cpf, dataNascimento, "001");

            System.out.println("\nCliente cadastrado:");
            System.out.println("Nome: " + cliente.getNome());
            System.out.println("CPF: " + cliente.getCpf());
            System.out.println("Nascimento: " + cliente.getDataNascimento());
            System.out.println("Endereço: " + cliente.getEndereco().getRua() + ", " + cliente.getEndereco().getNumero());
        } catch (Exception e) {
            System.out.println("Erro ao processar: " + e.getMessage());
        }

        sc.close();
    }
}
