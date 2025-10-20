package apirest.productos.model.services;

import java.util.List;

import apirest.productos.model.entities.Categoria;

public interface CategoriaService {

	Categoria findById(int idCategoria);
	List<Categoria> findAll();
	
	Categoria persist(Categoria categoria);
	Categoria updateOne(Categoria categoria);
	int deleteById(int idCategoria);
	
}
