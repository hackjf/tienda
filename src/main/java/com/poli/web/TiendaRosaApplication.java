package com.poli.web;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.poli.web.entidad.Producto;
import com.poli.web.repositorio.ProductoRepositorio;

@SpringBootApplication
public class TiendaRosaApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(TiendaRosaApplication.class, args);
	}

	@Autowired
	private ProductoRepositorio repositorio;
	
	@Override
	public void run(String... args) throws Exception {
		/*
	Producto producto1 = new Producto("maiz", 233, 2, 466);
	repositorio.save(producto1);
	Producto producto2 = new Producto("arroz", 133, 1, 133);
	repositorio.save(producto2);*/
	}
	
}


