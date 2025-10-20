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

import apirest.productos.model.dto.ProductoDto;
import apirest.productos.model.entities.Producto;
import apirest.productos.model.services.CategoriaServiceImplMy8;
import apirest.productos.model.services.ProductoServiceImplMy8;

@RestController
@RequestMapping("/productos")
@CrossOrigin(origins="*")
public class ProductoRestController {

	@Autowired
	private ProductoServiceImplMy8 ps;
	@Autowired
	private CategoriaServiceImplMy8 cs;
	
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
	private Producto actualizar(@PathVariable int id, @RequestBody ProductoDto productoDto) {
	
		// fetch original product
		Producto producto = ps.findById(id);
		
		// update
		producto.setNombre(productoDto.getNombre());
		producto.setPrecio(productoDto.getPrecio());
		producto.setStock(productoDto.getStock());
		
		producto.setCategoria(cs.findById(productoDto.getIdCategoria()));
		
		return ps.updateOne(ps.findById(id));
	}
	
	@DeleteMapping("/{id}")
	private int baja(@PathVariable int id) {
		return ps.deleteById(id);
	}
	
	// specific end points
	
	@GetMapping("/stock-menor/{stock}")
	private List<Producto> porStockMenor(@PathVariable int stock){
		return ps.porStockMenor(stock);
	}
	
	@GetMapping("/por-categoria/{idCategoria}")
	private List<Producto> porCategoria(@PathVariable int idCategoria){
		return ps.porIdCategoria(idCategoria);
	}
	
}
