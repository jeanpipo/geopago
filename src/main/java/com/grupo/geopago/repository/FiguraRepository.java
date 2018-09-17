package com.grupo.geopago.repository;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.grupo.geopago.entity.Figura;

@Repository("figuraRepository")
public interface FiguraRepository extends JpaRepository <Figura, Serializable>{
	public abstract List<Figura> findByTipoFigura(String tipoFigura);
	public abstract List<Figura> findAll();
}
