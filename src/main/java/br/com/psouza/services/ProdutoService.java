/**
 * 
 */
package br.com.psouza.services;

import br.com.psouza.dao.IProdutoDAO;
import br.com.psouza.domain.Produto;
import br.com.psouza.services.generic.GenericService;

public class ProdutoService extends GenericService<Produto, String> implements IProdutoService {

	public ProdutoService(IProdutoDAO dao) {
		super(dao);
	}

}
