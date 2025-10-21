package apirest.productos.model.services;

import java.util.List;

import apirest.productos.model.dto.LineasPedidoDto;

public interface LineasPedidoService {

	public List<LineasPedidoDto> cantidadAgrupadaPorProducto(int idPedido);

}
