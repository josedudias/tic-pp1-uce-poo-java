import br.com.unifacef.compraseorcamentos.Solicitante;
import br.com.unifacef.compraseorcamentos.ProdutoOuServico;
import br.com.unifacef.compraseorcamentos.Solicitacao;
import br.com.unifacef.compraseorcamentos.Gerente;
import br.com.unifacef.compraseorcamentos.Financeiro;
import br.com.unifacef.compraseorcamentos.Estoque;

public class Main {
    public static void main(String[] args) {
        Solicitante solicitante1 = new Solicitante(1, "João", "joao@example.com");
        ProdutoOuServico produto = new ProdutoOuServico(1, "Produto A", "Descrição do Produto A", 10);
        Solicitacao solicitacao1 = new Solicitacao(1, true, false, solicitante1, produto);
        Gerente gerente1 = new Gerente(1, "Maria");
        Financeiro financeiro1 = new Financeiro(1);
        Estoque estoque = new Estoque();

        estoque.adicionarProduto(produto, 20);

        solicitante1.SolicitarProdutoOuServico(produto);
        gerente1.AnalisarEAprovar(solicitacao1);
        gerente1.SolicitarOrcamento(solicitacao1);
        financeiro1.EfetuarPagamento(solicitacao1, estoque);
        financeiro1.NotificarSolicitantesEGerente(solicitante1, gerente1);
    }
}
