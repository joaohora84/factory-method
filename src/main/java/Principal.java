import com.manoelcampos.exportador.Coluna;
import com.manoelcampos.exportador.ExportadorListaProduto;
import com.manoelcampos.exportador.Produto;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Executa a aplicação Exportador Simple Factory.
 * @author Manoel Campos da Silva Filho
 */
public class Principal {
    public static void main(String[] args) {

        List<Produto> produtos = Arrays.asList(

                new Produto("TV", 1000 ),
                new Produto("Geladeira", 2000),
                new Produto("Notebook", 5000)

        );

        ExportadorListaProduto exportadorMd = ExportadorListaProduto.newInstance("md");
        exportadorMd.addNewColuna(Principal::precoComDesconto, "Preço com desconto");

        ExportadorListaProduto exportadorHtml = ExportadorListaProduto.newInstance("html");
        exportadorHtml.addNewColuna(Principal::precoComDesconto, "Preço com desconto");

        System.out.println(exportadorMd.exportar(produtos));
        System.out.println(exportadorHtml.exportar(produtos));

    }

    private static double precoComDesconto(Produto produto){

        return produto.getPreco() * 0.9;

    }
}
