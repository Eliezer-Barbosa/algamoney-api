package com.example.algamoney.api.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.algamoney.api.model.Categoria;
import com.example.algamoney.api.repository.CategoriaRepository;

/*
 * Essa classe representa o recurso de Categoria.
 * Essa classe é um controller, que recebe requisições HTTP
 * */

@RestController
@RequestMapping("/categorias")
public class CategoriaResource {
	
	@Autowired // spring procura a implementação de CategoriaRepository e injeta nesse objeto
	private CategoriaRepository categoriaRepository;
	
	@GetMapping
	public List<Categoria> listar() {
		return categoriaRepository.findAll();
	}

}