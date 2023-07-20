package br.com.alura.loja.imposto;

import java.math.BigDecimal;

import br.com.alura.loja.orcamento.Orcamento;

public class CalculadoraDeImpostos {

    // Retiramos o algotimo dessa classe por que quanto mais impostos aparecer maior
    // fica esse metodo, oque nao é legal, entao separamos o algoritimo em classes
    // separadas, diminuindo a complexibilidade de um unico metodo ter muitas
    // condicoes
    public BigDecimal calcular(Orcamento orcamento, TipoImposto tipoImposto) {
        return tipoImposto.calcular(orcamento);
    }
}
