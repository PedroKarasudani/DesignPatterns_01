package br.com.alura;

import java.math.BigDecimal;

import br.com.alura.loja.desconto.CalculadoraDeDesconto;
import br.com.alura.loja.orcamento.ItemOrcamento;
import br.com.alura.loja.orcamento.Orcamento;

public class TesteDesconto {
    public static void main(String[] args) {
        ItemOrcamento banana = new ItemOrcamento(new BigDecimal("100"));
        ItemOrcamento uva = new ItemOrcamento(new BigDecimal("200"));
        Orcamento primeiroOrcamento = new Orcamento();
        Orcamento segundoOrcamento = new Orcamento();
        primeiroOrcamento.adicionarItem(banana);
        segundoOrcamento.adicionarItem(uva);
        CalculadoraDeDesconto valorDesconto = new CalculadoraDeDesconto();

        System.out.println(valorDesconto.calcular(primeiroOrcamento));
        System.out.println(valorDesconto.calcular(segundoOrcamento));

    }
}
