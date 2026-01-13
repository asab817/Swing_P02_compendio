/*
* Proyecto: swing_p02_SabriAchahidAnouar
* Paquete: swing_p02_SabriAchahidAnouar
* Archivo: Ventana.java
* Autor/a: Anouar Sabri Achahid
* Fecha: 22 oct 2025 8:50:03
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

/**
 * 
 */

public class Ventana extends JFrame {

    private Panel panel;

    public Ventana() {
        setTitle("Práctica Swing");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        panel = new Panel();
        add(panel);

        setVisible(true);
    }
}