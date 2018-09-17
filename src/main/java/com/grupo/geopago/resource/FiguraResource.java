package com.grupo.geopago.resource;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.grupo.geopago.dto.FiguraDto;
import com.grupo.geopago.entity.Figura;
import com.grupo.geopago.service.FiguraService;

@RestController
@RequestMapping("/api")
public class FiguraResource {
	
	@Autowired
	@Qualifier("figuraService")
	FiguraService figuraService;
	
	@GetMapping("/figura/{tipoFigura}")
	public List<FiguraDto> getFindByTipoFigura(@PathVariable("tipoFigura") String tipoFigura) {
		return figuraService.findByTipoFigura(tipoFigura);
	}
	
	@GetMapping("/figura")
	public List<FiguraDto> getFindAll() {
		return figuraService.findAll();
	}
	
	@PostMapping("/figura")
	public boolean setFigura(@RequestBody @Valid Figura figura) throws Exception {
		 
		validateFigura(figura);
		if (figuraService.setFigura(figura)) {
			return true;
		}
		
		throw new Exception("ocurrio un error al crear la figura");
	}
	
	public boolean validateFigura(Figura figura) throws Exception {
		
		if (figura.getTipoFigura().equalsIgnoreCase("cuadrado")  && figura.getBase()!= null) {
			figura.setAltura(null);
			figura.setDiametro(null);
			return true;
		}
		
		if (figura.getTipoFigura().equalsIgnoreCase("triangulo") && figura.getAltura() != null && figura.getBase() != null) {
			figura.setDiametro(null);
			return true;
		} 
		
		if (figura.getTipoFigura().equalsIgnoreCase("circulo") && figura.getDiametro() != null) {
			figura.setAltura(null);
			figura.setBase(null);
			return true;
		} 
		
		throw new Exception("Ingreso una figura no valida, recuerde que solo son triangulo, cuadrado, circulo");
	}
	
}
