package com.example.algamoney.api.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.algamoney.api.model.Lancamento;
import com.example.algamoney.api.repository.filter.LancamentoFilter;

public interface LancamentoRepository extends JpaRepository<Lancamento, Long> {

	List<Lancamento> filtrar(LancamentoFilter lancamentoFilter);

}