package com.mlg.pontointeligente.api.service.impl;

import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mlg.pontointeligente.api.entities.Funcionario;
import com.mlg.pontointeligente.api.repositories.FuncionarioRepository;
import com.mlg.pontointeligente.api.service.FuncionarioService;

@Service
public class FuncionarioServiceImpl implements FuncionarioService {
	
	private static final Logger log = LoggerFactory.getLogger(FuncionarioServiceImpl.class);
	
	@Autowired
	private FuncionarioRepository funcionarioRepository;

	
	public Funcionario persistir(Funcionario funcionario) {
		log.info("Persistindo funcionario: {}", funcionario);
		return this.funcionarioRepository.save(funcionario);
	}

	
	public Optional<Funcionario> buscarPorCpf(String cpf) {
		log.info("Buscando funcionario por cpf: {}", cpf);
		return Optional.ofNullable(this.funcionarioRepository.findByCpf(cpf));
	}

	
	public Optional<Funcionario> buscarPorEmail(String email) {
		log.info("Buscando funcionario por email: {}", email);
		return Optional.ofNullable(this.funcionarioRepository.findByEmail(email));
	}

	@Override
	public Optional<Funcionario> buscarPorId(Long id) {
		log.info("Buscando funcionario por Id: {}", id);
		return this.funcionarioRepository.findById(id);
	}

}
