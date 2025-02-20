/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utility;

import java.awt.Image;
import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author Admin
 */
public class BDUtility {
    public static void setImage(JFrame frame,String imagePath ,int newHeight , int newWidth){
        try{
            BufferedImage originalImage = ImageIO.read(BDUtility.class.getResourceAsStream(imagePath));
            BufferedImage resizedImage = new BufferedImage(newWidth,newHeight,BufferedImage.TYPE_INT_RGB);
            resizedImage.createGraphics().drawImage(originalImage.getScaledInstance(newWidth, newHeight, Image.SCALE_SMOOTH),0,0,null);
            ImageIcon backgroundImage = new ImageIcon(resizedImage);
            JLabel backgroundLabel1 = new JLabel(backgroundImage);
            background
        }
        catch(Exception ex){
            ex.printStackTrace();
        }
    }
}
