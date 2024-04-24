package br.com.unifacef.compraseorcamentos;

public class Gerente {
    private Integer id;
    private String nome;

    public Gerente(Integer id, String nome) {
        this.id = id;
        this.nome = nome;
    }

    public Integer getId() { return id; }
    public void setId(Integer id) { this.id = id; }
    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }

    public void AnalisarEAprovar(Solicitacao solicitacao) {
        if (solicitacao.getUrgente()) {
            solicitacao.setAprovada(true);
            System.out.println("Gerente " + nome + " analisou e aprovou urgentemente a solicitação " + solicitacao.getId());
        } else {
            solicitacao.setAprovada(false);
            System.out.println("Gerente " + nome + " analisou e rejeitou a solicitação " + solicitacao.getId());
        }
    }

    public void SolicitarOrcamento(Solicitacao solicitacao) {
        Orcamento orcamento = new Orcamento(1, 1000.0, solicitacao);
        orcamento.VerificarOrcamentoDoPedido();
    }

    public void AnalisarEAprovarCotacao(Orcamento orcamento) {
        if (orcamento.getValor() <= 1000.0) {
            System.out.println("Gerente " + nome + " analisou e aprovou a cotação de R$" + orcamento.getValor());
        } else {
            System.out.println("Gerente " + nome + " analisou e rejeitou a cotação de R$" + orcamento.getValor());
        }
    }
}