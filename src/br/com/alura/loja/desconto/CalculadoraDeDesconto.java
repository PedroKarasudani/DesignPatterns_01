package br.com.alura.loja.desconto;

import java.math.BigDecimal;

import br.com.alura.loja.orcamento.Orcamento;

public class CalculadoraDeDesconto {

    public BigDecimal calcular(Orcamento orcamento) {
        // Colocamos os descontos em classe e se nao for busca o proximo, com algoritmos
        // diferentes
        Desconto desconto = new DescontoParaOrcamentoComMaisDeCincoItens(
                new DescontoParaOrcamentoComValorMaiorQueQuinhetos(
                        new SemDesconto()));
        return desconto.calcular(orcamento);
    }
}
