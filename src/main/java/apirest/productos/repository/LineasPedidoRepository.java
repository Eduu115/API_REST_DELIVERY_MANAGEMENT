package apirest.productos.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import apirest.productos.model.entities.LineasPedido;

public interface LineasPedidoRepository extends JpaRepository<LineasPedido, Integer>{
	// TODO: Obtener cantidad total vendida de un pedido - Hacer un groupBy por pedido y sumar la cantidad de cada uno
	// LO HARE CON FINDALL Y TRABAJO CON STREAM
}
