package main;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.File;
import java.util.List;

public class NationLoader {
    public static List<NationData> loadNations(String parth){
        try {
            ObjectMapper mapper = new ObjectMapper();
            return mapper.readValue(new File(".src/countrydata/nation.json"), new TypeReference<List<NationData>>() {});
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
