/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.zodiacsign;
import java.util.Scanner;

/**
 *
 * @author Alumno
 */
public class ZodiacSign {

    public static void main(String[] args) {
       
        
        Scanner sc = new Scanner(System.in);
        int numYear;
        int residuo;
        
        System.out.println("Ingrese un año");
        numYear=sc.nextInt();
        
        residuo=numYear/12;
       
      
        switch (residuo) {
            case 1:
                System.out.println(" es el año del mono");
                break;
                
            case 2:
                System.out.println(" es el año del gallo");
                break;    
                
                
            case 3:
                System.out.println(" es el año del perro");
                break; 
                
            case 4:
                System.out.println(" es el año del cerdo");
                break;
                
            case 5:
                System.out.println(" es el año de la rata");
                break;
                
            case 6:
                System.out.println(" es el año del buey");
                break;
                
            case 7:
                System.out.println(" es el año del tigre");
                break;
                
            case 8:
                System.out.println(" es el año del conejo");
                break;    
                
            case 9:
                System.out.println(" es el año del dragón");
                break;
                
            case 10:
                System.out.println(" es el año de la serpiente");
                
            case 11:
                System.out.println(" es el año del caballo");    
                
                break;    
                
                
                
            default:
                throw new AssertionError();
        }
                
        
        
        
        
        
    }
}
