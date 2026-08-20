package exercicio1;

public class CaixaGenerica<T> {
    private T coisaNacaixa;

    public void guardar(T coisa) {
        this.coisaNacaixa = coisa;
    }

    public T pegar() {
        return coisaNacaixa;
    }

}
