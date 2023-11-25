class PagamentoPix implements Pagamento {
    private String chavePix;

    public PagamentoPix(String chavePix) {
        this.chavePix = chavePix;
    }

    @Override
    public String processarPagamento(double valor) {

        return "Pagamento via PIX processado com sucesso. Valor: R$" + valor;
    }
}