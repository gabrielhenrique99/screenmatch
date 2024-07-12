package br.com.alura.screenmatch.modelos;

// Definição de um record TituloOmdb
public record TituloOmdb(String title, String year, String runtime) {
    // Este record TituloOmdb é uma classe imutável que contém três campos:
    // - title: Representa o título do filme ou série.
    // - year: Representa o ano de lançamento.
    // - runtime: Representa a duração em minutos.
}

