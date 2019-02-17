package com.mlg.pontointeligente.api.service;

import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

import com.mlg.pontointeligente.api.entities.Lancamento;

public interface LancamentoService {
	
	Lancamento persistir (Lancamento lancamento);
		
	Page<Lancamento> buscarPorFuncionarioId(Long id, PageRequest pageRequest);
	
	Optional<Lancamento> buscarPorId(Long id);
	
	void remover (Long id);

}
