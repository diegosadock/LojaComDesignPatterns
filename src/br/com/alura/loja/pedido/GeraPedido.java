package br.com.alura.loja.pedido;

import br.com.alura.loja.orcamento.Orcamento;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class GeraPedido {
    private String cliente;
    private BigDecimal valorDoOrcamento;
    private int quantidadeItens;

    public GeraPedido(String cliente, BigDecimal valorDoOrcamento, int quantidadeItens) {
        this.cliente = cliente;
        this.valorDoOrcamento = valorDoOrcamento;
        this.quantidadeItens = quantidadeItens;
    }

    public String getCliente() {
        return cliente;
    }

    public BigDecimal getValorDoOrcamento() {
        return valorDoOrcamento;
    }

    public int getQuantidadeItens() {
        return quantidadeItens;
    }
}
