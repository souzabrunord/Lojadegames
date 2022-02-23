package com.generation.lojadegames.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.generation.lojadegames.model.Produto;

@Repository
public interface ProdutoRepository extends JpaRepository <Produto, Long> {
	
	List <Produto> findAllByNomeContainingIgnoreCase(String titulo);
	List <Produto> findByPrecoGreaterThanOrderByPreco(Double preco);
	List <Produto> findByPrecoLessThanOrderByPrecoDesc(Double preco);
	

}
