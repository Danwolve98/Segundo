
public class ProcesoHijo extends Thread {

	public ProcesoHijo() {
		super();
		
	}

	public ProcesoHijo(String string) {
		super(string);
	}
	
	

	@Override
	public void run() {
		super.run();
		String genero = this.getName();
		if(genero.toCharArray()[genero.length()-1] != 'a') {
			System.out.println("Hijo: Hola soy tu hijo -> " + this.getName());
			System.out.println("Hijo: Adios padre");
		} else {
			System.out.println("Hija: Hola soy tu hija -> " + this.getName());
			System.out.println("Hija: Adios padre");
		}
	}
	
}
