package main;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Nation {
    private BufferedImage flag;

    //Constructor
    Nation(){
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

    public void setFlagPath(BufferedImage flagPath) {
        this.flag = flagPath;
    }
}