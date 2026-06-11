public class PagamentoCartao extends Pagamento {

    @Override
    public void processarPagamento(double valor) {
        System.out.println("Pagamento com cartão de crédito: R$ " + valor);
    }

}
