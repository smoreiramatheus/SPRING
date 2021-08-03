package org.minhafarmacia.farmacia.repository;

import java.util.List;

import org.minhafarmacia.farmacia.model.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoriaRepository extends JpaRepository<Categoria, Long> {
	public List<Categoria> findAllByClassificacaoContainingIgnoreCase (String classificacao);

}
