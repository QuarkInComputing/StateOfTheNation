package main;

import com.fasterxml.jackson.databind.ObjectMapper;
import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;


public class Nation {
    private BufferedImage flag;
    
    private String name;
    private String capitalCity;
    private String currency;

    //Constructor
    Nation(){
        setFlag();
        getInfo();
    }

    //Methods
    private void setFlag(){
        try {
            flag = ImageIO.read(new File("./src/assets/flag.png"));
            BufferedImage scaledFlag = new BufferedImage(200, 120, BufferedImage.TYPE_INT_ARGB);

            java.awt.Graphics2D g2d = scaledFlag.createGraphics();
            g2d.drawImage(flag, 0, 0, 200, 120, null);
            g2d.dispose();

            flag = scaledFlag;
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    
    private void getInfo(){
        try {
            ObjectMapper mapper = new ObjectMapper();
            NationData data = mapper.readValue(new File("./src/countrydata/nation.json"), NationData.class);
            
            for(Nation nation : data.nation){
                this.name = nation.name;
                this.capitalCity = nation.capitalCity;
                this.currency = nation.currency;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    //Getters & Setters
    public BufferedImage getFlag() {
        return flag;
    }

    public String getName() {
        return name;
    }

    public String getCapitalCity() {
        return capitalCity;
    }

    public String getCurrency() {
        return currency;
    }
    
}