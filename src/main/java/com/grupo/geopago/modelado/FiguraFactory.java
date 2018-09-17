package com.grupo.geopago.modelado;

public class FiguraFactory {
	
	public Figura CreateFigura (Float superficie, Float base, Float alto, Float diametro, String tipoFigura) {
		if (tipoFigura.equalsIgnoreCase("cuadrado")) {
			return new Cuadrado(superficie, base, tipoFigura);
		} else if (tipoFigura.equalsIgnoreCase("triangulo")) {
			return new Triangulo(superficie, base, alto, tipoFigura);
		} else if (tipoFigura.equalsIgnoreCase("circulo")) {
			return new Circulo(superficie, diametro, tipoFigura);
		}
			
		return null;
	}
}
