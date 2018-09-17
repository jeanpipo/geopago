package com.grupo.geopago.modelado;

public class Cuadrado  implements Figura {
	private Float superfice;
	private Float base;
	private String tipoFigura;
	
	

	public Cuadrado() {
	}

	public Cuadrado(Float superfice, Float base, String tipoFigura) {
		this.superfice = superfice;
		this.base = base;
		this.tipoFigura = tipoFigura;
	}

	@Override
	public Float getBase() {
		// TODO Auto-generated method stub
		return this.base;
	}

	@Override
	public Float getAlto() {
		// TODO Auto-generated method stub
		return null;
	}

	public void setBase(Float base) {
		this.base=base;
		
	}

	@Override
	public Float getSuperfice() {
		
		return this.superfice;
	}

	@Override
	public String getTipoFigura() {
		// TODO Auto-generated method stub
		return this.tipoFigura;
	}

	public void setSuperfice(Float superficie) {
		this.superfice = superficie;
		
	}

	public void setTipoFigura(String tipoFigura) {
		this.tipoFigura = tipoFigura;
		
	}

	@Override
	public Float getDiametro() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String toString() {
		return "Cuadrado [superfice=" + superfice + ", base=" + base + ", tipoFigura=" + tipoFigura + "]";
	}	
	
	

}
