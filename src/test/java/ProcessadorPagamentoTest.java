import static junit.framework.Assert.assertEquals;

import org.junit.jupiter.api.Test;

public class ProcessadorPagamentoTest {

    @Test
    void testPagamentoCartaoCredito() {
        Pagamento pagamento = new PagamentoCartaoCredito("1234-5678-9012-3456", "12/25", "123");
        ProcessadorPagamento processador = new ProcessadorPagamento(pagamento);
        String resultado = processador.realizarPagamento(100.0);
        assertEquals("Pagamento com cartão de crédito processado com sucesso. Valor: R$100.0", resultado);
    }

    @Test
    void testPagamentoPix() {
        Pagamento pagamento = new PagamentoPix("24999546458");
        ProcessadorPagamento processador = new ProcessadorPagamento(pagamento);
        String resultado = processador.realizarPagamento(50.0);
        assertEquals("Pagamento via PIX processado com sucesso. Valor: R$50.0", resultado);
    }

    @Test
    void testAlteracaoDinamicaPagamento() {
        Pagamento pagamentoCartaoCredito = new PagamentoCartaoCredito("1234-5678-9012-3456", "12/25", "123");
        Pagamento pagamentoPix = new PagamentoPix("chavePix123");

        ProcessadorPagamento processador = new ProcessadorPagamento(pagamentoCartaoCredito);
        String resultado1 = processador.realizarPagamento(75.0);
        assertEquals("Pagamento com cartão de crédito processado com sucesso. Valor: R$75.0", resultado1);

        // Altera dinamicamente para PagamentoPix
        processador.Pagamento(pagamentoPix);
        String resultado2 = processador.realizarPagamento(30.0);
        assertEquals("Pagamento via PIX processado com sucesso. Valor: R$30.0", resultado2);
    }
}
