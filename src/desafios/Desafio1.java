package desafios;

import java.util.Scanner;

public class Desafio1 {

	public static boolean esAñoBisiesto(int año) {
		return (año % 4 == 0);
	}

	public static boolean comprobarAño(int año) {
		return ((año >= 1900) && (año <= 2099));
	}

	public static boolean comprobarMes(int mes) {
		return ((mes >= 1) && (mes <= 12));
	}

	public static boolean comprobarDia(int dia) {
		return ((dia >= 1) && (dia <= 31));

	}

	public static String validarFecha(int dia, int mes, int año) {
		if (comprobarDia(dia) && comprobarMes(mes) && comprobarAño(año)) {
			if (esAñoBisiesto(año) && mes == 2) {

				if (dia > 29) {
					return "La fecha ingresada NO es Válida";
				}
			}
			return "La fecha ingresada es Válida";
		} else {
			return "La fecha ingresada NO es Válida";
		}

	}

	public static void main(String[] args) {
		System.out.println("Ingrese una fecha para verificar si es correcta");
		Scanner leer = new Scanner(System.in);
		System.out.println("Ingrese Dia");
		int dia = leer.nextInt();
		System.out.println("Ingrese Mes");
		int mes = leer.nextInt();
		System.out.println("Ingrese Año");
		int año = leer.nextInt();

		System.out.println(validarFecha(dia, mes, año));

		leer.close();

	}

}
