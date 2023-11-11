/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.deportista;

/**
 *
 * @author Administrator
 */
public class DEPORTISTA {

    public static void main(String[] args) {
// Subclase Deportista que hereda de la superclase Persona
    public class Deportista extends persona {
    private String deporte;
    

    // Constructor
    public Deportista(String nombre, int edad, String direccion, String deporte) {
        super(nombre, edad, direccion);
        this.deporte = deporte;
    }

    // Métodos getter y setter para el nuevo atributo
    public String getDeporte() {
        return deporte;
    }

    public void setDeporte(String deporte) {
        this.deporte = deporte;
    }

    // Método adicional
    public void corre() {
        System.out.println("Vamos a guardar el codigo...");
    }
   }
 }