package model;

public class Veiculo {

    // Atributos
    private static int contador = 0;
    private int id;
    private String tipo;
    private String modelo;
    private int ano;
    private double kilometragem;
    private boolean disponivel;

    // Construtor
    public Veiculo(String tipo, String modelo, int ano, double kilometragem) {
        // throw → Lança manualmente uma exceção.
        if (ano < 1886) {
            throw new IllegalArgumentException("Ano inválido! O primeiro carro foi criado em 1886.");
        }

        if (kilometragem < 0) {
            throw new IllegalArgumentException("A kilometragem não pode ser negativa");
        }

        contador++;
        this.id = contador;
        this.tipo = tipo;
        this.modelo = modelo;
        this.ano = ano;
        this.kilometragem = kilometragem;
        this.disponivel = true;
    }

    // Método
    public void exibirInformacoes(){
        System.out.println("Id: " + getId());
        System.out.println("Tipo: " + getTipo());
        System.out.println("Modelo: " + getModelo());
        System.out.println("Ano: " + getAno());
        System.out.println("Kilometragem: " + getKilometragem());
        System.out.println("Status: " + (disponivel ? "Disponível" : "Vendido"));
    }

    // Getters
    public int getId() {
        return id;
    }
        
    public String getTipo() {
        return tipo;
    }

    public String getModelo() {
        return modelo;
    }

    public int getAno() {
        return ano;
    }

    public double getKilometragem() {
        return kilometragem;
    }

    public boolean isDisponivel() {
        return disponivel;
    }

    // Setters
    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }


}
