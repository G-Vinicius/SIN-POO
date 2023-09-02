package mainPackage;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Locale;

public class Main {
    public static void exibirMenu() {
        System.out.println("1. Adicionar produto");
        System.out.println("2. Listar produtos");
        System.out.println("3. Buscar produto por ID");
        System.out.println("4. Atualizar produto por ID");
        System.out.println("0. Sair");
    }

    public static void main(String[] args) {
        ArrayList<Produto> produtos = new ArrayList<>();
        CadastroProdutos cp = new CadastroProdutos(produtos);

        Scanner input = new Scanner(System.in).useLocale(Locale.US);

        int id, opcao;
        String nome;
        double preco;

        do {
            exibirMenu();
            opcao = input.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Insira o id");
                    id = input.nextInt();
                    System.out.println("Insira o nome");
                    nome = input.nextLine();
                    nome = input.nextLine();
                    System.out.println("Insira o preco");
                    preco = input.nextDouble();
                    Produto p = new Produto(id, nome, preco);
                    cp.adicionarProduto(p);
                    break;
                case 2:
                    cp.listarProdutos();
                    break;
                case 3:
                    System.out.println("Insira o ID");
                    id = input.nextInt();
                    Produto produtoProcurado = cp.buscarProduto(id);
                    if (produtoProcurado != null) {
                        produtoProcurado.mostrarDetalhes();
                    }
                    break;
                case 4:
                    System.out.println("Insira o ID");
                    id = input.nextInt();
                    System.out.println("Insra o novo nome");
                    nome = input.nextLine();
                    nome = input.nextLine();
                    System.out.println("Insira o novo preco");
                    preco = input.nextDouble();
                    cp.atualizarProduto(id, nome, preco);
                    break;
                case 0:
                    break;
            }

        } while (opcao != 0);
    }
}
