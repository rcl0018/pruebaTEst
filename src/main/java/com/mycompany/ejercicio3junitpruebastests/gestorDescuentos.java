/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio3junitpruebastests;


public class gestorDescuentos {
    private Cliente cliente;
    
    
    public int calcularDescuentos(int antiguedad){
        if (cliente.getAñosAntiguedad() > 5) {
            return 10;
        }else {
            return 0;
        }
        
        
    }
}
