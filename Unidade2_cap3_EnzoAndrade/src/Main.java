public class Main {
    public static void main(String[] args) {
        Pagamento[] pagamentos = new Pagamento[2];

        pagamentos[0] = new PagamentoCartao();
        pagamentos[1] = new PagamentoPix();

        for (Pagamento pagamento : pagamentos) {
            pagamento.processarPagamento(500);
        }
    }
}
