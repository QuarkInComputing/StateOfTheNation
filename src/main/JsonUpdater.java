package main;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.File;
import java.io.IOException;
import java.util.List;

public class JsonUpdater {
    public static void updateJson(String filepath) {
        ObjectMapper mapper = new ObjectMapper();
        File file = new File(filepath);
        
        if(filepath.contains("nation.json")){
            try {
                NationData nation = mapper.readValue(file, NationData.class);
                nation.getGovernment().get(0).setIdeology("republic");
             
                mapper.writerWithDefaultPrettyPrinter().writeValue(file, nation);
            } catch (Exception e) {
                e.printStackTrace();
            }
             
        } else {
            //For events when I eventually add them
        }
    }
}
