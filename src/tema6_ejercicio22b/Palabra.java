package tema6_ejercicio22b;

import java.util.Scanner;

public class Palabra {
	
		String termino;
		String definicion;
		
		public Palabra(String termino, String definicion) {
			this.termino = termino;
			this.definicion = definicion;
		}
		public String getTermino() {
			return termino;
		}
		public void setTermino(String termino) {
			this.termino = termino;
		}
		public String getDefinicion() {
			return definicion;
		}
		public void setDefinicion(String definicion) {
			this.definicion = definicion;
		}
	
}
