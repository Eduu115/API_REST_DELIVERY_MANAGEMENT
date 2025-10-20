package apirest.productos.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import apirest.productos.model.entities.Producto;
import apirest.productos.model.entities.Categoria;


public interface ProductoRepository extends JpaRepository<Producto, Integer>{

	List<Producto> findByStockIsLessThan(int stock);
	List<Producto> findByCategoria(Categoria categoria);
}
