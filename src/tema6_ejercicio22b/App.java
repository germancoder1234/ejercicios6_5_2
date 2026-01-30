package tema6_ejercicio22b;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class App {

	void mostrarMenu() {
		System.out.println("1) Añadir una palabra al diccionario");
		System.out.println("2) Mostrar todas las palabras");
		System.out.println("3) Obtener la definición de una palabra concreta");
		System.out.println("4) Eliminar un término y su definición");

	}

	public static void main(String[] args) {
		App a = new App();
		Scanner sc = new Scanner(System.in);
		List<Palabra> diccionario = new ArrayList<>();

		int opcion;
		String definicion;
		String termino;

		do {

			a.mostrarMenu();

			opcion = sc.nextInt();

			switch (opcion) {

			case 1:

				System.out.println("Introduce la palabra que deseas añadir");
				termino = sc.next();

				System.out.println("Introduce la definición de dicha palabra");
				definicion = sc.next();

				diccionario.add(new Palabra(termino, definicion));

				break;
			case 2:

				Iterator<Palabra> iter = diccionario.iterator();
				while (iter.hasNext()) {
					Palabra p = iter.next();

					System.out.println(p.getTermino());

				}

				break;
			case 3:
				break;
			case 4:
				break;

			}
		} while (opcion != 0);
	}

}
