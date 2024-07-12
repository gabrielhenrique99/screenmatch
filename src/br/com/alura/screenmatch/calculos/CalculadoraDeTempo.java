package br.com.alura.screenmatch.calculos;

import br.com.alura.screenmatch.modelos.Titulo;

// Definição da classe CalculadoraDeTempo
public class CalculadoraDeTempo {

    private int tempoTotal; // Variável para armazenar o tempo total de duração

    // Método para retornar o tempo total de duração
    public int getTempoTotal() {
        return tempoTotal;
    }

    // Método para incluir um título na calculadora de tempo
    public void inclui(Titulo titulo) {
        this.tempoTotal += titulo.getDuracaoEmMinutos(); // Adiciona a duração do título ao tempo total
    }

//    public void inclui(Filme f){
//        tempoTotal += f.getDuracaoEmMinutos();
//    }
//    public void inclui(Serie s){
//        tempoTotal += s.getDuracaoEmMinutos();
//    }

}
