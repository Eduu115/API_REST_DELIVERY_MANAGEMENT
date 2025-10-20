package apirest.productos.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import apirest.productos.model.entities.Producto;

public interface ProductoRepository extends JpaRepository<Producto, Integer>{

}
