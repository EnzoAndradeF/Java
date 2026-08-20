package exercicio2;

public class PeixeVenenoso extends Peixe {
    private boolean predador;

    public PeixeVenenoso(String especie, boolean predador) {
        super(especie);
        this.predador = predador;
    }

    public boolean isPredador() {
        return predador;
    }

    @Override
    public String toString() {
        return "PeixeVenenoso [predador=" + predador + ", Especie=" + getEspecie() + "]";
    }



}
