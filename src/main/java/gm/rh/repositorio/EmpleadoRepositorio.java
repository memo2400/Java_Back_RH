package gm.rh.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;

import gm.rh.modelo.Empleado;
// <empleado y integer viene del primer elemento de la clas empleado ID es integer>
public interface EmpleadoRepositorio extends JpaRepository <Empleado, Integer> {

}
