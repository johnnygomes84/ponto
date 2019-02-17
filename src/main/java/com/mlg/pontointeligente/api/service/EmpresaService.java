package com.mlg.pontointeligente.api.service;

import java.util.Optional;


import com.mlg.pontointeligente.api.entities.Empresa;


public interface EmpresaService {
	
	Optional<Empresa> buscarPorCnpj(String cnpj);
	
	Empresa persistir(Empresa empresa);

}
