package apirest.productos.model.services;

import java.util.List;

import apirest.productos.model.entities.Usuario;

public interface PedidoService {

	List<Usuario> findByExistPedido();
	
}
