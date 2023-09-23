/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prin;

/**
 *
 * @author dsdev
 */
public class UsuarioActual {
    private static String nombreUsuario;

    public static String getNombreUsuario() {
        return nombreUsuario;
    }

    public static void setNombreUsuario(String nombre) {
        nombreUsuario = nombre;
    }
}
