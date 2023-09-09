/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.zodiacsign4;

import java.util.Scanner;

/**
 *
 * @author Alumno
 */
public class Zodiacsign4 {

    public static void main(String[] args) {
        
       Scanner scanner = new Scanner(System.in);
        int numYear;
        int residuo;
        int c;
        
        System.out.println("Ingrese un año");
        numYear=scanner.nextInt();
        c=numYear/12;
        residuo=numYear-(c*12);
       
      
        switch (residuo) {
            case 0:
                System.out.println(" es el año del mono");
                break;
                
            case 1:
                System.out.println(" es el año del gallo");
                break;    
                
                
            case 2:
                System.out.println(" es el año del perro");
                break; 
                
            case 3:
                System.out.println(" es el año del cerdo");
                break;
                
            case 4:
                System.out.println(" es el año de la rata");
                break;
                
            case 5:
                System.out.println(" es el año del buey");
                break;
                
            case 6:
                System.out.println(" es el año del tigre");
                break;
                
            case 7:
                System.out.println(" es el año del conejo");
                break;    
                
            case 8:
                System.out.println(" es el año del dragón");
                break;
                
            case 9:
                System.out.println(" es el año de la serpiente");
                
            case 10:
                System.out.println(" es el año del caballo");    
                
                break;    
                  
            default:
                System.out.println("no esta dentro de la lista");
                break;
        }  
        
        
        
        
    }
}
