package mx.uaemex.fi.paradigmas_1;

public class Principal {
	
	public static void main(String[] args) {
		
		Cuadrado C = new Cuadrado(5);
		Circulo CI = new Circulo(7.5);
		
		System.out.println(C.PerimetroCuadrado());
		System.out.println(C.AreaCuadrado());
		System.out.println(CI.PerimetroCirculo());
		System.out.println(CI.AreaCirculo());
		
		
	}

}
