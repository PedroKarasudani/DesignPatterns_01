package br.com.alura;

import java.math.BigDecimal;

import br.com.alura.loja.orcamento.ItemOrcamento;
import br.com.alura.loja.orcamento.Orcamento;

public class TesteComposicao {
    public static void main(String[] args) {
        Orcamento antigo = new Orcamento();
        Orcamento novo = new Orcamento();

        antigo.adicionarItem(new ItemOrcamento(new BigDecimal("200")));
        novo.adicionarItem(new ItemOrcamento(new BigDecimal("500")));

        novo.adicionarItem(antigo);

        System.out.println(novo.getValor());
        System.out.println(novo.getValor());
    }
}
