package com.gestion.empleados.com.seguridad.spring.Repositorio;

import com.gestion.empleados.com.seguridad.spring.Modelo.Empleado;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmpleadoRepositorio  extends JpaRepository<Empleado,Long> {

}
