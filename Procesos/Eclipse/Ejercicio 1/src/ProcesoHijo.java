
public class ProcesoHijo implements Runnable {
	
	Thread procesohijo;
	
	public ProcesoHijo() {
		super();
		procesohijo = new Thread(this);
		procesohijo.start();
		// TODO Auto-generated constructor stub
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i = 0;i<20000000;i++) {
			System.out.println("Cuenta del hijo: " + i);
		}
		
	}

}
