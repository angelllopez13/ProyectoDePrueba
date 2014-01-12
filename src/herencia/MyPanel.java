
package herencia;

import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JPanel;


public class MyPanel extends JPanel{
    
    public void paint(Graphics g){
       
        try{
            Image imagen= new ImageIcon(getClass().getResource("/resource/fondo.jpg")).getImage();
            g.drawImage(imagen, 0,0, this);
            setOpaque(false);
            super.paint(g);
        }catch(Exception e){
           super.paint(g);
        }
        
    }
}
