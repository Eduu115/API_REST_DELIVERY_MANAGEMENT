package apirest.productos.model.services;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import apirest.productos.model.entities.Usuario;
import apirest.productos.repository.UsuarioRepository;

@Service
public class UsuarioServiceImplMy8 implements UsuarioService{

	@Autowired
	private UsuarioRepository urepo;

	@Override
	public List<Usuario> findByEmailContainig(String email) {
		// TODO Auto-generated method stub
		return urepo.findByEmailContaining(email);
	}

	@Override
	public List<Usuario> findDespuesDeFecha(LocalDate fecha) {
		// TODO Auto-generated method stub
		return urepo.findByFechaRegistroGreaterThan(fecha);
	}
	
}
