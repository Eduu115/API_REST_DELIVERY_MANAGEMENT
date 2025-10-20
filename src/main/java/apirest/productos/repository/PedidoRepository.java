package apirest.productos.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import apirest.productos.model.entities.Pedido;

public interface PedidoRepository extends JpaRepository<Pedido, Integer>{

}
