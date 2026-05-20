package base;

public class Audio {
    private String titulo;
    private String duracao;
    private int totalCurtidas;
    private int totalReproduzicoes;
    private int classificacao;

    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public String getDuracao() {
        return duracao;
    }

    public int getTotalCurtidas() {
        return totalCurtidas;
    }

    public int getTotalReproduzicoes() {
        return totalReproduzicoes;
    }

    public int getClassificacao() {
        return classificacao;
    }
  
    public void curtir(){
        this.totalCurtidas++;
    }

    public void reproduzir(){
        this.totalReproduzicoes++;
    }

    
}
