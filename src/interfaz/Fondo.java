/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package interfaz;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JDesktopPane;

/**
 *
 * @author Parisan
 */
public class Fondo extends JDesktopPane {
     Image image;
    public Fondo() {
        super();
        image = new ImageIcon(getClass().getResource("/utiliarios/corazon.jpg")).getImage();
        setBackground(new Color(69, 64, 92));
    }

 @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawImage(image, 0, 0, getWidth(), getHeight(), this);
}
}