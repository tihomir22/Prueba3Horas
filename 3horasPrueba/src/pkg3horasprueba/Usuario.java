/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg3horasprueba;

import java.util.Calendar;

/**
 *
 * @author mati
 */
abstract class Usuario {
    protected String dni;
    protected String usuario;
    protected String contraseña;
    protected String nombreApellidos;
    protected Calendar fechaNacimiento=Calendar.getInstance();

    public Usuario(String dni, String usuario, String contraseña, String nombreApellidos) {
        this.dni = dni;
        this.usuario = usuario;
        this.contraseña = contraseña;
        this.nombreApellidos = nombreApellidos;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public String getNombreApellidos() {
        return nombreApellidos;
    }

    public void setNombreApellidos(String nombreApellidos) {
        this.nombreApellidos = nombreApellidos;
    }

    public Calendar getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Calendar fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    @Override
    public String toString() {
        return "INFO: "+this.dni+"\t"+this.usuario+"\t"+this.contraseña+"\t"+this.nombreApellidos+"\t"+this.fechaNacimiento;
    }
    
}
