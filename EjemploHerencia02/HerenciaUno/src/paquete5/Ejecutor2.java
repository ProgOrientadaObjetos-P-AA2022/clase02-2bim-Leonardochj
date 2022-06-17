/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete5;

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
        int nCreditos = 15;
        double valorCredito = 100.21;

        EstudiantePresencial estPresencial = new EstudiantePresencial(nombre,
                apellido, identificacion, edad, nCreditos, valorCredito);
        
        estPresencial.calcularMatriculaPresencial();
        
        System.out.println(estPresencial);
    }
}
