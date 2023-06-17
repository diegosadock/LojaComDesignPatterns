package br.com.alura.loja.imposto;

import br.com.alura.loja.orcamento.Orcamento;

import java.math.BigDecimal;

public class ICMSComISS extends Imposto {
    public ICMSComISS(Imposto outro) {
        super(outro);
    }

    public BigDecimal realizarCalculo(Orcamento orcamento) {
        BigDecimal icms = new ICMS(null).calcular(orcamento);
        BigDecimal iss = new ISS(null).calcular(orcamento);
        return icms.add(iss);
    }
}
