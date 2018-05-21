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
public class Profesores extends Usuario{
    private String deparmento;

    public Profesores(String deparmento, String dni, String usuario, String contraseña, String nombreApellidos) {
        super(dni, usuario, contraseña, nombreApellidos);
        this.deparmento = deparmento;
    }

    public String getDeparmento() {
        return deparmento;
    }

    public void setDeparmento(String deparmento) {
        this.deparmento = deparmento;
    }

    @Override
    public String toString() {
        return super.toString()+"\t"+this.deparmento;
    }
    
    
}
