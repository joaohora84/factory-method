package com.manoelcampos.exportador;

public interface Coluna {

    String getTitulo();
    void setTitulo(String titulo);
    String abrir();
    String fechar();
    String exportarCabacalho();
    String exportarDado(Produto produto);

}
