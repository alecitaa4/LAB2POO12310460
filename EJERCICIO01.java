/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio01.Lab1;

import java.util.Scanner;

/**
 *
 * @author Alumno
 */
public class EJERCICIO01 {

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese un número a evaluar: "); 

        try {
            long x = sc.nextLong();
            System.out.println(x + " puede ser almacenado en: ");
            
            if (x >= Byte.MIN_VALUE && x <= Byte.MAX_VALUE) {
                System.out.println("byte");
            }
            if (x >= Short.MIN_VALUE && x <= Short.MAX_VALUE) {
                System.out.println("short");
            }
            if (x >= Integer.MIN_VALUE && x <= Integer.MAX_VALUE) {
                System.out.println("int");
            }
            if (x >= Long.MIN_VALUE && x <= Long.MAX_VALUE) {
                System.out.println("long");
            }
        } catch (Exception e) {
            System.out.println(sc.next() + " no puede ser almacenado en ningún tipo de dato primitivo.");
        }
    }        
}
    

