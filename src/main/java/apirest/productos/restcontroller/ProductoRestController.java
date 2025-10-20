package apirest.productos.restcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import apirest.productos.model.entities.Producto;
import apirest.productos.model.services.ProductoServiceImplMy8;

@RestController
@RequestMapping("/productos")
@CrossOrigin(origins="*")
public class ProductoRestController {

	@Autowired
	private ProductoServiceImplMy8 ps;
	
	@GetMapping("/")
	private List<Producto> todos(){
		return ps.findAll();
	}
	
	@GetMapping("/{id}")
	private Producto uno(@PathVariable int id) {
		return ps.findById(id);
	}
	
	@PostMapping("/")
	private Producto alta(@RequestBody Producto producto) {
		return ps.persist(producto);
	}
	
	@PutMapping("/{id}")
	private Producto actualizar(@PathVariable int id) {
		return ps.updateOne(ps.findById(id));
	}
	
	@DeleteMapping("/{id}")
	private int baja(@PathVariable int id) {
		return ps.deleteById(id);
	}
	
}
