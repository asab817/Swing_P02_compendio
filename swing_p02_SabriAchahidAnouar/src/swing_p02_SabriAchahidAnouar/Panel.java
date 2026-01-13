/*
* Proyecto: swing_p02_SabriAchahidAnouar
* Paquete: swing_p02_SabriAchahidAnouar
* Archivo: Panel.java
* Autor/a: Anouar Sabri Achahid
* Fecha: 29 oct 2025 12:47:19
*
* Descripción:
* [Resumen del propósito del archivo/clase.]
*
* Licencia:
* [Condiciones de uso/licencia.]
*/

package swing_p02_SabriAchahidAnouar;

/**
 * 
 */

import javax.swing.*;
import java.awt.*;

public class Panel extends JPanel {

    private JLabel etiquetaMensaje;

    public Panel() {
         

        etiquetaMensaje = new JLabel("", SwingConstants.CENTER);
        etiquetaMensaje.setFont(new Font("Arial", Font.BOLD, 16));
        etiquetaMensaje.setBounds(50, 50, 300, 30);
        add(etiquetaMensaje);

        ejecutarDialogos();
    }

    private void ejecutarDialogos() {
        ImageIcon iconoJava = (ImageIcon) UIManager.getIcon("OptionPane.informationIcon");
        JOptionPane.showMessageDialog(
                this,
                "Estás ejecutando una aplicación Java.",
                "Advertencia",
                JOptionPane.WARNING_MESSAGE,
                iconoJava
        );

        String nombre = JOptionPane.showInputDialog(this, "¿Cómo te llamas?", "Pregunta", JOptionPane.QUESTION_MESSAGE);
        if (nombre == null || nombre.isBlank()) nombre = "Usuario";

        JOptionPane.showMessageDialog(this, "¡Hola, " + nombre + "!", "Saludo", JOptionPane.INFORMATION_MESSAGE);

        String[] opciones = {"Opción 1", "Opción 2", "Opción 3"};
        int seleccion = JOptionPane.showOptionDialog(
                this,
                "Elige una opción:",
                "Selección",
                JOptionPane.DEFAULT_OPTION,
                JOptionPane.QUESTION_MESSAGE,
                null,
                opciones,
                opciones[0]
        );

        if (seleccion == 0) etiquetaMensaje.setText("Has elegido la primera opción.");
        else if (seleccion == 1) etiquetaMensaje.setText("Has elegido la segunda opción.");
        else if (seleccion == 2) etiquetaMensaje.setText("Has elegido la tercera opción.");
        else etiquetaMensaje.setText("No has elegido ninguna opción.");

        int confirmar = JOptionPane.showConfirmDialog(
                this,
                "¿Estás de acuerdo con tu selección?",
                "Confirmación",
                JOptionPane.YES_NO_OPTION
        );

        if (confirmar != JOptionPane.YES_OPTION) {
            etiquetaMensaje.setText(""); 
        }

        repaint();
    }
}
