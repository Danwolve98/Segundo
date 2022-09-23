
public class ProcesoHijo implements Runnable {

	
	Thread procesohijo;
	
	public ProcesoHijo() {
		super();
		// TODO Auto-generated constructor stub
		procesohijo = new Thread(this);
		procesohijo.start();
		
		
	}

	@Override
	public void run() {		
		System.out.println("Hola soy el proceso hijo");
	}

}
