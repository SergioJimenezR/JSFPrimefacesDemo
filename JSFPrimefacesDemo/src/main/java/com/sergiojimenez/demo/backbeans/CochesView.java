package com.sergiojimenez.demo.backbeans;

import java.io.Serializable;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;

import com.sergiojimenez.demo.dao.CocheDAO;
import com.sergiojimenez.demo.model.Coche;

@Named("panelCoches")
@ViewScoped
public class CochesView implements Serializable {

	private static final long serialVersionUID = 1L;

	@Inject
	private CocheDAO cocheDAO;

	private List<Coche> listaCoches;

	private List<Coche> listaFiltradaCoches;

	@PostConstruct
	public void init() {
		listaCoches = cocheDAO.findAll();
	}

	/*
	 * El .xhtml invocará este método getListaCoches() cuando hagamos referencia, en
	 * el caso de este ejemplo, a "#{panelCoches.listaCoches}", no resultando
	 * dependiente del nombre del atributo listaCoches.
	 */
	public List<Coche> getListaCoches() {
		return listaCoches;
		/*
		 * No solamente tiene por qué devolver directamente eso (habiéndolo mantenido
		 * desde el init); sino que puede hacer la consulta aquí mismo.
		 */
	}

	public void setListaCoches(List<Coche> listaCoches) {
		this.listaCoches = listaCoches;
	}

	public List<Coche> getListaFiltradaCoches() {
		return listaFiltradaCoches;
	}

	public void setListaFiltradaCoches(List<Coche> listaFiltradaCoches) {
		this.listaFiltradaCoches = listaFiltradaCoches;
	}

}
