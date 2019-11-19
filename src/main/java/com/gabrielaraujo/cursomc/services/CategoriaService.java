package com.gabrielaraujo.cursomc.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gabrielaraujo.cursomc.domain.Categoria;
import com.gabrielaraujo.cursomc.repositories.CategoriaRepository;
import com.gabrielaraujo.cursomc.services.exceptions.ObjectNotFoundException;

@Service
public class CategoriaService {
	
	@Autowired
	private CategoriaRepository repo;
	
	public Categoria buscar(Integer id) {
		Optional<Categoria> obj = repo.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException(
						"Objeto não encontrado! Id: " + id  + ", Tipo: " + Categoria.class.getName()));
	}

}
