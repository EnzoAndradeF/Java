package service;

import java.util.ArrayList;

import model.Veiculo;

public class GerenciadorAutoCar {
    
    // Criando uma lista dinâmica
    private ArrayList<Veiculo> veiculos;

    // Construtor
    public GerenciadorAutoCar(ArrayList<Veiculo> veiculos) {
        this.veiculos = veiculos;
    }

    // Métodos
    public void cadastrarVeiculo(Veiculo veiculo){
        // Tratando Unchecked: NullPointerException
        if (veiculo == null) {
            throw new NullPointerException("Não é possível cadastrar um veículo nulo");
        }
        veiculos.add(veiculo);
        System.out.println("Veiculo cadastrado! ID registrado: " + veiculo.getId());
    }

    public void exibirEstoque(){
        if (veiculos.isEmpty()) {
            System.out.println("Estoque vazio");
            return;
        }

        for (Veiculo veiculo : veiculos) {
            veiculo.exibirInformacoes();
            System.out.println("===============");
        }
    }

    public void venderVeiculo(int idveiculo){
        for (Veiculo veiculo : veiculos) {

            if (idveiculo == veiculo.getId()) {

                if (veiculo.isDisponivel()) {

                    veiculo.setDisponivel(false);
                    System.out.println("Venda realizada com sucesso!");

                } else {
                    System.out.println("Este veículo já foi vendido");
                }               
                return;  
            }
        }
        
        System.out.println("Veículo com id: '" + idveiculo + "' não existe");
    }

    

}
