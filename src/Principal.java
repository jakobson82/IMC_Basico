
public class Principal {

	public static void main(String[] args) {

		paciente p1 = new paciente(45, 1.70);
		System.out.println(p1.diagnostico());
		System.out.println();
		
		paciente p2 = new paciente(79, 1.65);
		System.out.println(p2.diagnostico());
		System.out.println();
		
		paciente p3 = new paciente(120, 1.60);
		System.out.println(p3.diagnostico());
		System.out.println();
		
		paciente p4 = new paciente(100, 1.82);
		System.out.println(p4.diagnostico());
		System.out.println();
		
		
		paciente p5 = new paciente(60, 1.60);
		System.out.println(p5.diagnostico());
		System.out.println();
		
		

	}

}
