/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete4;

/**
 *
 * @author Usuario
 */
public class Ejecutor2 {

    public static void main(String[] args) {
        String nombre = "Leonardo";
        String apellido = "Chuquimarca";
        String identificacion = "1105980922";
        int edad = 19;

        EstudiantePresencial estPresencial = new EstudiantePresencial(nombre,
                apellido, identificacion, edad);
        
        estPresencial.establecerNumeroCreditos(15);
        estPresencial.establecerCostoCredito(100.21);
        estPresencial.calcularMatriculaPresencial();
        
        System.out.println(estPresencial);
    }
}
