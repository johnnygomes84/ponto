package com.mlg.pontointeligente.api.service.impl;

import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import com.mlg.pontointeligente.api.entities.Lancamento;
import com.mlg.pontointeligente.api.repositories.LancamentoRepository;
import com.mlg.pontointeligente.api.service.LancamentoService;

@Service
public class LancamentoServiceImpl implements LancamentoService {
	
	public static final Logger log = LoggerFactory.getLogger(LancamentoServiceImpl.class);
	
	@Autowired
	private LancamentoRepository lancamentoRepository;

	
	public Lancamento persistir(Lancamento lancamento) {
		log.info("Persistindo lancamento: {}",lancamento);
		return this.lancamentoRepository.save(lancamento);
	}

	
	public Page<Lancamento> buscarPorFuncionarioId(Long id, PageRequest pageRequest) {
		log.info("Buscando por funcionario id: {}", id);
		return this.lancamentoRepository.findByFuncionarioId(id, pageRequest);
	}

	
	public Optional<Lancamento> buscarPorId(Long id) {
		log.info("Buscando por id: {}", id);
		return this.lancamentoRepository.findById(id);
	}

	
	public void remover(Long id) {
		log.info("removendo funcionario com id: {}", id);
		this.lancamentoRepository.deleteById(id);		
	}

}
