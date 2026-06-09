import java.time.LocalDate;

public class ProdutoAlimenticio extends Produto {
    private LocalDate dataValidade;

    public ProdutoAlimenticio(String nome, LocalDate dataValidade) {
        super(nome);
        this.dataValidade = dataValidade;
    }

    public LocalDate getDataValidade() {
        return dataValidade;
    }

    public void setDataValidade(LocalDate dataValidade) {
        this.dataValidade = dataValidade;
    }

    public boolean estaVencido() {
        LocalDate dataAtual = LocalDate.now();
        return dataAtual.isAfter(dataValidade);
    }

}
