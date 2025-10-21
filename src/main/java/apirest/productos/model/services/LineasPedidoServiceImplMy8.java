package apirest.productos.model.services;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import apirest.productos.model.dto.LineasPedidoDto;
import apirest.productos.model.entities.LineasPedido;
import apirest.productos.repository.LineasPedidoRepository;
import apirest.productos.repository.PedidoRepository;

@Service
public class LineasPedidoServiceImplMy8 implements LineasPedidoService{
	
	@Autowired
	private PedidoRepository prepo;
	@Autowired
	private LineasPedidoRepository lprepo;

	@Override
	public List<LineasPedidoDto> cantidadAgrupadaPorProducto(int pedidoId) {
        Map<String, Integer> totalesPorProducto = lprepo.findByPedido(prepo.findById(pedidoId).orElse(null)).stream()
                .collect(Collectors.groupingBy( // Hacemos groupBy con las 2 columnas que queremos
                        lp -> lp.getProducto().getNombre(),              // col 1: agrupamos por nombre de prod
                        Collectors.summingInt(LineasPedido::getCantidad) // col 2: suma de las cantidades
                ));

        return totalesPorProducto.entrySet().stream()
                .map(entry -> new LineasPedidoDto(entry.getKey(), entry.getValue()))
                .collect(Collectors.toList());
    } // (espero no haber cometido un terrorismo informatico)
	
	
	
}
