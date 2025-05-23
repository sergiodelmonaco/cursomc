package com.sergiodelmonaco.cursomc.resources;
import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sergiodelmonaco.cursomc.domain.Categoria;

import ch.qos.logback.core.joran.spi.HttpUtil.RequestMethod;

@SuppressWarnings("unused")
@RestController
@RequestMapping(value="/categorias")
public class CategoriaResource {
	
	@GetMapping
	public List<Categoria> listar() {
		
		Categoria  cat1 = new Categoria(1, "Informática");
		Categoria  cat2 = new Categoria(2, "Escritório");
		
		List<Categoria> lista = new ArrayList<>();
		lista.add(cat1);
		lista.add(cat2);
		
		return lista;
	}

}
