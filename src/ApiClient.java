import com.google.gson.Gson;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ApiClient {

    private static final String API_KEY = "aabcda981c5c2df46ae7bc0d";
    private static final String URL_BASE = "https://v6.exchangerate-api.com/v6/";

    public Moeda buscarTaxa(String codigoBase, String codigoAlvo){
        String url = URL_BASE + API_KEY + "/pair/" + codigoBase + "/" + codigoAlvo;

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder().uri(URI.create(url)).build();

        try{
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
            Gson gson = new Gson();
            Moeda moeda = gson.fromJson(response.body(), Moeda.class);
            return moeda;
        }

        catch (Exception e){
            throw new RuntimeException("Erro de leitura, tente novamente.");
        }
    }

}
