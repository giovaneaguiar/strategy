<h1 align="center">Strategy</h1>

<p>O Strategy é um padrão de projeto comportamental que permite que você defina uma família de algoritmos, 
  coloque-os em classes separadas, e faça os objetos deles intercambiáveis.
</p>

##

#### Exemplo 

<p>
O meu exemplo implementa um sistema de pagamentos, permitindo que diferentes estratégias de pagamento sejam implementadas de forma independente. 
  Atualmente, tenho duas implementações: PagamentoCartaoCredito para cartões de crédito e PagamentoPix para transações via PIX.

  A classe ProcessadorPagamento age como um intermediário, aceitando uma estratégia de pagamento e utilizando-a para processar pagamentos. Isso proporciona flexibilidade, 
  já que é possível alternar dinamicamente entre estratégias sem modificar a lógica do processamento de pagamento.
</p>


