package com.poli.web.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.poli.web.entidad.Producto;

@Repository
public interface EstudianteRepositorio extends JpaRepository<Producto, Long>{

}
