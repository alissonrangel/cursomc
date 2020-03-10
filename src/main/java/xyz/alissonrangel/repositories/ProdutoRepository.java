package xyz.alissonrangel.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import xyz.alissonrangel.domain.Produto;;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Integer> {
	
	
	
}
