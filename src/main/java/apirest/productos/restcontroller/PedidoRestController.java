package apirest.productos.restcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import apirest.productos.model.entities.Usuario;
import apirest.productos.model.services.PedidoServiceImplMy8;

@RestController
@RequestMapping("/pedidos")
@CrossOrigin(origins="*")
public class PedidoRestController {

	@Autowired
	private PedidoServiceImplMy8 pes;
	
	@GetMapping("/usuarios")
	private List<Usuario> usuariosPorPedido(){
		return pes.findByExistPedido();
	} 
	
}
