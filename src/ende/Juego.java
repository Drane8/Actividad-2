package ende;

/**
 * Simula el juego de Piedra, Papel o tijera
 */
public class Juego {
	private static final String TIJERAS = "tijeras";
	private static final String PAPEL = "papel";
	private static final String PIEDRA = "piedra";
	private static final int PARTIDAS_GANAR = 3;

	public static void main(String args[]) {
		Jugador jugador1 = new Jugador();
		Jugador jugador2 = new Jugador();
		boolean finDeJuego = false;
		int rondasJugadas = 0; // Número de rondas jugadas
		int empates = 0;
		String opcionJugador1;
		String opcionJugador2;

		// Bucle de juego
		do {
			System.out.println("***** Ronda: " + rondasJugadas + " *********************\n");
			System.out.println("Numero de empates: " + empates + "\n");
			opcionJugador1 = jugador1.opcionAlAzar();
			System.out.println("Jugador 1: " + opcionJugador1 + "\t Jugador 1 - Partidas ganadas: "
			        + jugador1.getExitos());
			opcionJugador2 = jugador2.opcionAlAzar();
			System.out.println("Jugador 2: " + opcionJugador2 + "\t Jugador 2 - Partidas ganadas: "
			        + jugador2.getExitos());

			if (opcionJugador1.equals(PIEDRA) && opcionJugador2.equals(PAPEL)) {
				ganaJugador2(jugador2);
			} else if (opcionJugador1.equals(PAPEL) && opcionJugador2.equals(PIEDRA)) {
				ganaJugador1(jugador1);
			} else if (opcionJugador1.equals(PIEDRA) && opcionJugador2.equals(TIJERAS)) {
				ganaJugador1(jugador1);
			} else if (opcionJugador1.equals(TIJERAS) && opcionJugador2.equals(PIEDRA)) {
				ganaJugador2(jugador2);
			} else if (opcionJugador1.equals(TIJERAS) && opcionJugador2.equals(PAPEL)) {
				ganaJugador1(jugador1);
			} else if (opcionJugador1.equals(PAPEL) && opcionJugador2.equals(TIJERAS)) {
				ganaJugador2(jugador2);
			}

			if (opcionJugador1.equals(opcionJugador2)) {
				empates++;
				System.out.println("\n\t\t\t Empate \n");
			}

			rondasJugadas++;

			if ((jugador1.getExitos() >= PARTIDAS_GANAR)
			        || (jugador2.getExitos() >= PARTIDAS_GANAR)) {
				finDeJuego = true;
				System.out.println("FIN DEL JUEGO!!");
			}

			System.out.println();
		} while (finDeJuego != true);
	}

	private static void ganaJugador1(Jugador jugador) {
		jugador.sumarExito();
		System.out.println("Jugador 1 GANA");
	}

	private static void ganaJugador2(Jugador jugador) {
		jugador.sumarExito();
		System.out.println("Jugador 2 GANA");
	}
}
