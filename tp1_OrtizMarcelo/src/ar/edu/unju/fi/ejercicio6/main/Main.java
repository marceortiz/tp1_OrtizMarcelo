package ar.edu.unju.fi.ejercicio6.main;
import ar.edu.unju.fi.ejercicio6.model.Persona;
import java.util.Scanner;
import java.time.LocalDate;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		//creacion de objeto utilizando constructor por defecto 
     System.out.println("Creación de objeto utilizando constructor por defecto");
        
        System.out.print("Ingrese el DNI: ");
        String dni = scanner.nextLine();
        System.out.print("Ingrese el nombre: ");
        String nombre = scanner.nextLine();
        System.out.print("Ingrese la fecha de nacimiento (formato: AAAA-MM-DD): ");
        String fechaNacimientoStr = scanner.nextLine();
        LocalDate fechaNacimiento = LocalDate.parse(fechaNacimientoStr);
        System.out.print("Ingrese la provincia: ");
        String provincia = scanner.nextLine();
        
        Persona persona1 = new Persona(dni, nombre, fechaNacimiento, provincia);
        persona1.mostrarDatos();

        //creacion de objeto utilizando constructor parametrizado
        System.out.println("\nCreación de objeto utilizando constructor parametrizado");
        System.out.print("Ingrese el DNI: ");
        dni = scanner.nextLine();
        System.out.print("Ingrese el nombre: ");
        nombre = scanner.nextLine();
        System.out.print("Ingrese la fecha de nacimiento (formato: AAAA-MM-DD): ");
        String fechaNacimientoStr2 = scanner.nextLine();
        LocalDate fechaNacimiento2 = LocalDate.parse(fechaNacimientoStr2);
        Persona persona2 = new Persona(dni, nombre, fechaNacimiento2);
        persona2.mostrarDatos();

        //creacion de objeto utilizando constructor con dni, nombre y fecha de nacimiento
        System.out.println("\nCreación de objeto utilizando constructor con dni, nombre y fecha de nacimiento");
        System.out.print("Ingrese el DNI: ");
        dni = scanner.nextLine();
        System.out.print("Ingrese el nombre: ");
        nombre = scanner.nextLine();
        System.out.print("Ingrese la fecha de nacimiento (formato: AAAA-MM-DD): ");
        String fechaNacimientoStr3 = scanner.nextLine();
        LocalDate fechaNacimiento3 = LocalDate.parse(fechaNacimientoStr3);
        Persona persona3 = new Persona(dni, nombre, fechaNacimiento3);
        persona3.mostrarDatos();

	}

}
