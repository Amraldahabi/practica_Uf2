package practica;

import java.util.Scanner;

public class notas {
	// Renombrar variables
	double notas1, notas2, notas3;
	double acumulador1, acumulador2, acumulador3, notaFinal;
//utilizames ecaner para poder introducir datos
	Scanner entrada = new Scanner(System.in);

///vamos ca crear un metodo para ingresar
	public void IngresaNotas() {
//cuando ejeuctamos este metodo lo primnero que queremos es que nos pida notas
		System.out.println("ingrese las notas del estudiante");
		System.out.print("ingrese nota 1: ");
		notas1 = entrada.nextDouble();
		System.out.print("ingrese nota 2: ");
		notas2 = entrada.nextDouble();
		System.out.print("ingrese nota 3: ");
		notas3 = entrada.nextDouble();
	}

// metodo para comprobar bien entroduccion de notas
	public void comprobarcion() {
		if (notas1 > 10) {
			System.out.println(" nota1 mal introducida");
		} else {
			System.out.println(" nota1 correcta");
		}
		if (notas2 > 10) {
			System.out.println(" nota2 mal introducida");
		} else {
			System.out.println(" nota2 correcta");
		}
		if (notas3 > 10) {
			System.out.println(" nota3 mal introducida");
		} else {
			System.out.println(" nota3 correcta");
		}
	}

// metodo para calcular nota
	public void Calculonotas() {
		acumulador1 = notas1 * 0.35;
		acumulador2 = notas2 * 0.35;
		acumulador3 = notas3 * 0.30;
		notaFinal = acumulador1 + acumulador2 + acumulador3;
//hasta aqui la tenemos calculada peor no la mostramos
	}

	public void Mostrar() {
//print ln lo que hace es que al terminar el print baja la linea
		System.out.println(" notas introducidas son:");
		System.out.println(" nota1 = " + notas1);
		System.out.println(" nota2 = " + notas2);
		System.out.println(" nota3 = " + notas3);
		System.out.println(" acumuado 1 = " + acumulador1);
		System.out.println(" acumuado 2 = " + acumulador2);
		System.out.println(" acumuado 3 = " + acumulador3);
		System.out.println(" nota definitiva es = " + notaFinal);
	}

	public void aprobado() {
		if (notaFinal < 5 && notaFinal >= 0) {
			System.out.println("suspendio");
		} else {
			if (notaFinal >= 5 && notaFinal <= 10) {
				System.out.println("aprobado");
			} else {
				System.out.println(" error en la notas");
			}
		}
	}

	public static void main(String[] args) {
// creamos mecanimos para llamar a cualquier metodo fuero de la clase
		notas fc = new notas();
		fc.IngresaNotas();
		fc.comprobarcion();
		fc.Calculonotas();
		fc.Mostrar();
		fc.aprobado();
	}
}