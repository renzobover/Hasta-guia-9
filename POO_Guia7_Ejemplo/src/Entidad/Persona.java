/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

import java.util.Date;

/**
 *
 * @author renzo
 */
public class Persona {

    private String nombre;
    private String apellido;
    private String dni;
    private Date nacimiento;
    private String pais;
    private String provincia;
    private String ciudad;
    private String direccion;
    private int hambre;

    public Persona(String nombre, String apellido, String dni, String pais, String provincia, String ciudad, String direccion) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.pais = pais;
        this.provincia = provincia;
        this.ciudad = ciudad;
        this.direccion = direccion;
        this.hambre = 1000;
    }
    //Sets: Nos permite cambiar los valores de los atributos.

    public Persona(String nombre, String apellido, String dni, String pais, String provincia, String direccion) {
    }

    public void setNombre(String nombre) {
        if (nombre.length() > 0) {
            this.nombre = nombre;
        }
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public void setNacimiento(Date nacimiento) {
        this.nacimiento = nacimiento;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    //Gets: es la funcion que permite acceder a los atributos.
    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getDni() {
        return dni;
    }

    public String getPais() {
        return pais;
    }

    public String getProvincia() {
        return provincia;
    }

    public String getCiudad() {
        return ciudad;
    }

    public String getDireccion() {
        return direccion;
    }
    public int caminar(int restarHambre){
        hambre -= restarHambre;
        return hambre;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", apellido=" + apellido + ", dni=" + dni + ", nacimiento=" + nacimiento + ", pais=" + pais + ", provincia=" + provincia + ", ciudad=" + ciudad + ", direccion=" + direccion + ", hambre=" + hambre + '}';
    }
    
    
    

}
