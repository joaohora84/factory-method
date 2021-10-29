package com.manoelcampos.exportador;

import java.util.function.Function;

public abstract class AbstractColuna implements Coluna {

    private Function<Produto, Object> obterValorColuna;
    private String titulo;

    public AbstractColuna(Function<Produto, Object> obterValorColuna, String titulo) {
        this.obterValorColuna = obterValorColuna;
        this.titulo = titulo;
    }

    @Override
    public String getTitulo() {
        return titulo;
    }

    @Override
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    @Override
    public String exportarCabacalho() {

        return abrir() + titulo + fechar();
    }

    @Override
    public String exportarDado(Produto produto) {

        Object retorno = obterValorColuna.apply(produto);

        return abrir() + retorno.toString() + fechar();
    }
}
