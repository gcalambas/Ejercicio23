/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.EjercicioP23;
import java.util.Scanner;
public class EjercicioP23 {
    public static void main(String[] args) {
        double a, b, c;
        Scanner entrada = new Scanner(System.in);

        // Leer los coeficientes de la ecuación
        System.out.println("Ingrese el valor de A: ");
        
        a = entrada.nextDouble();

        System.out.println("Ingrese el valor de B: ");
        b = entrada.nextDouble();

        System.out.println("Ingrese el valor de C: ");
        c = entrada.nextDouble();


        EcuacionSegundoGrado ecuacion = new EcuacionSegundoGrado(a, b, c);

        ecuacion.resolverEcuacion();
    }
    
}
