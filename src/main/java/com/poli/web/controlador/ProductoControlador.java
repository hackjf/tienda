package com.poli.web.controlador;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.poli.web.entidad.Producto;
import com.poli.web.servicio.ProductoServicio;

@Controller
public class ProductoControlador {
	
	@Autowired
	private ProductoServicio servicio;
	
	@GetMapping({"/productos","/"})
	public String listarProductos(Model modelo) {
		modelo.addAttribute("productos", servicio.listarTodosLosProductos());
		return "productos";
	}
	
	@GetMapping("/productos/nuevo")
	public String mostrarFormularioDeRegistrarProducto(Model modelo) {
		Producto producto = new Producto();
		modelo.addAttribute("producto", producto);
		return "crear_producto";
	}
	
	@PostMapping("/productos")
	public String guardarProducto(@ModelAttribute("producto") Producto producto) {
		servicio.guardarProducto(producto);
		return "redirect:/productos";
	}
	
}
