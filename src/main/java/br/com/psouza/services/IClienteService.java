/**
 * 
 */
package br.com.psouza.services;

import br.com.psouza.domain.Cliente;
import br.com.psouza.exceptions.TipoChaveNaoEncontradaException;

public interface IClienteService {

	Boolean cadastrar(Cliente cliente) throws TipoChaveNaoEncontradaException;

	Cliente buscarPorCPF(Long cpf);

	void excluir(Long cpf);

	void alterar(Cliente cliente) throws TipoChaveNaoEncontradaException;

}
