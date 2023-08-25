package br.com.alura;

import java.math.BigDecimal;

import br.com.alura.loja.orcamento.ItemOrcamento;
import br.com.alura.loja.orcamento.Orcamento;
import br.com.alura.loja.orcamento.OrcamentoProxy;

public class TesteComposicao {
    public static void main(String[] args) {
        Orcamento antigo = new Orcamento();
        Orcamento novo = new Orcamento();

        antigo.adicionarItem(new ItemOrcamento(new BigDecimal("200")));
        novo.adicionarItem(new ItemOrcamento(new BigDecimal("500")));

        novo.adicionarItem(antigo);

        OrcamentoProxy proxy = new OrcamentoProxy(novo); // Com proxy o dado fica em memoria

        System.out.println(proxy.getValor());
        System.out.println(proxy.getValor());
        System.out.println(proxy.getValor());
        System.out.println(proxy.getValor());
        System.out.println(proxy.getValor());
        System.out.println(proxy.getValor());
    }
}
