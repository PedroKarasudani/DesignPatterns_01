package br.com.alura.loja.pedido;

import java.time.LocalDateTime;

import br.com.alura.loja.orcamento.Orcamento;
import br.com.alura.loja.pedido.acao.EnviaEmailPedido;
import br.com.alura.loja.pedido.acao.SalvaPedidoNoBancoDeDados;

public class GeraPedidoHandlers {
    // construtor com injecao de dependencia externas: repository, service, etc..

    public void executa(GeraPedido dados) {
        Orcamento orcamento = new Orcamento(dados.getValorOrcamento(), dados.getQuantidadeItens());

        Pedido pedido = new Pedido(dados.getCliente(), LocalDateTime.now(), orcamento);

        EnviaEmailPedido enviaEmail = new EnviaEmailPedido();
        SalvaPedidoNoBancoDeDados salvaPedido = new SalvaPedidoNoBancoDeDados();

        enviaEmail.executar(pedido);
        salvaPedido.executar(pedido);
    }
}
