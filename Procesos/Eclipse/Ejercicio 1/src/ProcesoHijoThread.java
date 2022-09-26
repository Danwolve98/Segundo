
public class ProcesoHijoThread extends Thread{

	public ProcesoHijoThread() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		super.run();
		for (int i = 0; i < 20000000; i++) {
			System.out.println("Cuenta del hijo: " + i);
		}
	}
	
	

	
	
}
