package br.com.alura.screenmatch.calculos;

// Import da interface Classificavel (presumindo que seja importada de algum pacote)
import br.com.alura.screenmatch.calculos.Classificavel;

// Definição da classe FiltroRecomendacao
public class FiltroRecomendacao {

    // Método para filtrar e imprimir recomendações com base na classificação
    public void filtra(Classificavel classificavel) {
        // Verifica a classificação do objeto Classificavel
        if (classificavel.getClassificacao() >= 4) {
            System.out.println("Está entre os preferidos do momento");
        } else if (classificavel.getClassificacao() >= 2) {
            System.out.println("Muito bem avaliado no momento");
        } else {
            System.out.println("Coloque na lista para assistir depois");
        }
    }
}

