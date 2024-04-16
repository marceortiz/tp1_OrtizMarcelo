package ar.edu.unju.fi.ejercicio6.model;
import java.time.LocalDate;
public class Persona {
	private String dni;
	private String nombre;
	private LocalDate fechaNacimiento;
	private String provincia;
	//constructores
	public Persona () {
		
	}


	public Persona(String dni, String nombre, LocalDate fechaNacimiento, String provincia) {
		this.dni = dni;
		this.nombre = nombre;
		this.fechaNacimiento = fechaNacimiento;
		this.provincia = provincia;
	}
	
    public Persona(String dni, String nombre, LocalDate fechaNacimiento) {
        this.dni = dni;
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
        this.provincia = "Jujuy";
    }
    

    //metodos accesores
	public String getDni() {
		return dni;
	}


	public void setDni(String dni) {
		this.dni = dni;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public LocalDate getFechaNacimiento() {
		return fechaNacimiento;
	}


	public void setFechaNacimiento(LocalDate fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}


	public String getProvincia() {
		return provincia;
	}


	public void setProvincia(String provincia) {
		this.provincia = provincia;
	}
    
    //metodos adicionales
	public int calcularEdad() {
		LocalDate fechaActual = LocalDate.now();
		int edad = fechaActual.getYear() - fechaNacimiento.getYear();
		return edad;
		
	}
	
	public boolean esMayorEdad() {
		int edad = calcularEdad();
		return edad >= 18;
		
	}
	
	public void mostrarDatos() {
		System.out.println("DNI: "+ dni);
		System.out.println("Nombre: "+ nombre);
		System.out.println("Fecha de nacimiento: "+ fechaNacimiento);
		System.out.println("Provincia: "+ provincia);
		System.out.println("Edad: "+ calcularEdad());
		
		if (esMayorEdad()) {
			System.out.println("Es mayor de edad");
		} else {
			System.out.println("No es mayor de edad");
		}
		
	}
	
	
}
