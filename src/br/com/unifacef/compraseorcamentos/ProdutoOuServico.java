package br.com.unifacef.compraseorcamentos;

public class ProdutoOuServico {
    private Integer id;
    private String nome;
    private String descricao;
    private Integer quantidade;

    public ProdutoOuServico(Integer id, String nome, String descricao, Integer quantidade) {
        this.id = id;
        this.nome = nome;
        this.descricao = descricao;
        this.quantidade = quantidade;
    }

    public Integer getId() { return id; }
    public void setId(Integer id) { this.id = id; }
    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }
    public String getDescricao() { return descricao; }
    public void setDescricao(String descricao) { this.descricao = descricao; }
    public Integer getQuantidade() { return quantidade; }
    public void setQuantidade(Integer quantidade) { this.quantidade = quantidade; }
}