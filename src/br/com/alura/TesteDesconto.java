package br.com.alura;

import java.math.BigDecimal;

import br.com.alura.loja.desconto.CalculadoraDeDesconto;
import br.com.alura.loja.orcamento.ItemOrcamento;
import br.com.alura.loja.orcamento.Orcamento;

public class TesteDesconto {
    public static void main(String[] args) {
        Orcamento primeiroOrcamento = new Orcamento();
        Orcamento segundoOrcamento = new Orcamento();
        primeiroOrcamento.adicionarItem(new ItemOrcamento(new BigDecimal("100")));
        segundoOrcamento.adicionarItem(new ItemOrcamento(new BigDecimal("200")));

        CalculadoraDeDesconto valorDesconto = new CalculadoraDeDesconto();

        System.out.println(valorDesconto.calcular(primeiroOrcamento));
        System.out.println(valorDesconto.calcular(segundoOrcamento));

    }
}
