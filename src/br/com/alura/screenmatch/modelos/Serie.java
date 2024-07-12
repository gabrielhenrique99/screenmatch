package br.com.alura.screenmatch.modelos;

// Definição da classe Serie que estende a classe Titulo
public class Serie extends Titulo {

    private int temporadas; // Número de temporadas da série
    private boolean ativa; // Indica se a série está ativa
    private int episodiosPorTemporada; // Número de episódios por temporada
    private int minutosPorEpisodio; // Duração de cada episódio em minutos

    // Construtor da classe Serie que chama o construtor da superclasse Titulo
    public Serie(String nome, int anoDeLancamento) {
        super(nome, anoDeLancamento); // Chama o construtor da superclasse Titulo
    }

    // Getter para o número de temporadas
    public int getTemporadas() {
        return temporadas;
    }

    // Setter para o número de temporadas
    public void setTemporadas(int temporadas) {
        this.temporadas = temporadas;
    }

    // Getter para o status ativo da série
    public boolean isAtiva() {
        return ativa;
    }

    // Setter para o status ativo da série
    public void setAtiva(boolean ativa) {
        this.ativa = ativa;
    }

    // Getter para o número de episódios por temporada
    public int getEpisodiosPorTemporada() {
        return episodiosPorTemporada;
    }

    // Setter para o número de episódios por temporada
    public void setEpisodiosPorTemporada(int episodiosPorTemporada) {
        this.episodiosPorTemporada = episodiosPorTemporada;
    }

    // Getter para a duração de cada episódio em minutos
    public int getMinutosPorEpisodio() {
        return minutosPorEpisodio;
    }

    // Setter para a duração de cada episódio em minutos
    public void setMinutosPorEpisodio(int minutosPorEpisodio) {
        this.minutosPorEpisodio = minutosPorEpisodio;
    }

    // Sobrescrita do método getDuracaoEmMinutos da classe Titulo
    @Override
    public int getDuracaoEmMinutos() {
        // Calcula a duração total da série em minutos
        return temporadas * episodiosPorTemporada * minutosPorEpisodio;
    }

    // Sobrescrita do método toString para fornecer uma representação em string do objeto Serie
    @Override
    public String toString() {
        // O @Override indica que estamos sobrescrevendo o método toString() da classe Titulo
        return "Série: " + this.getNome() + " (" + this.getAnoDeLancamento() + ")";
    }
}

