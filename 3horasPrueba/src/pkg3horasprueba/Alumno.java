/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg3horasprueba;

/**
 *
 * @author mati
 */
public class Alumno extends Usuario{
    private String nivelEstudios;

    public Alumno(String nivelEstudios, String dni, String usuario, String contraseña, String nombreApellidos) {
        super(dni, usuario, contraseña, nombreApellidos);
        this.nivelEstudios = nivelEstudios;
    }

    public String getNivelEstudios() {
        return nivelEstudios;
    }

    public void setNivelEstudios(String nivelEstudios) {
        this.nivelEstudios = nivelEstudios;
    }

    @Override
    public String toString() {
        return super.toString()+this.nivelEstudios;
    }
    
}
