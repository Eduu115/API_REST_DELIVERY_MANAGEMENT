package apirest.productos.model.services;

import java.util.Map;

public interface LineasPedidoService {

	public Map<String, Integer> cantidadAgrupadaPorProducto(int numeroOrden);

}
