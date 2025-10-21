package apirest.productos.model.services;

import java.util.Map;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import apirest.productos.model.entities.LineasPedido;
import apirest.productos.repository.LineasPedidoRepository;

@Service
public class LineasPedidoServiceImplMy8 implements LineasPedidoService{

	@Autowired
	private LineasPedidoRepository lprepo;

	@Override
	public Map<String, Integer> cantidadAgrupadaPorProducto(int numeroOrden) {
		// TODO Auto-generated method stub
		return lprepo.findById(numeroOrden).stream().collect(
				Collectors.groupingBy( // GroupBy
						lp-> lp.getProducto().getNombre(), // Param1, primer parametro group by nombre
						Collectors.summingInt(LineasPedido::getCantidad) // Segundo parametro, suma de las cantidades 
				));														 // de todos los registros del mismo nombre que 
																		 // el agrupado en el primero
	} // (espero no haber cometido un terrorismo informatico)
	
	
	
}
