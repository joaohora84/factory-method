package com.manoelcampos.exportador;

import java.util.function.Function;

class ColunaMarkdown extends AbstractColuna{
    public ColunaMarkdown(Function<Produto, Object> obterValorColuna, String titulo) {
        super(obterValorColuna, titulo);
    }

    @Override
    public String abrir() {
        return "|";
    }

    @Override
    public String fechar() {
        return "";
    }
}
