package com.fincatto.nfe.classes.nota;

import java.math.BigDecimal;

import org.junit.Assert;
import org.junit.Test;

import com.fincatto.nfe.classes.NFNotaInfoImpostoTributacaoICMS;
import com.fincatto.nfe.classes.NFNotaInfoItemImpostoICMSModalidadeBaseCalulo;
import com.fincatto.nfe.classes.NFOrigem;

public class NFNotaInfoItemImpostoICMS20Test {

    @Test(expected = IllegalStateException.class)
    public void naoDevePermitirPercentualAliquotaComTamanhoInvalido() {
        new NFNotaInfoItemImpostoICMS20().setPercentualAliquota(new BigDecimal("100"));
    }

    @Test(expected = IllegalStateException.class)
    public void naoDevePermitirPercentualReducaoBCComTamanhoInvalido() {
        new NFNotaInfoItemImpostoICMS20().setPercentualReducaoBC(new BigDecimal("100"));
    }

    @Test(expected = IllegalStateException.class)
    public void naoDevePermitirValorBCICMSComTamanhoInvalido() {
        new NFNotaInfoItemImpostoICMS20().setValorBCICMS(new BigDecimal("1000000000000"));
    }

    @Test(expected = IllegalStateException.class)
    public void naoDevePermitirValorTributoComTamanhoInvalido() {
        new NFNotaInfoItemImpostoICMS20().setValorTributo(new BigDecimal("1000000000000"));
    }

    @Test
    public void devePermitirDesoneracaoNulo() {
        final NFNotaInfoItemImpostoICMS20 icms20 = new NFNotaInfoItemImpostoICMS20();
        icms20.setOrigem(NFOrigem.NACIONAL);
        icms20.setPercentualAliquota(new BigDecimal("99.99"));
        icms20.setPercentualReducaoBC(new BigDecimal("99.99"));
        icms20.setSituacaoTributaria(NFNotaInfoImpostoTributacaoICMS.ISENTA);
        icms20.setValorBCICMS(new BigDecimal("999999999999.99"));
        icms20.setValorTributo(new BigDecimal("999999999999.99"));
        icms20.setValorICMSDesoneracao(new BigDecimal("999999999999.99"));
        icms20.setModalidadeBaseCalculo(NFNotaInfoItemImpostoICMSModalidadeBaseCalulo.PAUTA);
        icms20.toString();
    }

    @Test
    public void devePermitirValorICMSDesoneracaoNulo() {
        final NFNotaInfoItemImpostoICMS20 icms20 = new NFNotaInfoItemImpostoICMS20();
        icms20.setOrigem(NFOrigem.NACIONAL);
        icms20.setPercentualAliquota(new BigDecimal("99.99"));
        icms20.setPercentualReducaoBC(new BigDecimal("99.99"));
        icms20.setSituacaoTributaria(NFNotaInfoImpostoTributacaoICMS.ISENTA);
        icms20.setValorBCICMS(new BigDecimal("999999999999.99"));
        icms20.setValorTributo(new BigDecimal("999999999999.99"));
        icms20.setDesoneracao(NFNotaInfoMotivoDesoneracaoICMS.OUTROS);
        icms20.setModalidadeBaseCalculo(NFNotaInfoItemImpostoICMSModalidadeBaseCalulo.PAUTA);
        icms20.toString();
    }

    @Test(expected = IllegalStateException.class)
    public void naoDevePermitirModalidadeBaseCalculoNulo() {
        final NFNotaInfoItemImpostoICMS20 icms20 = new NFNotaInfoItemImpostoICMS20();
        icms20.setOrigem(NFOrigem.NACIONAL);
        icms20.setPercentualAliquota(new BigDecimal("99.99"));
        icms20.setPercentualReducaoBC(new BigDecimal("99.99"));
        icms20.setSituacaoTributaria(NFNotaInfoImpostoTributacaoICMS.ISENTA);
        icms20.setValorBCICMS(new BigDecimal("999999999999.99"));
        icms20.setValorTributo(new BigDecimal("999999999999.99"));
        icms20.setDesoneracao(NFNotaInfoMotivoDesoneracaoICMS.OUTROS);
        icms20.setValorICMSDesoneracao(new BigDecimal("999999999999.99"));
        icms20.toString();
    }

