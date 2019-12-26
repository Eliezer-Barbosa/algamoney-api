package com.example.algamoney.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.algamoney.api.model.Categoria;

// repository passando Categoria e o tipo da chave primaria de Categoria, que é Long
public interface CategoriaRepository extends JpaRepository<Categoria, Long>{

}
