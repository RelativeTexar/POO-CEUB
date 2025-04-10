import java.util.ArrayList;
import java.util.Date;

// Classe Cliente
class Cliente {
    private String nome;
    private String endereco;
    private ArrayList<Pedido> pedidos = new ArrayList<>();

    public Cliente(String nome, String endereco) {
        this.nome = nome;
        this.endereco = endereco;
    }

    public Pedido criarPedido() {
        Pedido novoPedido = new Pedido(this);
        pedidos.add(novoPedido);
        return novoPedido;
    }

    public String getNome() {
        return nome;
    }

    public String getEndereco() {
        return endereco;
    }
}

// Classe Pedido
class Pedido {
    private static int contador = 1;

    private int numero;
    private Date data;
    private ArrayList<Item> itens;
    private Cliente cliente;

    public Pedido(Cliente cliente) {
        this.numero = contador++;
        this.data = new Date();
        this.itens = new ArrayList<>();
        this.cliente = cliente;
    }

    public void adicionarItem(Item item) {
        itens.add(item);
    }

    public void removerItem(Item item) {
        itens.remove(item);
    }

    public double calcularTotal() {
        double total = 0;
        for (Item item : itens) {
            total += item.calcularPreco();
        }
        return total;
    }

    public int getNumero() {
        return numero;
    }

    public Date getData() {
        return data;
    }
}

// Classe Item
class Item {
    private Produto produto;
    private int quantidade;

    public Item(Produto produto, int quantidade) {
        this.produto = produto;
        this.quantidade = quantidade;
    }

    public double calcularPreco() {
        return produto.getPreco() * quantidade;
    }
}

// Classe Produto
class Produto {
    private String nome;
    private double preco;

    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }
}

// Classe principal
public class Main {
    public static void main(String[] args) {
        Cliente cliente = new Cliente("Gabriel", "Guará");
        Pedido pedido = cliente.criarPedido();

        Produto produto1 = new Produto("Teclado", 200.00);
        Produto produto2 = new Produto("Mouse", 150.00);

        Item item1 = new Item(produto1, 1);
        Item item2 = new Item(produto2, 2);

        pedido.adicionarItem(item1);
        pedido.adicionarItem(item2);

        System.out.println("Cliente: " + cliente.getNome());
        System.out.println("Endereço: " + cliente.getEndereco());
        System.out.println("Número do Pedido: " + pedido.getNumero());
        System.out.println("Data: " + pedido.getData());
        System.out.println("Total do Pedido: R$ " + pedido.calcularTotal());
    }
}
