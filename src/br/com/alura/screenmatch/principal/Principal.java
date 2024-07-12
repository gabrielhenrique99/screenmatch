package br.com.alura.screenmatch.principal;

// Importação das classes necessárias
import br.com.alura.screenmatch.calculos.CalculadoraDeTempo;
import br.com.alura.screenmatch.calculos.FiltroRecomendacao;
import br.com.alura.screenmatch.modelos.Episodio;
import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;

import java.util.ArrayList;

public class Principal {

    public static void main(String[] args) {
        // Criação de um objeto Filme e configuração de suas propriedades
        Filme meuFilme = new Filme("Parasita", 2019);
        meuFilme.setDuracaoEmMinutos(130);
        meuFilme.exibeFichaTecnica(); // Exibe a ficha técnica do filme
        meuFilme.avalia(8);
        meuFilme.avalia(9);
        meuFilme.avalia(10);

        // Exibe o total de avaliações e a média das avaliações do filme
        System.out.println("Total de Avaliações: " + meuFilme.getTotalDeAvaliacoes());
        System.out.println(meuFilme.pegaMedia());

        // Criação de um objeto Serie e configuração de suas propriedades
        Serie lost = new Serie("Lost", 2000);
        lost.exibeFichaTecnica(); // Exibe a ficha técnica da série
        lost.setTemporadas(4);
        lost.setEpisodiosPorTemporada(22);
        lost.setMinutosPorEpisodio(50);
        System.out.println("Duração para maratonar Lost: " + lost.getDuracaoEmMinutos());

        // Criação de outro objeto Filme
        Filme outroFilme = new Filme("Parasita 2", 2025);
        outroFilme.setDuracaoEmMinutos(145);

        // Criação de um objeto CalculadoraDeTempo e inclusão dos filmes e série
        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
        calculadora.inclui(meuFilme);
        calculadora.inclui(outroFilme);
        calculadora.inclui(lost);
        System.out.println(calculadora.getTempoTotal()); // Exibe o tempo total calculado

        // Criação de um objeto FiltroRecomendacao e filtragem do filme
        FiltroRecomendacao filtro = new FiltroRecomendacao();
        filtro.filtra(meuFilme);

        // Criação de um objeto Episodio e configuração de suas propriedades
        Episodio episodio = new Episodio();
        episodio.setNumero(1);
        episodio.setSerie(lost);
        episodio.setTotalVisualizacoes(300);
        filtro.filtra(episodio); // Filtra o episódio

        // Criação de mais um objeto Filme e configuração de suas propriedades
        var filme3 = new Filme("007", 2015);
        filme3.setDuracaoEmMinutos(180);
        filme3.avalia(9);

        // Criação de uma lista de filmes e adição dos filmes criados anteriormente
        ArrayList<Filme> listaDeFilmes = new ArrayList<>();
        listaDeFilmes.add(filme3);
        listaDeFilmes.add(meuFilme);
        listaDeFilmes.add(outroFilme);

        // Exibe o tamanho da lista e informações sobre o primeiro filme na lista
        System.out.println("Tamanho da lista: " + listaDeFilmes.size());
        System.out.println("Primeiro filme: " + listaDeFilmes.get(0).toString());
        System.out.println(listaDeFilmes);
    }
}
