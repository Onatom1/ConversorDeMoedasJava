import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

import com.google.gson.Gson;
import com.google.gson.JsonObject;

public class APIReader {
    private static final String ENDERECO_API = "https://v6.exchangerate-api.com/v6/eaa1c82eab7d78ac11839f71/latest/BRL";
    private JsonObject conversionRates;

    public APIReader() throws IOException, InterruptedException {
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(ENDERECO_API))
                .build();

        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

        String json = response.body();
        Gson gson = new Gson();
        this.conversionRates = gson.fromJson(json, JsonObject.class).getAsJsonObject("conversion_rates");
    }

    public double getTaxaDeCambio(String moeda) {
        return conversionRates.get(moeda).getAsDouble();
    }
}
