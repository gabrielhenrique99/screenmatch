package br.com.alura.screenmatch.excecao;

// Definição da classe de exceção ErroDeConversaoDeAnoException que estende RuntimeException
public class ErroDeConversaoDeAnoException extends RuntimeException {

    private String mensagem; // Campo para armazenar a mensagem da exceção

    // Construtor que recebe a mensagem de erro como parâmetro
    public ErroDeConversaoDeAnoException(String mensagem) {
        this.mensagem = mensagem; // Inicializa o campo mensagem com a mensagem recebida
    }

    // Sobrescrita do método getMessage() para retornar a mensagem de erro
    @Override
    public String getMessage() {
        return this.mensagem; // Retorna a mensagem de erro armazenada no campo mensagem
    }
}

