package br.com.alura.screenmatch.principal;

// Importação das classes necessárias
import br.com.alura.screenmatch.excecao.ErroDeConversaoDeAnoException;
import br.com.alura.screenmatch.modelos.Titulo;
import br.com.alura.screenmatch.modelos.TituloOmdb;
import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileWriter;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PrincipalComBusca {
    public static void main(String[] args) throws IOException, InterruptedException {
        // Scanner para leitura da entrada do usuário
        Scanner leitura = new Scanner(System.in);
        String busca = "";
        List<Titulo> titulos = new ArrayList<>();

        // Configuração do Gson para serialização e desserialização de JSON
        Gson gson = new GsonBuilder()
                .setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE)
                .setPrettyPrinting()
                .create();

        // Loop para realizar buscas até o usuário digitar "Sair"
        while (!busca.equalsIgnoreCase("Sair")) {
            System.out.println("Digite um filme: ");
            busca = leitura.nextLine();

            // Se o usuário digitar "Sair", o loop é encerrado
            if(busca.equalsIgnoreCase("Sair")){
                break;
            }

            // Monta a URL de busca no OMDb API
            String endereco = "http://www.omdbapi.com/?t=" + busca.replace(" ", "+") + "&apikey=d1e2e0a1";
            try {
                // Configuração do cliente HTTP e envio da requisição
                HttpClient client = HttpClient.newHttpClient();
                HttpRequest request = HttpRequest.newBuilder()
                        .uri(URI.create(endereco))
                        .build();
                HttpResponse<String> response = client
                        .send(request, HttpResponse.BodyHandlers.ofString());

                // Obtém a resposta em JSON
                String json = response.body();
                System.out.println(json);

                // Desserializa o JSON para um objeto TituloOmdb
                TituloOmdb meuTituloOmdb = gson.fromJson(json, TituloOmdb.class);
                System.out.println(meuTituloOmdb);

                // Converte o objeto TituloOmdb para Titulo
                Titulo meuTitulo = new Titulo(meuTituloOmdb);
                System.out.println("Título já convertido: ");
                System.out.println(meuTitulo);

                // Adiciona o título à lista de títulos
                titulos.add(meuTitulo);

            } catch (NumberFormatException e) {
                // Captura e trata exceção de formato numérico
                System.out.println("Aconteceu um erro: ");
                System.out.println(e.getMessage());
            } catch (IllegalArgumentException e) {
                // Captura e trata exceção de argumento ilegal
                System.out.println("Algum erro na busca");
            } catch (ErroDeConversaoDeAnoException e) {
                // Captura e trata exceção personalizada de conversão de ano
                System.out.println(e.getMessage());
            }
        }

        // Exibe a lista de títulos
        System.out.println(titulos);

        // Escreve a lista de títulos em um arquivo JSON
        FileWriter escrita = new FileWriter("filmes.json");
        escrita.write(gson.toJson(titulos));
        escrita.close();
        System.out.println("Programa finalizou corretamente");
    }
}

