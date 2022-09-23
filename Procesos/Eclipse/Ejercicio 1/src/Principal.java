
public class Principal {

	public static void main(String[] args) {
		
		ProcesoHijo hijo = new ProcesoHijo();
		
		for(int i = 0;i<20000000;i++) {
			System.out.println("Cuenta del padre: " + i);
		}
		
		
		
	}

}
