package xyz.alissonrangel.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import xyz.alissonrangel.domain.Categoria;
import xyz.alissonrangel.repositories.CategoriaRepository;

@Service
public class CategoriaService {

	@Autowired //dependencia automaticamente instanciada pelo spring
	private CategoriaRepository repo;
	
	public Categoria buscar(Integer id) {
		
		Optional<Categoria> obj = repo.findById(id);
		
		return obj.orElse(null);
	}
}
