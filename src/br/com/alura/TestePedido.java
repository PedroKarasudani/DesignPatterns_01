package br.com.alura;

import java.math.BigDecimal;
import br.com.alura.loja.pedido.GeraPedido;
import br.com.alura.loja.pedido.GeraPedidoHandlers;

public class TestePedido {
    public static void main(String[] args) {
        String cliente = args[0];
        BigDecimal valorOrcamento = new BigDecimal(args[1]);
        int quantidadeItens = Integer.parseInt(args[2]);
        // MAIN REPRESENTACAO INTERFACE COM USUARIO, POR LINHA DE COMANDO, dados vindo
        // de maneira diferente do modelo anterior

        GeraPedido gerador = new GeraPedido(cliente, valorOrcamento, quantidadeItens); // separando os dados
        GeraPedidoHandlers handlers = new GeraPedidoHandlers(/* As dependencias externas */); // separando as
                                                                                              // dependencias
        handlers.executa(gerador);
    }
}
