package br.pucrs.ep.poo;

public class Circulo {
	private double centroX;
	private double centroY;
	private double raio;
	
	
	public Circulo() {
		this(0,0,1);
	}
	
	public Circulo(double x, double y, double r) {
		centroX = x;
		centroY =y;
		raio = r;
	}

	public double getCentroX() {
		return centroX;
	}

	public double getCentroY() {
		return centroY;
	}

	public double getRaio() {
		return raio;
	}

	public void move(double newX, double newY) {
		centroX = newX;
		centroY = newY;
	}
	
	public void zoom(double fator) {
		raio *= fator;
	}
	
	public double area() {
		return Math.PI * Math.pow(raio,2);
	}
	
	public String toString(){
		return String.format("(%.2f,%.2f) raio: %.2f", centroX, centroY, raio);
	}
}
