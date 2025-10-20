package apirest.productos.restcontroller;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import apirest.productos.model.entities.Usuario;
import apirest.productos.model.services.UsuarioServiceImplMy8;

@RestController
@RequestMapping("/usuarios")
@CrossOrigin(origins="*")
public class UsuarioRestController {

	@Autowired
	private UsuarioServiceImplMy8 us;
	
	@GetMapping("/por-email/{texto}")
	private List<Usuario> porEmail(@PathVariable String texto){
		return us.findByEmailContainig(texto);
	}
	
	@GetMapping("/despues-fecha/{fecha}")
	private List<Usuario> porFechaPosterior(@PathVariable LocalDate fecha){
		return us.findDespuesDeFecha(fecha);
	}
}
