package org.example;

import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.Path;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.core.type.TypeReference;
import model.Hotel;
import model.Result;
import model.Service;


public final class Gateway {

    private List<Service> hotelsByService = getData("data.json");

    private static List<Service> getData(String fileName) {
        Path filePath = Paths.get("src", "main", "resources", fileName).toAbsolutePath().normalize();
        ObjectMapper mapper = new ObjectMapper();
        try {
            var content = Files.readString(filePath).trim();
            return mapper.readValue(content, new TypeReference<List<Service>>() { });
        } catch (Exception e) {
            throw new RuntimeException(e.getMessage());
        }
    }

    public List<Result> findAll()
}