package com.mlg.pontointeligente.api.service.impl;

import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mlg.pontointeligente.api.entities.Empresa;
import com.mlg.pontointeligente.api.repositories.EmpresaRepository;
import com.mlg.pontointeligente.api.service.EmpresaService;

@Service
public class EmpresaServiceImpl implements EmpresaService {
	
	private static final Logger log = LoggerFactory.getLogger(EmpresaServiceImpl.class); 

	@Autowired
	private EmpresaRepository empresaRepository;
	
	
	public Optional<Empresa> buscarPorCnpj(String cnpj) {
		log.info("Buscando uma empresa pelo CNPJ {}",cnpj);
		return Optional.ofNullable(empresaRepository.findByCnpj(cnpj));
	}

	
	public Empresa persistir(Empresa empresa) {
		log.info("persistindo empresa {}",empresa);
		return this.empresaRepository.save(empresa);
	}
	

}
