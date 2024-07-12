package br.com.alura.screenmatch.modelos;

// Importação da interface Classificavel
import br.com.alura.screenmatch.calculos.Classificavel;

// Definição da classe Episodio que implementa a interface Classificavel
public class Episodio implements Classificavel {
    private int numero; // Número do episódio
    private String nome; // Nome do episódio
    private Serie serie; // Série à qual o episódio pertence
    private int totalVisualizacoes; // Total de visualizações do episódio

    // Getter para o número do episódio
    public int getNumero() {
        return numero;
    }

    // Setter para o número do episódio
    public void setNumero(int numero) {
        this.numero = numero;
    }

    // Getter para o nome do episódio
    public String getNome() {
        return nome;
    }

    // Setter para o nome do episódio
    public void setNome(String nome) {
        this.nome = nome;
    }

    // Getter para a série à qual o episódio pertence
    public Serie getSerie() {
        return serie;
    }

    // Setter para a série à qual o episódio pertence
    public void setSerie(Serie serie) {
        this.serie = serie;
    }

    // Getter para o total de visualizações do episódio
    public int getTotalVisualizacoes() {
        return totalVisualizacoes;
    }

    // Setter para o total de visualizações do episódio
    public void setTotalVisualizacoes(int totalVisualizacoes) {
        this.totalVisualizacoes = totalVisualizacoes;
    }

    // Implementação do método getClassificacao da interface Classificavel
    @Override
    public int getClassificacao() {
        // O @Override indica que estamos sobrescrevendo o método getClassificacao() da interface Classificavel
        // Retorna 4 se o total de visualizações for maior que 100, senão retorna 2
        if (totalVisualizacoes > 100) {
            return 4;
        } else {
            return 2;
        }
    }
}

