package br.com.alura;

import java.math.BigDecimal;

import br.com.alura.loja.desconto.CalculadoraDeDesconto;
import br.com.alura.loja.orcamento.Orcamento;

public class TesteDesconto {
    public static void main(String[] args) {
        Orcamento primeiroOrcamento = new Orcamento(new BigDecimal(100), 6);
        Orcamento segundoOrcamento = new Orcamento(new BigDecimal(600), 1);
        CalculadoraDeDesconto valorDesconto = new CalculadoraDeDesconto();

        System.out.println(valorDesconto.calcular(primeiroOrcamento));
        System.out.println(valorDesconto.calcular(segundoOrcamento));

    }
}