    @Test(expected = IllegalStateException.class)
    public void naoDevePermitirOrigemNulo() {
        final NFNotaInfoItemImpostoICMS20 icms20 = new NFNotaInfoItemImpostoICMS20();
        icms20.setModalidadeBaseCalculo(NFNotaInfoItemImpostoICMSModalidadeBaseCalulo.PAUTA);
        icms20.setPercentualAliquota(new BigDecimal("99.99"));
        icms20.setPercentualReducaoBC(new BigDecimal("99.99"));
        icms20.setSituacaoTributaria(NFNotaInfoImpostoTributacaoICMS.ISENTA);
        icms20.setValorBCICMS(new BigDecimal("999999999999.99"));
        icms20.setValorTributo(new BigDecimal("999999999999.99"));
        icms20.setDesoneracao(NFNotaInfoMotivoDesoneracaoICMS.OUTROS);
        icms20.setValorICMSDesoneracao(new BigDecimal("999999999999.99"));
        icms20.toString();
    }

    @Test(expected = IllegalStateException.class)
    public void naoDevePermitirPercentualAliquotaNulo() {
        final NFNotaInfoItemImpostoICMS20 icms20 = new NFNotaInfoItemImpostoICMS20();
        icms20.setModalidadeBaseCalculo(NFNotaInfoItemImpostoICMSModalidadeBaseCalulo.PAUTA);
        icms20.setOrigem(NFOrigem.NACIONAL);
        icms20.setPercentualReducaoBC(new BigDecimal("99.99"));
        icms20.setSituacaoTributaria(NFNotaInfoImpostoTributacaoICMS.ISENTA);
        icms20.setValorBCICMS(new BigDecimal("999999999999.99"));
        icms20.setValorTributo(new BigDecimal("999999999999.99"));
        icms20.setDesoneracao(NFNotaInfoMotivoDesoneracaoICMS.OUTROS);
        icms20.setValorICMSDesoneracao(new BigDecimal("999999999999.99"));
        icms20.toString();
    }

    @Test(expected = IllegalStateException.class)
    public void naoDevePermitirPercentualReducaoBCNulo() {
        final NFNotaInfoItemImpostoICMS20 icms20 = new NFNotaInfoItemImpostoICMS20();
        icms20.setModalidadeBaseCalculo(NFNotaInfoItemImpostoICMSModalidadeBaseCalulo.PAUTA);
        icms20.setOrigem(NFOrigem.NACIONAL);
        icms20.setPercentualAliquota(new BigDecimal("99.99"));
        icms20.setSituacaoTributaria(NFNotaInfoImpostoTributacaoICMS.ISENTA);
        icms20.setValorBCICMS(new BigDecimal("999999999999.99"));
        icms20.setValorTributo(new BigDecimal("999999999999.99"));
        icms20.setDesoneracao(NFNotaInfoMotivoDesoneracaoICMS.OUTROS);
        icms20.setValorICMSDesoneracao(new BigDecimal("999999999999.99"));
        icms20.toString();
    }

    @Test(expected = IllegalStateException.class)
    public void naoDevePermitirSituacaoTributariaNulo() {
        final NFNotaInfoItemImpostoICMS20 icms20 = new NFNotaInfoItemImpostoICMS20();
        icms20.setModalidadeBaseCalculo(NFNotaInfoItemImpostoICMSModalidadeBaseCalulo.PAUTA);
        icms20.setOrigem(NFOrigem.NACIONAL);
        icms20.setPercentualAliquota(new BigDecimal("99.99"));
        icms20.setPercentualReducaoBC(new BigDecimal("99.99"));
        icms20.setValorBCICMS(new BigDecimal("999999999999.99"));
        icms20.setValorTributo(new BigDecimal("999999999999.99"));
        icms20.setDesoneracao(NFNotaInfoMotivoDesoneracaoICMS.OUTROS);
        icms20.setValorICMSDesoneracao(new BigDecimal("999999999999.99"));
        icms20.toString();
    }

