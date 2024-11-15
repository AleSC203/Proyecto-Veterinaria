
package Frames;

import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JTabbedPane;

public class jTabbedPaneConFondo extends JTabbedPane{
     private Image imagenFondo;

    public jTabbedPaneConFondo(String rutaImagen) {
       try {
            ImageIcon icono = new ImageIcon(getClass().getResource(rutaImagen));
            imagenFondo = icono.getImage();
        } catch (Exception e) {
            System.err.println("Error al cargar la imagen de fondo: " + e.getMessage());
            // Consider displaying an error message to the user or logging the error
        }
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        if (imagenFondo != null) {
            // Scale the image to fit the desktop pane
            g.drawImage(imagenFondo, 0, 0, getWidth(), getHeight(), this);
        }
    }
    }
     
     

