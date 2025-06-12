package utils.data;

import io.qameta.allure.internal.shadowed.jackson.databind.ObjectMapper;
import utils.Logs;

import java.io.File;
import java.io.IOException;

public class dataReader {
    private static final  String variablePath = "src/test/java/utils/data/data.json";
    public static dataVariable dataVariable(){
        final var objectMapper = new ObjectMapper();
        try {
            return objectMapper.readValue(new File(variablePath), dataVariable.class);
        }catch (IOException ioException){
            Logs.error("IOException: %s", ioException.getLocalizedMessage());
            throw new RuntimeException();
        }
    }
}
