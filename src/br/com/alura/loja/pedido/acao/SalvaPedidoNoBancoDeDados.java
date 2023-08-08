package br.com.alura.loja.pedido.acao;

import br.com.alura.loja.pedido.Pedido;

public class SalvaPedidoNoBancoDeDados implements AcaoAposGerarPedido {

    public void executar(Pedido pedido) {
        System.out.println("Salvar pedido no banco de dados");
    }

}
