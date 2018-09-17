package com.grupo.geopago.modelado;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FiguraFactory factory = new FiguraFactory();
		Figura cuadrado = factory.CreateFigura(1F, 2F, 5F, 9F, "cuadrado");
		Figura triangulo = factory.CreateFigura(1F, 2F, 4F, 3F, "triangulo");
		Figura circulo = factory.CreateFigura(1F, 2F, 3F, 9F, "circulo");
		System.out.println(cuadrado.toString());
		System.out.println(triangulo.toString());
		System.out.println(circulo.toString());
		

	}

}
