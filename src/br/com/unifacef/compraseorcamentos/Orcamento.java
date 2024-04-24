package br.com.unifacef.compraseorcamentos;

public class Orcamento {
    private Integer id;
    private Double valor;
    private Solicitacao solicitacao;

    public Orcamento(Integer id, Double valor, Solicitacao solicitacao) {
        this.id = id;
        this.valor = valor;
        this.solicitacao = solicitacao;
    }

    public Integer getId() { return id; }
    public void setId(Integer id) { this.id = id; }
    public Double getValor() { return valor; }
    public void setValor(Double valor) { this.valor = valor; }
    public Solicitacao getSolicitacao() { return solicitacao; }
    public void setSolicitacao(Solicitacao solicitacao) { this.solicitacao = solicitacao; }

    public void VerificarOrcamentoDoPedido() {
        if (valor <= 1000.0) {
            System.out.println("Orçamento de R$" + valor + " verificado e aprovado para a solicitação " + solicitacao.getId());
        } else {
            System.out.println("Orçamento de R$" + valor + " verificado e rejeitado para a solicitação " + solicitacao.getId());
        }
    }
}