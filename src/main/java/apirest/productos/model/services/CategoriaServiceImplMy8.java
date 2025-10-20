package apirest.productos.model.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import apirest.productos.model.entities.Categoria;
import apirest.productos.repository.CategoriaRepository;

@Service
public class CategoriaServiceImplMy8 implements CategoriaService{

	@Autowired
	private CategoriaRepository crepo;
	
	@Override
	public Categoria findById(int idCategoria) {
		// TODO Auto-generated method stub
		return crepo.findById(idCategoria).orElse(null);
	}

	@Override
	public List<Categoria> findAll() {
		// TODO Auto-generated method stub
		return crepo.findAll();
	}

	@Override
	public Categoria persist(Categoria categoria) {
		// TODO Auto-generated method stub
		if (findById(categoria.getIdCategoria()) == null) {
			try {
				return crepo.save(categoria);
			} catch (Exception e) {
				e.getCause();
			}
		}
		return null;
	}

	@Override
	public Categoria updateOne(Categoria categoria) {
		// TODO Auto-generated method stub
		if (findById(categoria.getIdCategoria()) != null) {
			try {
				return crepo.save(categoria);
			} catch (Exception e) {
				e.getCause();
			}
		}
		return null;
	}

	@Override
	public int deleteById(int idCategoria) {
		// TODO Auto-generated method stub
		if (findById(idCategoria) != null) {
			try {
				crepo.deleteById(idCategoria);
				return 1;
			} catch (Exception e) {
				e.getCause();
				return -1;
			}
		}else {
			return 0;			
		}
	}

	
	
}
