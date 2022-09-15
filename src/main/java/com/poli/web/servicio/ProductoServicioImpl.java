package com.poli.web.servicio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.poli.web.entidad.Producto;
import com.poli.web.repositorio.ProductoRepositorio;

@Service
public class ProductoServicioImpl implements ProductoServicio {

	@Autowired
	private ProductoRepositorio repositorio;

	@Override
	public List<Producto> listarTodosLosProductos() {
		return repositorio.findAll();
	}

	@Override
	public Producto guardarProducto(Producto producto) {
		// TODO Auto-generated method stub
		return repositorio.save(producto);
	}

	@Override
	public Producto obtenerProductoPorId(Long id) {
		// TODO Auto-generated method stub
		return repositorio.findById(id).get();
	}

	@Override
	public Producto actualizarProducto(Producto producto) {
		// TODO Auto-generated method stub
		return repositorio.save(producto);
	}

	@Override
	public void eliminarProducto(Long id) {
		// TODO Auto-generated method stub
		repositorio.deleteById(id);
	}

}
