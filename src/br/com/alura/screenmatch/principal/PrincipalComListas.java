package br.com.alura.screenmatch.principal;

// Importação das classes necessárias
import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;
import br.com.alura.screenmatch.modelos.Titulo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class PrincipalComListas {

    public static void main(String[] args) {
        // Criação de objetos Filme e avaliação deles
        Filme meuFilme = new Filme("Parasita", 2019);
        meuFilme.avalia(9);
        Filme outroFilme = new Filme("Parasita 2", 2025);
        outroFilme.avalia(1);
        var filme3 = new Filme("007", 2015);
        filme3.avalia(5);
        Serie lost = new Serie("Lost", 2000);

        // Criação e preenchimento de uma lista de Títulos
        ArrayList<Titulo> lista = new ArrayList<>();
        lista.add(filme3);
        lista.add(meuFilme);
        lista.add(outroFilme);
        lista.add(lost);

        // Iteração pela lista de títulos e impressão de seus nomes e classificações (se aplicável)
        for (Titulo item: lista) {
            System.out.println(item.getNome());
            if (item instanceof Filme filme && filme.getClassificacao() > 2) {
                System.out.println("Classificação: " + filme.getClassificacao());
            }
        }

        // Criação e preenchimento de uma lista de artistas
        ArrayList<String> buscaPorArtista = new ArrayList<>();
        buscaPorArtista.add("Adam Sandler");
        buscaPorArtista.add("Gabriel");
        buscaPorArtista.add("Arthur");
        System.out.println(buscaPorArtista);

        // Ordenação da lista de artistas
        Collections.sort(buscaPorArtista);
        System.out.println("Depois da ordenação: ");
        System.out.println(buscaPorArtista);

        // Ordenação da lista de títulos usando a implementação de Comparable
        Collections.sort(lista);
        System.out.println("Lista de títulos Ordenados: ");
        System.out.println(lista);

        // Ordenação da lista de títulos por ano de lançamento usando Comparator
        lista.sort(Comparator.comparing(Titulo::getAnoDeLancamento));
        System.out.println("Ordenando por ano: ");
        System.out.println(lista);
    }
}

