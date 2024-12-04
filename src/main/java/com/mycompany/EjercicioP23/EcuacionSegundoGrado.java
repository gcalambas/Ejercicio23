/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.EjercicioP23;
public class EcuacionSegundoGrado {
   private double a;
    private double b;
    private double c;
    private double x;
    private double x1;
    private double x2;
    private double parteReal;
    private double parteImaginaria;

    public EcuacionSegundoGrado(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public void resolverEcuacion() {
        
        if (a == 0) {
            if (b != 0) {
                x = -c / b;
                System.out.println("Es una ecuacion lineal con solucion: x = " + x);
            } else {
                System.out.println("No hay solucion valida.");
            }
        } else {
            double discriminante = Math.pow(b, 2) - 4 * a * c;

            if (discriminante > 0) {
                x1 = (-b + Math.sqrt(discriminante)) / (2 * a);
                x2 = (-b - Math.sqrt(discriminante)) / (2 * a);
                System.out.println("Soluciones reales y diferentes:");
                System.out.println("x1 = " + x1);
                System.out.println("x2 = " + x2);
            } else if (discriminante == 0) {
                x = -b / (2 * a);
                System.out.println("Una solucion real y unica:");
                System.out.println("x = " + x);
            } else {
                parteReal = -b / (2 * a);
                parteImaginaria = Math.sqrt(-discriminante) / (2 * a);
                System.out.println("Soluciones complejas:");
                System.out.println("x1 = " + parteReal + " + " + parteImaginaria + "i");
                System.out.println("x2 = " + parteReal + " - " + parteImaginaria + "i");
            }
        }
    } 
}
