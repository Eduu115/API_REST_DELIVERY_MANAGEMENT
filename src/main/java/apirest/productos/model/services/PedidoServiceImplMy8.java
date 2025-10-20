package apirest.productos.model.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import apirest.productos.model.entities.Usuario;
import apirest.productos.repository.PedidoRepository;

@Service
public class PedidoServiceImplMy8 implements PedidoService{

	@Autowired
	private PedidoRepository perepo;
	
	@Override
	public List<Usuario> findByExistPedido() {
		// TODO Auto-generated method stub
		return perepo.findDistinctUsuarios();
	}

}
