package apirest.productos.restcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import apirest.productos.model.dto.LineasPedidoDto;
import apirest.productos.model.services.LineasPedidoServiceImplMy8;

@RestController
@CrossOrigin(origins="*")
@RequestMapping("/lineapedido")
public class LineasPedidoRestController {

	@Autowired 
	private LineasPedidoServiceImplMy8 lps;
	
	@GetMapping("/venta-productos/{idPedido}")
	private List<LineasPedidoDto> cantidadTotalDePedido(@PathVariable int idPedido){

		return lps.cantidadAgrupadaPorProducto(idPedido);
	}
	
}
