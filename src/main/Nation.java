package main;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;


public class Nation {
    private BufferedImage flag;
    private NationData data;

    //Constructor
    Nation(NationData data){
        this.data = data;
        
        setFlag();
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

    //Getters & Setters

    public BufferedImage getFlag() {
        return flag;
    }
    
    public String getName() {
        return data.getName();
    }
    
    public String getCapitalCity() {
    return data.getCapitalCity();
}

    public String getCurrency() {
        return data.getCurrency();
    }

    public int getPoliticalfreedom() {
        return data.getModifiers().get(0).getPoliticalfreedom();
    }

    public int getGovernmentspending() {
        return data.getModifiers().get(0).getGovernmentspending();
    }

    public int getAutority() {
        return data.getModifiers().get(0).getAutority();
    }

    public int getEconomy() {
        return data.getModifiers().get(0).getEconomy();
    }
    public String getIdeology() {
        return data.getGovernment().get(0).getIdeology();
    }

    public String getElections() {
        return data.getGovernment().get(0).getElections();
    }
}