package br.com.alura;

import java.math.BigDecimal;
import java.util.Arrays;

import br.com.alura.loja.orcamento.ItemOrcamento;
import br.com.alura.loja.pedido.GeraPedido;
import br.com.alura.loja.pedido.GeraPedidoHandlers;
import br.com.alura.loja.pedido.acao.EnviaEmailPedido;
import br.com.alura.loja.pedido.acao.LogDePedido;
import br.com.alura.loja.pedido.acao.SalvaPedidoNoBancoDeDados;

public class TestePedido {
    public static void main(String[] args) {
        String cliente = "Rodrigo";

        ItemOrcamento banana = new ItemOrcamento(new BigDecimal("300"));
        // MAIN REPRESENTACAO INTERFACE COM USUARIO, POR LINHA DE COMANDO, dados vindo
        // de maneira diferente do modelo anterior

        GeraPedido gerador = new GeraPedido(cliente, banana); // separando os dados
        GeraPedidoHandlers handlers = new GeraPedidoHandlers(
                Arrays.asList(new SalvaPedidoNoBancoDeDados(), new EnviaEmailPedido(), new LogDePedido())); // separando
                                                                                                            // as
                                                                                                            // dependencias

        handlers.executa(gerador);
    }
}
