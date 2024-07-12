package br.com.alura.screenmatch.modelos;

// Importação da interface Classificavel
import br.com.alura.screenmatch.calculos.Classificavel;

// Definição da classe Filme que estende a classe Titulo e implementa a interface Classificavel
public class Filme extends Titulo implements Classificavel {

    private String diretor; // Diretor do filme

    // Construtor da classe Filme que chama o construtor da classe Titulo
    public Filme(String nome, int anoDeLancamento) {
        super(nome, anoDeLancamento);
    }

    // Getter para o diretor do filme
    public String getDiretor() {
        return diretor;
    }

    // Setter para o diretor do filme
    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    // Implementação do método getClassificacao da interface Classificavel
    @Override
    public int getClassificacao() {
        // O @Override indica que estamos sobrescrevendo o método getClassificacao() da interface Classificavel
        // Retorna a média das avaliações do filme dividida por 2, convertida para inteiro
        return (int) pegaMedia() / 2;
    }

    // Sobrescrita do método toString para fornecer uma representação em string do objeto Filme
    @Override
    public String toString() {
        // O @Override indica que estamos sobrescrevendo o método toString() da classe Titulo
        return "Filme: " + this.getNome() + " (" + this.getAnoDeLancamento() + ")";
    }
}

