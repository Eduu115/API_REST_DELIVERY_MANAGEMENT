package apirest.productos.model.services;

import java.time.LocalDate;
import java.util.List;

import apirest.productos.model.entities.Usuario;

public interface UsuarioService {

	List<Usuario> findByEmailContainig(String email);
	List<Usuario> findDespuesDeFecha(LocalDate fecha);
	
}
