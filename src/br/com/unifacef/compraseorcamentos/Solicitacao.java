package br.com.unifacef.compraseorcamentos;

public class Solicitacao {
    private Integer id;
    private Boolean urgente;
    private Boolean aprovada;
    private Solicitante solicitante;
    private ProdutoOuServico produtoOuServico;

    public Solicitacao(Integer id, Boolean urgente, Boolean aprovada, Solicitante solicitante, ProdutoOuServico produtoOuServico) {
        this.id = id;
        this.urgente = urgente;
        this.aprovada = aprovada;
        this.solicitante = solicitante;
        this.produtoOuServico = produtoOuServico;
    }

    public Integer getId() { return id; }
    public void setId(Integer id) { this.id = id; }
    public Boolean getUrgente() { return urgente; }
    public void setUrgente(Boolean urgente) { this.urgente = urgente; }
    public Boolean getAprovada() { return aprovada; }
    public void setAprovada(Boolean aprovada) { this.aprovada = aprovada; }
    public Solicitante getSolicitante() { return solicitante; }
    public void setSolicitante(Solicitante solicitante) { this.solicitante = solicitante; }
    public ProdutoOuServico getProdutoOuServico() { return produtoOuServico; }
    public void setProdutoOuServico(ProdutoOuServico produtoOuServico) { this.produtoOuServico = produtoOuServico; }
}