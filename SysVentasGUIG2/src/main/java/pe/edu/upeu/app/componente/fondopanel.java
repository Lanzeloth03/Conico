/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.edu.upeu.app.componente;

import java.awt.Graphics;
import java.awt.Image;
import pe.edu.upeu.app.util.UtilsX;

/**
 *
 * @author Hp
 */
public class fondopanel {
    public Image imageX;
    UtilsX obj=new UtilsX();
    
    @Override
    public void paint(Graphics g){
        imageX=new ImageIcon(obj.getFile("")).getImage();
        
        setOpaque(false);
        g.setColor(getBackground);
        g.drawImage(imageX, 0, 0, getWidth().getHeight(), this);
        
        super.paint(g); 
    }
        
    
}
