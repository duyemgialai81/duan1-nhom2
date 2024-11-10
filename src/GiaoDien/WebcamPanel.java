/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GiaoDien;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import javax.swing.JPanel;

/**
 *
 * @author SingPC
 */
class WebcamPanel extends  JPanel{
    private BufferedImage image;

    public void setImage(BufferedImage img) {
        this.image = img;
        repaint();  // Gọi lại phương thức paintComponent
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        if (image != null) {
            g.drawImage(image, 0, 0, getWidth(), getHeight(), null);  // Vẽ hình ảnh lên JPanel
        }
    }
}
