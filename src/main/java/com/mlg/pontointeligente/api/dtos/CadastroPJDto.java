package com.mlg.pontointeligente.api.dtos;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;

import org.hibernate.validator.constraints.br.CNPJ;
import org.hibernate.validator.constraints.br.CPF;



public class CadastroPJDto {
	
	
	private Long id;
	
	@NotEmpty(message = "Nome não pode estar vazio.")
	private String nome;
	
	@NotEmpty(message = "Email não pode estar vazio.")
	@Email(message = "Informe um email válido.")
	private String email;
	
	@NotEmpty(message = "Senha não pode estar vazia.")
	private String senha;
	
	@NotEmpty(message = "CPF não pode estar vazio.")
	@CPF(message = "Informe um CPF válido.")
	private String cpf;
	
	@NotEmpty(message = "Razão social não pode estar vazia.")
	private String razaoSocial;
	
	@NotEmpty(message = "CNPJ não pode estar vazio.")
	@CNPJ(message = "Informe um CNPJ válido.")
	private String cnpj;
	
	public CadastroPJDto() {
		
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getRazaoSocial() {
		return razaoSocial;
	}

	public void setRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	@Override
	public String toString() {
		return "CadastroPJDto [id=" + id + ", nome=" + nome + ", email=" + email + ", senha=" + senha + ", cpf=" + cpf
				+ ", razaoSocial=" + razaoSocial + ", cnpj=" + cnpj + "]";
	}
	
	
	
	
	

}
