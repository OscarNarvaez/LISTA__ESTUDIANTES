/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package listaestudiantes;

import java.io.Serializable;

/**
 *
 * @author Oscar Julian Narvaez -- Carlos Alexander Burgos
 */
enum Genero {
    Masculino, Femenino, Otros
}

enum RH {
    A, O, B, AB, a, o, b, ab
}

public class Estudiante implements Serializable{
    private int codigo;
    private String nombre;
    private int edad;
    private int faltas;
    private Genero genero;
    private RH rh;

    Estudiante(int codigo, String nombre, int edad, Genero genero, RH rh, int faltas) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.edad = edad;
        this.genero = genero;
        this.rh = rh;
        this.faltas = faltas;
    }

    String getCodigo() {
        return "" + this.codigo;
    }

    String getNombre() {
        return this.nombre;
    }

    String getEdad() {
        return "" + this.edad;
    }

    String getFaltas() {
        return "" + this.faltas;
    }

    String getGenero() {
        return this.genero.toString();
    }

    String getRh() {
        return this.rh.toString();
    }
    
    String getRhFormat() {
        switch (rh) {
            case A:
                return "A+";
            case O:
                return "O+";
            case B:
                return "B+";
            case AB:
                return "AB+";
            case a:
                return "A-";
            case o:
                return "O-";
            case b:
                return "B-";
            default:
                return "AB-";
        }
    }

    void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    void setNombre(String nombre) {
        this.nombre = nombre;
    }

    void setEdad(int edad) {
        this.edad = edad;
    }

    void setGenero(Genero genero) {
        this.genero = genero;
    }

    void setSangre(RH rh) {
        this.rh = rh;
    }

    void setFaltas(int faltas) {
        this.faltas = faltas;
    }

    boolean equals(Estudiante estudiante) {
        return this.codigo == estudiante.codigo &&
                this.nombre.equals(estudiante.nombre) &&
                this.edad == estudiante.edad &&
                this.genero == estudiante.genero &&
                this.rh == estudiante.rh &&
                this.faltas == estudiante.faltas;
    }
}
