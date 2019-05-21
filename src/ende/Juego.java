package ende;

/**
 * Simula el juego de Piedra, Papel o tijera
 */
public class Juego {
	public static void main(String args[]) {
		Jugador p1 = new Jugador();
		Jugador p2 = new Jugador();
		boolean finDeJuego = false;
		Integer rondasJugadas = 0; // Número de rondas jugadas
		Integer empates = 0;
		String opcionJugador1;
		String opcionJugador2;

		// Bucle de juego
		do {
			System.out.println("***** Ronda: " + rondasJugadas + " *********************\n");
			System.out.println("Numero de empates: " + empates + "\n");
			opcionJugador1 = p1.opcion_al_azar();
			System.out.println("Jugador 1: " + opcionJugador1 + "\t Jugador 1 - Partidas ganadas: "
			        + p1.getExitos());
			opcionJugador2 = p2.opcion_al_azar();
			System.out.println("Jugador 2: " + opcionJugador2 + "\t Jugador 2 - Partidas ganadas: "
			        + p2.getExitos());

			if ((opcionJugador1.equals("piedra")) && (opcionJugador2.equals("papel"))) {
				System.out.println("Jugador 2 GANA");
				p2.sumarExito();

			} else if ((opcionJugador1.equals("papel")) && (opcionJugador2.equals("piedra"))) {
				p1.sumarExito();
				System.out.println("Jugador 1 GANA");
			} else if ((opcionJugador1.equals("piedra")) && (opcionJugador2.equals("tijeras"))) {
				p1.sumarExito();
				System.out.println("Jugador 1 GANA");
			} else if ((opcionJugador1.equals("tijeras")) && (opcionJugador2.equals("piedra"))) {
				p2.sumarExito();
				System.out.println("Jugador 2 GANA");
			} else if ((opcionJugador1.equals("tijeras")) && (opcionJugador2.equals("papel"))) {
				p1.sumarExito();
				System.out.println("Jugador 1 GANA");
			} else if ((opcionJugador1.equals("papel")) && (opcionJugador2.equals("tijeras"))) {
				p2.sumarExito();
				System.out.println("Jugador 2 GANA");
			}
			if (opcionJugador1 == opcionJugador2) {
				empates++;
				System.out.println("\n\t\t\t Empate \n");
			}
			rondasJugadas++;
			if ((p1.getExitos() >= 3) || (p2.getExitos() >= 3)) {
				finDeJuego = true;
				System.out.println("FIN DEL JUEGO!!");
			}
			System.out.println();
		} while (finDeJuego != true);
	}
}
