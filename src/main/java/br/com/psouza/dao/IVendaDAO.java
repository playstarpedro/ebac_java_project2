/**
 * 
 */
package br.com.psouza.dao;

import br.com.psouza.dao.generic.IGenericDAO;
import br.com.psouza.domain.Venda;
import br.com.psouza.exceptions.TipoChaveNaoEncontradaException;

public interface IVendaDAO extends IGenericDAO<Venda, String> {

	public void finalizarVenda(Venda venda) throws TipoChaveNaoEncontradaException;
}
