package br.com.alura.loja.pedido;

import java.math.BigDecimal;

import br.com.alura.loja.orcamento.ItemOrcamento;

public class GeraPedido {
    private String cliente;
    private BigDecimal valorOrcamento;

    public GeraPedido(String cliente, ItemOrcamento item) {
        this.cliente = cliente;
        this.valorOrcamento = item.getValor();
    }

    public String getCliente() {
        return cliente;
    }

    public BigDecimal getValorOrcamento() {
        return valorOrcamento;
    }

}