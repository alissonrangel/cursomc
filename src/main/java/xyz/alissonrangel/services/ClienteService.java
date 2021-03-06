package xyz.alissonrangel.services;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import xyz.alissonrangel.domain.Cliente;
import xyz.alissonrangel.repositories.ClienteRepository;
import xyz.alissonrangel.services.exceptions.ObjectNotFoundException;

@Service
public class ClienteService {

	@Autowired // dependencia automaticamente instanciada pelo spring
	private ClienteRepository repo;

	public Cliente buscar(Integer id) {

		Optional<Cliente> obj = repo.findById(id);

		// return obj.orElse(null);
		return obj.orElseThrow(() -> new ObjectNotFoundException(
				"Objeto não encontrado! Id: " + id + ", Tipo: " + Cliente.class.getName()));
	}

	public List<Cliente> buscar() {
		
		List<Cliente> lista = new ArrayList<>();
		
		
		lista.addAll(repo.findAll());

		// return obj.orElse(null);
		return lista;
	}
}
