package com.grupo.geopago.modelado;

public class Circulo  implements Figura {
	
	private Float superfice;
	private Float diametro;
	private String tipoFigura;
	
	public Circulo() {
	}
	
	public Circulo(Float superfice, Float diametro, String tipoFigura) {
		this.superfice = superfice;
		this.diametro = diametro;
		this.tipoFigura = tipoFigura;
	}

	@Override
	public Float getDiametro() {
		// TODO Auto-generated method stub
		return this.diametro;
	}


	public void setDiametro(Float diametro) {
		this.diametro = diametro;

	}

	@Override
	public Float getSuperfice() {
		return this.superfice;
	}

	@Override
	public String getTipoFigura() {
		return this.tipoFigura;
	}

	public void setSuperfice(Float superficie) {
		this.superfice = superficie;
		
	}

	public void setTipoFigura(String tipoFigura) {
		this.tipoFigura = tipoFigura;
		
	}

	@Override
	public Float getBase() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Float getAlto() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String toString() {
		return "Circulo [superfice=" + superfice + ", diametro=" + diametro + ", tipoFigura=" + tipoFigura + "]";
	}
	
	
}
