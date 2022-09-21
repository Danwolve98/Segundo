
public class HolaMundoConProcesos {

	public static void main(String[] args) {
		System.out.println("Padre: Hola soy tu padre");
		ProcesoHijo hijo = new ProcesoHijo("Pepe");
		hijo.start();
		ProcesoHijo hijo2 = new ProcesoHijo("Raul");
		hijo2.start();
		ProcesoHijo hijo3 = new ProcesoHijo("Luisa");
		hijo3.start();
		hijo = new ProcesoHijo("Pepe");
		hijo.start();
		hijo2 = new ProcesoHijo("Maria");
		hijo2.start();
		hijo3 = new ProcesoHijo("Luis");
		hijo3.start();
		System.out.println("Padre: Adios hijo");
	}

}
