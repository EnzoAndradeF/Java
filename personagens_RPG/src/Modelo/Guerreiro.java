package Modelo;

public class Guerreiro extends Personagem{

    public Guerreiro(String nome, int vida, int ataque) {
        super(nome, vida, ataque);
    }

    @Override
    public void usarHabilidade() {
        //GOLPE PESADO CAUSANDO *2 DE ATAQUE
        double dano = getAtaque() *2;

        System.out.println(getNome() + " usou GOLPE PESADO casando " + dano + " de dano");
    }

    
    
}
