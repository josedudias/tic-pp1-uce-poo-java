package br.com.unifacef.compraseorcamentos;

import java.util.HashMap;
import java.util.Map;

public class Estoque {
    private Map<ProdutoOuServico, Integer> produtosEmEstoque;

    public Estoque() {
        this.produtosEmEstoque = new HashMap<>();
    }

    public void adicionarProduto(ProdutoOuServico produto, Integer quantidade) {
        produtosEmEstoque.put(produto, quantidade);
    }

    public boolean verificarDisponibilidade(ProdutoOuServico produto) {
        return produtosEmEstoque.getOrDefault(produto, 0) > 0;
    }
}