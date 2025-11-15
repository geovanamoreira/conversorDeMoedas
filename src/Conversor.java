import java.io.IOException;

public class Conversor {
    private final ApiClient apiClient = new ApiClient();

    public double converter(String Base, String Alvo, double valor)
        throws IOException, InterruptedException{

            Moeda moeda = apiClient.buscarTaxa(Base, Alvo);
            double taxa = moeda.getConversion_rate();
            return valor * taxa;
    }

}
