package br.com.alura;

import java.math.BigDecimal;

import br.com.alura.loja.http.JavaHttpCliente;
import br.com.alura.loja.orcamento.ItemOrcamento;
import br.com.alura.loja.orcamento.Orcamento;
import br.com.alura.loja.orcamento.RegistroDeOrcamento;

public class TesteAdapter {
    public static void main(String[] args) {
        ItemOrcamento banana = new ItemOrcamento(new BigDecimal("100"));
        Orcamento orcamento = new Orcamento();
        orcamento.adicionarItem(banana);
        orcamento.aprovar();
        orcamento.finalizar();

        RegistroDeOrcamento registro = new RegistroDeOrcamento(new JavaHttpCliente());
        registro.registrar(orcamento);
    }
}
