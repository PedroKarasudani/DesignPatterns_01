package br.com.alura;

import java.math.BigDecimal;

import br.com.alura.loja.imposto.CalculadoraDeImpostos;
import br.com.alura.loja.imposto.TipoImposto;
import br.com.alura.loja.orcamento.Orcamento;

public class TesteImpostos {
    public static void main(String[] args) {
        Orcamento novoOrcamento = new Orcamento(new BigDecimal(1000));
        CalculadoraDeImpostos valorImposto = new CalculadoraDeImpostos();

        System.out.println(valorImposto.calcular(novoOrcamento, TipoImposto.ICMS));
        System.out.println(valorImposto.calcular(novoOrcamento, TipoImposto.ISS));

    }
}
