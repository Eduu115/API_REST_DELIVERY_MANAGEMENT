package apirest.productos.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import apirest.productos.model.entities.Pedido;
import apirest.productos.model.entities.Usuario;

public interface PedidoRepository extends JpaRepository<Pedido, Integer>{
	
	@Query("SELECT DISTINCT p.usuario FROM Pedido p")
    List<Usuario> findDistinctUsuarios();
}
