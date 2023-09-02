package mainPackage;

import java.util.ArrayList;

public class CadastroProdutos {
    private ArrayList<Produto> produtos;

    CadastroProdutos(ArrayList<Produto> produtos) {
        this.produtos = produtos;
    }
    
    public void adicionarProduto(Produto p) {
        produtos.add(p);
    }
    
    public void listarProdutos() {
        for (Produto produto: produtos) {
            produto.mostrarDetalhes();
        }
    }
    
    public Produto buscarProduto(int id) {
        for (Produto produto: produtos) {
            if(id == produto.getId()) {
                return produto;
            }
        }
        System.out.println("Produto não encontrado");
        return null;
    }

    public void atualizarProduto(int id, String novoNome, double novoPreco) {
        Produto p = this.buscarProduto(id);
        if (p != null) {
            p.setNome(novoNome);
            p.setPreco(novoPreco);
        }
    }
    
}
