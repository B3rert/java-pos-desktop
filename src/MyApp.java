
import javax.swing.JFrame;
import prin.DeleteProduct;
import prin.Login;
import prin.Pos;
import prin.Reports;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author dsdev
 */
public class MyApp {
    public static void main(String[] args) {
        // Crear una instancia del formulario principal
        Login formulario = new Login();    
        


        // Configurar cómo se debe cerrar la aplicación al cerrar el formulario
        formulario.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        // Mostrar el formulario principal
        formulario.setVisible(true);
    }
}
