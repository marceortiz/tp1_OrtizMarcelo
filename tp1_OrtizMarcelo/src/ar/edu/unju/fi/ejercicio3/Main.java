package ar.edu.unju.fi.ejercicio3;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int num, dobleNum = 0, tripleNum = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingrese un número entero:");
		num = sc.nextInt();
		if (num % 2 == 0) {
			tripleNum = num*3;
			System.out.println(tripleNum);
		}
		else {
			dobleNum = num*2;
			System.out.println(dobleNum);
		}
	}

}
