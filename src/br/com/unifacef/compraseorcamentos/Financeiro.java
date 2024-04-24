package br.com.unifacef.compraseorcamentos;

public class Financeiro {
    private Integer id;
    private Boolean pagamentoEfetuado;

    public Financeiro(Integer id) {
        this.id = id;
    }

    public Integer getId() { return id; }
    public void setId(Integer id) { this.id = id; }
    public Boolean getPagamentoEfetuado() { return pagamentoEfetuado; }
    public void setPagamentoEfetuado(Boolean pagamentoEfetuado) { this.pagamentoEfetuado = pagamentoEfetuado; }

    public void EfetuarPagamento(Solicitacao solicitacao, Estoque estoque) {
        if (solicitacao.getAprovada() && estoque.verificarDisponibilidade(solicitacao.getProdutoOuServico())) {
            pagamentoEfetuado = true;
            System.out.println("Pagamento efetuado para a solicitação " + solicitacao.getId());
        } else {
            pagamentoEfetuado = false;
            System.out.println("Pagamento não efetuado para a solicitação " + solicitacao.getId() + " porque a solicitação não foi aprovada ou o produto não está em estoque");
        }
    }

    public void NotificarSolicitantesEGerente(Solicitante solicitante, Gerente gerente) {
        if (pagamentoEfetuado) {
            System.out.println("Notificação de pagamento efetuado enviada para o solicitante " + solicitante.getNome() + " e o gerente " + gerente.getNome());
        } else {
            System.out.println("Notificação de pagamento não efetuado enviada para o solicitante " + solicitante.getNome() + " e o gerente " + gerente.getNome());
        }
    }
}