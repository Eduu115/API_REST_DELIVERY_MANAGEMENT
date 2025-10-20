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

import apirest.productos.model.dto.CategoriaDto;
import apirest.productos.model.entities.Categoria;
import apirest.productos.model.services.CategoriaServiceImplMy8;

@RestController
@RequestMapping("/categorias")
@CrossOrigin(origins = "*")
public class CategoriaRestController {

	@Autowired
	private CategoriaServiceImplMy8 cs;
	
	@GetMapping("/")
	private List<Categoria> todas(){
		return cs.findAll();
	}
	
	@GetMapping("/{id}")
	private Categoria una(@PathVariable int id) {
		return cs.findById(id);
	}
	
	@PostMapping("/")
	private Categoria alta(@RequestBody Categoria categoria) {
		return cs.persist(categoria);
	}
	
	@PutMapping("/{id}")
	private Categoria actualizar(@PathVariable int id, @RequestBody CategoriaDto categoriaDto) {
		
		// obtain original category
		Categoria categoria = cs.findById(id);
		
		// set original category the new data
		categoria.setDescripcion(categoriaDto.getDescripcion());
		categoria.setNombre(categoriaDto.getNombre());
		
		return cs.updateOne(categoria);
	}
	
	@DeleteMapping("/{id}")
	private int baja(@PathVariable int id) {
		return cs.deleteById(id);
	}
	
	
}
