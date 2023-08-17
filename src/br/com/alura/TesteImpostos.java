package br.com.alura;

import java.math.BigDecimal;

import br.com.alura.loja.imposto.CalculadoraDeImpostos;
import br.com.alura.loja.imposto.ICMS;
import br.com.alura.loja.imposto.ISS;
import br.com.alura.loja.orcamento.ItemOrcamento;
import br.com.alura.loja.orcamento.Orcamento;

public class TesteImpostos {
    public static void main(String[] args) {
        ItemOrcamento banana = new ItemOrcamento(new BigDecimal("100"));
        Orcamento novoOrcamento = new Orcamento();
        novoOrcamento.adicionarItem(banana);
        CalculadoraDeImpostos valorImposto = new CalculadoraDeImpostos();

        System.out.println(valorImposto.calcular(novoOrcamento, new ICMS(null)));
        System.out.println(valorImposto.calcular(novoOrcamento, new ISS(null)));

    }
}
