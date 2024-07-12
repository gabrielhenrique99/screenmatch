package br.com.alura.screenmatch.modelos;

import br.com.alura.screenmatch.excecao.ErroDeConversaoDeAnoException;

// Definição da classe Titulo que implementa a interface Comparable
public class Titulo implements Comparable<Titulo> {
    private String nome; // Nome do título
    private int anoDeLancamento; // Ano de lançamento do título
    private boolean incluidoNoPlano; // Indica se o título está incluído no plano
    private double somaAvaliacoes; // Soma das avaliações recebidas
    private int totalDeAvaliacoes; // Total de avaliações recebidas
    private int duracaoEmMinutos; // Duração do título em minutos

    // Construtor da classe Titulo
    public Titulo(String nome, int anoDeLancamento) {
        this.nome = nome;
        this.anoDeLancamento = anoDeLancamento;
    }

    // Construtor da classe Titulo que aceita um objeto TituloOmdb
    public Titulo(TituloOmdb meuTituloOmdb) {
        this.nome = meuTituloOmdb.title();

        if (meuTituloOmdb.year().length() > 4) {
            throw new ErroDeConversaoDeAnoException("Não consegui o ano porque tem mais de 4 caracteres");
        }
        this.anoDeLancamento = Integer.valueOf(meuTituloOmdb.year());
        this.duracaoEmMinutos = Integer.valueOf(meuTituloOmdb.runtime().substring(0, 3));
    }

    // Getters e setters para os atributos da classe
    public String getNome() {
        return nome;
    }

    public int getAnoDeLancamento() {
        return anoDeLancamento;
    }

    public boolean isIncluidoNoPlano() {
        return incluidoNoPlano;
    }

    public int getDuracaoEmMinutos() {
        return duracaoEmMinutos;
    }

    public int getTotalDeAvaliacoes() {
        return totalDeAvaliacoes;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setAnoDeLancamento(int anoDeLancamento) {
        this.anoDeLancamento = anoDeLancamento;
    }

    public void setIncluidoNoPlano(boolean incluidoNoPlano) {
        this.incluidoNoPlano = incluidoNoPlano;
    }

    public void setDuracaoEmMinutos(int duracaoEmMinutos) {
        this.duracaoEmMinutos = duracaoEmMinutos;
    }

    // Método para exibir a ficha técnica do título
    public void exibeFichaTecnica() {
        System.out.println("Titulo: " + nome);
        System.out.println("Ano de Lançamento: " + anoDeLancamento);
    }

    // Método para avaliar o título
    public void avalia(double nota) {
        somaAvaliacoes += nota;
        totalDeAvaliacoes++;
    }

    // Método para calcular a média das avaliações
    public double pegaMedia() {
        return somaAvaliacoes / totalDeAvaliacoes;
    }

    // Implementação do método compareTo da interface Comparable
    @Override
    public int compareTo(Titulo outroTitulo) {
        // O @Override indica que estamos sobrescrevendo o método compareTo() da interface Comparable
        return this.getNome().compareTo(outroTitulo.getNome());
    }

    // Sobrescrita do método toString para fornecer uma representação em string do objeto Titulo
    @Override
    public String toString() {
        // O @Override indica que estamos sobrescrevendo o método toString() da classe Object
        return "(Nome: '" + nome + '\'' +
                ", Ano de Lançamento: " + anoDeLancamento +
                ", Duração: " + duracaoEmMinutos + ")";
    }
}

