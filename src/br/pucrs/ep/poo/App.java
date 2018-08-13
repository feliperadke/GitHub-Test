package br.pucrs.ep.poo;

public class App {

	public static void main(String[] args) {
		Circulo c1 = new Circulo();
		Circulo c2 = new Circulo(3,4,5);

		System.out.println("Circulo 1: "+c1.toString());
		System.out.println("Circulo 2: "+c2.toString());
		
		c1.move(2,3);
		c2.zoom(2);
		
		System.out.println("Circulo 1: "+c1.toString());
		System.out.println("Circulo 2: "+c2.toString());
		
		System.out.println("Area do circulo 1: "+c1.area());
		System.out.println("Area do circulo 2: "+c2.area());
		
	}

}
