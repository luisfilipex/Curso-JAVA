package app;

import com.google.gson.Gson;
import org.springframework.stereotype.Component;

@Component
public class ConversorJson { // Renomeado para "ConversorJson"

    private Gson gson = new Gson();

    public ViaCepResponse converter(String json) {
        ViaCepResponse response = gson.fromJson(json, ViaCepResponse.class);
        return response;
    }
}
