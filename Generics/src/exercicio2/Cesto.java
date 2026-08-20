package exercicio2;

import java.util.ArrayList;
import java.util.List;

public class Cesto<T> {
    private List<T> peixes = new ArrayList<>();

    public Cesto() {
        this.peixes = new ArrayList<>();
    }

    public void guardar(T novoPeixe) {
        peixes.add(novoPeixe);
    }

    public void checarCesto() {
        if (peixes.isEmpty()) {
            System.out.println("Cesto vazio");
            return;
        }

        System.out.println("O cesto contém:");
        for (T peixe : peixes) {
            System.out.println(peixe);
        }
    }


}
