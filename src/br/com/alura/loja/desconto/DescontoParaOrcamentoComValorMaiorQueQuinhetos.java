package br.com.alura.loja.desconto;

import java.math.BigDecimal;

import br.com.alura.loja.orcamento.Orcamento;

public class DescontoParaOrcamentoComValorMaiorQueQuinhetos extends Desconto {
    public DescontoParaOrcamentoComValorMaiorQueQuinhetos(Desconto proximo) {
        super(proximo);
    }

    @Override
    public BigDecimal efetuarCalculo(Orcamento orcamento) {
        return orcamento.getValor().multiply(new BigDecimal("0.1"));
    }

    @Override
    public boolean verifica(Orcamento orcamento) {
        if (orcamento.getValor().compareTo(new BigDecimal("500")) > 0) {
            return true;
        }
        return false;
    }

}
