package mainPackage;

import java.util.Random;

public class Produto {
    private int id;
    private String nome;
    private double preco;

    Produto(int id, String nome, double preco) {
        this.id = id;
        this.nome = nome;
        this.preco = preco;
    }

    Produto(String nome, double preco) {
        Random random = new Random(9999);
        this.id = random.nextInt();
        this.nome = nome;
        this.preco = preco;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public double getPreco() {
        return preco;
    }

    public void mostrarDetalhes() {
        System.out.println(this.id);
        System.out.println(this.nome);
        System.out.println(this.preco);
        System.out.println("-------------------------------------");
    }
}
