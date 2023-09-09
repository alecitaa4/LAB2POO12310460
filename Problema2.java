import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;
public class Problema2 {
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[]args){

        System.out.println("Ingrese el numero :");

        int N = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        if ( N >= 2 && N <= 5 && N % 2 == 0 ){
            System.out.println("Sol");
        } else if ( N >= 6 && N <= 20 && N % 2 == 0){
            System.out.println("Tierra");
        } else if ( N > 20 && N % 2 == 0){
            System.out.println("Galaxia");
        } else {
            System.out.println("Luna");
        }

        scanner.close();
    }
}
