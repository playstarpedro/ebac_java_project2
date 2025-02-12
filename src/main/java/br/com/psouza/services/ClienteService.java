/**
 * 
 */
package br.com.psouza.services;

import br.com.psouza.dao.IClienteDAO;
import br.com.psouza.domain.Cliente;
import br.com.psouza.services.generic.GenericService;

public class ClienteService extends GenericService<Cliente, Long> implements IClienteService {
	
	public ClienteService(IClienteDAO clienteDAO) {
		super(clienteDAO);
	}

	@Override
	public Cliente buscarPorCPF(Long cpf) {
		return this.dao.consultar(cpf);
	}
}
