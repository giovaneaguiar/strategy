class PagamentoCartaoCredito implements Pagamento {
    private String numeroCartao;
    private String dataExpiracao;
    private String cvv;

    public PagamentoCartaoCredito(String numeroCartao, String dataExpiracao, String cvv) {
        this.numeroCartao = numeroCartao;
        this.dataExpiracao = dataExpiracao;
        this.cvv = cvv;
    }

    public String processarPagamento(double valor) {
        return "Pagamento com cartão de crédito processado com sucesso. Valor: R$" + valor;
    }
}

