package exercicio2;

public class PeixeComivel extends Peixe {
    private String porte;

    public PeixeComivel(String especie, String porte) {
        super(especie);
        this.porte = porte;
    }

    public String getPorte() {
        return porte;
    }

    @Override
    public String toString() {
        return "PeixeComivel [porte=" + porte + ", Especie=" + getEspecie() + "]";
    }



}
