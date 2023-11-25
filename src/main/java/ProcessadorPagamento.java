public class ProcessadorPagamento {
    private Pagamento pagamento;

    public ProcessadorPagamento(Pagamento pagamento) {
        this.pagamento = pagamento;
    }

    public String realizarPagamento(double valor) {
        return pagamento.processarPagamento(valor);
    }

    public void Pagamento(Pagamento pagamento) {
        this.pagamento = pagamento;
    }
}