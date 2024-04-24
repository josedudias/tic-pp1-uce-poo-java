package br.com.unifacef.compraseorcamentos;

public class Solicitante {
    private Integer id;
    private String nome;
    private String contato;

    public Solicitante(Integer id, String nome, String contato) {
        this.id = id;
        this.nome = nome;
        this.contato = contato;
    }

    public Integer getId() { return id; }
    public void setId(Integer id) { this.id = id; }
    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }
    public String getContato() { return contato; }
    public void setContato(String contato) { this.contato = contato; }

    public void SolicitarProdutoOuServico(ProdutoOuServico produto) {
        System.out.println("Solicitante " + nome + " está solicitando " + produto.getQuantidade() + " unidades do produto ou serviço: " + produto.getNome());
    }

    public void NotificarNegacaoDoOrcamento() {
        System.out.println("Solicitante " + nome + " foi notificado sobre a negação do orçamento.");
    }
}