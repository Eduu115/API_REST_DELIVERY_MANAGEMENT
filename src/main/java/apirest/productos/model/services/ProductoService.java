package apirest.productos.model.services;

import java.util.List;

import apirest.productos.model.entities.Producto;

public interface ProductoService {

	Producto findById(int idProducto);
	List<Producto> findAll();
	
	Producto persist(Producto producto);
	Producto updateOne(Producto producto);
	int deleteById(int idProducto);
	
	List<Producto> porStockMenor(int stock);
	List<Producto> porIdCategoria(int idCategoria);
	
}
