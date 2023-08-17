package br.com.alura;

import java.math.BigDecimal;

import br.com.alura.loja.imposto.CalculadoraDeImpostos;
import br.com.alura.loja.imposto.ICMS;
import br.com.alura.loja.imposto.ISS;
import br.com.alura.loja.orcamento.ItemOrcamento;
import br.com.alura.loja.orcamento.Orcamento;

public class TesteSomaImpostos {
    public static void main(String[] args) {
        ItemOrcamento banana = new ItemOrcamento(new BigDecimal("100"));
        Orcamento orcamento = new Orcamento();
        orcamento.adicionarItem(banana);
        CalculadoraDeImpostos valorImposto = new CalculadoraDeImpostos();

        System.out.println(valorImposto.calcular(orcamento, new ICMS(new ISS(null))));

    }

}
