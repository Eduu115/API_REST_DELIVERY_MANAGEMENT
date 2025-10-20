package apirest.productos.repository;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import apirest.productos.model.entities.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Integer>{

	List<Usuario> findByEmailContaining(String containig);
	List<Usuario> findByFechaRegistroGreaterThan(LocalDate fecha);

}
