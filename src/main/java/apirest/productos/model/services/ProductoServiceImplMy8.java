package apirest.productos.model.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import apirest.productos.model.entities.Producto;
import apirest.productos.repository.CategoriaRepository;
import apirest.productos.repository.ProductoRepository;

@Service
public class ProductoServiceImplMy8 implements ProductoService{

	@Autowired
	private ProductoRepository prepo;
	@Autowired
	private CategoriaRepository crepo;
	
	@Override
	public Producto findById(int idProducto) {
		// TODO Auto-generated method stub
		return prepo.findById(idProducto).orElse(null);
	}

	@Override
	public List<Producto> findAll() {
		// TODO Auto-generated method stub
		return prepo.findAll();
	}

	@Override
	public Producto persist(Producto producto) {
		// TODO Auto-generated method stub
		if (findById(producto.getIdProducto()) == null) {
			try {
				return prepo.save(producto);
			} catch (Exception e) {
				e.getCause();
			}
		}
		return null;
	}

	@Override
	public Producto updateOne(Producto producto) {
		// TODO Auto-generated method stub
		if (findById(producto.getIdProducto()) != null) {
			try {
				return updateOne(producto);
			} catch (Exception e) {
				e.getCause();
			}
		}
		return null;
	}

	@Override
	public int deleteById(int idProducto) {
		// TODO Auto-generated method stub
		if (findById(idProducto) != null) {
			try {
				prepo.deleteById(idProducto);
				return 1;
			} catch (Exception e) {
				e.getCause();
				return -1;
			}
		}else {
			return 0;			
		}
	}

	@Override
	public List<Producto> porStockMenor(int stock) {
		// TODO Auto-generated method stub
		return prepo.findByStockIsLessThan(stock);
	}

	@Override
	public List<Producto> porIdCategoria(int idCategoria) {
		// TODO Auto-generated method stub
		return prepo.findByCategoria(crepo.findById(idCategoria).orElse(null));
	}

}
