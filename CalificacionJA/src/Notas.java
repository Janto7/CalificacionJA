import java.util.Scanner;

public class Notas {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);// Para pedir números por teclado
		int n = 0;
		String calificacion = "";
		System.out.print("Introduzca una nota: ");
		n = reader.nextInt();
		obtenerNota(reader, n);
	}

	private static void obtenerNota(Scanner reader, int nota) {
		String calificacion;
		if (nota >= 0 && nota < 5)
			calificacion = "Suspenso";
		else if (nota >= 5 && nota <= 10)
			calificacion = "Aprobado";
		else
			calificacion = "La nota introducida no es correcta";
		System.out.println(calificacion);
		reader.close();
	}
}

