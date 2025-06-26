package main;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Map;

public class JsonUpdater {
    public static void updateGovernment(String filepath, String dataType, String newData) {
        ObjectMapper mapper = new ObjectMapper();
        
        try {
            List<Map<String, Object>> nationList = mapper.readValue(
            new File(filepath),
            new TypeReference<List<Map<String, Object>>>() {}  
            );  
            Map<String, Object> nation = nationList.get(0);
            List<Map<String, Object>> government = (List<Map<String, Object>>) nation.get("Government");
            
            government.get(0).put(dataType, newData);
            
            mapper.writerWithDefaultPrettyPrinter().writeValue(new File(filepath), nationList);
            
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    /**
     * 
     * Used for updating a nations basic info (i.e the name, capital, currency, etc.)
     */
    public static void updateBasic(String filepath, String dataType, String newData) {
        ObjectMapper mapper = new ObjectMapper();
        
        try{
            List<Map<String, Object>> nationList = mapper.readValue(
            new File(filepath),
            new TypeReference<List<Map<String, Object>>>() {}
            );
            
            Map<String, Object> nation = nationList.get(0);
            
            nation.put(dataType, newData);
            
            mapper.writerWithDefaultPrettyPrinter().writeValue(new File(filepath), nationList);
        } catch(IOException e) {
            e.printStackTrace();
        }
    }
}
