package ar.edu.unju.fi.ejercicio5;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// Crear el objeto scanner
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingrese número del 1 al 9:");
		int num = sc.nextInt();
		
		//Verificar si el número está dentro del rango 1-9
		if (num < 1 || num >9) {
			System.out.println("Fuera de rango");
		} else {
			//Tabla de multiplicar usando for
			System.out.println("Tabla de multiplicar de "+ num +":");
			for (int i = 1;i<=10;i++) {
				int resultado = num * i;
				System.out.println(num+"x"+i+"="+ resultado);
			}
		}

	}

}
