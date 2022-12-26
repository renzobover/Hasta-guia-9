/*
 Implemente la clase Persona. Una persona tiene un nombre y una fecha de nacimiento
(Tipo Date), constructor vacío, constructor parametrizado, get y set. Y los siguientes
métodos:
• Agregar un método de creación del objeto que respete la siguiente firma:
crearPersona(). Este método rellena el objeto mediante un Scanner y le pregunta al
usuario el nombre y la fecha de nacimiento de la persona a crear, recordemos que la
fecha de nacimiento debe guardarse en un Date y los guarda en el objeto.
• Escribir un método calcularEdad() a partir de la fecha de nacimiento ingresada. Tener
en cuenta que para conocer la edad de la persona también se debe conocer la fecha
actual.
• Agregar a la clase el método menorQue(int edad) que recibe como parámetro otra
edad y retorna true en caso de que el receptor tenga menor edad que la persona que
se recibe como parámetro, o false en caso contrario.
• Metodo mostrarPersona(): este método muestra la persona creada en el método
anterior.
 */
package Atributos;

import java.util.Scanner;
import java.util.Date;

/**
 *
 * @author renzo
 */
public class Persona {

    private String nombre;
    private Date fecha_nacimiento;
    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Persona(String nombre, Date fecha_nacimiento) {
        this.nombre = nombre;
        this.fecha_nacimiento = fecha_nacimiento;
    }

    public Persona() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Date getFecha_nacimiento() {
        return fecha_nacimiento;
    }

    public void setFecha_nacimiento(Date fecha_nacimiento) {
        this.fecha_nacimiento = fecha_nacimiento;
    }

    public Persona nose() { //No puedo comunicar el objeto si lo hago fuera de las funciones, en cambio con una funcion para crearlo si.
        Persona p1 = new Persona();
        return p1;
    }

    public Persona crerPersona(Persona p1, Scanner leer) {

        System.out.print("Ingrese su nombre: ");
        p1.setNombre(leer.next());
        System.out.print("Ingrese su año de nacimiento: ");
        int anio = leer.nextInt();
        System.out.print("Ingrese su mes de nacimiento: ");
        int mes = leer.nextInt();
        System.out.println("Ingrese su dia de nacimiento: ");
        int dia = leer.nextInt();
        Date fn = new Date(anio, mes, dia);
        p1.setFecha_nacimiento(fn);

        return p1;
    }

    public void calcularEdad(Persona p1) {

        Date fechaActual = new Date();
        System.out.println("Su edad actualemente es de " + (((fechaActual.getYear() + 1900)) - (p1.getFecha_nacimiento().getYear())) + " años.");
    }

    public void menorQue(Persona p1, Scanner leer) {
        Date fechaActual = new Date();
        int edad = 0;
        System.out.println("Ingrese una edad nuevamente: ");
        edad = leer.nextInt();
        int edadUsuario = (((fechaActual.getYear() + 1900)) - (p1.getFecha_nacimiento().getYear()));
        boolean vof = false;

        if (edadUsuario < edad) {
            vof = true;
        }

        System.out.println(vof);

    }

    public void mostrarPersona(Persona p1) {
        Date fechaActual = new Date();

        System.out.println("Nombre: " + p1.getNombre());
        System.out.println("Año de nacimiento: " + (p1.getFecha_nacimiento().getYear()));
        System.out.println("Mes: " + (p1.getFecha_nacimiento().getMonth()));
        System.out.println("Dia: " + (p1.getFecha_nacimiento().getDay()));
        System.out.println("Edad: " + (((fechaActual.getYear() + 1900)) - (p1.getFecha_nacimiento().getYear())));
    }
}
