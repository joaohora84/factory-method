package com.manoelcampos.exportador;

import java.util.function.Function;

class ColunaHtml extends AbstractColuna {
    public ColunaHtml(Function<Produto, Object> obterValorColuna, String titulo) {
        super(obterValorColuna, titulo);
    }

    @Override
    public String abrir() {
        return "<td>";
    }

    @Override
    public String fechar() {
        return "</td>";
    }
}
