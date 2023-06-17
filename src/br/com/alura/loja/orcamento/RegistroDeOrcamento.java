package br.com.alura.loja.orcamento;

import br.com.alura.loja.DomainException;
import br.com.alura.loja.http.HttpAdapter;

import java.io.IOException;
import java.util.Map;

public class RegistroDeOrcamento {
    private HttpAdapter http;

    public RegistroDeOrcamento(HttpAdapter http) {
        this.http = http;
    }

    public void registrar(Orcamento orcamento) throws IOException {
        if(!orcamento.isFinalizado()) {
            throw new DomainException("Orçamento não finalizado!");
        }

        String url = "https://api.externa/orcamento";
        Map<String, Object> dados = Map.of(
                "valor", orcamento.getValor(),
                "quantidadeItems", orcamento.getQuantidadeItens()
        );
        http.post(url, dados);

    }
}