/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package areatriangulo;

import java.util.Scanner;

/**
 *
 * @author expec
 */
public class AreaTriangulo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double base, altura,r;
        Scanner e = new Scanner(System.in);
        System.out.println("Ingresa la base: ");
        base = e.nextDouble();
        System.out.println("Ingresa la altura");
        altura = e.nextDouble();
        r = (base*altura)/2;
        System.out.println("El area del triangulo es: "+r);
    }
    
}
