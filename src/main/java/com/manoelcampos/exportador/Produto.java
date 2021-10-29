package com.manoelcampos.exportador;

/**
 * @author Manoel Campos da Silva Filho
 */
public class Produto {
    /**
     * Último ID gerado automaticamente.
     */
    private static int ultimoId = 0;

    private int id;
    private String descricao;
    private double preco;


    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }




    public Produto(){
        this.id = ++ultimoId;
    }

    /**
     * Construtor que inicializa todos os atributos do produto.
     * Ele possui uma grande quantidade de parâmetros, que não é recomendável
     * por tornar a chamada do método confusa.
     * Ele foi usado aqui apenas para exigir menos linhas para instanciar um produto.
     * Sempre que possível, defina métodos com no máximo 3 parâmetros.
     *
     * @param descricao
     */
    public Produto(String descricao, double preco) {
        this();
        this.descricao = descricao;
        this.preco = preco;
    }

    public int getId() {
        return id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }


}