    @Test(expected = IllegalStateException.class)
    public void naoDevePermitirValorBCICMSNulo() {
        final NFNotaInfoItemImpostoICMS20 icms20 = new NFNotaInfoItemImpostoICMS20();
        icms20.setModalidadeBaseCalculo(NFNotaInfoItemImpostoICMSModalidadeBaseCalulo.PAUTA);
        icms20.setOrigem(NFOrigem.NACIONAL);
        icms20.setPercentualAliquota(new BigDecimal("99.99"));
        icms20.setPercentualReducaoBC(new BigDecimal("99.99"));
        icms20.setSituacaoTributaria(NFNotaInfoImpostoTributacaoICMS.ISENTA);
        icms20.setValorTributo(new BigDecimal("999999999999.99"));
        icms20.setDesoneracao(NFNotaInfoMotivoDesoneracaoICMS.OUTROS);
        icms20.setValorICMSDesoneracao(new BigDecimal("999999999999.99"));
        icms20.toString();
    }

    @Test(expected = IllegalStateException.class)
    public void naoDevePermitirValorTributoNulo() {
        final NFNotaInfoItemImpostoICMS20 icms20 = new NFNotaInfoItemImpostoICMS20();
        icms20.setModalidadeBaseCalculo(NFNotaInfoItemImpostoICMSModalidadeBaseCalulo.PAUTA);
        icms20.setOrigem(NFOrigem.NACIONAL);
        icms20.setPercentualAliquota(new BigDecimal("99.99"));
        icms20.setPercentualReducaoBC(new BigDecimal("99.99"));
        icms20.setSituacaoTributaria(NFNotaInfoImpostoTributacaoICMS.ISENTA);
        icms20.setValorBCICMS(new BigDecimal("999999999999.99"));
        icms20.setDesoneracao(NFNotaInfoMotivoDesoneracaoICMS.OUTROS);
        icms20.setValorICMSDesoneracao(new BigDecimal("999999999999.99"));
        icms20.toString();
    }

    @Test
    public void deveGerarXMLDeAcordoComOPadraoEstabelecido() {
        final NFNotaInfoItemImpostoICMS20 icms20 = new NFNotaInfoItemImpostoICMS20();
        icms20.setModalidadeBaseCalculo(NFNotaInfoItemImpostoICMSModalidadeBaseCalulo.PAUTA);
        icms20.setOrigem(NFOrigem.NACIONAL);
        icms20.setPercentualAliquota(new BigDecimal("99.99"));
        icms20.setPercentualReducaoBC(new BigDecimal("99.99"));
        icms20.setSituacaoTributaria(NFNotaInfoImpostoTributacaoICMS.ISENTA);
        icms20.setValorBCICMS(new BigDecimal("999999999999.99"));
        icms20.setValorTributo(new BigDecimal("999999999999.99"));
        icms20.setDesoneracao(NFNotaInfoMotivoDesoneracaoICMS.OUTROS);
        icms20.setValorICMSDesoneracao(new BigDecimal("999999999999.99"));

        final String xmlEsperado = "<NFNotaInfoItemImpostoICMS20><orig>0</orig><CST>40</CST><modBC>1</modBC><pRedBC>99.99</pRedBC><vBC>999999999999.99</vBC><pICMS>99.99</pICMS><vICMS>999999999999.99</vICMS><vICMSDeson>999999999999.99</vICMSDeson><motDesICMS>9</motDesICMS></NFNotaInfoItemImpostoICMS20>";
        Assert.assertEquals(xmlEsperado, icms20.toString());
    }
}