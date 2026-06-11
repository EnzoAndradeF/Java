public class PagamentoPix extends Pagamento {

    @Override
    public void processarPagamento(double valor) {
        System.out.println("Pagamento via Pix: R$ " + valor);
    }

}
