package TP_1;

import java.util.Scanner;

public class ejercicio3 {

	public static void main(String[] args) {
		double salarioActual = 0;
		double desempeño;
		double incremento = 0;
		double nuevoSalario = 0;
		
		Scanner scan = new Scanner(System.in);
			System.out.print("Ingrese el salario actual: ");
			salarioActual = scan.nextDouble();
			
			System.out.print("Ingrese la calificación de desempeño: ");
			desempeño = scan.nextDouble();
		
		
		if (desempeño ==1) {
			incremento = salarioActual * 0.06;
		}else if (desempeño ==2) {
			incremento = salarioActual * 0.04;
		}else if (desempeño ==3) {
			incremento = salarioActual * 0.015;
		}else {
			System.out.println("Calificación de desempeño no válida. Debe ser 1, 2 o 3; ");
			return;
		}
		nuevoSalario = salarioActual + incremento;
		
		System.out.println("incremento: $" +incremento);
		System.out.println("Nuevo Salario: $" +nuevoSalario);
				

	}

}
