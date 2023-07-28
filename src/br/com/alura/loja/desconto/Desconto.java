package br.com.alura.loja.desconto;

import java.math.BigDecimal;

import br.com.alura.loja.orcamento.Orcamento;

public abstract class Desconto {

    protected Desconto proximo;

    public Desconto(Desconto proximo) {
        this.proximo = proximo;
    }

    // Tiramos o metodo das classes filha que se repetem, adionando nelas metodos
    // abstract
    public BigDecimal calcular(Orcamento orcamento) {
        if (this.verifica(orcamento)) {
            return this.efetuarCalculo(orcamento);
        }
        return proximo.calcular(orcamento);
    }

    // metos implementados na classe filha
    public abstract BigDecimal efetuarCalculo(Orcamento orcamento);

    public abstract boolean verifica(Orcamento orcamento);
}
