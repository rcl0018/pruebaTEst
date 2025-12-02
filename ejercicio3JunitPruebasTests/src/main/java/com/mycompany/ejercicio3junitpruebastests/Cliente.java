/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio3junitpruebastests;

/**
 *
 * @author PC205
 */
public class Cliente {
    private String nombre;
    private int añosAntiguedad;

    public Cliente(String nombre, int añosAntiguedad) {
        this.nombre = nombre;
        this.añosAntiguedad = añosAntiguedad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getAñosAntiguedad() {
        return añosAntiguedad;
    }

    public void setAñosAntiguedad(int añosAntiguedad) {
        this.añosAntiguedad = añosAntiguedad;
    }
    
    
    
}
