package com.github.angel.lambdas.schema;

public class Person {
    private String nombre;
    private String apellido;
    private String email;


    public Person() {
    }

    public Person(String nombre,   String apellido, String email ){
        this.nombre = nombre;
        this.email = email;
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }



    @Override
    public String toString() {
        return STR."Nombre:\{nombre} Apellidos:\{apellido} Email:\{email}\n";
    }

}
