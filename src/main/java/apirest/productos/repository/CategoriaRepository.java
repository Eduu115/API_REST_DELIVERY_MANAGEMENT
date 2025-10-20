package apirest.productos.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import apirest.productos.model.entities.Categoria;

public interface CategoriaRepository extends JpaRepository<Categoria, Integer>{

}
