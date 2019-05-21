package ende;

/**
 *
 */
class Jugador {

	private int exitos; // número de partidas ganadas

	public Jugador() {
		exitos = 0;
	}

	/**
	 * Escoge piedra, papel o tijera al azar
	 */
	public String opcionAlAzar() {
		String opcion = "";
		int c = (int) (Math.random() * 3);
		switch (c) {
			case 0:
				opcion = "piedra";
				break;
			case 1:
				opcion = "papel";
				break;
			case 2:
				opcion = "tijeras";
		}
		return opcion;
	}

	public void sumarExito() {
		exitos++;
	}

	public int getExitos() {
		return exitos;
	}

}